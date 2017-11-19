/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view_tubes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import model_tubes.Aplikasi;
import view_tubes.Pegawai;

/**
 *
 * @author personal
 */
public class PegawaiHandler extends MouseAdapter implements ActionListener{
    
    private Aplikasi app;
    private Pegawai view;
    
    public PegawaiHandler(Aplikasi app) {
        this.app = app;
        view = new Pegawai();
        view.addActionListner(this);
        view.setVisible(true);  
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
            if (source.equals(view.getbuttonPesanBahan())) {
                this.view.dispose();
                new PesanBahan().setVisible(true);
            }
            if (source.equals(view.getbuttonKelolaBahan())) {
                this.view.dispose();
                new KelolaBahanHandler().setVisible(true);
            }
            if (source.equals(view.getbuttonKelolaTransaksi())) {
                this.view.dispose();
                new KelolaTransaksiHandler().setVisible(true);
            }
            if (source.equals(view.getbuttonBuatLaporan())) {
                this.view.dispose();
                new BuatLaporanHandler().setVisible(true);
            }
            if (source.equals(view.getbuttonKelolaMenu())) {
                this.view.dispose();
                new KelolaMenuHandler().setVisible(true);
            }
    }
    
}
