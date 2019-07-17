package com.backend.tamnun.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.backend.tamnun.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	// this @query annotation will include the jpql query - it is not native SQL but our objects
	// we are adding parameters that start with column and the @Param annotation will do the mapping between the variable names 
	// of the function and the parameter values that will be sent to Hibernate
//	@Query("from Flight where departureCity=:departureCityIn and arrivalCity=:arrivalCityIn and dateOfDeparture=:dateOfDepartureIn")
//	public List<Flight> findFlightsByOrignDestinationsAndDate(@Param("departureCityIn") String departureCity, @Param("arrivalCityIn") 
//	String arrivalCity, @Param("dateOfDepartureIn") Date dateOfDeparture);
	
	

}

