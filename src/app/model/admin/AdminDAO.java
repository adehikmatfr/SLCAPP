/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model.admin;

import app.model.AbstractModel;
import storage.SQLExecuteResult;
import storage.SQLStorage;

/**
 *
 * @author Administrator
 */
public class AdminDAO extends AbstractModel<AdminModel> implements Admin {

    public AdminDAO(SQLStorage sqlStorage) {
        super(sqlStorage);
    }

    @Override
    protected SQLExecuteResult FindByINTID(int id) {
        return super.FindByINTID(id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected SQLExecuteResult Update(AdminModel data) {
        return super.Update(data); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected SQLExecuteResult Create(AdminModel data) {
        return super.Create(data); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public SQLExecuteResult<Boolean> CreateAdmin(AdminModel model) {
        return this.Create(model);
    }

    @Override
    public SQLExecuteResult<Boolean> UpdateAdmin(AdminModel model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public SQLExecuteResult<AdminModel> FindAdminById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public SQLExecuteResult<AdminModel> VerifyLogin(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
