package com.santosediego.DSMeta.controllers;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.santosediego.DSMeta.entities.Sale;
import com.santosediego.DSMeta.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private SaleService service;

	@GetMapping
	public Page<Sale> findAll(
			@RequestParam(value = "minDate", defaultValue = "") String minDate,
			@RequestParam(value = "maxDate", defaultValue = "") String maxDate,
			Pageable pageable) {
		return service.findSales(minDate, maxDate, pageable);
	}
}
