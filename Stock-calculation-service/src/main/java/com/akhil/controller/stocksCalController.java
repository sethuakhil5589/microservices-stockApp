package com.akhil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akhil.Service.IStocksService;

@RestController
@RequestMapping("/cal")
public class stocksCalController {
	
	@Autowired
	private IStocksService service;
	private ResponseEntity<?> response;
	

	@GetMapping("/getAmount/{companyName}/{numStocks}")
	public ResponseEntity<?> getAmount(@PathVariable String companyName,@PathVariable Integer numStocks) throws Exception{
//		String message;
//		try {
//			Double price = service.calculateAmount(companyName, numStocks);
//			message="The total amount you need: "+price;
//		} catch (Exception e) {
//			message="Company Not found";
//			e.printStackTrace();
//		}
//		return new ResponseEntity<>(message,HttpStatus.OK);
		return new ResponseEntity<>(service.calculateAmount(companyName, numStocks),HttpStatus.OK);
	}
}
