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

    public SQLExecuteResult<AdminModel> findAdminById(int id);

    public SQLExecuteResult<AdminModel> findAdminByUsername(String username);
}
