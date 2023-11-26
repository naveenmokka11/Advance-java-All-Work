package com.jsp.workSpace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.workSpace.dao.Clientdao;
import com.jsp.workSpace.dto.Client;
import com.jsp.workSpace.util.ResponseStructure;

@Service
public class ClientService {
	@Autowired
	private Clientdao clientdao;
	
	public ResponseEntity<ResponseStructure<Client>> saveClient(Client client){
		
		Client db = clientdao.SaveClient(client);
		ResponseStructure<Client> rs=new ResponseStructure<>();
		rs.setData(db);
		rs.setMassage("client Data Inserted");
		rs.setStatus(HttpStatus.CREATED.value());
		
		return new  ResponseEntity<ResponseStructure<Client>>(rs,HttpStatus.CREATED);
		
	}

}
