package com.dubbo.springboot.result;

/**
 * 统一错误码异常
 *
 * Created by bysocket on 14/03/2017.
 */
public class GlobalErrorInfoException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ErrorInfoInterface errorInfo;

    public GlobalErrorInfoException (ErrorInfoInterface errorInfo) {
        this.errorInfo = errorInfo;
    }

    public ErrorInfoInterface getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(ErrorInfoInterface errorInfo) {
        this.errorInfo = errorInfo;
    }
}
