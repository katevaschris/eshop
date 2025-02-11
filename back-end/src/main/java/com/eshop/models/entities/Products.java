package com.eshop.models.entities;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "products")
public class Products{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "price")
	private Float price;

	@Column(name = "quantity")
	private Integer quantity;
}