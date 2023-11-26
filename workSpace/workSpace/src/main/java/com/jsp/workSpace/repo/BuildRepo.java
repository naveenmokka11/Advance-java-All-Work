package com.jsp.workSpace.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.workSpace.dto.Building;

public interface BuildRepo  extends JpaRepository<Building, Integer>{

}
