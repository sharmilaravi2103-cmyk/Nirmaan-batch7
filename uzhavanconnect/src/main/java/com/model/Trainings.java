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

public class Trainings {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Training_Id;
	private String Title;
	private String Trainer_Name;
	private String Video_Link;
	private String Category;
	private LocalDateTime Training_Date;
	private Long Created_By;
	
	@Enumerated(EnumType.STRING)
	private Role role;

	private Boolean isActive;
	private LocalDateTime createdAt;
}
