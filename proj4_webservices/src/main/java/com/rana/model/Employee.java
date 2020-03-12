package com.rana.model;

public class Employee {
			private int empid;
			private String name;
			private Address addr;
			@Override
			public String toString() {
				return "Employee [empid=" + empid + ", pname=" + name + ", addr=" + addr + "]";
			}
			public int getEmpid() {
				return empid;
			}
			public void setEmpid(int empid) {
				this.empid = empid;
			}
			public String getPname() {
				return name;
			}
			public void setPname(String pname) {
				this.name = pname;
			}
			public Address getAddr() {
				return addr;
			}
			public void setAddr(Address addr) {
				this.addr = addr;
			}
			public Employee() {
				super();
			} 
}
