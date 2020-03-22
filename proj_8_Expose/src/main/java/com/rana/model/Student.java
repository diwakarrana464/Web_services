package com.rana.model;

import com.google.gson.annotations.Expose;

public class Student {
	@Expose(
			serialize =  false,
			deserialize = true)
	private Integer sid;
	@Expose(
			serialize = true,   // take stdName from obj -> show in JSON
			deserialize = false //Do not take stdName from JSON into Object
			)
	private String sname;
	@Expose(deserialize = true)
	private float fee;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname( ) {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public float getFee() {
		return fee;
	}
	public void setFee(float fee) {
		this.fee = fee;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", fee=" + fee + "]";
	}
}
