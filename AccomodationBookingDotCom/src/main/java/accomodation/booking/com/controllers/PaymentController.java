package accomodation.booking.com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import accomodation.booking.com.entities.PaymentEntity;
import accomodation.booking.com.repositories.PaymentRepositories;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins= "http://localhost:4200", allowedHeaders="*")
@RestController
@RequestMapping("/api")


public class PaymentController {
	
	@Autowired
	private PaymentRepositories paymentRepository;
	
	
//Getting all payments
	@GetMapping("/payments")
	public List<PaymentEntity> getAllPayments(){
		
	List<PaymentEntity> payments = new ArrayList<>();
	paymentRepository.findAll().forEach(payments::add);
	
	return payments;
		
	}
	
//Creating a payment
	
	@PostMapping("/create/payment")
	
    public PaymentEntity createPayment(@RequestBody PaymentEntity paymnent) {
	PaymentEntity _payment = paymentRepository.save(paymnent);
	return _payment;	
	}
    

}
