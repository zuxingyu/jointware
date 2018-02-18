/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.chameleon.container.docker.adapters;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 */
public class CreateContainerCmdImpl extends com.github.dockerjava.core.command.CreateContainerCmdImpl {

	/**
	 * 
	 */
	public CreateContainerCmdImpl(Exec exec) {
		super(exec, "image");
	}
	
	public CreateContainerCmdImpl(Exec exec, String image) {
		super(exec, image);
	}

}
