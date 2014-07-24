package com.willchun.razorhelper.model;

import java.sql.Date;

public class Channel {
	
	private int channel_id;
	private String channel_name;
	private Date create_date;
	private int user_id;
	private String type;
	private int platform;
	private int active;
	private String channel_en;
	
	public int getChannel_id() {
		return channel_id;
	}
	public void setChannel_id(int channel_id) {
		this.channel_id = channel_id;
	}
	public String getChannel_name() {
		return channel_name;
	}
	public void setChannel_name(String channel_name) {
		this.channel_name = channel_name;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPlatform() {
		return platform;
	}
	public void setPlatform(int platform) {
		this.platform = platform;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public String getChannel_en() {
		return channel_en;
	}
	public void setChannel_en(String channel_en) {
		this.channel_en = channel_en;
	}
	@Override
	public String toString() {
		return "Channel [channel_id=" + channel_id + ", channel_name="
				+ channel_name + ", create_date=" + create_date + ", user_id="
				+ user_id + ", type=" + type + ", platform=" + platform
				+ ", active=" + active + ", channel_en=" + channel_en + "]";
	}
	
	
}
