/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model.balance_pegawai;

import app.model.AbstractModel;
import java.util.ArrayList;
import java.util.UUID;
import storage.SQLExecuteResult;
import storage.SQLStorage;

/**
 *
 * @author Administrator
 */
public class BalancePegawaiDAO extends AbstractModel<BalancePegawaiModel> implements BalancePegawai {
    public BalancePegawaiDAO(SQLStorage sqlStorage) {
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
    protected SQLExecuteResult Update(BalancePegawaiModel data) {
        return super.Update(data); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected SQLExecuteResult Create(BalancePegawaiModel data) {
        return super.Create(data); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public SQLExecuteResult<Boolean> CreateBalancePewagai(BalancePegawaiModel model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public SQLExecuteResult<Boolean> UpdateBalancePewagai(BalancePegawaiModel model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public SQLExecuteResult<BalancePegawaiModel> FindBalancePewagaiById(UUID id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public SQLExecuteResult<ArrayList<BalancePegawaiModel>> FindBalancePewagaiAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
