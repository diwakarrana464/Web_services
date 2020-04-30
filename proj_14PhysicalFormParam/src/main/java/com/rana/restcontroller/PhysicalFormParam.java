package com.rana.restcontroller;

import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/physicalform")
public class PhysicalFormParam {
	
	@POST
	@Path("param")
	public String formMessage(
		@FormParam("cardNum")int cardNum,
		@FormParam("cardName")String cardName,
		@FormParam("expYear")int expYear,
		@FormParam("cvv")int cvv,
		@FormParam("amt")Double amt,
		@FormParam("expMonth")String expMonth
			) {
		
		StringBuffer sb = new StringBuffer();
		String msg = sb.append("Expiring Month is ").append(expMonth).append("Card number is ").append(cardNum).append("Card name is ").append(cardName).append("cvv number is ").append(cvv)
		.append("Amount  is ").append(amt).append("exping year  is ").append(expYear).toString();
				return msg ;
	}
}
