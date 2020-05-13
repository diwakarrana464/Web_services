package com.rana.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement
@Data
public class Student {
	private Integer sid;
	private String sname;
	private List<Subject> subjectList;

}
