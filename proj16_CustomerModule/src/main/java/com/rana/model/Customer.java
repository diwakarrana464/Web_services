package com.rana.model;

import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class Customer {
	private String custId;
	private String custName;
	private Map<String, Double> item_price;
	private Map<String, Integer> item_qnty;
	private List<Integer> discount;
}
