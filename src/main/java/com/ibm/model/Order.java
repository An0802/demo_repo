package com.ibm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "orders")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data

public class Order {
	@Id
	@Column(name = "order_id")
	private String orderId;
	@Column (name = "order_type")
	private String orderType;
	@Column (name = "order_price")
	private double orderPrice;
	@Column (name = "Is_Confirmed")
	private Boolean isConfirmed;
}
