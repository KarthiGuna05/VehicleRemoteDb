package com.Vehicle.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.TableGenerator;

@Entity
@TableGenerator(name= "truck_details")
public class Truck {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String brand;
	private int price;
	private String colour;
	private int wheeler;
	private int makeYear;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getWheeler() {
		return wheeler;
	}
	public void setWheeler(int wheeler) {
		this.wheeler = wheeler;
	}
	public int getMakeYear() {
		return makeYear;
	}
	public void setMakeYear(int makeYear) {
		this.makeYear = makeYear;
	}
	public int getNoOftyre() {
		return noOftyre;
	}
	public void setNoOftyre(int noOftyre) {
		this.noOftyre = noOftyre;
	}
	private int noOftyre;
	

}
