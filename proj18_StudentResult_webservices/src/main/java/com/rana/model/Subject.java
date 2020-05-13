package com.rana.model;

import lombok.Data;

@Data
public class Subject {
	private String subName;
	private Integer thryMarks;			//obtained marks
	private Integer labMark;             //obtained marks
	private Integer maxThryMark;   //150 per subject
	private Integer maxLabMark;		// 50 per subject
}
