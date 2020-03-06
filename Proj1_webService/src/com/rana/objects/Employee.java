package com.rana.objects;

public class Employee {
	 private int empid;
	 private String ename;
	 private float esal;
	 
	 //zero param constructor to generate it use alt+shift+s,o 
	public Employee() {
		super();
	}

	//all accessor and mutators .....   alt+shift+s,r
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getEsal() {
		return esal;
	}

	public void setEsal(float esal) {
		this.esal = esal;
	}
	// here we are overriding String method of oject class.....
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", esal=" + esal + "]";
	}
}
