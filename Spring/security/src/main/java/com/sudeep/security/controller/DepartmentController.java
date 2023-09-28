package com.sudeep.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sudeep.security.model.Department;
import com.sudeep.security.service.DepartmentService;

@RestController
@RequestMapping("department")
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;

	// create
	@PostMapping
	@RequestMapping("/createDepartment")
	public String createDepartment(Department department) {

		return departmentService.saveDepartment(department);

	}

	// read

	@GetMapping
	@RequestMapping("/getAllDepartments")
	public List<Department> readDepartment() {

		return departmentService.getAllDepartments();

	}

	// update

	@PostMapping
	@RequestMapping("/updateDepartment/{id}")
	public String updateDepartment(@RequestBody Department department, @PathVariable int id) {

		return departmentService.updateDepartment(department, id);

	}

	// delete

	@DeleteMapping
	@RequestMapping("/deleteDepartment/{id}")
	public String updateDepartment(@PathVariable int id) {

		return departmentService.deleteDepartment(id);

	}

}
