import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class Main {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306:Sudeep";
        String query = "select Driver_ID from Sudeep.Drivers_License";


        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection connection = DriverManager.getConnection(url,"root","javauser");
        Statement statement = connection.createStatement();
        ResultSet resultSet= statement.executeQuery(query);
        String name =  resultSet.getString("Driver_ID");

        System.out.println(name);
        statement.close();
        connection.close();







    }
}