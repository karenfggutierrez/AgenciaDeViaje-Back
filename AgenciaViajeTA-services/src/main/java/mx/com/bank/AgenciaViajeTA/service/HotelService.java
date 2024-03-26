package mx.com.bank.AgenciaViajeTA.service;

import java.util.List;

import mx.com.bank.AgenciaViajeTA.dto.HotelDTO;
import mx.com.bank.AgenciaViajeTA.dto.RespuestaDTO;

public interface HotelService {

	List<HotelDTO> getHotels();

	 HotelDTO getHotel(Long idHotel);

	List<HotelDTO> getHotelByName(String nameHotel);
	
	List<HotelDTO> getHotelByCode(String codeHotel);
	
	List<HotelDTO> getHotelByCity(String city);
	
	List<HotelDTO> getHotelByCamp(Long idHotel, String nameHotel, String codeHotel, String city);

	HotelDTO createHotel(HotelDTO request);

	HotelDTO updateHotel(HotelDTO request);

	RespuestaDTO deleteHotel(Long idHotel);
	
	HotelDTO updateHotelStatus(HotelDTO request);

}
