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
public class D_agent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long agentid;
	
	private String name;
	private Long phno;
	private String vehicleno;
	
	
	@Enumerated(EnumType.STRING)
	private Boolean IsActive;
	
	private LocalDateTime createdAt;
	

}
