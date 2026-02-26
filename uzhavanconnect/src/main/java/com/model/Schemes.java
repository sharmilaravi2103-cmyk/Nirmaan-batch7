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

public class Schemes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Scheme_Id;
	private String Title;
	private String Description;
	private String Eligibility;
	private LocalDateTime Last_Date;
	private Long Posted_By;
	
	@Enumerated(EnumType.STRING)
	private Role role;

	private Boolean isActive;
	private LocalDateTime createdAt;
}
