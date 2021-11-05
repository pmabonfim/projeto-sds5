package com.devsuperior.dsvendas.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsvendas.domain.entity.Sale;
import com.devsuperior.dsvendas.domain.repository.SaleRepository;
import com.devsuperior.dsvendas.domain.repository.SellerRepository;
import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.dto.SaleSuccessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;

@Service
public class SaleService {
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;

	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable page) {
		sellerRepository.findAll();
		
		Page<Sale> lista = repository.findAll(page);
		
		return lista.map(s -> new SaleDTO(s));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupBySeller() {
		return repository.amountGroupBySeller();
	}

	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupBySeller() {
		return repository.successGroupBySeller();
	}

}
