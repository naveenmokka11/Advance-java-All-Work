package com.jsp.workSpace.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.workSpace.dto.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer> {

}
