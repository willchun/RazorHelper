package com.willchun.razorhelper.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.willchun.razorhelper.common.BaseDao;
import com.willchun.razorhelper.common.DBBean;
import com.willchun.razorhelper.common.DaoListener;
import com.willchun.razorhelper.model.ChannelProduct;

public class ChannelProductDao extends BaseDao<ChannelProduct> implements DaoListener<ChannelProduct>{
	
	@Override
	public ChannelProduct dealT(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		ChannelProduct channelProduct = new ChannelProduct();
		channelProduct.setCp_id(rs.getInt(1));
		channelProduct.setDescription(rs.getString(2));
		channelProduct.setUpdateurl(rs.getString(3));
		channelProduct.setEntrypoint(rs.getString(4));
		channelProduct.setLocation(rs.getString(5));
		channelProduct.setVersion(rs.getString(6));
		channelProduct.setDate(rs.getDate(7));
		channelProduct.setProductkey(rs.getString(8));
		channelProduct.setMan(rs.getInt(9));
		channelProduct.setUser_id(rs.getInt(10));
		channelProduct.setProduct_id(rs.getInt(11));
		channelProduct.setChannel_id(rs.getInt(12));
		return channelProduct;
	}

	@Override
	public List<ChannelProduct> queryAll() {
		// TODO Auto-generated method stub
		return query("select * from razor_channel_product");
	}
	
}
