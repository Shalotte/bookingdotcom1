package accomodation.booking.com.repositories;

import org.springframework.data.repository.CrudRepository;

import accomodation.booking.com.entities.ListPropertyEntity;

public interface ListPropertyRepository extends CrudRepository <ListPropertyEntity, String> {

}
