package com.model;

import java.time.LocalDateTime;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues.Strategy;
import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long User_Id;
	private String Name;
	private String Email;
	private String PhoneNumber;
	private String Password;
	private String State;
	private String PinCode;
	private Boolean Status;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	private Boolean isActive;
	private LocalDateTime createdAt;
	
}
