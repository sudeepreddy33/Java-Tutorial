package com.sudeep.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sudeep.security.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
