/** 
 * <pre>项目名称:generatorSqlmapCustom 
 * 文件名称:Result.java 
 * 包名:com.baiyangdian.entity 
 * 创建日期:2018年9月6日下午8:41:21 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.baiyangdian.entity;

import java.io.Serializable;

/** 
 * <pre>项目名称：generatorSqlmapCustom    
 * 类名称：Result    
 * 类描述：    
 * 创建人：邵先志  
 * 创建时间：2018年9月6日 下午8:41:21    
 * 修改人：邵先志
 * 修改时间：2018年9月6日 下午8:41:21    
 * 修改备注：       
 * @version </pre>    
 */
public class Result implements Serializable{
	
	private static final long serialVersionUID = -3468558788664166472L;

	private boolean success;

	private String message;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Result [success=" + success + ", message=" + message + "]";
	}

	   
	public Result(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}

	   
	public Result() {
		super();
	}

	   
	   
}
