package com.willchun.razorhelper.model;

import java.sql.Date;

public class ChannelProduct {
	private int cp_id;
	private String description;
	private String updateurl;
	private String entrypoint;
	private String location;
	private String version;
	private Date date;
	private String productkey;
	private int man;
	private int user_id;
	private int product_id;
	private int channel_id;
	public int getCp_id() {
		return cp_id;
	}
	public void setCp_id(int cp_id) {
		this.cp_id = cp_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUpdateurl() {
		return updateurl;
	}
	public void setUpdateurl(String updateurl) {
		this.updateurl = updateurl;
	}
	public String getEntrypoint() {
		return entrypoint;
	}
	public void setEntrypoint(String entrypoint) {
		this.entrypoint = entrypoint;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getProductkey() {
		return productkey;
	}
	public void setProductkey(String productkey) {
		this.productkey = productkey;
	}
	public int getMan() {
		return man;
	}
	public void setMan(int man) {
		this.man = man;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getChannel_id() {
		return channel_id;
	}
	public void setChannel_id(int channel_id) {
		this.channel_id = channel_id;
	}
	@Override
	public String toString() {
		return "ChannelProduct [cp_id=" + cp_id + ", description="
				+ description + ", updateurl=" + updateurl + ", entrypoint="
				+ entrypoint + ", location=" + location + ", version="
				+ version + ", date=" + date + ", productkey=" + productkey
				+ ", man=" + man + ", user_id=" + user_id + ", product_id="
				+ product_id + ", channel_id=" + channel_id + "]";
	}
	
	
}
