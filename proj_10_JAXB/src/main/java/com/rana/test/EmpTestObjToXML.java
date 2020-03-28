package com.rana.test;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.rana.model.Employee;

public class EmpTestObjToXML {

	public static void main(String[] args) {
			//create object of model class and assign value..
		Employee e = new Employee();
		e.setDept("IT");
		e.setEmpid(100);
		e.setEmpName("Diwakar Rana");
		e.setEmpSal(100000);
		
		//holding the file ...
		File f = new File("d:\\io\\webServices_Employee.xml");
		
		//create object of JAXBContext
		try {
			JAXBContext context = JAXBContext.newInstance(Employee.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.marshal(e, f);
		} catch (JAXBException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("Done");
	}
}
