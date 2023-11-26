package com.jsp.workSpace.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.workSpace.dto.Client;

public interface ClientRepo extends JpaRepository<Client, Integer>{

}
