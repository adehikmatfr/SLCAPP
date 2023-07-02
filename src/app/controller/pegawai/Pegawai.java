/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.controller.pegawai;

import app.model.ServiceResult;
import app.model.pegawai.PegawaiModel;

/**
 *
 * @author Administrator
 */
public interface Pegawai {
     public ServiceResult<Boolean> CreatePegawai(PegawaiModel pegawaiModel);
}
