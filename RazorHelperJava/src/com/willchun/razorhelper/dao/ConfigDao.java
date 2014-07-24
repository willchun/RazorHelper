package com.willchun.razorhelper.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.willchun.razorhelper.common.BaseDao;
import com.willchun.razorhelper.common.DaoListener;
import com.willchun.razorhelper.model.Config;


public class ConfigDao extends BaseDao<Config> implements DaoListener<Config>{
	
	@Override
	public List<Config> queryAll() {
		// TODO Auto-generated method stub
		return query("select * from razor_config");
	}

	@Override
	public Config dealT(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		Config config = new Config();
		config.setId(rs.getInt(1));
		config.setAutogetlocation(rs.getInt(2));
		config.setUpdateonlywifi(rs.getInt(3));
		config.setProduct_id(rs.getInt(4));
		config.setSessionmillis(rs.getInt(5));
		config.setReportpolicy(rs.getInt(6));
		return config;
	}
}
