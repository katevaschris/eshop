package com.eshop.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import com.eshop.models.entities.Category;

import java.time.OffsetDateTime;

@Entity
@Getter
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "price")
	private Float price;

	@Column(name = "stock")
	private Integer stock = 0;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category", referencedColumnName = "id")
	private Category category;

	@Column(name = "created_at")
	private OffsetDateTime createdAt;
}