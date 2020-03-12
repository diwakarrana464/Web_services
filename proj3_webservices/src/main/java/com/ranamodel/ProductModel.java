package com.ranamodel;

import java.util.Map;
import java.util.Properties;

public class ProductModel {
	
	private int pid;
	private String pcode;
	private Map<String,String> models;
	private Properties info;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public Map<String, String> getModels() {
		return models;
	}
	public void setModels(Map<String, String> models) {
		this.models = models;
	}
	public Properties getInfo() {
		return info;
	}
	public void setInfo(Properties info) {
		this.info = info;
	}
	
	
	

}
