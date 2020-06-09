package com.lambdaschool.javaorders.models;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ordnum;

	private double ordamount;
	private double advanceamount;

	// one customer to many orders - not null
	private long custcode;

	private String orderdescription;
}
