package com.offloadmemory.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.offloadmemory.model.Arithmetic;

@RestController
public class ArithmeticController {
	private enum Operation {
	    add,sub,multi,div
	};	
	
	@RequestMapping(value="/arithmetic", method=RequestMethod.POST, consumes="application/json")
	public String getMesage(@RequestBody String bodyPayload) throws JsonParseException, JsonMappingException, IOException{	
		ObjectMapper mapper = new ObjectMapper();
		Arithmetic arithmetic = mapper.readValue(bodyPayload, Arithmetic.class);
		Operation operation = Operation.valueOf(arithmetic.getOperation());
		Integer result = 0;
		
		switch(operation){
			case add:
				result = arithmetic.getOperand1()+arithmetic.getOperand2();
				break;
			case sub:
				result = arithmetic.getOperand1()-arithmetic.getOperand2();
				break;
			case multi: 
				result = arithmetic.getOperand1()*arithmetic.getOperand2();
				break;
			case div: 
				result = arithmetic.getOperand1()/arithmetic.getOperand2();
				break;				
			default:
				break;
		}
		
		
		arithmetic.setResult(result);
		
		return mapper.writeValueAsString(arithmetic);
	}
}
