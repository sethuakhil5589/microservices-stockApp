package com.akhil.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("STOCK-DATAOPERATIONS-SERVICE")
public interface IStocksInterface {
	@GetMapping("/api/price/{companyName}")
	public ResponseEntity<?> getPriceByCompany(@PathVariable String companyName)throws Exception;
}
