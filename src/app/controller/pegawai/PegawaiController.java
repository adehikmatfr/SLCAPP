/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.controller.pegawai;

import app.model.ServiceResult;
import app.model.base.FilterQuery;
import app.model.pegawai.PegawaiDAO;
import app.model.pegawai.PegawaiModel;
import java.util.ArrayList;
import storage.SQLExecuteResult;
import storage.SQLStorage;

/**
 *
 * @author Administrator
 */
public class PegawaiController implements Pegawai {
    
    public PegawaiController(SQLStorage sqlStorage) {
        this.pegawaiDataAccessObject = new PegawaiDAO(sqlStorage);
    }
    
    private final app.model.pegawai.Pegawai pegawaiDataAccessObject;

    // validate data 
    private ServiceResult validatePegawaiModel(PegawaiModel pegawaiModel) {
        ServiceResult serviceResult = new ServiceResult();
        
        if (pegawaiModel.getNip() == null) {
            serviceResult.addError("nip not empty");
        }
        
        if (pegawaiModel.getNama().equals("")) {
            serviceResult.addError("nama not empty");
        }
        
        if ("".equals(serviceResult.getErrorDetail())) {
            serviceResult.setSuccess();
        }
        
        return serviceResult;
    }
    
    @Override
    public ServiceResult<Boolean> CreatePegawai(PegawaiModel pegawaiModel) {
        ServiceResult serviceResult = this.validatePegawaiModel(pegawaiModel);
        
        if (serviceResult.isSuccess()) {
            SQLExecuteResult<Boolean> sqlExecuteResult = this.pegawaiDataAccessObject.CreatePegawai(pegawaiModel);
            return new ServiceResult(sqlExecuteResult);
        }
        
        return serviceResult;
    }
    
    @Override
    public ServiceResult<Boolean> UpdatePegawai(PegawaiModel pegawaiModel) {
        ServiceResult serviceResult = this.validatePegawaiModel(pegawaiModel);
        
        if (serviceResult.isSuccess()) {
            SQLExecuteResult<Boolean> sqlExecuteResult = this.pegawaiDataAccessObject.UpdatePegawai(pegawaiModel);
            return new ServiceResult(sqlExecuteResult);
        }
        
        return serviceResult;
    }
    
    @Override
    public ServiceResult<ArrayList<PegawaiModel>> FindPewagaiAll(FilterQuery filterQuery) {
        SQLExecuteResult<ArrayList<PegawaiModel>> sqlExecuteResult = this.pegawaiDataAccessObject.FindPewagaiAll(filterQuery);
        return new ServiceResult(sqlExecuteResult);
    }
    
    @Override
    public ServiceResult<Boolean> DeletePegawai(PegawaiModel pegawaiModel) {
        SQLExecuteResult<Boolean> sqlExecuteResult = this.pegawaiDataAccessObject.DeletePegawai(pegawaiModel);
        return new ServiceResult(sqlExecuteResult);
    }
}
