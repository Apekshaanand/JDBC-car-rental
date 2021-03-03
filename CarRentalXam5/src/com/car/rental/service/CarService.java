package com.car.rental.service;

import java.util.List;

import com.car.rental.domain.Car;

public interface CarService {
	

	public void saveCar(Car theCar);

	public Car getCar(int theId);

	public void deleteCar(int theId);
	
	public void updateCar(Car theCar) ;
	
	public List<Car> getBookedCars();
	
	

}
