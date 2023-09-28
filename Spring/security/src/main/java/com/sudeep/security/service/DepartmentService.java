package com.sudeep.security.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sudeep.security.model.Department;
import com.sudeep.security.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepository departmentRepository;

	public String saveDepartment(Department department) {
		departmentRepository.save(department);
		return "Successfully Saved";
	}

	public List<Department> getAllDepartments() {
		List<Department> departments = departmentRepository.findAll();
		return departments;
	}

	public String updateDepartment(Department department, int id) {
		Optional<Department> departmentById = departmentRepository.findById(id);
//		departmentById.get().setId(department.getId());
		departmentById.get().setName(department.getName());
		departmentRepository.save(departmentById.get());

		return "Successfully Updated";
	}

	public String deleteDepartment(int id) {
		Department department = departmentRepository.findById(id).get();
		if (department == null) {
			return "Cannot find the department entry with id" + id;
		} else {
			departmentRepository.deleteById(id);
			return "Successfully deleted";
		}
	}
	
		

}
