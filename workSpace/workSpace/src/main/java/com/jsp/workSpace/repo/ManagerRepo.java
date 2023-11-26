package com.jsp.workSpace.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.workSpace.dto.Manager;

public interface ManagerRepo extends JpaRepository<Manager, Integer> {

}
