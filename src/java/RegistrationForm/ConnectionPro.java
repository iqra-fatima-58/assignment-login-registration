/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegistrationForm;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Asad Choudhary
 */
public class ConnectionPro {

    private static Connection con;

    public static Connection getConnection() {
        try {
            Class.forName("com.sqlservel.jdbc.Driver");
            String dbURL = "jdbc:sqlserver://DESKTOP-BSA7KR4;databaseName=Assignment_05";
            String userName = "sa";
            String password = "asad507";

            con = DriverManager.getConnection(dbURL, userName, password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
