package com.rana.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Result {
	private Integer sid;
	private String sname;
	private Integer totalMrks;
	private Integer avg;
	private String grade;
	private List<SubResult> subResultList;
	private String finalResult;
}
