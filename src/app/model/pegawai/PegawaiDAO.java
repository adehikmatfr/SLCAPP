/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model.pegawai;

import app.model.AbstractModel;
import app.model.balance_pegawai.BalancePegawaiModel;
import java.util.ArrayList;
import java.util.UUID;
import storage.SQLExecuteResult;
import storage.SQLStorage;

/**
 *
 * @author Administrator
 */
public class PegawaiDAO extends AbstractModel implements Pegawai{
    
    public PegawaiDAO(SQLStorage sqlStorage) {
        super(sqlStorage);
    }

    @Override
    protected SQLExecuteResult FindByALL() {
        return super.FindByALL(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected SQLExecuteResult FindByUUID(UUID id) {
        return super.FindByUUID(id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected SQLExecuteResult DeleteByUUID(UUID id) {
        return super.DeleteByUUID(id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected SQLExecuteResult Update(Object data) {
        return super.Update(data); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected SQLExecuteResult Create(Object data) {
        return super.Create(data); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public SQLExecuteResult<Boolean> CreatePegawai(BalancePegawaiModel model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public SQLExecuteResult<Boolean> UpdatePegawai(BalancePegawaiModel model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public SQLExecuteResult<Boolean> DeletePegawai(BalancePegawaiModel model) {
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
