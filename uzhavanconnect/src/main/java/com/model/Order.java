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

public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Order_Id;
	private Long Consumer_Id;
	private LocalDateTime Order_Date;
	private Double Total_Amount;
	private String Payment_Method;
	private Boolean Order_Status;
	
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	private boolean isActive;
	private LocalDateTime createdAt;
	
}
