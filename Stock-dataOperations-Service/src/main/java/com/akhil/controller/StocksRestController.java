package com.akhil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akhil.Entity.Stocks;
import com.akhil.service.IStocksService;

@RestController
@RequestMapping("/api")
public class StocksRestController {
	
	@Autowired
	private IStocksService service;

	@GetMapping("/get")
	public ResponseEntity<List<Stocks>> fetchingData(){
		return new ResponseEntity<>(service.fetchAllStocks(),HttpStatus.OK);
	}
	
	@GetMapping("/price/{companyName}")
	public ResponseEntity<?> getPriceByCompany(@PathVariable String companyName){
		return new ResponseEntity<>(service.fetchPrice(companyName),HttpStatus.OK);
	}
}
