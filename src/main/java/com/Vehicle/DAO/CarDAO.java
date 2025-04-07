package com.Vehicle.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Vehicle.Entity.Car;
import com.Vehicle.Repository.CarRepository;

@Repository
public class CarDAO {
	@Autowired
	CarRepository cr;

	public String carDetails(int a, Car c) {
		cr.save(c);
		return "Saved Successfully";
	}
	
	public String postAllCar(List<Car> c) {
		cr.saveAll(c);
		return "Saved Successful";
	}

	public List<Car> getCarDetails() {
		return cr.findAll();
	}

	public Car carDetailsByIndex(int a) {
		return cr.findById(a).get();
	}

	public String carDetailsDeleteByIndex(int a) {
		cr.deleteById(a);
		return "Deleted Sucessfully";
	}

	public String carChangeObject(int a, Car c) {
		Car cc = cr.findById(a).get();
		cc.setBrand(c.getBrand());
		cc.setPrice(c.getPrice());
		cc.setColour(c.getColour());
		cc.setEnginecc(c.getEnginecc());
		cc.setModelYear(c.getModelYear());
		cc.setSeats(c.getSeats());
		cr.save(cc);
		return "Updated Sucessfully";
	}

	public String carBrandChangeObject(int a, Car c) {
		Car cc = cr.findById(a).get();
		cc.setBrand(c.getBrand());
		cr.save(cc);
		return "Changed Succesfully";
	}

	public List<Car> getByCarColour(String c) {
		return cr.getByCarColour(c);
	}

	public int getMaxCarPrice() {
		return cr.getMaxCarPrice();
	}
	
	public List<Car> getCars(){
		return cr.getCars();
	}
	
	public List<Object> getCarAndSeat(){
		return cr.getCarAndSeat();
	}
	
	public List<Car> getPriceGreaterThan(int a){
		return cr.getPriceGreaterThan(a);
	}
	
	public List<Integer> getPriceByDesc(){
		return cr.getPriceByDesc();
	}
	
	public List<Object> getCarBetweenPrices(int a, int b) {
		return cr.getCarBetweenPrices(a,b);
	}
	
	public List<Car> getBySeats(){
		return cr.getBySeats();
	}
	
	public List<Car> getByLimitOffset(){
		return cr.getByLimitOffset();
	}
	
	public Integer getMaxPrice() {
		return cr.getMaxPrice();
	}
	
	public List<Car> getMinPriceObject(){
		return cr.getMinPriceObject();
	}
	
	public List<Car> getByColour(String a){
		return cr.getByColour(a);
	}
	
	public Integer getSumOffValue(String a) {
		return cr.getSumOffValue(a);
	}

	




	
	

}
