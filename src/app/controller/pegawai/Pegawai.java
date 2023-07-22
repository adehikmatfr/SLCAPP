/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.controller.pegawai;

import app.model.ServiceResult;
import app.model.base.FilterQuery;
import app.model.pegawai.PegawaiModel;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public interface Pegawai {

    public ServiceResult<Boolean> CreatePegawai(PegawaiModel pegawaiModel);

    public ServiceResult<Boolean> UpdatePegawai(PegawaiModel pegawaiModel);

    public ServiceResult<Boolean> DeletePegawai(PegawaiModel pegawaiModel);

    public ServiceResult<ArrayList<PegawaiModel>> FindPewagaiAll(FilterQuery filterQuery);
}
