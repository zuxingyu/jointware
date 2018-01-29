/**
 * Copyright (2018, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.isdream.cdispatcher.docker.adapters;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 *
 */
public class CreateImageCmdImpl extends com.github.dockerjava.core.command.CreateImageCmdImpl {

	public CreateImageCmdImpl(Exec exec) {
		super(exec, "repository", new InputStream(){

			@Override
			public int read() throws IOException {
				return 0;
			}
			
		});
	}
	
	public CreateImageCmdImpl(Exec exec, String repository, InputStream imageStream) {
		super(exec, repository, imageStream);
	}

}
