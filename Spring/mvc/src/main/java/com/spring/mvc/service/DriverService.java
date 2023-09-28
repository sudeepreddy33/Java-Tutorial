package com.spring.mvc.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DriverService {

//	@Autowired
////	Connection connection;
//
//	public void viewData() throws SQLException {
//
//		Statement statement = connection.createStatement();
//		ResultSet resultSet = statement.executeQuery("Select * from DriversLicense");
//		ResultSetMetaData metaData = resultSet.getMetaData();
//        int columnCount = metaData.getColumnCount();
//
//        while (resultSet.next()) {
//            // Iterate through each column and retrieve values
//            for (int i = 1; i <= columnCount; i++) {
//                String columnName = metaData.getColumnName(i);
//                Object value = resultSet.getObject(i);
//                System.out.println(columnName + ": " + value);
//            }
//            System.out.println(); // Print an empty line between rows
//        }
//
//        statement.close();
//
//	}

}
