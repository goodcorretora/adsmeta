package com.app.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
