package com.willchun.razorhelper.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.willchun.razorhelper.common.BaseDao;
import com.willchun.razorhelper.common.DBBean;
import com.willchun.razorhelper.common.DaoListener;
import com.willchun.razorhelper.model.Channel;

public class ChannelDao extends BaseDao<Channel> implements DaoListener<Channel>{

	public void add(){
		System.out.println("----------- channel dao add------start------");
		DBBean db = new DBBean();
		try {
			db.init();
			db.executeUpdate("insert into razor_channel value(?, ?, ?, ?, ?, ?, ?, ?)"
					, null, "test", new Date(), 1, "system", 1, 1, "english");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			db.close();
		}
		
		System.out.println("----------- channel dao add------end------");
	}

	@Override
	public Channel dealT(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		Channel channel = new Channel();
		channel.setChannel_id(rs.getInt("channel_id"));
		channel.setChannel_name(rs.getString("channel_name"));
		channel.setCreate_date(rs.getDate("create_date"));
		channel.setUser_id(rs.getInt("user_id"));
		channel.setType(rs.getString("type"));
		channel.setPlatform(rs.getInt("platform"));
		channel.setActive(rs.getInt("active"));
		channel.setChannel_en(rs.getString("channel_en"));
		return channel;
	}

	@Override
	public List<Channel> queryAll() {
		// TODO Auto-generated method stub
		return query("select * from razor_channel");
	}


}	
