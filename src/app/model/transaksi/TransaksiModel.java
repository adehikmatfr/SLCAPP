/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model.transaksi;

import app.model.pegawai.PegawaiModel;
import java.security.Timestamp;
import java.util.UUID;

/**
 *
 * @author Administrator
 */
public class TransaksiModel {

    public TransaksiModel() {
    }

    private UUID id;
    private UUID nip;
    private char type;
    private int total;
    private int prevTotalAmount;
    private int totalAmount;
    private Timestamp createdAt;
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

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPrevTotalAmount() {
        return prevTotalAmount;
    }

    public void setPrevTotalAmount(int prevTotalAmount) {
        this.prevTotalAmount = prevTotalAmount;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public PegawaiModel getPegawai() {
        return pegawai;
    }

    public void setPegawai(PegawaiModel pegawai) {
        this.pegawai = pegawai;
    }
    
}
