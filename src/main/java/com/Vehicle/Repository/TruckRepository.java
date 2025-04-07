package com.Vehicle.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Vehicle.Entity.Truck;

public interface TruckRepository extends JpaRepository<Truck,Integer>{
	
	//J Query:
	
	@Query(value = "select brand,colour from Truck t where t.price>:x and t.price<:y")
	public List<Object> getByPrice(@Param("x") int a,@Param("y") int b);
	
	@Query(value = "select t from Truck t where t.brand like'A%'")
	public List<Truck> getByStartsWithA();
	
}
