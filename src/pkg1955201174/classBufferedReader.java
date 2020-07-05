/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1955201174;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author User
 */
public class classBufferedReader {
    public static void main(String[] args) throws IOException {
        
        InputStreamReader isr = new InputStreamReader (System.in);
        
        BufferedReader br = new BufferedReader(isr);
        
        String nama ;
        String tingkat ;
        String daerah = null ;
        String kejuaraan ;
        String perolehanmedali ;
        String bidang ;
        int tanggalLahir ;
        int umur ;
        double beratbadan ;
        double tinggibadan ;
        
        System.out.println("###########");
        
        System.out.println("siapa nama anda?");
        nama = br.readLine();
        
        System.out.println("apa tingkat anda?");
        tingkat = br.readLine();
        
        System.out.println("dimana daerah anda?");
        String Daerah = br.readLine();
        
        System.out.println("berapa kejuaraan anda?");
        kejuaraan = br.readLine();
        
        System.out.println("apa perolehanmedali anda?");
        perolehanmedali = br.readLine();
        
        System.out.println("berapa bidang anda?");
        bidang = br.readLine();
        
        System.out.println("berapa tanggalLahir anda?");
        tanggalLahir = Integer.parseInt(br.readLine());
        
        System.out.println("berapa umur anda?");
        umur = Integer.parseInt(br.readLine());
        
        System.out.println("berapa berat badan anda?");
        beratbadan = Double.parseDouble(br.readLine());
        
        System.out.println("berapa tinggi badan anda?");
        double tinggiBadan = Double.parseDouble(br.readLine());
        
        System.out.println("#########");
        System.out.println("nama anda siapa ;" + nama);
        System.out.println("apa tingkat anda ;" + tingkat);
        System.out.println("dimana daerah anda ;" + daerah);
        System.out.println("berapa kejuaraan anda ;" + kejuaraan);
        System.out.println("apa perolehanmedali anda ;" + perolehanmedali);
        System.out.println("berapa bidang anda ;" + bidang);
        System.out.println("berapa tanggalLahir anda ;" + tanggalLahir);
        System.out.println("berapa berat badan anda" + beratbadan);
        System.out.println("berapa tinggi badan anda ;" + tinggiBadan);
        
        
        
        
        
    }
}
