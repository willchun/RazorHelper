package com.willchun.razorhelper.model;

import java.sql.Date;

public class Product {
	private int id;
	private String name;
	private String description;
	private Date datetime;
	private int user_id;
	private int channel_count;
	private String product_key;
	private int product_platform;
	private int category;
	private int active;
	private String umeng_key;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getChannel_count() {
		return channel_count;
	}
	public void setChannel_count(int channel_count) {
		this.channel_count = channel_count;
	}
	public String getProduct_key() {
		return product_key;
	}
	public void setProduct_key(String product_key) {
		this.product_key = product_key;
	}
	public int getProduct_platform() {
		return product_platform;
	}
	public void setProduct_platform(int product_platform) {
		this.product_platform = product_platform;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public String getUmeng_key() {
		return umeng_key;
	}
	public void setUmeng_key(String umeng_key) {
		this.umeng_key = umeng_key;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description="
				+ description + ", datetime=" + datetime + ", user_id="
				+ user_id + ", channel_count=" + channel_count
				+ ", product_key=" + product_key + ", product_platform="
				+ product_platform + ", category=" + category + ", active="
				+ active + ", umeng_key=" + umeng_key + "]";
	}
	
	
}
