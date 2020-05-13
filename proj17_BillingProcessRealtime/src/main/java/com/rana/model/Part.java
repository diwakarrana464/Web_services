package com.rana.model;

import lombok.Data;

@Data
public class Part {
	
	private Integer pid;
	private String pcode;
	private Double pcost;
	private Integer qty;
	private Integer discPer;

}
