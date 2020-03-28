package com.rana.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="emp-data")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {
	@XmlAttribute(name="eid")
	private int empid;
	@XmlElement(name="ename")
	private String EmpName;
	@XmlTransient
	private float empSal;
	private String dept;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", EmpName=" + EmpName + ", empSal=" + empSal + ", dept=" + dept + "]";
	}
}
