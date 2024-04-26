package com.akhil.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhil.feign.IStocksInterface;

@Service
public class StocksServiceImpl implements IStocksService {

	@Autowired
	private IStocksInterface feignService;
	
	@Override
	public Double calculateAmount(String companyName, Integer numStocks) throws Exception{
		Double price = (Double) feignService.getPriceByCompany(companyName).getBody();
		return price*numStocks;
		
	}
}
