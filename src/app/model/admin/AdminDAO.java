/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model.admin;

import app.model.DataAccessModel;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import storage.SQLExecuteResult;
import storage.SQLStorage;

/**
 *
 * @author Administrator
 */
public class AdminDAO extends DataAccessModel<AdminModel> implements Admin {
    
    public AdminDAO(SQLStorage sqlStorage) {
        super(sqlStorage);
    }

    @Override
    protected SQLExecuteResult findByIntId(int id) {
        AdminModel adminModel = new AdminModel();
        Connection connection = null;
        PreparedStatement statement;
        ResultSet resultSet;

        try {
            connection = this.sqlStorage.getConnection();
            
            statement = connection.prepareStatement("SELECT * FROM admin WHERE id = ?");
            statement.setInt(1, id);
            
            resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                adminModel.setId(resultSet.getInt("id"));
                adminModel.setUsername(resultSet.getString("username"));
            }
            
            resultSet.close();
            statement.close();
            
            if (adminModel.getId() <= 0) throw new  SQLException("Username not found");
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            return new SQLExecuteResult(false, ex.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }

        return new SQLExecuteResult(true, adminModel);
    }

    @Override
    public SQLExecuteResult<AdminModel> findAdminById(int id) {
        return this.findByIntId(id);
    }

    private AdminModel findByUsername(String username) throws Exception {
        AdminModel adminModel = new AdminModel();
        Connection connection = null;
        PreparedStatement statement;
        ResultSet resultSet;

        try {
            connection = this.sqlStorage.getConnection();
            
            statement = connection.prepareStatement("SELECT * FROM admin WHERE username = ?");
            statement.setString(1, username);
            
            resultSet = statement.executeQuery();
                
            while (resultSet.next()) {
                adminModel.setId(resultSet.getInt("id"));
                adminModel.setUsername(resultSet.getString("username"));
                adminModel.setPassword(resultSet.getString("password"));
            }
            
            resultSet.close();
            statement.close();
            
            if (adminModel.getId() <= 0) throw new SQLException("Username not found");
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new Exception(ex.toString());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }

        return adminModel;
    }

    @Override
    public SQLExecuteResult<AdminModel> findAdminByUsername(String username) {
        AdminModel adminModel = new AdminModel();

        try {
            adminModel = this.findByUsername(username);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new SQLExecuteResult(false, ex.getMessage());
        }

        return new SQLExecuteResult(true, adminModel);
    }

}
