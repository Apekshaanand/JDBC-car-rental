package com.car.rental.payment;

import java.util.List;

import com.car.rental.domain.*;




public interface PaymentDAO {
	List<Payment> findByPaymentId(int paymentId);
	public void save(Payment payment);
	public List<Payment> findAll();
	public void delete(int paymentId);
	
	
}