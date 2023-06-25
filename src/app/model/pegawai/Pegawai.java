/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.model.pegawai;

import app.model.balance_pegawai.BalancePegawaiModel;
import java.util.ArrayList;
import java.util.UUID;
import storage.SQLExecuteResult;

/**
 *
 * @author Administrator
 */
public interface Pegawai {
    public SQLExecuteResult<Boolean> CreatePegawai(BalancePegawaiModel model);

    public SQLExecuteResult<Boolean> UpdatePegawai(BalancePegawaiModel model);
    
    public SQLExecuteResult<Boolean> DeletePegawai(BalancePegawaiModel model);

    public SQLExecuteResult<PegawaiModel> FindPewagaiById(UUID id);

    public SQLExecuteResult<ArrayList<PegawaiModel>> FindPewagaiAll();
}
