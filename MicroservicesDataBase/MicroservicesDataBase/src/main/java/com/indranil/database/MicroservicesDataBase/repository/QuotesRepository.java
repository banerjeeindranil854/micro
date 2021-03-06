package com.indranil.database.MicroservicesDataBase.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indranil.database.MicroservicesDataBase.model.Quote;

public interface QuotesRepository extends JpaRepository<Quote, Integer> {
	List<Quote> findByUserName(String username);
}