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

public class Fooditems {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private Long donationrid;
	private Long donorid;
	private Long ngoid;
	private String foodname;
	private String quantity;
	private LocalDateTime expirydate;
	private Boolean status;
	private String location;
	
	@Enumerated(EnumType.STRING)
	private Boolean IsActive;
	private LocalDateTime createdAt;

}
