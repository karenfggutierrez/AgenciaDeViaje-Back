package mx.com.bank.AgenciaViajeTA.service;

import java.util.List;


import mx.com.bank.AgenciaViajeTA.dto.CityDTO;
import mx.com.bank.AgenciaViajeTA.dto.RespuestaDTO;

public interface CityService {
	
	List<CityDTO> getCities();
	List<CityDTO> searchCities(String name, String continentName );
	CityDTO createCity(CityDTO newCity);
	CityDTO updateCity(CityDTO newCity);
	RespuestaDTO deleteCity(Long id);
	CityDTO getInformation(Long id);

}
