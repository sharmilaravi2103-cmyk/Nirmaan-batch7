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
public class Delivery {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long deliveryid;
	
	private Long donationid;
	private Long Agentid;
	private LocalDateTime pickuptime;
	private LocalDateTime droptime;
	private Boolean deliverystatus;
	
	@Enumerated(EnumType.STRING)
	private Boolean IsActive;
	
	private LocalDateTime created;
	
	
	
	

}
