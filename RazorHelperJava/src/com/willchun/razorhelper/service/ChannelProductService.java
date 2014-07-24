package com.willchun.razorhelper.service;

import java.util.Date;
import java.util.List;

import com.willchun.razorhelper.dao.ChannelProductDao;
import com.willchun.razorhelper.model.ChannelProduct;

/**
 * 各应用渠道表单
 * @author Administrator
 *
 */
public class ChannelProductService {
	
	public List<ChannelProduct> queryAll(){
		ChannelProductDao dao = new ChannelProductDao();
		return dao.queryAll();
	}
	
	public List<ChannelProduct> queryByProductAndChannel(int product_id, int channel_id){
		ChannelProductDao dao = new ChannelProductDao();
		return dao.query("select * from razor_channel_product where product_id = ? and channel_id = ?", product_id, channel_id);
	}
	
	/**
	 * 增加一个应用渠道
	 * @param product_id 应用id
	 * @param channel_id 渠道id
	 * @param key 合并key
	 * @return
	 */
	public int add(int product_id, int channel_id, String key){
		ChannelProductDao dao = new ChannelProductDao();
		String sql = "insert into razor_channel_product (product_id, channel_id, productkey, date) value(?, ?, ?, ?)";
		return dao.execute(sql, product_id, channel_id, key, new Date()); 
	}
	
	/**
	 * 通过Id修改合并key
	 * @param cp_id 生产渠道id
	 * @param key 合并key
	 * @return
	 */
	public int updateKeyById(int cp_id, String key){
		ChannelProductDao dao = new ChannelProductDao();
		String sql = "update razor_channel_product set productkey = ? where cp_id = ?";
		return dao.execute(sql, key, cp_id);
	}
	
	/**
	 * 通过id删除某个资源
	 * @param cp_id
	 * @return
	 */
	public int deleteById(int cp_id){
		ChannelProductDao dao = new ChannelProductDao();
		String sql = "delete from razor_channel_product where cp_id = ?";
		return dao.execute(sql, cp_id);
	}
	
}
