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

public class Discussion {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long Discussion_Id;
private Long Farmer_Id;
private String Title;
private String Description;
private LocalDateTime Posted_Date;

@Enumerated(EnumType.STRING)
private Role role;

private Boolean isActive;
private LocalDateTime createdAt;
}
