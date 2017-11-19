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
import model_tubes.Customer;

/**
 *
 * @author personal
 */
public class CustomerHandler extends MouseAdapter implements ActionListener{
    
    private Aplikasi app;
    private Customer view;
    
    public CustomerHandler(Aplikasi app) {
        this.app = app;
        view = new Customer();
        view.addActionListner(this);
        view.addMouseAdapter(this);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
