package com.arithemtic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arithemtic.model.Arithmetic;
import com.arithemtic.repository.ArithmeticRepository;

@RestController
public class ArithmeticController {
	
	@Autowired
	ArithmeticRepository repository;
	
	@RequestMapping(value="/arithmetic", method= RequestMethod.POST)
	public Arithmetic insertRecord(@RequestParam int operand1, @RequestParam int operand2, @RequestParam String operation) {
		Arithmetic arithmetic = new Arithmetic();
		arithmetic.setOperand1(operand1);
		arithmetic.setOperand2(operand2);
		arithmetic.setOperation(operation);
		int result = 0;
		if(operation.equals("add")) {
			result = operand1+operand2;
		}
		arithmetic.setResult(result);
		return repository.save(arithmetic);
	}
	
	@RequestMapping(value="/arithmetic", method= RequestMethod.GET)
	public List<Arithmetic> getRecords() {
		List<Arithmetic> allRecords = (List<Arithmetic>) repository.findAll();
		return allRecords;
	}
	
	@RequestMapping(value="/arithmetic/{id}", method= RequestMethod.DELETE)
	public String deleteRecord(@PathVariable Integer id) {
		repository.deleteById(id);
		return "Deleted successfully";
	}
}
