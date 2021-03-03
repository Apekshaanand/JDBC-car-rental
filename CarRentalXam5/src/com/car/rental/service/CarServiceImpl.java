
package com.car.rental.service;
import java.util.List;
import java.util.Scanner;

import com.car.rental.dao.CarDAO;
import com.car.rental.dao.CarDAOImpl;

import com.car.rental.dao.CustomerDAOImpl;
import com.car.rental.domain.Car;
import com.car.rental.domain.Customer;


public class CarServiceImpl implements CarService {
	Scanner sc  = new Scanner(System.in);
 	CarDAO cardao = new CarDAOImpl();
	
	public List<Car> getBookedCars(){
		
		return null;
	}

	public void saveCar(Car theCar){
		System.out.println("Enter the carModel ");
		String carModel = sc.next();
		System.out.println("Enter the carType");
		String carType  = sc.next();
		// do fo all fields which I have menttioned in Customer.java
		
		Car car = new Car();
		car.setCarModel(carModel);;
		car.setCarType(carType);
		
		cardao.saveCar(car);
		System.out.println("One Entry Inserted Successfully");
	}
		
	

	public Car getCar(int theId){
		
		Car car = null;
		
		return car;
		
	}

	public void deleteCar(int theId){
		System.out.println("Enter the ID which you want to delete");
		int id = sc.nextInt();
		Car cust = new Car();
		cust.setCarNO(id);
	cardao.deleteCar(theId);
	 System.out.println("One Entry Deleted Successfully");

	}
	public void updateCar(Car theCar) {
		System.out.println("Enter the ID which you want to update");
		int id = sc.nextInt();
		System.out.println("Enter the new Modelname");
		String name = sc.next();
		System.out.println("Enter the new carType");
		String type = sc.next();
		Car p = new Car();
		p.setCarModel(name);
		p.setCarType(type);
		p.setCarNO(id);
		cardao.updateCar(theCar);
		//custDao.addCustomer(cust);
		System.out.println("One Entry Updated Successfully");
		
	}
	}
	


