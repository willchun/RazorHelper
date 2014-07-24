package com.willchun.razorhelper.service;

import java.util.List;

import com.willchun.razorhelper.dao.ConfigDao;
import com.willchun.razorhelper.model.Config;

/**
 * 配置信息
 * @author Administrator
 *
 */
public class ConfigService {
	
	public List<Config> queryAll(){
		ConfigDao dao = new ConfigDao();
		return dao.queryAll();
	}
	
	/**
	 * 查找应用id对应的配置信息
	 * @param product_id
	 * @return
	 */
	public List<Config> queryByProduct_id(int product_id){
		ConfigDao dao = new ConfigDao();
		String sql = "select * from razor_config where product_id = ?";
		return dao.query(sql, product_id);
	}
	
	public int add(int product_id){
		ConfigDao dao = new ConfigDao();
		String sql = "insert into razor_config (product_id) value(?)";
		return dao.execute(sql, product_id);
	}
	
	public int delete(int id){
		ConfigDao dao = new ConfigDao();
		String sql = "delete from razor_config where id = ?";
		return dao.execute(sql, id);
	}
}
