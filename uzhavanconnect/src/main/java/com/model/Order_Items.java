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

public class Order_Items {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Order_Item_Id;
	private Long Order_Id;
	private Long Product_Id;
	private Long Quantity;
	private Double Subtotal;
	
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	private boolean isActive;
	private LocalDateTime createdAt;

}
