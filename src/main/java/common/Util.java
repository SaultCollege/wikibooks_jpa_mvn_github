/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author fred
 */
public class Util {

    public static void createDatabase() throws Exception {
        String DB_USER = "root";
        String DB_NAME = "wikibooks_jpa";
        Connection connection
                = DriverManager.getConnection("jdbc:mysql://localhost/?user=" + DB_USER + "&password=itstudies12345");
        Statement stmt = connection.createStatement();
        stmt.executeUpdate("DROP DATABASE IF EXISTS " + DB_NAME);
        stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS " + DB_NAME);
    }
}
