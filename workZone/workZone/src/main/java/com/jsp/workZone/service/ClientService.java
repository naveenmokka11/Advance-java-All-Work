package com.jsp.workZone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.workZone.dao.ClientDao;
import com.jsp.workZone.dto.Client;
import com.jsp.workZone.util.ResponseStracture;

@Service
public class ClientService {
	
	@Autowired
	private ClientDao clientDao;

	public ResponseEntity<ResponseStracture<Client>> saveClient(Client client){
		
		Client dbdata = clientDao.saveClient(client);
		
		ResponseStracture<Client> stracture=new ResponseStracture<>();
		
		stracture.setMsg("client data saved");
		stracture.setStatus(HttpStatus.CREATED.value());
		stracture.setData(dbdata);
		
		return new ResponseEntity<ResponseStracture<Client>>(stracture,HttpStatus.CREATED);
		
	}
}
