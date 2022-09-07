package com.app.dsmeta.services;

<<<<<<< HEAD
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
=======
import java.time.LocalDate;
>>>>>>> e1939efacb27760cb687af5f8cbd14ac2fe643ed

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.app.dsmeta.entities.Sale;
import com.app.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
<<<<<<< HEAD
	private SaleRepository repository;
	
	public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable) {
		
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		
		LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);
		LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);
		
		return repository.findSales(min, max, pageable);
	}
}

=======
	private SaleRepository  repository;
	
	public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable) {
		
		LocalDate min = LocalDate.parse(minDate);
		LocalDate max = LocalDate.parse(maxDate);
		
		return repository.findSales(min, max, pageable);
	}

}
>>>>>>> e1939efacb27760cb687af5f8cbd14ac2fe643ed
