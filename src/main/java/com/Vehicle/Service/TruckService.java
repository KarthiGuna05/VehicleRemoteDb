package com.Vehicle.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.Vehicle.DAO.TruckDAO;
import com.Vehicle.Entity.Truck;

@Service
public class TruckService {
	@Autowired
	TruckDAO td;

	public String truckDetails(List<Truck> c) {
		return td.truckDetails(c);
	}

	public List<Truck> getTruckDetails() {
		return td.getTruckDetails();
	}

	public List<Truck> getPrice() {
		return td.getTruckDetails().stream().filter(f -> f.getPrice() > 30000).collect(Collectors.toList());
	}

	// using @getMapping get the details under color equals condition using stream:
	public List<Truck> getByColour(String a) {
		List<Truck> trucks = td.getTruckDetails();
		return trucks.stream().filter(f -> f.getColour().equalsIgnoreCase(a)).collect(Collectors.toList());
	}

	// using @getMapping get the price details under one condition using stream:
	public List<Integer> getByPrice(int a) {
		return td.getTruckDetails().stream().map(m -> m.getPrice()).filter(f -> f > a).collect(Collectors.toList());
	}

	// using @GetMapping get only the Distinct object:
	public List<Truck> getDistinctDetails() {
		return td.getTruckDetails().stream().distinct().toList();
	}

	// using @GetMapping sort the brand using stream:
	public List<Truck> getSortedByBrand() {
		return td.getTruckDetails().stream().sorted(Comparator.comparing(Truck::getBrand)).toList();
	}

	// using @getMapping find the max Price alone (INTEGER) using stream:
	public Integer getMaxPrice() {
		return td.getTruckDetails().stream().map(m -> m.getPrice()).max(Comparable::compareTo).get();
	}

	// using @GetMapping find the min Object using Stream:
	public Truck getMinObject() {
		return td.getTruckDetails().stream().min(Comparator.comparing(Truck::getPrice)).get();
	}

	// using @getMapping find the 2nd max price only using stream:
	public Integer getSecondMaxPrice() {
		return td.getTruckDetails().stream().map(m -> m.getPrice()).sorted(Comparator.reverseOrder()).skip(1)
				.findFirst().get();
	}
	
	//Using #GetMapping use GroupingBy() in Stream:
	public Map<Integer,Long> getGroupingDetails() {
		return td.getTruckDetails().stream().collect(Collectors.groupingBy(g->g.getPrice(),Collectors.counting()));
	}
	
	//Using #GetMapping getPrice() and  use SummingInt() to get total price in Stream:
	public Long getTotalPrice() {
		return td.getTruckDetails().stream().collect(Collectors.summarizingInt(s->s.getPrice())).getSum();
	}
	
	//j query:
	public List<Object> getByPrice(int a,int b){
		return td.getByPrice(a, b);
	}
	
	public List<Truck> getByStartsWithA(){
		return td.getByStartsWithA();
	}

}
