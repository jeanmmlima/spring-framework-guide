package com.jeanlima.connection;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.jupiter.api.Test;

public class JDBConn {

    @Test
    public void testJDBC(){
        String jdbcUrl = "jdbc:mysql://localhost:3306/HIBERMAP?useSSL=false";
        String user = "hbstudent";
        String pass = "hbstudent";

        System.out.println(pass);

        try {
            System.out.println("Connecting to DB: "+jdbcUrl);

            Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);

            System.out.println("Connection Successful!");
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
    
}
