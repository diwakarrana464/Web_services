package com.rana.model;

import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;


@Data
@XmlRootElement
public class CustomerResponse {
	
	private String custId;
	private String custName;
	private Map<String, Double> item_amt;
	private Double TotalCost;//    (after discount) = 208.3
	private Double GST;  //         12% of totalCost 
	private Double  BillingAmount;//   totalCost + GST
}
