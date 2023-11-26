package com.jsp.workZone.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.workZone.dto.ClientBooking;

public interface ClientBookingsRepo extends JpaRepository<ClientBooking, Integer>  {

}
