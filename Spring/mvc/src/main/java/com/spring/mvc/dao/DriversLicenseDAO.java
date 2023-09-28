package com.spring.mvc.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Getter;
import lombok.Setter;

@Table
public class DriversLicenseDAO {

	@Id
	@Getter
	@Setter
    public String driverID;

	@Getter
	@Setter
    public String firstName;

	@Getter
	@Setter
    public String lastName;

	@Getter
	@Setter
    public String address;

	@Getter
	@Setter
    public String postCode;
}
