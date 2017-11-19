/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_tubes;

import java.util.ArrayList;

/**
 *
 * @author personal
 */
public class Aplikasi {
    private ArrayList<Bahan> daftarBahan;
    private ArrayList<Supplier> daftarSupplier;
    private ArrayList<Pegawai> daftarPegawai;
    private ArrayList<Customer> daftarCustomer;
    private ArrayList<Transaksi> Transaksi;
    
    public Aplikasi() {
        daftarBahan = new ArrayList<>();
        daftarSupplier = new ArrayList<>();
        daftarPegawai = new ArrayList<>();
        daftarCustomer = new ArrayList<>();
        Transaksi = new ArrayList<>();
    }
    //--------------------------Bahan--------------------------------
    
    public ArrayList<Bahan> daftarBahan() {
        return daftarBahan;
    }
    
    public Bahan getBahan(int i) {
        return daftarBahan.get(i);
    }
    
    public String[] getDaftarBahan() {
        String[] daftarID = new String[daftarBahan.size()];
        for (int i=0; i<daftarID.length; i++) {
            daftarID[i] = daftarBahan.get(i).getKodeBahan();
        }
        return daftarID;
    }
    
    public void tambahBahan(Bahan barang) {
        daftarBahan.add(barang);
    }
    
    public Bahan getBahanDariNama(String nama) {
        Bahan s = null;
        String[] daftarBahanID = new String[daftarBahan.size()];
        for (int j = 0; j<daftarBahanID.length; j++) {
            if (nama == daftarBahan.get(j).getNamaBahan()) {
                s = daftarBahan.get(j);
            }
        }
        return s;
    }
    
    //--------------------------Pegawai--------------------------------
   
    public String[] getDaftarPegawai() {
        String[] daftarID = new String[daftarPegawai.size()];
        for (int i=0; i<daftarID.length; i++) {
            daftarID[i] = daftarPegawai.get(i).getIdPegawai();
        }
        return daftarID;
    }
    
    public ArrayList<Pegawai> daftarPegawai() {
        return daftarPegawai;
    }
    
    public void tambahPegawai(Pegawai staff) {
        daftarPegawai.add(staff);
    }
    
    public Pegawai getPegawai(int i) {
        return daftarPegawai.get(i);
    }
    
    public Pegawai getPegawaiDariID(String id) {
        Pegawai s = null;
        String[] daftarPegawaiID = new String[daftarPegawai.size()];
        for (int j = 0; j<daftarPegawaiID.length; j++) {
            if (id == daftarPegawai.get(j).getIdPegawai()) {
                s = daftarPegawai.get(j);
            }
        }
        return s;
    }
    //--------------------------Customer--------------------------------
    
    public String[] getDaftarCustomer() {
        String[] daftarID = new String[daftarCustomer.size()];
        for (int i=0; i<daftarID.length; i++) {
            daftarID[i] = daftarCustomer.get(i).getIdCustomer();
        }
        return daftarID;
    }
    
    public ArrayList<Customer> daftarCustomer() {
        return daftarCustomer;
    }
    
    public Customer getCustomer(int i) {
        return daftarCustomer.get(i);
    }
    
    public void tambahCustomer(Customer penyewa) {
        daftarCustomer.add(penyewa);
    }
    
    public Customer getCustomerDariID(String id) {
        Customer s = null;
        String[] daftarCustomerID = new String[daftarCustomer.size()];
        for (int j = 0; j<daftarCustomerID.length; j++) {
            if (id == daftarCustomer.get(j).getIdCustomer()) {
                s = daftarCustomer.get(j);
            }
        }
        return s;
    }
    
    
}
