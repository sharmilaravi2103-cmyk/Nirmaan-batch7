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

public class Notifications {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Notification_Id;
	private Long User_Id;
	private String Title;
	private String Message;
	private String Type;
	private Short is_Read;
	
	
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	private Boolean isActive;
	private LocalDateTime createdAt;

}
