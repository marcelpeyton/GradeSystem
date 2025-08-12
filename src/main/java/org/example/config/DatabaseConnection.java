package org.example.config;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private Connection connection;

    static Dotenv dotenv = Dotenv.load();
    private static final String URL = dotenv.get("DATABASE_URL");
    private static final String USER = dotenv.get("DATABASE_USER");
    private static final String PASSWORD = dotenv.get("DATABASE_PASSWORD");

    private DatabaseConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(URL,USER,PASSWORD);
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static DatabaseConnection getInstance(){
        if(instance == null){
            synchronized (DatabaseConnection.class){
                if(instance == null){
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    public Connection getConnection(){
        return connection;
    }
}
