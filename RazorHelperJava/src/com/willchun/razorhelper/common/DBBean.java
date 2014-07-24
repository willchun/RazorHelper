package com.willchun.razorhelper.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.willchun.razorhelper.Config;

/**
 * 基础的DBBean
 * @author Administrator
 */
public class DBBean {
	
	private Connection con;
	private PreparedStatement pstt;
	private ResultSet rs;
	
	public void init() throws Exception{
		//加载驱动程序
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(Config.DB_CONN_PATH, Config.DB_CONN_USER, Config.DB_CONN_PASSWORD);
	}
	
	
	public ResultSet executeQuery(String sql, Object... params) throws SQLException{
		//处理参数
		processParam(sql, params);
		rs = pstt.executeQuery();
		return rs;
	}
	
	public int executeUpdate(String sql, Object... params) throws SQLException{
		//处理参数
		processParam(sql, params);
		//执行
		return pstt.executeUpdate();
	}
	
	/**
	 * 处理数据库参数
	 * @param sql
	 * @param params
	 * @throws SQLException
	 */
	private void processParam(String sql, Object... params) throws SQLException{
		pstt = con.prepareStatement(sql);
		//对SQL变量赋值赋值
		if(params != null){
			for(int i=0; i<params.length; i++){
				pstt.setObject(i+1, params[i]);
			}
		}
	}
	
	/**
	 * 关闭连接
	 */
	public void close(){
		if(rs != null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(pstt != null){
			try {
				pstt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(con != null){
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
