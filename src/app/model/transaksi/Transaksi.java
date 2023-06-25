/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.model.transaksi;

import java.util.ArrayList;
import java.util.UUID;
import storage.SQLExecuteResult;

/**
 *
 * @author Administrator
 */
public interface Transaksi {
    public SQLExecuteResult<Boolean> CreateTransaksi(TransaksiModel model);

    public SQLExecuteResult<Boolean> UpdateTransaksi(TransaksiModel model);
    
    public SQLExecuteResult<Boolean> DeleteTransaksi(UUID id);

    public SQLExecuteResult<TransaksiModel> FindTransaksiById(UUID id);

    public SQLExecuteResult<ArrayList<TransaksiModel>> FindTransaksiAll();
}
