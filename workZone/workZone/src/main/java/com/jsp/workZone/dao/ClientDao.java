package com.jsp.workZone.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.workZone.dto.Client;
import com.jsp.workZone.repo.ClientRepo;

@Repository
public class ClientDao {
	
	@Autowired
	private ClientRepo clientRepo;
	
	public Client saveClient(Client client) {
		
		return clientRepo.save(client);
		
	}

}
