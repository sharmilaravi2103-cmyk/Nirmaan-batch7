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

public class Payment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long paymentId;
	private double amount;
	private LocalDateTime paymentDate;
	@Enumerated(EnumType.STRING)
	private String paymentStatus;
	private Long userId;
	private Long projectId;
	

}
