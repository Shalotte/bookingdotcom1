package accomodation.booking.com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import accomodation.booking.com.entities.BookingEntity;
import accomodation.booking.com.repositories.BookingRepository;

@CrossOrigin(origins = "http://localhost:4200",allowedHeaders="*")
@RestController
@RequestMapping("/api")

public class BookingController {
	
       @Autowired
       private BookingRepository bookingRepository;
       
       
       @PostMapping("/create/booking")
       public BookingEntity createBooking(@RequestBody BookingEntity booking) {
    	   
       BookingEntity _booking = bookingRepository.save(booking);
       return _booking;
    	   
       }

}
