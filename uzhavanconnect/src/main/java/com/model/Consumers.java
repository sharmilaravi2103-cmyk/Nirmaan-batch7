package com.model;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity

public class Consumers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long User_Id;
	private Long Consumer_Id;
	private String Preferred_Products;
	private String Subscription_Type;
	
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	private boolean isActive;
	private LocalDateTime createdAt;
	

}
