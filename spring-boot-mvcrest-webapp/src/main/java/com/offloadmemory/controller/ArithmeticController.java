package com.offloadmemory.controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.offloadmemory.exceptions.ImageNotFoundException;
import com.offloadmemory.model.Arithmetic;

@RestController
public class ArithmeticController {
	
	private enum Operation {
	    add,sub,multi,div
	};	
	
	@ResponseBody
	@RequestMapping(value = "/photo2", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
	public ResponseEntity<byte[]> localRedirect() throws ImageNotFoundException{
		final HttpHeaders headers = new HttpHeaders();
		byte[] imageInByte = null;
		
		try{
			BufferedImage originalImage = ImageIO.read(new URL("https://avatars3.githubusercontent.com/u/"));
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ImageIO.write( originalImage, "jpg", baos );
			baos.flush();
			imageInByte = baos.toByteArray();
			baos.close();
		    headers.setContentType(MediaType.IMAGE_PNG);
		}
		catch(Exception e){
			throw new ImageNotFoundException();
		}
	    
	    return new ResponseEntity<byte[]>(imageInByte, headers, HttpStatus.CREATED);
	}
	
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
