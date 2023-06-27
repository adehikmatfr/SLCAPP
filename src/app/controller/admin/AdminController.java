/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller.admin;

import app.model.ServiceResult;
import app.model.admin.AdminModel;

/**
 *
 * @author Administrator
 */
public class AdminController implements Admin {

    public AdminController() {
    }

    @Override
    public ServiceResult<AdminModel> FindAdminById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ServiceResult<AdminModel> VerifyLogin(String username, String password) {
//        veryfy password here
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
