package com.car.rental.payment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.car.rental.domain.Payment;
import com.car.rental.domain.Reservation;


public class PaymentServiceImp implements PaymentService {
	
	PaymentDAO paymentDao;

	
	public void addPayment(Payment payment, Reservation obj) {
		payment.setPaymentDateTime(new Date());
		payment.setReservation(obj);
		payment.setIsConfirm("PAID");
		paymentDao.save(payment);
	}

	
	public List<Payment> findPaymentByID(String paymentId) {
		List<Payment> paymentList = paymentDao.findByPaymentId(Integer.parseInt(paymentId));
		return paymentList;
	}

	
	public List<Payment> findAllPayment() {
		List<Payment> paymentList = paymentDao.findAll();
		return paymentList;
	}

	public void cancelPayment(int paymentId) {
		List<Payment> paymentList = paymentDao.findByPaymentId(paymentId);
		for (Payment p : paymentList) {
			if (paymentId==p.getPaymentId()) {
				paymentDao.delete(paymentId);
			}
		}
	}

	
	public double findTotalAmount(List<Payment> list) {
		double amount = 0.0;
		for (Payment p : list)
			amount += p.getAmount();
		return amount;
	}

	List<Payment> findByPaymentId(int paymentId){
	List<Payment> p = 	 paymentDao.findByPaymentId(paymentId);
		return p;
	}
	
	public Payment getPaymentObject(String paymentId) {
		List<Payment> paymentList = paymentDao.findByPaymentId(Integer.parseInt(paymentId));
		for (Payment p : paymentList) {
			if (paymentId.equals(p.getPaymentId() + "")) {
				return p;
			}
		}
		return null;
		
	}


	public void paymentUpdated(Payment payment, double amount) {
		if (payment != null) {
			payment.setAmount(amount);
			paymentDao.save(payment);
		}

	}

	
	

}
