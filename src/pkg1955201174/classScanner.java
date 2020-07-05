/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1955201174;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class classScanner { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Type data yang akan digunakan
        String nama, alamat;
        int usia,tahunlulus;
        double suhubadan;
        
        //New Scanner
        Scanner keyboard = new Scanner (System.in);
        
        //output to user
        System.out.println("!!!data kejuaraan mahasiswa !!!");
        System.out.println("nama mahasiswa");
        //apa yang di simpan yang di type data
       nama = keyboard.nextLine();
        // tampilkan output
        System.out.println("tingkat");
        String tingkat = keyboard.nextLine();
        
         System.out.println("daerah");
        String daerah = keyboard.nextLine();
        
        System.out.println("kejuaraan");
        String kejuaraan = keyboard.nextLine();
        
        System.out.println("perolehanmedali");
        int perolehanmedali = keyboard.nextInt();
        
        System.out.println("bidang");
        double bidang = keyboard.nextDouble();
        
         //output dari input
        System.out.println("#####");
        System.out.println("nama alamat;" + nama);
        System.out.println("tingkat;" +tingkat );
        System.out.println("daerah;" + daerah);
        System.out.println("kejuaraan;" + kejuaraan);
        System.out.println("perolehanmedali;" + perolehanmedali);
        System.out.println("bidang;" + bidang);
                
    
    }
}    
