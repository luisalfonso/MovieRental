package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    Connection connection;
    static String bd = "movies_rental";
    static String port = "3306";
    static String login = "root";
    static String password = "admin";
  

    public DBConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:" + DBConnection.port + "/" + DBConnection.bd;
            connection = DriverManager.getConnection(url, DBConnection.login, DBConnection.password);
            System.out.println("Conecxion Establecida");

        } catch (Exception ex) {
            System.out.println(DBConnection.login + DBConnection.password);
            System.out.println(ex.getMessage());
        }

    }

    public Connection getConnection() {
        return connection;
    }

    public void desconectar() {
        connection = null;
    }

}