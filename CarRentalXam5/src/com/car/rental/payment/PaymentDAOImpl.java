package com.car.rental.payment;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.car.rental.db.DBUtility;
import com.car.rental.domain.Customer;
import com.car.rental.domain.Payment;

public class PaymentDAOImpl implements PaymentDAO {
	
	DBUtility db = new DBUtility();
 	PreparedStatement pst;
 	ResultSet rs;
 	Payment payment  = new Payment();
	
	public void save(Payment payment){
		try{
			String sql = "insert into payment(paymentId,paymentType,isConfirm,amount,reservation) values(?,?,?,?,?)";
			pst = db.createPST(sql);
			pst.setInt(1, payment.getPaymentId());
			pst.setString(2, payment.getPaymentType());

			pst.setString(3, payment.getIsConfirm());
			pst.setDouble(4, payment.getAmount());
			pst.setObject(5, payment.getReservation());
						int i  =  db.update(pst);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public List<Payment> findAll(){
		List<Payment> list = new ArrayList<>();
	      Payment p = new Payment();
		String sql = "SELECT * from payment";
		try{
	      ResultSet rs = pst.executeQuery(sql);
	      //STEP 5: Extract data from result set
	      
	      while(rs.next()){
	         //Retrieve by column name
	        p.setPaymentId(rs.getInt("paymentId"));
	        p.setPaymentType(rs.getString("paymentType"));
	        p.setIsConfirm(rs.getString("IsConfirm"));
	        p.setAmount(rs.getDouble("amount"));
	            list.add(p);
	      }
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	      return list;
	}
	public void delete(int paymentId){
		String sql = "delete from payment where id=?";
		try{
 		pst = db.createPST(sql);
 		pst.setInt(1,  paymentId);
 		 db.update(pst);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	public List<Payment> findByPaymentId(int paymentId){
		List<Payment> list = new ArrayList<>();
	      Payment p = new Payment();
		String sql = "SELECT * from payment where paymentId=?";
		try{
			pst.setInt(1,  paymentId);
	      ResultSet rs = pst.executeQuery(sql);
	      //STEP 5: Extract data from result set
	      
	      while(rs.next()){
	         //Retrieve by column name
	        p.setPaymentId(rs.getInt("paymentId"));
	        p.setPaymentType(rs.getString("paymentType"));
	        p.setIsConfirm(rs.getString("IsConfirm"));
	        p.setAmount(rs.getDouble("amount"));
	            list.add(p);
	      }
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	      return list;
		
	}

}
