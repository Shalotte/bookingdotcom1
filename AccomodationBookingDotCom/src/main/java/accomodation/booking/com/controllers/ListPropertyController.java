package accomodation.booking.com.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import accomodation.booking.com.entities.ListPropertyEntity;
import accomodation.booking.com.repositories.ListPropertyRepository;


@CrossOrigin(origins= "http://localhost:4200", allowedHeaders="*")
@RestController
@RequestMapping("/api")


public class ListPropertyController {
	
	@Autowired
	private ListPropertyRepository listpropertyRepository;
	
	
@PostMapping("/create/property")
public ListPropertyEntity listProperty(@RequestBody ListPropertyEntity listproperty) {
	
    ListPropertyEntity _listproperty =listpropertyRepository.save(listproperty);
	return _listproperty;
}

@DeleteMapping("/delete/property/{id}")
public ResponseEntity<String> deleteById(@PathVariable ("id") String id ){

	listpropertyRepository.deleteById(id);
	
	return new ResponseEntity<>("Property has been deleted", HttpStatus.OK);
	
}


}
