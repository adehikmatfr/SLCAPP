/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model.balance_pegawai;

import app.model.pegawai.PegawaiModel;
import java.util.UUID;

/**
 *
 * @author Administrator
 */
public class BalancePegawaiModel {

    public BalancePegawaiModel() {
    }

    private UUID id;
    private UUID nip;
    private int total_amount;
    private PegawaiModel pegawai;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getNip() {
        return nip;
    }

    public void setNip(UUID nip) {
        this.nip = nip;
    }

    public int getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(int total_amount) {
        this.total_amount = total_amount;
    }

    public PegawaiModel getPegawai() {
        return pegawai;
    }

    public void setPegawai(PegawaiModel pegawai) {
        this.pegawai = pegawai;
    }
}
