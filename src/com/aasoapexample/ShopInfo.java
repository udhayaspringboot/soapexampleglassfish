package com.aasoapexample;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.aasoapexample.exception.CustomException;

@WebService
@SOAPBinding(style=Style.RPC)
public class ShopInfo {
	
	@WebResult(partName="lookupOutput")
	public String getInfo(@WebParam(partName="lookupInput")String property) throws CustomException
	{
		property =null;
		if(property.equalsIgnoreCase("Check-in"))
		{
			return "Check-in Successfull";
		}else if(property.equalsIgnoreCase("check-out"))
		{
			return "check-in failed";
		}
		else
		{
			throw new CustomException("invalid input", property+"not a valid input");
		}
	}

}
