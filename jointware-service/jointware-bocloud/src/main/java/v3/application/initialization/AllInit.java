/**
 * Copyright (2017, ) Institute of Software, Chinese Academy of Sciences
 * Copyright (2017, ) Bocloud Co,. Lmt
 */
package v3.application.initialization;

import org.apache.log4j.Logger;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by xyj on 2016/4/19.
 */

public class AllInit implements ServletContextListener {
    private Log4JInit lji ;
    public static String baseFilePath ="D:";
    private static Logger logger = Logger.getLogger(AllInit.class);
    public Log4JInit getLji() {
        return lji;
    }
    public void contextInitialized(ServletContextEvent sce) {
        baseFilePath = sce.getServletContext().getRealPath("/");
        lji = new Log4JInit();
        lji.setLog4JPath(sce);
    }

    public void contextDestroyed(ServletContextEvent sce) {

    }
}
