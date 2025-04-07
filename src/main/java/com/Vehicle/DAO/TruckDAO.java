package com.Vehicle.DAO;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Vehicle.Entity.Truck;
import com.Vehicle.Repository.TruckRepository;

@Repository
public class TruckDAO {
	@Autowired
	TruckRepository tr;
	
	public String truckDetails(List<Truck> c) {
		tr.saveAll(c);
		return "Saved Sucessfully";
	}

	public List<Truck> getTruckDetails() {
		return tr.findAll();
	}
	
	public List<Object> getByPrice(int a,int b){
		return tr.getByPrice(a, b);
	}
	
	public List<Truck> getByStartsWithA(){
		return tr.getByStartsWithA();
	}


	
	
}
