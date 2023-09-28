package org.example.config;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.*;


public class JdbcConfig {

    Connection connection;

    private String driver;

    private String url;

    private String username;

    private String password;

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    String query = "select * from Sudeep.DriversLicense";


    //Step3: Call init method (here it's createConnection() to create JdbcConfig bean.
    @PostConstruct
    public void createConnection() throws ClassNotFoundException, SQLException {

        //load Driver
        Class.forName(driver);

        //get a Connection
        connection = DriverManager.getConnection(url, username, password);

        System.out.println("Connection Established:::::::::");


    }


    public void fetchAllRows() throws SQLException {

        //Query Statement
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();

        while (resultSet.next()) {
            // Iterate through each column and retrieve values
            for (int i = 1; i <= columnCount; i++) {
                String columnName = metaData.getColumnName(i);
                Object value = resultSet.getObject(i);
                System.out.println(columnName + ": " + value);
            }
            System.out.println(); // Print an empty line between rows
        }

        statement.close();

    }

    //Step 4: Before destroying the bean - close the connection using @PreDestroy
    @PreDestroy
    public void closeConnection() throws SQLException {
        System.out.println("Connection Closed:::::::::");
        connection.close();
    }
}



