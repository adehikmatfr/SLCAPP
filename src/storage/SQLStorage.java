/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package storage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class SQLStorage {

    public SQLStorage(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    private final String url;
    private final String username;
    private final String password;
    private Connection connection;
    private PreparedStatement statement;

    @SuppressWarnings("CallToPrintStackTrace")
    public Connection getConnection() throws SQLException {
        try {
            connection = DriverManager.getConnection(this.url, this.username, this.password);
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }

        return connection;
    }
}
