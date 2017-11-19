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
public class Menu {
    private String kodeMenu;
    private String namaMenu;
    private int hargaMenu;
    private int jumlahMenu;

    public Menu(String kodeMenu, String namaMenu, int hargaMenu, int jumlahMenu) {
        this.kodeMenu = kodeMenu;
        this.namaMenu = namaMenu;
        this.hargaMenu = hargaMenu;
        this.jumlahMenu = jumlahMenu;
    }

    public String getKodeMenu() {
        return kodeMenu;
    }

    public void setKodeMenu(String kodeMenu) {
        this.kodeMenu = kodeMenu;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public int getHargaMenu() {
        return hargaMenu;
    }

    public void setHargaMenu(int hargaMenu) {
        this.hargaMenu = hargaMenu;
    }

    public int getJumlahMenu() {
        return jumlahMenu;
    }

    public void setJumlahMenu(int jumlahMenu) {
        this.jumlahMenu = jumlahMenu;
    }

    
}
