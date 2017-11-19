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

public class Transaksi {
    private String kodeTransaksi;
    private Pegawai pegawai;
    private Customer costumer;
    Menu[] menu = new Menu[5];
    private int jumlahMenuYangDipesan;
    private int totalMenu;
    private double pembayaran;

    public Transaksi(String kodeTransaksi, Pegawai pegawai, Customer costumer, int jumlahMenu, int totalMenu, double pembayaran) {
        this.kodeTransaksi = kodeTransaksi;
        this.pegawai = pegawai;
        this.costumer = costumer;
        this.jumlahMenuYangDipesan = jumlahMenuYangDipesan;
        this.totalMenu = totalMenu;
        this.pembayaran = pembayaran;
    }

    public String getKodeTransaksi() {
        return kodeTransaksi;
    }

    public void setKodeTransaksi(String kodeTransaksi) {
        this.kodeTransaksi = kodeTransaksi;
    }

    public Pegawai getPegawai() {
        return pegawai;
    }

    public void setPegawai(Pegawai pegawai) {
        this.pegawai = pegawai;
    }

    public Customer getCustomer() {
        return costumer;
    }

    public void setCustomer(Customer costumer) {
        this.costumer = costumer;
    }

    public Menu[] getMenu() {
        return menu;
    }

    public void setMenu(Menu[] menu) {
        this.menu = menu;
    }

    public int getJumlahMenuYangDipesan() {
        return jumlahMenuYangDipesan;
    }

    public void setJumlahMenuYangDipesan(int jumlahMenuYangDipesan) {
        this.jumlahMenuYangDipesan = jumlahMenuYangDipesan;
    }

    public int getTotalMenu() {
        return totalMenu;
    }

    public void setTotalMenu(int totalMenu) {
        this.totalMenu = totalMenu;
    }

    public double getPembayaran() {
        return pembayaran;
    }

    public void setPembayaran(double pembayaran) {
        this.pembayaran = pembayaran;
    }
    
    public void addMenu(Menu m, int jumlahMenuYangDipesan) {
        if (totalMenu < 5) {
            totalMenu++;
            this.menu[totalMenu-1] = m;
            this.menu[totalMenu-1].setJumlahMenu(jumlahMenuYangDipesan);
        }
        else {
            System.out.println("Tidak dapat menambah menu lagi");
        }
    }
}
