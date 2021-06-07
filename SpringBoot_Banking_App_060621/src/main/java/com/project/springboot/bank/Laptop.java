package com.project.springboot.bank;

import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop {
	
	private int laptopid;
	private String brand;
	
	public int getLaptopid() {
		return laptopid;
	}
	public void setLaptopid(int laptopid) {
		this.laptopid = laptopid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	//testchangelaptop
	public void showL() {
		System.out.println("Laptop Show");
	}
	
	

}
