/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.model.pegawai;

import app.model.base.FilterQuery;
import java.util.ArrayList;
import storage.SQLExecuteResult;

/**
 *
 * @author Administrator
 */
public interface Pegawai {

    public SQLExecuteResult<Boolean> CreatePegawai(PegawaiModel model);

    public SQLExecuteResult<Boolean> UpdatePegawai(PegawaiModel model);

    public SQLExecuteResult<Boolean> DeletePegawai(PegawaiModel model);

    public SQLExecuteResult<ArrayList<PegawaiModel>> FindPewagaiAll(FilterQuery filterQuery);
}
