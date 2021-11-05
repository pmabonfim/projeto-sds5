package com.devsuperior.dsvendas.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.devsuperior.dsvendas.domain.entity.Sale;

import lombok.Data;

@Data
public class SaleDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private Integer visited;
	
	private Integer deals;
	
	private Double amount;
	
	private LocalDate date;
	
	private SellerDTO seller;

	public SaleDTO(Long id, Integer visited, Integer deals, Double amount, LocalDate date, SellerDTO seller) {
		super();
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}
	
	public SaleDTO(Sale entity) {
		this.id = entity.getId();
		this.visited = entity.getVisited();
		this.deals = entity.getDeals();
		this.amount = entity.getAmount();
		this.date = entity.getDate();
		this.seller = new SellerDTO(entity.getSeller());
	}
	
	

}
