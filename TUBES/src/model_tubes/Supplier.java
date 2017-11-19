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
public class Supplier {
    private static int nomorSupplier = 0;
    private Bahan[] bahan = new Bahan[10];
    private int totalBahan = 0;
    
    public Supplier(Bahan bhn) {
        nomorSupplier++;
        bahan[totalBahan] = bhn;
        totalBahan++;
    }

    public static int getNomorSupplier() {
        return nomorSupplier;
    }

    public Bahan[] getBahan() {
        return bahan;
    }

    public int getTotalBahan() {
        return totalBahan;
    }

    public void addBahan(Bahan bhn) {
        if (totalBahan <= 10) {
            bahan[totalBahan-1] = bhn;
            totalBahan++;
        }
        else {
            System.out.println("Supplier bahan penuh");
        }
    }
    
    public String displaySupplier() {
        String s = "";
        String[] l = new String[totalBahan];
        for(int i = 0; i < totalBahan; i++) {
           l[i] = "Bahan "+(i+1)+bahan[i].getNamaBahan()+ "Jumlah bahan : "+bahan[i].getJumlahBahan();
        }
        if (totalBahan == 1) {
             s = "Nomor Supplier : "+getNomorSupplier()+"\n"
                +l[0]+"\n"
                +"Total Bahan : "+getTotalBahan()+"\n";
        }
        else if (totalBahan == 2) {
             s = "Nomor Supplier : "+getNomorSupplier()+"\n"
                +l[0]+"\n"
                +l[1]+"\n"
                +"Total Bahan : "+getTotalBahan()+"\n";
        }
        else if (totalBahan == 3) {
             s = "Nomor Supplier : "+getNomorSupplier()+"\n"
                +l[0]+"\n"
                +l[1]+"\n"
                +l[2]+"\n"
                +"Total Bahan : "+getTotalBahan()+"\n";
        }
        else if (totalBahan == 4) {
             s = "Nomor Supplier : "+getNomorSupplier()+"\n"
                +l[0]+"\n"
                +l[1]+"\n"
                +l[2]+"\n"
                +l[3]+"\n"
                +"Total Bahan : "+getTotalBahan()+"\n";
        }
        else if (totalBahan == 5) {
             s = "Nomor Supplier : "+getNomorSupplier()+"\n"
                +l[0]+"\n"
                +l[1]+"\n"
                +l[2]+"\n"
                +l[3]+"\n"
                +l[4]+"\n"
                +"Total Bahan : "+getTotalBahan()+"\n";
        }
        else if (totalBahan == 6) {
             s = "Nomor Supplier : "+getNomorSupplier()+"\n"
                +l[0]+"\n"
                +l[1]+"\n"
                +l[2]+"\n"
                +l[3]+"\n"
                +l[4]+"\n"
                +l[5]+"\n"
                +"Total Bahan : "+getTotalBahan()+"\n";
        }
        else if (totalBahan == 7) {
             s = "Nomor Supplier : "+getNomorSupplier()+"\n"
                +l[0]+"\n"
                +l[1]+"\n"
                +l[2]+"\n"
                +l[3]+"\n"
                +l[4]+"\n"
                +l[5]+"\n"
                +l[6]+"\n"
                +"Total Bahan : "+getTotalBahan()+"\n";
        }
        else if (totalBahan == 8) {
             s = "Nomor Supplier : "+getNomorSupplier()+"\n"
                +l[0]+"\n"
                +l[1]+"\n"
                +l[2]+"\n"
                +l[3]+"\n"
                +l[4]+"\n"
                +l[5]+"\n"
                +l[6]+"\n"
                +l[7]+"\n"
                +"Total Bahan : "+getTotalBahan()+"\n";
        }
        else if (totalBahan == 9) {
             s = "Nomor Supplier : "+getNomorSupplier()+"\n"
                +l[0]+"\n"
                +l[1]+"\n"
                +l[2]+"\n"
                +l[3]+"\n"
                +l[4]+"\n"
                +l[5]+"\n"
                +l[6]+"\n"
                +l[7]+"\n"
                +l[8]+"\n"
                +"Total Bahan : "+getTotalBahan()+"\n";
        }
        else if (totalBahan == 10) {
             s = "Nomor Supplier : "+getNomorSupplier()+"\n"
                +l[0]+"\n"
                +l[1]+"\n"
                +l[2]+"\n"
                +l[3]+"\n"
                +l[4]+"\n"
                +l[5]+"\n"
                +l[6]+"\n"
                +l[7]+"\n"
                +l[8]+"\n"
                +l[9]+"\n"
                +"Total Bahan : "+getTotalBahan()+"\n";
        }        
        return s;
    }
}
