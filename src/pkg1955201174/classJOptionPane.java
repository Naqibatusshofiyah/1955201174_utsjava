/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1955201174;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
class classJOptionPane {
    public static void main(String[] args) {
    
        
        
        String tanya = JOptionPane.showInputDialog("siapa nama anda");
        String daerah = JOptionPane.showInputDialog("dimana daerah anda");
        String citaCita = JOptionPane.showInputDialog("apa cita cita mu");
        String umur = JOptionPane.showInputDialog("berapa umur anda");
        String tingkat = JOptionPane.showInputDialog("tingkat keberapa anda");
        String tanggalLahir = JOptionPane.showInputDialog("apa tanggalLahir anda");
        String kejuaraan = JOptionPane.showInputDialog("apa kejuaraan anda");
         String perolehanmedali = JOptionPane.showInputDialog("medali apa yang anda terima");
        String bidang = JOptionPane.showInputDialog("bidang apa yang anda tujuh");
        
        int jumlah = Integer.parseInt(umur);
        int banyaknyamahasiswa = 1000;
        double total = jumlah*banyaknyamahasiswa;
        
        System.out.println("siapa nama anda;" + tanya);
        System.out.println("dimana daerah anda;" + daerah);
        System.out.println("apa cita cita mu;" + citaCita);
        System.out.println("berapa umur anda;" + umur);
        System.out.println("apa tingkat anda;" + tingkat);
        System.out.println("apa tanggal lahir anda;" + tanggalLahir);
        System.out.println("berapa kejuaraan anda;" + kejuaraan);
        System.out.println("apa perolehanmedali anda;" + perolehanmedali);
        System.out.println("berapa bidang anda;" + bidang);
        
    }
    
}
