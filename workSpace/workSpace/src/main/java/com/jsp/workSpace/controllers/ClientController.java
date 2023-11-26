package com.jsp.workSpace.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.workSpace.dto.Client;
import com.jsp.workSpace.service.ClientService;
import com.jsp.workSpace.util.ResponseStructure;

@RestController
public class ClientController {
	@Autowired
	ClientService clientServices;
	@PostMapping("/saveClient")
	public ResponseEntity<ResponseStructure<Client>> SaveClient(@RequestBody Client Client) {
		
		return clientServices.saveClient(Client);
		
	}

}
