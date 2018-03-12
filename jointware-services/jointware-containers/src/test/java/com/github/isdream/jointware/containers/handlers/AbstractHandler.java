/**
 * Copyright (2018, ) Institute of Software, Chinese academy of Sciences
 */
package com.github.isdream.jointware.containers.handlers;

import java.util.Properties;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 */
public abstract class AbstractHandler {

	public final static String OBJECT = "obj";
	
	public final static String TAG = "tag";
	
	protected AbstractHandler nextHandler;
	
	public AbstractHandler() {
		super();
	}

	public void handle(Properties props) {
		doHandle(props);
		
		if (nextHandler != null) {
			nextHandler.doHandle(props);
		}
	}
	
	public abstract void doHandle(Properties props);

	public AbstractHandler getNextHandler() {
		return nextHandler;
	}

	public void setNextHandler(AbstractHandler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
}
