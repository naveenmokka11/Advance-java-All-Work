package com.jsp.workSpace.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.workSpace.dto.Client;
import com.jsp.workSpace.repo.ClientRepo;

@Repository
public class Clientdao {
	
	@Autowired
	private ClientRepo clientRepo;
	
	public Client SaveClient(Client client) {
		
		return clientRepo.save(client);
		
	}
	
	
	

}
