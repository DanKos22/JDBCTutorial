package ie.atu.jdbc;


import java.sql.*;

public class pool {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/newdatabase";
        String password = "root";

        String selectSQL= "SELECT email FROM person";

            try {
                Connection connection = DriverManager.getConnection(url, "root", "root");
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(selectSQL);

                while(resultSet.next()) {
                    String email = resultSet.getString("email");
                    System.out.println("Email: "+ email);
                }

            } catch( SQLException e) {
            e.printStackTrace();
        }
    }
}
