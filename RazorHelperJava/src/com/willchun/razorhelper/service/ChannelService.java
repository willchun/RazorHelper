package com.willchun.razorhelper.service;

import java.util.List;

import com.willchun.razorhelper.dao.ChannelDao;
import com.willchun.razorhelper.model.Channel;

/**
 * 渠道列表
 * @author Administrator
 *
 */
public class ChannelService {
	
	public List<Channel> queryAll(){
		ChannelDao dao = new ChannelDao();
		return dao.queryAll();
	}
	
	public List<Channel> queryAndroidAll(){
		ChannelDao dao = new ChannelDao();
		return dao.query("select * from razor_channel where platform=?", 1);
	}
}
