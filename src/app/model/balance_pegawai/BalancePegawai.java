/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.model.balance_pegawai;

import java.util.ArrayList;
import java.util.UUID;
import storage.SQLExecuteResult;

/**
 *
 * @author Administrator
 */
public interface BalancePegawai {

    public SQLExecuteResult<Boolean> CreateBalancePewagai(BalancePegawaiModel model);

    public SQLExecuteResult<Boolean> UpdateBalancePewagai(BalancePegawaiModel model);

    public SQLExecuteResult<BalancePegawaiModel> FindBalancePewagaiById(UUID id);

    public SQLExecuteResult<ArrayList<BalancePegawaiModel>> FindBalancePewagaiAll();
}
