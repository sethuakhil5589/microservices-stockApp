package com.akhil.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akhil.Entity.Stocks;

public interface IStocksRepo extends JpaRepository<Stocks, Integer> {
	Stocks findByCompanyName(String companyName);
}
