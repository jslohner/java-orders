package com.lambdaschool.javaorders.models;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long custcode;

	private String custname;
	private String custcity;
	private String workingarea;
	private String custcountry;
	private String grade;
	private double openingamt;
	private double receiveamt;
	private double paymentamt;
	private double outstandingamt;
	private String phone;

	// on agent to many customers - not null
	private long agentcode;
}
