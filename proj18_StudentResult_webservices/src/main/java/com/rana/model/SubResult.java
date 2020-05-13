package com.rana.model;

import lombok.Data;

@Data
public class SubResult {
	private String subName;
	private Integer thryMarksPer;   //individual percentage of theory
	private Integer labMarkPer;      // and lab
	private String passFail;   				//fail or pass status per subject  
}
   