/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.controller.admin;

import app.model.ServiceResult;
import app.model.admin.AdminModel;

/**
 *
 * @author Administrator
 */
public interface Admin {
    public ServiceResult<AdminModel> FindAdminById(int id);

    public ServiceResult<AdminModel> VerifyLogin(String username, String password);
}
