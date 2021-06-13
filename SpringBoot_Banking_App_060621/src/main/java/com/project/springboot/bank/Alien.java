package com.project.springboot.bank;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component()
//@Table
public class Alien {
	
	@Id
	private int aid;
//	@Column
	private String aname;
//	@Column
	private String alang;

	/*
	 * @Autowired
	 * 
	 * @Qualifier("lap1") private Laptop laptop;
	 * 
	 * public Laptop getLaptop() { return laptop; } public void setLaptop(Laptop
	 * laptop) { this.laptop = laptop; }
	 */
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	
	public String getAlang() {
		return alang;
	}
	public void setAlang(String alang) {
		this.alang = alang;
	}
	
	
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", alang=" + alang + "]";
	}
	public void show() {
		System.out.println("Alien Details:"+ this.aid + " , "+ this.aname +" , "+ this.alang +".");
		//laptop.showL();
	}

}
