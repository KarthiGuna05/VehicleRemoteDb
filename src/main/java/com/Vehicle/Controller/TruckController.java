package com.Vehicle.Controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Vehicle.Entity.Car;
import com.Vehicle.Entity.Truck;
import com.Vehicle.Service.TruckService;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/truck")
@RestController
public class TruckController {
	@Autowired
	TruckService ts;

	@PostMapping(value = "/truckDetails")
	public String truckDetails(@RequestBody List<Truck> c) {
		return ts.truckDetails(c);
	}

	// using @getMapping get the details:
	@GetMapping(value = "/getTruckDetails")
	public List<Truck> getTruckDetails() {
		return ts.getTruckDetails();
	}

	// using @getMapping get the details under price condition using stream:
	@GetMapping("/getPrice")
	public List<Truck> getPrice() {
		return ts.getPrice();
	}

	// using @getMapping get the details under color equals condition using stream:
	@GetMapping("/getByColour/{a}")
	public List<Truck> getByColour(@PathVariable String a) {
		return ts.getByColour(a);
	}

	// using @getMapping get the price details under one condition using stream:
	@GetMapping("/getByPrice/{a}")
	public List<Integer> getByPrice(@PathVariable int a) {
		return ts.getByPrice(a);
	}

	// using @GetMapping get only the Distinct object:
	@GetMapping("/getDistinctDetails")
	public List<Truck> getDistinctDetails() {
		return ts.getDistinctDetails();
	}

	// using @GetMapping sort the brand using stream:
	@GetMapping("/getSortedByBrand")
	public List<Truck> getSortedByBrand() {
		return ts.getSortedByBrand();
	}

	// using @getMapping find the max Price alone (INTEGER) using stream:
	@GetMapping("/getMaxPrice")
	public Integer getMaxPrice() {
		return ts.getMaxPrice();
	}

	// using @GetMapping find the min Object using Stream:
	@GetMapping("/getMinObject")
	public Truck getMinObject() {
		return ts.getMinObject();
	}

	// using @getMapping find the 2nd max price only using stream:
	@GetMapping("/getSecondMaxPrice")
	public Integer getSecondMaxPrice() {
		return ts.getSecondMaxPrice();
	}
	
	//Using #GetMapping use GroupingBy() in Stream:
	@GetMapping("/getGroupingDetails")
	public Map<Integer,Long> getGroupingDetails() {
		return ts.getGroupingDetails();
	}
	
	//Using #GetMapping getPrice() and  use SummingInt() to get total price in Stream:
	@GetMapping("/getTotalPrice")
	public Long getTotalPrice() {
		return ts.getTotalPrice();
	}
	
	//j query:
	@GetMapping("/getByPrice/{a}/{b}")
	public List<Object> getByPrice(@PathVariable int a,@PathVariable int b){
		return ts.getByPrice(a, b);
	}
	
	@GetMapping("/getByStartsWithA")
	public List<Truck> getByStartsWithA(){
		return ts.getByStartsWithA();
	}
	
}
