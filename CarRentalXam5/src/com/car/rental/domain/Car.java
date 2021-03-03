package com.car.rental.domain;
import java.util.*;
import java.io.*;

/////////////////////////////////////////////Car class/////////////////////////////////////
public class Car {

	private String carType, carModel;
	private double carPrice;
	private int carNO;
	private boolean isAvailable;
	
	public Car() {
	
		carType = "";
		carModel = "";
		carPrice = 0;
	}
	
	public void setCar(String cT, String cM, double cP){
		
		carType = cT;
		carModel = cM;
		carPrice = cP;	
	}
	
	public String getCarType() {
		return carType;
	}
	
	public String getCarModel() {
		return carModel;
	}
	
	public String getCar() {
		return getCarType() + "-" + getCarModel();
	}
		
	public void setCarType(String carType) {
		this.carType = carType;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}

	public double getCarPrice() {
		return carPrice;
	}

	public int getCarNO() {
		return carNO;
	}

	public void setCarNO(int carNO) {
		this.carNO = carNO;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	
	
//	public void saveToFile() throws IOException {
		
//		PrintWriter outFile = new PrintWriter(new FileOutputStream(new File("Cars_Inventory.txt"), true));
//			outFile.println(getCar() + " " + getCarPrice());
//			outFile.close();
//  }
}