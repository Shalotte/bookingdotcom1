package accomodation.booking.com.controllers;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import accomodation.booking.com.entities.DestinationEntity;
import accomodation.booking.com.repositories.DestinationRepository;


@CrossOrigin(origins = "http://localhost:4200",allowedHeaders="*")
@RestController
@RequestMapping("/api")

public class DestinationController {
	
@Autowired
private DestinationRepository destinationRepository ;

//Creating a destination
@PostMapping("/create/destination")

public DestinationEntity postDestination(@RequestBody DestinationEntity destination){
DestinationEntity _destination = destinationRepository.save(destination);
return _destination;
}

//Update a destination
@RequestMapping(method=RequestMethod.PUT, value=("/update/destination"))

public DestinationEntity updateDestination(@RequestBody DestinationEntity destination) {
return destination = destinationRepository.save(destination);	
}

//Searching for destination
@GetMapping("/search/destination/{street_address}/{check_in_date}/{check_out_date}/{children}/{rooms}/{adults}")
public DestinationEntity searchDestination(@PathVariable("street_address") String street_address, @PathVariable("check_in_date") Date check_in_date,
@PathVariable ("check_out_date") Date check_out_date, @PathVariable("children") int children, @PathVariable("rooms") int rooms,
		@PathVariable("adults") int adults){
	
DestinationEntity destionation = null;
  
    
List<DestinationEntity> destinations = new ArrayList<>();
destinationRepository.findAll().forEach(destinations::add);
	
for(int i=0; i<destinations.size(); i++) {
if(destinations.get(i).getAdults()==adults && destinations.get(i).getChildren()==children && destinations.get(i).getCheck_in_date().equals(check_in_date)
&& destinations.get(i).getCheck_out_date().equals(check_out_date) && destinations.get(i).getRooms()==rooms) {

destionation = destinations.get(i);
	
}
		
		
}
	
return destionation ;
}


//Deleting a location by id

@DeleteMapping("/destination/delete/{id}")

public ResponseEntity<String> deleteDestination(@PathVariable ("id") String id){
destinationRepository.deleteById(id);
return new ResponseEntity<String>("Destination is deleted", HttpStatus.OK);
}

}
