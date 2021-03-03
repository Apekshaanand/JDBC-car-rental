package com.car.rental.dao;

import java.util.List;

import com.car.rental.domain.*;

public interface CarDAO {
	public void saveCar(Car theCar);

	public Car getCar(int theId);

	public void deleteCar(int theId);
	
	public void updateCar(Car theCar) ;
	
	public List<Car> getBookedCars();
	

}
