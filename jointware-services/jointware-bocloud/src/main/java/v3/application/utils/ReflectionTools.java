package v3.application.utils;

import org.apache.log4j.Logger;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public class ReflectionTools {

    private static Logger logger = Logger.getLogger(ReflectionTools.class);

    public static void executeConvertSubMethod(Object obj,String methodName,String[] refType,Map<String,Object> oldMap,String subKey,Object subValue,Map<String,Object> newRef,Map<String,Object> oldRef) throws Exception {
        Class cls = null;
        try {
            logger.info("method name: "+methodName);
            cls = obj.getClass();
            Method setMethod = cls.getDeclaredMethod(methodName,String[].class,Map.class,
                                                                String.class,Object.class,Map.class,Map.class);
            setMethod.invoke(obj, refType,oldMap,subKey,subValue,newRef,oldRef);
        } catch (NoSuchMethodException e) {
            logger.info(methodName+" does not exist, "+subValue+" can directly convert.");
            throw e;
        } catch (IllegalAccessException e) {
            logger.info("Need to check handler method's type.");
            throw e;
        } catch (InvocationTargetException e) {
            logger.info("Need to check ServiceSelector's status.");
            throw e;
        } catch (Exception e){
            logger.info("self defined exception");
            throw e;
        }
    }

    public static String upperCase(String str) {
        char[] ch = str.toCharArray();
        if (ch[0] >= 'a' && ch[0] <= 'z') {
            ch[0] = (char) (ch[0] - 32);
        }
        return new String(ch);
    }
}
