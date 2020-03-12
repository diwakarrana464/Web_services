package com.rana.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ranamodel.ProductModel;

public class ProductTest {

	public static void main(String[] args) {
		Map<String, String> models = new HashMap();
		models.put("M1", "Red");
		models.put("M2", "Yellow");
		models.put("M3", "Green");
		models.put("M4", "Pink");
		Properties p = new Properties();
		p.put("val1", "3.2");
		p.put("val2", "kuch Bhi");
		try {
			ProductModel pm = new ProductModel();
			pm.setPid(100);
			pm.setPcode("ABC");
			pm.setModels(models);
			pm.setInfo(p);
			
			ObjectMapper om = new  ObjectMapper();
			String json = om.writeValueAsString(pm);
			System.out.println(json);
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
