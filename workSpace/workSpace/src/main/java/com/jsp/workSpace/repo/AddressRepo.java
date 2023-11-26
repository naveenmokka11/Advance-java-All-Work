package com.jsp.workSpace.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.workSpace.dto.Address;

public interface AddressRepo  extends JpaRepository<Address, Integer>{

}
