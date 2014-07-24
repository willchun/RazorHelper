package com.willchun.razorhelper.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.willchun.razorhelper.common.BaseDao;
import com.willchun.razorhelper.common.DaoListener;
import com.willchun.razorhelper.model.Product;

public class ProductDao extends BaseDao<Product> implements DaoListener<Product>{

	@Override
	public List<Product> queryAll() {
		// TODO Auto-generated method stub
		return query("select * from razor_product");
	}

	@Override
	public Product dealT(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		Product product = new Product();
		product.setId(rs.getInt(1));
		product.setName(rs.getString(2));
		product.setDescription(rs.getString(3));
		product.setDatetime(rs.getDate(4));
		product.setUser_id(rs.getInt(5));
		product.setChannel_count(rs.getInt(6));
		product.setProduct_key(rs.getString(7));
		product.setProduct_platform(rs.getInt(8));
		product.setCategory(rs.getInt(9));
		product.setActive(rs.getInt(10));
		product.setUmeng_key(rs.getString(11));
		return product;
	}
}
