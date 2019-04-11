package com.dubbo.util;



import com.alibaba.dubbo.rpc.Filter;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.dubbo.rpc.RpcResult;

public class ServiceFilter implements Filter{

	@Override
	public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
		  Result result = null;  
	        Long takeTime = 0L;  
	        try  
	        {  
	            Long startTime = System.currentTimeMillis();  
	            result = invoker.invoke(invocation);  
	            if (result.getException() instanceof Exception)  
	            {  
	                throw new Exception(result.getException());  
	            }  
	            takeTime = System.currentTimeMillis() - startTime;  
	        }  
	        catch (Exception e)  
	        {  
	           // logger.error("Exception:{},request{},curr error:{},msg:{}", invocation.getClass(),  
	              //  invocation.getArguments(), e.toString(), ExceptionUtils.getRootCause(e));  
	            result = new RpcResult(ServiceUtils.getResponse(e));  
	            return result;  
	        }  
	        finally  
	        {  
	              /* logger.info("method:[{}],request:{},response:{},takeTime:{} ms",  
	                invocation.getMethodName(), invocation.getArguments(), JsonUtil.toJSON(result),  
	                takeTime);  */
	        }  
	        return result;  
	}

}
