package com.model;


import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="Trainee102")
@PrimaryKeyJoinColumn(name="ID")

public class Trainee extends Employee{

	 float payperhour;
    String contractperiod;
	
	
	public Trainee() {
		super();
	}
	public Trainee(float payperhour, String contractperiod,String name) {
		super(name);
		this.payperhour = payperhour;
		this.contractperiod = contractperiod;
	}
	public float getPayperhour() {
		return payperhour;
	}
	public void setPayperhour(float payperhour) {
		this.payperhour = payperhour;
	}
	public String getContractperiod() {
		return contractperiod;
	}
	public void setContractperiod(String contractperiod) {
		this.contractperiod = contractperiod;
	}
	
	
}
