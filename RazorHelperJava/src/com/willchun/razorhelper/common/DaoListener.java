package com.willchun.razorhelper.common;

import java.util.List;

/**
 * 常用的Dao类方法
 * @author Administrator
 *
 * @param <T>
 */
public interface DaoListener<T> {
	
	public List<T> queryAll();
	
}
