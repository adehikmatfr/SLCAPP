/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.model.admin;

import storage.SQLExecuteResult;

/**
 *
 * @author Administrator
 */
public interface Admin {

    public SQLExecuteResult<Boolean> CreateAdmin(AdminModel model);

    public SQLExecuteResult<Boolean> UpdateAdmin(AdminModel model);

    public SQLExecuteResult<AdminModel> FindAdminById(int id);

    public SQLExecuteResult<AdminModel> VerifyLogin(String username, String password);
}
