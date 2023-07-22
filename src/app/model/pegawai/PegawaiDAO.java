/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model.pegawai;

import app.model.DataAccessModel;
import app.model.base.FilterQuery;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    protected SQLExecuteResult findALL(FilterQuery filterQuery) {
        Connection connection = null;
        ResultSet resultSet = null;
        ArrayList<PegawaiModel> pegawaiModelList = new ArrayList<>();

        try {
            PreparedStatement statement;

            connection = this.sqlStorage.getConnection();

            statement = connection.prepareStatement("""
                                                    SELECT p.nip , p.nama , IFNULL(bp.total_amount, 0) as total_balance 
                                                    FROM pegawai p 
                                                    LEFT JOIN balance_pegawai bp ON bp.nip = p.nip 
                                                    WHERE nama LIKE CONCAT('%',?, '%') 
                                                    ORDER BY p.updated_at DESC
                                                    LIMIT ? OFFSET ?""");
            statement.setString(1, filterQuery.getKeyword());
            statement.setInt(2, filterQuery.getTake());
            statement.setInt(3, filterQuery.getSkip());

            System.out.println("SQL Query: " + statement.toString());

            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                PegawaiModel model = new PegawaiModel();
                UUID uuid = (UUID) resultSet.getObject("nip");
                model.setNip(uuid);
                model.setNama(resultSet.getString("nama"));
                model.setTotalBalance(resultSet.getInt("total_balance"));
                pegawaiModelList.add(model);
            }

            statement.close();
            resultSet.close();
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

        return new SQLExecuteResult(true, pegawaiModelList);
    }

    @Override
    protected SQLExecuteResult<Boolean> deleteByUuid(UUID id) {
        Connection connection = null;
        Timestamp updateddAt = new Timestamp(System.currentTimeMillis());  // Current timestamp

        try {
            PreparedStatement statement;

            connection = this.sqlStorage.getConnection();

            statement = connection.prepareStatement("DELETE FROM pegawai WHERE nip = ?");
            statement.setObject(1, id);

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
    protected SQLExecuteResult<Boolean> update(PegawaiModel data) {
        Connection connection = null;
        Timestamp updateddAt = new Timestamp(System.currentTimeMillis());  // Current timestamp

        try {
            PreparedStatement statement;

            connection = this.sqlStorage.getConnection();

            statement = connection.prepareStatement("UPDATE pegawai SET nama = ?, updated_at = ? WHERE nip = ?");
            statement.setString(1, data.getNama());
            statement.setTimestamp(2, updateddAt);
            statement.setObject(3, data.getNip());

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
    protected SQLExecuteResult<Boolean> create(PegawaiModel data) {
        Connection connection = null;
        Timestamp createdAt = new Timestamp(System.currentTimeMillis());  // Current timestamp

        try {
            byte[] uuid = Uuid.toBytes(data.getNip());
            PreparedStatement statement;

            connection = this.sqlStorage.getConnection();

            statement = connection.prepareStatement("INSERT INTO pegawai (`nip`, `nama`, `created_at`) VALUES (?,?,?)");
            statement.setObject(1, uuid);
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
        return this.update(model);
    }

    @Override
    public SQLExecuteResult<Boolean> DeletePegawai(PegawaiModel model) {
        return this.deleteByUuid(model.getNip());
    }

    @Override
    public SQLExecuteResult<ArrayList<PegawaiModel>> FindPewagaiAll(FilterQuery filterQuery) {
        return this.findALL(filterQuery);
    }
}
