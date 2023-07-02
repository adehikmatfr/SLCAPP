/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model.pegawai;

import app.model.DataAccessModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.UUID;
import storage.SQLExecuteResult;
import storage.SQLStorage;
import java.sql.Timestamp;
import util.Uuid;

/**
 *
 * @author Administrator
 */
public class PegawaiDAO extends DataAccessModel<PegawaiModel> implements Pegawai {

    public PegawaiDAO(SQLStorage sqlStorage) {
        super(sqlStorage);
    }

    @Override
    protected SQLExecuteResult findALL() {
        return super.findALL(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected SQLExecuteResult findByUuid(UUID id) {
        return super.findByUuid(id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected SQLExecuteResult<Boolean> deleteByUuid(UUID id) {
        return super.deleteByUuid(id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected SQLExecuteResult<Boolean> update(PegawaiModel data) {
        return super.update(data); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected SQLExecuteResult<Boolean> create(PegawaiModel data) {
        Connection connection = null;
        Timestamp createdAt = new Timestamp(System.currentTimeMillis());  // Current timestamp

        try {
            byte[] uuid = Uuid.toBytes(data.getNip());
            PreparedStatement statement;

            connection = this.sqlStorage.getConnection();

            statement = connection.prepareStatement("INSERT INTO pegawai (`nip`, `nama`, `created_at`) VALUES (?,?,?)");
            statement.setBytes(1,  uuid);
            statement.setString(2, data.getNama());
            statement.setTimestamp(3, createdAt);

            System.out.println("SQL Query: " + statement.toString());
            
            statement.executeUpdate();
            statement.close();

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

        return new SQLExecuteResult(true, true);
    }

    @Override
    public SQLExecuteResult<Boolean> CreatePegawai(PegawaiModel model) {
        return this.create(model);
    }

    @Override
    public SQLExecuteResult<Boolean> UpdatePegawai(PegawaiModel model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public SQLExecuteResult<Boolean> DeletePegawai(PegawaiModel model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public SQLExecuteResult<PegawaiModel> FindPewagaiById(UUID id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public SQLExecuteResult<ArrayList<PegawaiModel>> FindPewagaiAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
