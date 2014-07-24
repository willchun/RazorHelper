package com.willchun.razorhelper.common;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseDao<T> {
	
	/**
	 * 处理数据库类数据
	 * @param rs
	 * @return
	 */
	public abstract T dealT(ResultSet rs) throws SQLException;
	
	
	/**
	 * 查询数据
	 * @param sql
	 * @param param
	 * @return
	 */   
	public List<T> query(String sql, Object... param){
		List<T> ret = new ArrayList<T>();
		DBBean db = new DBBean();
		try {
			db.init();
			ResultSet rs = db.executeQuery(sql, param);
			while(rs.next()){
				ret.add(dealT(rs));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			db.close();
		}
		return ret;
	}
	
	/**
	 * 更新数据
	 * @param sql
	 * @param params
	 * @return
	 */
	public int execute(String sql, Object... params){
		DBBean db = new DBBean();
		int ret = 0;
		try {
			db.init();
			ret = db.executeUpdate(sql, params);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.close();
		}
		return ret;
		
	}
	
}
