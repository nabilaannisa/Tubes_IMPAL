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

/**
 *
 * @author Adhi Jr
 */
public class MenuPilihanHandler extends MouseAdapter implements ActionListener{
    private Aplikasi app;
    private MenuPilihan view;
    
    public MenuPilihanHandler(Aplikasi app){
        this.app = app;
        view = new MenuPilihan();
        view.addActionListner(this);
        view.setVisible(true);
    }
     
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
            if (source.equals(view.getButtonPegawai())) {
                this.view.dispose();
                new Login().setVisible(true);
            }
            else if (source.equals(view.getButtonCustomer())) {
                this.view.dispose();
                new Customer().setVisible(true);
            } 
    }
}
