package com.rana.test;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.rana.model.Employee;

public class EmpTestXMLToObj {

	public static void main(String[] args) {
			//create object of model class and assign value..
		Employee e = new Employee();
		//holding the file ...
		File f = new File("d:\\io\\webServices_Employee.xml");
		
		//create object of JAXBContext
		try {
			JAXBContext context = JAXBContext.newInstance(Employee.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			Object ob = unmarshaller.unmarshal(f);
			System.out.println(ob);
		} catch (JAXBException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
