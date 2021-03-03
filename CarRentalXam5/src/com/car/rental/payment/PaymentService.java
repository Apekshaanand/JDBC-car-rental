package com.car.rental.payment;
import java.util.List;

import com.car.rental.domain.Payment;
import com.car.rental.domain.Reservation;

public interface PaymentService {
	public void addPayment(Payment payment, Reservation obj);

	public List<Payment> findPaymentByID(String paymentId);

	public List<Payment> findAllPayment();

	public void cancelPayment(int paymentId);

	public Payment getPaymentObject(String paymentId);

	public void paymentUpdated(Payment payment, double amount);

	public double findTotalAmount(List<Payment> list);

	//public List<Payment> searchPaymentByCustomerName(String customerName);
}
