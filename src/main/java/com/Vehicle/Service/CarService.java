package com.Vehicle.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.Vehicle.DAO.CarDAO;
import com.Vehicle.Entity.Car;

@Service
public class CarService {
	@Autowired
	CarDAO cd;

	public String carDetails(int a, Car c) {
		return cd.carDetails(a, c);
	}
	
	public String postAllCar(List<Car> c) {
		return cd.postAllCar(c);
	}

	public List<Car> getCarDetails() {
		return cd.getCarDetails();
	}

	public Car carDetailsByIndex(int a) {
		return cd.carDetailsByIndex(a);
	}

	public String carDetailsDeleteByIndex(int a) {
		return cd.carDetailsDeleteByIndex(a);
	}

	public String carChangeObject(int a, Car c) {
		return cd.carChangeObject(a, c);
	}

	public String carBrandChangeObject(int a, Car c) {
		return cd.carBrandChangeObject(a, c);
	}

	public List<Car> getByCarColour(String c) {
		return cd.getByCarColour(c);
	}

	public int getMaxCarPrice() {
		return cd.getMaxCarPrice();
	}

	public List<Car> getCars() {
		return cd.getCars();
	}

	public List<Object> getCarAndSeat() {
		return cd.getCarAndSeat();
	}

	public List<Car> getPriceGreaterThan(int a) {
		return cd.getPriceGreaterThan(a);
	}

	public List<Integer> getPriceByDesc() {
		return cd.getPriceByDesc();
	}

	public List<Object> getCarBetweenPrices(int a, int b) {
		return cd.getCarBetweenPrices(a,b);
	}
	
	public List<Car> getBySeats(){
		return cd.getBySeats();
	}
	
	public List<Car> getByLimitOffset(){
		return cd.getByLimitOffset();
	}
	
	public Integer getMaxPrice() {
		return cd.getMaxPrice();
	}
	
	public List<Car> getMinPriceObject(){
		return cd.getMinPriceObject();
	}
	
	public List<Car> getByColour(String a){
		return cd.getByColour(a);
	}
	
	public Integer getSumOffValue(String a) {
		return cd.getSumOffValue(a);
	}

	



}
