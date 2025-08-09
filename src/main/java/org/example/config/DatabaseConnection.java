package org.example.config;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;

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
        }
        catch(){

        }
    }
}
