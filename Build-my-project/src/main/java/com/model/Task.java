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

public class Task {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long taskId;
	private String taskName;
	private LocalDateTime deadline;
	@Enumerated(EnumType.STRING)
	private String status;
	private Long projectId;
}
