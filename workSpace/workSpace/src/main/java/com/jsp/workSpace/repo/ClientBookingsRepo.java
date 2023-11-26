package com.jsp.workSpace.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.workSpace.dto.ClientBooking;

public interface ClientBookingsRepo extends JpaRepository<ClientBooking, Integer>{

}
