package com.santosediego.DSMeta.services;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public List<Sale> findSales() {
		return repository.findAll();
	}
}
