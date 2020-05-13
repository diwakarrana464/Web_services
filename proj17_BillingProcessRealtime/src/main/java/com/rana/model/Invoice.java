package com.rana.model;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement
public class Invoice {
	private String code;
	private Integer cid;
	private List<SaleInfo> sales;
	private Double totalPrice;
	private Double gst;
	private Double billingAmount;
}
