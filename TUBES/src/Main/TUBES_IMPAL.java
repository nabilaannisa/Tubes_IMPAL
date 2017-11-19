/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import model_tubes.Aplikasi;
import view_tubes.Login;
import view_tubes.MenuPilihanHandler;

/**
 *
 * @author personal
 */
public class TUBES_IMPAL {
    public static void main(String[] args) {
        Aplikasi aplikasi = new Aplikasi();
        new MenuPilihanHandler(aplikasi);
    }
}
