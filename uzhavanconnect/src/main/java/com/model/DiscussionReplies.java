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

public class DiscussionReplies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Reply_Id;
	private Long Discussion_Id;
	private Long User_Id;
	private String Message;
	private LocalDateTime Reply_Date;
	
	@Enumerated(EnumType.STRING)
	private Role role;

	private Boolean isActive;
	private LocalDateTime createdAt;
}
