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
public class Feedback {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long feedbackId;
	private String message;
	@Enumerated(EnumType.STRING)
	private String rating;
	private Long userId;
private Long projectId;
}
