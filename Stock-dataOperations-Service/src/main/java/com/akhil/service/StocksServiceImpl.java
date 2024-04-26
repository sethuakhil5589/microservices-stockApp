package com.akhil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhil.Entity.Stocks;
import com.akhil.exception.CompanyNotFound;
import com.akhil.repo.IStocksRepo;

@Service
public class StocksServiceImpl implements IStocksService {

	@Autowired
	private IStocksRepo repo;
	@Override
	public List<Stocks> fetchAllStocks() {
		return repo.findAll();
	}
	@Override
	public Double fetchPrice(String companyName) {
		Stocks company = repo.findByCompanyName(companyName);
		if (company==null) {
			throw new CompanyNotFound("Company Not Found");
		}
		else {
			return	company.getPrice();
		}
	}

}
