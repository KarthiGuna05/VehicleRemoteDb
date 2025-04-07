package com.Vehicle.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Vehicle.Entity.Car;
import com.Vehicle.Service.CarService;

@RequestMapping("/car")
@RestController
public class CarController {
	@Autowired
	CarService cs;

	@PostMapping(value = "/carDetails/{a}")
	public String carDetails(@PathVariable int a, @RequestBody Car c) {
		return cs.carDetails(a, c);
	}
	
	@PostMapping(value = "/postAll")
	public String postAllCar(@RequestBody List<Car> c) {
		return cs.postAllCar(c);
	}

	@GetMapping(value = "/getCarDetails")
	public List<Car> getCarDetails() {
		return cs.getCarDetails();
	}

	@GetMapping(value = "/carDetailsByIndex/{a}")
	public Car carDetailsByIndex(@PathVariable int a) {
		return cs.carDetailsByIndex(a);
	}

	@GetMapping(value = "/carDetailsDeleteByIndex/{a}")
	public String carDetailsDeleteByIndex(@PathVariable int a) {
		return cs.carDetailsDeleteByIndex(a);
	}

	@PutMapping("carChangeObject/{a}")
	public String carChangeObject(@PathVariable int a, @RequestBody Car c) {
		return cs.carChangeObject(a, c);
	}

	@PatchMapping("/carBrandChangeObject/{a}")
	public String carBrandChangeObject(@PathVariable int a, @RequestBody Car c) {
		return cs.carBrandChangeObject(a, c);
	}

	@GetMapping("/getByCarColour/{c}")
	public List<Car> getByCarColour(@PathVariable String c) {
		return cs.getByCarColour(c);
	}

	@GetMapping("/getMaxCarPrice")
	public int getMaxCarPrice() {
		return cs.getMaxCarPrice();
	}
	
	@GetMapping("/getCars")
	public List<Car> getCars(){
		return cs.getCars();
	}
	
	@GetMapping("/getCarAndSeat")
	public List<Object> getCarAndSeat() {
		return cs.getCarAndSeat();
	}
	
	@GetMapping("/getPriceGreaterThan/{a}")
	public List<Car> getPriceGreaterThan(@PathVariable int a){
		return cs.getPriceGreaterThan(a);
	}
	@GetMapping("/getPriceByDesc")
	public List<Integer> getPriceByDesc(){
		return cs.getPriceByDesc();
	}
	
	@GetMapping("/getCarBetweenPrices/{a}/{b}")
	public List<Object> getCarBetweenPrices(@PathVariable int a,@PathVariable int b) {
		return cs.getCarBetweenPrices(a,b);
	}
	
	@GetMapping("/getBySeats")
	public List<Car> getBySeats(){
		return cs.getBySeats();
	}
	
	@GetMapping("/getByLimitOffset")
	public List<Car> getByLimitOffset(){
		return cs.getByLimitOffset();
	}
	
	@GetMapping("/getMaxPrice")
	public Integer getMaxPrice() {
		return cs.getMaxPrice();
	}
	
	@GetMapping("/getMinPriceObject")
	public List<Car> getMinPriceObject(){
		return cs.getMinPriceObject();
	}
	
	@GetMapping("/getByColour/{a}")
	public List<Car> getByColour(@PathVariable String a){
		return cs.getByColour(a);
	}
	
	@GetMapping("/getSumOffValue/{a}")
	public Integer getSumOffValue(@PathVariable String a) {
		return cs.getSumOffValue(a);
	}
	
}
