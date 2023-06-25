/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model.transaksi;

import app.model.AbstractModel;
import java.util.ArrayList;
import java.util.UUID;
import storage.SQLExecuteResult;
import storage.SQLStorage;

/**
 *
 * @author Administrator
 */
public class TransaksiDAO extends AbstractModel<TransaksiModel> implements Transaksi {
    
    public TransaksiDAO(SQLStorage sqlStorage) {
        super(sqlStorage);
    }

    @Override
    protected SQLExecuteResult<ArrayList<TransaksiModel>> FindByALL() {
        return super.FindByALL(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected SQLExecuteResult<TransaksiModel> FindByUUID(UUID id) {
        return super.FindByUUID(id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected SQLExecuteResult<Boolean> DeleteByUUID(UUID id) {
        return super.DeleteByUUID(id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected SQLExecuteResult<Boolean> Update(TransaksiModel data) {
        return super.Update(data); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected SQLExecuteResult<Boolean> Create(TransaksiModel data) {
        return super.Create(data); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @Override
    public SQLExecuteResult<Boolean> CreateTransaksi(TransaksiModel model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public SQLExecuteResult<Boolean> UpdateTransaksi(TransaksiModel model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public SQLExecuteResult<Boolean> DeleteTransaksi(UUID id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public SQLExecuteResult<TransaksiModel> FindTransaksiById(UUID id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public SQLExecuteResult<ArrayList<TransaksiModel>> FindTransaksiAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
