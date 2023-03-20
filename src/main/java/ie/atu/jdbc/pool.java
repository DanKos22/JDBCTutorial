package ie.atu.jdbc;


import java.sql.*;

public class pool {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/newdatabase";
        String password = "root";

        String selectSQL= "SELECT p.name, p.age, p.email" + "FROM person p " + "WHERE name = Paulina";

            try {

                Connection connection = DriverManager.getConnection(url, "root", "root");
                System.out.println("Connection is successful to the database: " + url);
            } catch( SQLException e) {
            e.printStackTrace();
        }
    }
}
