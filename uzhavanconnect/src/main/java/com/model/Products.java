package com.model;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Products {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Product_Id;
	private Long Farmer_Id;
	private String Crop_Name;
	private String Category;
	private Double Quantity;
	private String Quality_Grade;
	private Double Expected_Price;
	private LocalDateTime Harvest_Date;
	private Boolean Status;

	@Enumerated(EnumType.STRING)
	private Role role;
	
	private boolean isActive;
	private LocalDateTime createdAt;
	

}
