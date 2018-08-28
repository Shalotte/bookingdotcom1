package accomodation.booking.com.repositories;

import org.springframework.data.repository.CrudRepository;
import accomodation.booking.com.entities.UserEntity;

public interface UserRepository extends CrudRepository <UserEntity, Long> {

	

	
}
