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
public class percabanganIfElse {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog(null,"tulis nama anda");
        String alamat = JOptionPane.showInputDialog(null,"tulis alamat anda");
        String provinsi= JOptionPane.showInputDialog(null,"tulis provinsi");
        String agama = JOptionPane.showInputDialog(null,"tulis agama anda");
        String status = JOptionPane.showInputDialog(null,"tulis status anda");
        int usia = Integer.parseInt(JOptionPane.showInputDialog(null,"berapa usia anda"));
        
        if (usia >= 19){
            JOptionPane.showInputDialog(null,"selamat " + nama + "selamat anda telah berhasil,silakan keluar");
        }else{
            JOptionPane.showInputDialog(null,"maaf" + nama + "usia anda belum cukup,silahkan mengulang tahun depan");
        }
    }
  
}
