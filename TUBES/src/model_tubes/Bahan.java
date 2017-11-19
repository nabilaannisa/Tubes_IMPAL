/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_tubes;

import view_tubes.PesanBahanHandler;

/**
 *
 * @author personal
 */
public class Bahan {
    private String kodeBahan;
    private String namaBahan;
    private int jumlahBahan = 0;

    public Bahan(String kodeBahan, String namaBahan) {
        this.kodeBahan = kodeBahan;
        this.namaBahan = namaBahan;
        this.jumlahBahan = 0;
    }
    
    public Bahan(String kodeBahan, String namaBahan, int jumlahBahan){
        this.kodeBahan = kodeBahan;
        this.namaBahan = namaBahan;
        this.jumlahBahan = 0;
    }

    public String getKodeBahan() {
        return kodeBahan;
    }

    public void setKodeBahan(String kodeBahan) {
        this.kodeBahan = kodeBahan;
    }

    public String getNamaBahan() {
        return namaBahan;
    }

    public void setNamaBahan(String namaBahan) {
        this.namaBahan = namaBahan;
    }

    public int getJumlahBahan() {
        return jumlahBahan;
    }

    public void setJumlahBahan(int jumlahBahan) {
        this.jumlahBahan = jumlahBahan;
    }
    
    public String displayBahan() {
        String s = "Nama Bahan : "+getKodeBahan()+"\n"
                +"Kode Bahan : "+getNamaBahan()+"\n"
                +"Jumlah Bahan : "+getJumlahBahan()+"\n";
        return s;
    }

    
    
}
