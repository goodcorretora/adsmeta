package com.app.dsmeta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.dsmeta.entities.Sale;
import com.app.dsmeta.services.SaleService;

<<<<<<< HEAD


=======
>>>>>>> e1939efacb27760cb687af5f8cbd14ac2fe643ed
@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleService service;
<<<<<<< HEAD

	
	@GetMapping
	public Page<Sale> findSales(
			@RequestParam(value="minDate", defaultValue = "") String minDate, 
			@RequestParam(value="maxDate", defaultValue = "") String maxDate, 
			Pageable pageable) {
		return service.findSales(minDate, maxDate, pageable);		
	}
}

=======
	
	@GetMapping
	public Page<Sale> findSales(
			@RequestParam(value="minDate", defaultValue = "") String minDate,
			@RequestParam(value="maxDate", defaultValue = "") String maxDate,
			Pageable pageable) {
		return service.findSales(minDate, maxDate, pageable);
	}
}
>>>>>>> e1939efacb27760cb687af5f8cbd14ac2fe643ed
