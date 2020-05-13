package com.rana.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
@XmlRootElement
@Data
public class Cart {
	private Integer cid;
	private String code;
	private List<Part> parts;

}
