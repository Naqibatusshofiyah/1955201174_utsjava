/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1955201174;

import static javafx.scene.input.KeyCode.I;

/**
 *
 * @author User
 */
public class tugasFor {
    public static void main(String[] args) {
        int n = 5;
        String goreng = "";
        System.out.println("mulai");
        System.out.println("ambil alat penggoreng");
        System.out.println("lalu tuangkan minyak kewajan");
        System.out.println("lalu nyalakan kompor");
        System.out.println("menunggu minyak hingga panas");
        System.out.println("setelah itu masukkan tempe");
       
        String Goreng;
        goreng = "kenyang";
        System.out.println("apakah gorengan sudah selesai");
        if("kenyang".equals(goreng)) {
        }
        else {
            System.out.println("belum selesai");
        } 
        for (int i =1; i <n; i++){
            System.out.println("menggoreng lagi-" + I);
        }
        
            System.out.println("selesai");
    }
}
