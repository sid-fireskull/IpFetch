package com.ip.fetch.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name = "ip_domain")
public class IpDomain {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String domains;
	private String ips;
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	@CreationTimestamp
	private Date createdAt;
	@UpdateTimestamp
	private String lastUpdatedAt;
	
}
