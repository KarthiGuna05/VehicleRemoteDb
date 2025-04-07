package com.Vehicle.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Vehicle.Entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {

	// Only give unimplements method :
	//NATIVEQUERY:
	@Query(value = "select * from car_details where colour =?", nativeQuery = true)
	public List<Car> getByCarColour(String c);

	@Query(value = "select max(price) from car_details", nativeQuery = true)
	public int getMaxCarPrice();
	
	@Query(value = "select*from car_details", nativeQuery = true)
	public List<Car> getCars();
	
	@Query(value = "select brand,seats from car_details", nativeQuery = true)
	public List<Object> getCarAndSeat();
	
	@Query(value = "select*from car_details where price>?", nativeQuery = true)
	public List<Car> getPriceGreaterThan(int a);
	
	@Query(value = "select price from car_details order by price desc",nativeQuery = true)
	public List<Integer> getPriceByDesc();
	
	@Query(value = "select brand,colour from car_details where price>? && price<?",nativeQuery = true)
	public List<Object> getCarBetweenPrices(int a,int b);
	
	@Query(value = "select *from car_details where seats>2 limit 2",nativeQuery = true)
	public List<Car> getBySeats();
	
	@Query(value = "select *from car_details where price>20000 limit 2 offset 2",nativeQuery = true)
	public List<Car> getByLimitOffset();
	
	@Query(value = "select max(price) from car_details",nativeQuery = true)
	public Integer getMaxPrice();
	
	@Query(value = "select *from car_details where price=(select min(price) from car_details)",nativeQuery = true)
	public List<Car> getMinPriceObject();
	
	//J QUERY:
	@Query(value = "select c from Car c where c.colour=:x")
	public List<Car> getByColour(@Param("x") String a);
	
	@Query(value = "select sum(price) from Car c where c.colour=:Y")
	public Integer getSumOffValue(@Param("Y") String a);
}
