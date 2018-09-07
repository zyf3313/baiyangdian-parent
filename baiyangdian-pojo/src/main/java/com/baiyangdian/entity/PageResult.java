/** 
 * <pre>项目名称:generatorSqlmapCustom 
 * 文件名称:PageResult.java 
 * 包名:com.baiyangdian.entity 
 * 创建日期:2018年9月6日下午8:38:31 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */
package com.baiyangdian.entity;

import java.io.Serializable;
import java.util.List;

/**
 * <pre>
 * 项目名称：generatorSqlmapCustom    
 * 类名称：PageResult    
 * 类描述：    
 * 创建人：邵先志  
 * 创建时间：2018年9月6日 下午8:38:31    
 * 修改人：邵先志
 * 修改时间：2018年9月6日 下午8:38:31    
 * 修改备注：       
 * &#64;version
 * </pre>
 */
public class PageResult implements Serializable {

	private static final long serialVersionUID = -5706240206982032435L;

	private Long total;

	private List rows;

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "PageResult [total=" + total + ", rows=" + rows + "]";
	}

	public PageResult(Long total, List rows) {
		super();
		this.total = total;
		this.rows = rows;
	}

	public PageResult() {
		super();
	}

}
