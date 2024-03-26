package mx.com.bank.AgenciaViajeTA.service;

import java.util.List;

import mx.com.bank.AgenciaViajeTA.dto.ApplicationEntry;

public interface ApplicationService {
	
	public void createApplicationItem(ApplicationEntry request);

    public List<ApplicationEntry> getApplicationItems();

}
