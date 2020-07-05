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
public class perulanganUTS {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("=============================");
        System.out.println(  "       ALFAMART        " );
        System.out.println("=============================");
        
        System.out.println("Masukan jumlah barang yang akan anda beli");
        int beli = input.nextInt();
        
        for (int i = 1; i<=beli; i++)
        {
            System.out.println("Masukkan nama barang ke- "+i+" : ");
            String nama = input.next();
            System.out.println("Masukkan harga barang ke- "+i+" : ");
            int harga = input.nextInt();
            System.out.println("Masukkan jumlah barang ke- "+i+" : ");
            int jumlahb = input.nextInt();
            System.out.println("");
            
            System.out.println("==============================");
            System.out.println("Nama barang   :  "+nama);
            System.out.println("harga barang   :  "+harga);
            System.out.println("Jumlah barang   :  "+jumlahb);
            System.out.println("============================= ");
            
            int total,totalb, diskon =0;
            total = harga * jumlahb;
            System.out.println("total belanja  = Rp."+total);
            if (total >=5000) {
                diskon = total/5;
            }else {diskon =0;}
            
            System.out.println("Diskon =Rp."+diskon);
            totalb = total - diskon;
            System.out.println("Total Bayar =  Rp."+totalb);
            
            System.out.println("Uang Bayar = Rp.");
            int bayar = input.nextInt();
            
            int kembali = bayar - totalb;
            System.out.println("Uang Kembali = Rp."+kembali);
            System.out.println("==================================");
            System.out.println("");
            
            
            }
        }    
                
        
    }

