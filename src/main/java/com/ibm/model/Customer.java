package com.ibm.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table (name = "customers")
public class Customer {
	@Id
	@Column(name="customer_id")
	private String customerId;
	@Column(name="customer_name")
	private String customerName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_id")
	private Order order;
}
