package com.rana.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.rana.model.Cart;
import com.rana.model.Invoice;
import com.rana.model.Part;
import com.rana.model.SaleInfo;

@Path("/bill")
public class BillingProcessController {
	@POST
	@Path("/cal")
	@Consumes({"application/json","application/xml"})
	@Produces({"application/json","application/xml"})
	public Invoice calculateInvoiceData(
			Cart cart
			) 
	{
		//Get All parts data from Cart
		List<Part> parts=cart.getParts();

		double totalPrice=0.0;
		List<SaleInfo> sales=new ArrayList<>();
		for(Part p:parts) {
			// calculate line values 
			double lineAmt = p.getPcost() * p.getQty();
			double	discount = lineAmt * p.getDiscPer() / 100.0;
			double lineValue = lineAmt - discount;
			
			// convert to SaleInfo object 
			SaleInfo sale=new SaleInfo(
					p.getPcode(), p.getPcost(), 
					lineAmt, discount, lineValue);
			
			// save in List<SaleInfo>
			sales.add(sale);
			
			totalPrice += lineValue;
		}

		//calculate GST
		double gst=totalPrice * 12 /100.0;
		
		double billingAmount = totalPrice + gst;
		
		//Final Output: Invoice Object
		Invoice inv=new Invoice();
		inv.setCid(cart.getCid());
		inv.setCode(cart.getCode());
		
		inv.setSales(sales);
		inv.setTotalPrice(totalPrice);
		inv.setGst(gst);
		inv.setBillingAmount(billingAmount);
		
		return inv;
	}

}
