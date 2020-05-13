package com.rana.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaleInfo {
	
	private String pcode;
	private Double pcost;
	private Double lineAmt;
	private Double discount;
	private Double lineValue;

}
