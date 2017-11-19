/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view_tubes;
import model_tubes.Aplikasi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import model_tubes.Bahan;
import model_tubes.Aplikasi;
/**
 *
 * @author personal
 */
public class PesanBahanHandler extends MouseAdapter implements ActionListener{
    private Aplikasi app;
    private PesanBahan view;
    
    public PesanBahanHandler() {
        this.app = app;
        view = new PesanBahan();
        view.addActionListener(this);
        view.addMouseAdapter(this);
        view.setVisible(true); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource(); {
            if (source.equals(view.getpesanBahan())) {
                String kode = view.getKodeBahan();
                String nama = view.getNamaBahan();
                int jumlah = view.getJumlahBahan();
                Bahan b = new Bahan(kode, nama, jumlah);
                app.tambahBahan(b);
                view.resetView();
                view.setListBahan(app.getDaftarBahan());
            }
            else if (source.equals(view.getdeleteBahan())) {
                int i = view.getSelectedBahan();
                app.daftarBahan().remove(i);
                view.resetView();
                view.setListBahan(app.getDaftarBahan());;
            }
            else if (source.equals(view.getkembali())) {
                this.view.dispose();
                new PegawaiHandler(app);
            }
        }
    }
    
        public void mousePressed(MouseEvent f) {
        Object source = f.getSource();
        if (source.equals(view.getListBahan())) {
            int i = view.getSelectedBahan();
            Bahan b = app.getBahan(i);
            view.setTextBarang(b.displayBahan());
        }
    }    

    void setVisible(boolean b) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
