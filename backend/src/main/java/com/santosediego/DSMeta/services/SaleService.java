package com.santosediego.DSMeta.services;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.santosediego.DSMeta.entities.Sale;
import com.santosediego.DSMeta.repositories.SaleRepository;

@Service
public class SaleService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private SaleRepository repository;

	@Transactional(readOnly = true)
	public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable) {

		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());

		LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);
		LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);

		return repository.findSales(min, max, pageable);
	}
}
