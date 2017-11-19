/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_tubes;

/**
 *
 * @author personal
 */
public class Pegawai {
    private String  namaPegawai;
    private String  idPegawai;
    private String  pwdPegawai;

    public Pegawai(String namaPegawai, String idPegawai, String pwdPegawai) {
        this.namaPegawai = namaPegawai;
        this.idPegawai = idPegawai;
        this.pwdPegawai = pwdPegawai;
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public String getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    public String getPwdPegawai() {
        return pwdPegawai;
    }

    public void setPwdPegawai(String pwdPegawai) {
        this.pwdPegawai = pwdPegawai;
    }
    
    
}
