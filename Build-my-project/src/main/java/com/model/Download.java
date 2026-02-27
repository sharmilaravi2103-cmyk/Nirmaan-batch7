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
public class Download {
	@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long downloadId;
private LocalDateTime downloadDate;
@Enumerated(EnumType.STRING)
private String Status;
private Long userId;
private Long projectId;
}
