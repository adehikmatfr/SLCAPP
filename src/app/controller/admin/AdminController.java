/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller.admin;

import app.model.ServiceResult;
import app.model.admin.AdminDAO;
import app.model.admin.AdminModel;
import storage.SQLExecuteResult;
import storage.SQLStorage;
import util.Encoder;

/**
 *
 * @author Administrator
 */
public class AdminController implements Admin {

    public AdminController(SQLStorage sqlStorage) {
        this.adminDataAccessObject = new AdminDAO(sqlStorage);
    }

    private final app.model.admin.Admin adminDataAccessObject;

    @Override
    public ServiceResult<AdminModel> FindAdminById(int id) {
        return new ServiceResult(this.adminDataAccessObject.findAdminById(id));
    }

    @Override
    public ServiceResult<AdminModel> VerifyLogin(String username, String password) {
        SQLExecuteResult<AdminModel> sqlExecuteResult = this.adminDataAccessObject.findAdminByUsername(username);

        if (!sqlExecuteResult.isSuccess()) {
            return new ServiceResult(sqlExecuteResult);
        }

        AdminModel adminModel = sqlExecuteResult.getResult();
        if (!Encoder.verifyPassword(password, adminModel.getPassword())) {
            ServiceResult serviceResult = new ServiceResult();
            serviceResult.addError("Wrong Password!");
            return serviceResult;
        }

        return new ServiceResult(sqlExecuteResult);
    }

}
