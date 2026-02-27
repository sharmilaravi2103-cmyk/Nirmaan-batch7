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
public class Ngo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long userid;
	private Long ngoid;;
	@Enumerated(EnumType.STRING)
	private Boolean IsActive;
	private LocalDateTime createdAt;
	
}
