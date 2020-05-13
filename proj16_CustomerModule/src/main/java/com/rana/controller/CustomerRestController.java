package com.rana.controller;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.rana.model.Customer;
import com.rana.model.CustomerResponse;

@Path("/cust")
public class CustomerRestController {
	@POST
	@Path("/bill")
	@Consumes({"application/json", "application/xml"})
	@Produces({"application/json", "application/xml"})
	
	public CustomerResponse callBill(Customer customer){
		
		CustomerResponse  custRes = new CustomerResponse();
					// setting value to customerResponse
					custRes.setCustId(customer.getCustId());
					custRes.setCustName(customer.getCustName());
				
					Map<String, Double>  item_amt = new HashMap<String, Double>();
					Double totalCost = 0.0d;
					
					//calculating amount per item ......
					for( Map.Entry<String, Double>   entry  :  customer.getItem_price().entrySet()) {
						String key = entry.getKey();
						Double amt = entry.getValue()*customer.getItem_qnty().get(key);
						item_amt.put(key, amt);
					
						// for calculating total amount ......................
						totalCost +=amt;
						custRes.setTotalCost(totalCost);
					}
					
					custRes.setItem_amt(item_amt);
					// for calculation of total cost
					custRes.setGST(totalCost*.12);
					//for calculating final cost
					custRes.setBillingAmount(totalCost+totalCost*.12);
	
		return custRes ;
	}
}
