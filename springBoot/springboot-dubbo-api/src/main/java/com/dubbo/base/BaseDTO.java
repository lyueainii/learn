package com.dubbo.base;

import java.io.Serializable;


public abstract class BaseDTO implements Serializable {

	private static final long serialVersionUID = 257001020794589206L;
	//private static final int MAX_SIZE = 10240;
	//@Override
	/*public String toString() {
		String str = ReflectionToStringBuilder.toString(this, SkipNullToStringStyle.SKIP_NULL_STYLE, false, false, BaseDTO.class);
		if(str.length()>MAX_SIZE)
			return str.substring(0, MAX_SIZE)+"(IGNOR"+(str.length()-MAX_SIZE)+")";
		return str;
	}*/
}
