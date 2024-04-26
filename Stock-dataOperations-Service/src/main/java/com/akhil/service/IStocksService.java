package com.akhil.service;

import java.util.List;

import com.akhil.Entity.Stocks;

public interface IStocksService {
	List<Stocks> fetchAllStocks();
	Double fetchPrice(String companyName);
}
