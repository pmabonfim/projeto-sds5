package com.devsuperior.dsvendas.dto;

import java.io.Serializable;
import java.time.LocalDate;

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

}
