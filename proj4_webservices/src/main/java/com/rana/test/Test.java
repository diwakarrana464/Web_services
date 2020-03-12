package com.rana.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rana.model.Address;
import com.rana.model.Employee;

public class Test {
		public static void main(String[] args) {
			try {
				Address  a = new Address();
				a.setPin(203394);
				a.setTown("jahangirabad");
				a.setVill("Titauta");
				Employee e = new Employee();
				e.setPname("Diwakar Rana");
				e.setEmpid(100);
				e.setAddr(a);
				
				ObjectMapper om = new ObjectMapper();
				String json = om.writeValueAsString(e);
				System.out.println(json);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
}
