package com.ip.fetch.entity;

import java.util.Date;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotBlank(message = "UserName is mandatory")
	private String userName;
	@NotBlank(message = "Password is mandatory")
	private String password;
	@NotBlank(message = "Name is mandatory")
	private String name;
	private String role;
	private String token;
	boolean isEnabled;
	@CreationTimestamp
	private Date createdAt;
	@UpdateTimestamp
	private String lastUpdatedAt;
}
