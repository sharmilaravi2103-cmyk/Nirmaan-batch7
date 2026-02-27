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

public class Donor {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long donorid;
private String organizationname;
private Long userid;

@Enumerated(EnumType.STRING)
private Role role;
private Boolean IsActive;
private LocalDateTime createdAt;


}
