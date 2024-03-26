package mx.com.bank.AgenciaViajeTA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import mx.com.bank.AgenciaViajeTA.model.AirlineEntity;

public interface AirlineRepository extends JpaRepository<AirlineEntity, Long> {
	
	List<AirlineEntity> findByName(String name);
	
	
	


	


}
