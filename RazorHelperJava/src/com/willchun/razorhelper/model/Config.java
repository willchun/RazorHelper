package com.willchun.razorhelper.model;

public class Config {
	private int id;
	private int autogetlocation;
	private int updateonlywifi;
	private int product_id;
	private int sessionmillis;
	private int reportpolicy;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAutogetlocation() {
		return autogetlocation;
	}
	public void setAutogetlocation(int autogetlocation) {
		this.autogetlocation = autogetlocation;
	}
	public int getUpdateonlywifi() {
		return updateonlywifi;
	}
	public void setUpdateonlywifi(int updateonlywifi) {
		this.updateonlywifi = updateonlywifi;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getSessionmillis() {
		return sessionmillis;
	}
	public void setSessionmillis(int sessionmillis) {
		this.sessionmillis = sessionmillis;
	}
	public int getReportpolicy() {
		return reportpolicy;
	}
	public void setReportpolicy(int reportpolicy) {
		this.reportpolicy = reportpolicy;
	}
	@Override
	public String toString() {
		return "Config [id=" + id + ", autogetlocation=" + autogetlocation
				+ ", updateonlywifi=" + updateonlywifi + ", product_id="
				+ product_id + ", sessionmillis=" + sessionmillis
				+ ", reportpolicy=" + reportpolicy + "]";
	}
	
	
	
}
