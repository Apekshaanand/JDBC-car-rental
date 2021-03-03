package com.car.rental.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.car.rental.db.DBUtility;
import com.car.rental.domain.Car;
import com.car.rental.domain.Customer;

public class CarDAOImpl implements CarDAO{
	DBUtility db = new DBUtility();
 	PreparedStatement pst;
 	ResultSet rs;
 	Car car =  new Car();

	public List<Car> getBookedCars(){
		List<Car> carlist  = null;
		return carlist;
	}

	public void saveCar(Car theCar){
		try{
			String sql = "insert into Car(carType,carModel) values(?,?)";
			pst = db.createPST(sql);
			pst.setString(1, theCar.getCarType());
			pst.setString(2, theCar.getCarModel());

			
			int i  =  db.update(pst);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
	}

	

	public Car getCar(int theId){
		
		String sql = "select * from car where id=?";
		try{
	 		pst = db.createPST(sql);
	 		pst.setInt(1,  theId);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		Car car = null;
		
		return car;
		
	}

	public void deleteCar(int theId){
		String sql = "delete from car where id=?";
		try{
 		pst = db.createPST(sql);
 		pst.setInt(1,  theId);
 		 db.update(pst);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	public void updateCar(Car theCar) {
		try {
			String sql = "update car set carType=?,carModel=? where id=?";
			pst = db.createPST(sql);
			pst.setString(1, theCar.getCarType());
			pst.setString(2, theCar.getCarModel());
	

			int i  =  db.update(pst);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		}
		
	}



