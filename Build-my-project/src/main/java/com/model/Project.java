package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Project {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long projectId;
	private String title;
	private String description;
	@Enumerated(EnumType.STRING)
	private String status;
	private Long userId;
	private Long categoryId;
}
