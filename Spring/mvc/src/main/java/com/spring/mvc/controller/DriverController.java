package com.spring.mvc.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.mvc.service.DriverService;

@Controller
public class DriverController {

	@Autowired
	DriverService service;


	@RequestMapping("viewInfo")
	public void intro() throws SQLException {
//		service.viewData();

	}

}
