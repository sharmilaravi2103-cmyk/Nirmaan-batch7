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

public class Farmers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long User_Id;
	private Long Farmer_Id;
	private Double Land_Area;
	private String Soil_Type;
	private String Farming_Type;
	private Long Experience_Years;
	private Boolean Verification_Status;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	private boolean isActive;
	private LocalDateTime createdAt;
	
}
