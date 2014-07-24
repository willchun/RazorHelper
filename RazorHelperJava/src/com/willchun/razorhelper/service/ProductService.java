package com.willchun.razorhelper.service;

import java.util.List;

import com.willchun.razorhelper.dao.ChannelProductDao;
import com.willchun.razorhelper.dao.ProductDao;
import com.willchun.razorhelper.model.ChannelProduct;
import com.willchun.razorhelper.model.Product;

/**
 * 应用列表
 * @author Administrator
 *
 */
public class ProductService {
	
	public List<Product> queryAll(){
		ProductDao dao = new ProductDao();
		return dao.queryAll();
	}
	
	/**
	 * 获取安装平台的所有应用  product_platform=1
	 * @return
	 */
	public List<Product> queryAndroidAll(){
		ProductDao dao = new ProductDao();
		return dao.query("SELECT * FROM razor_product WHERE product_platform = 1");
	}
}
