/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan34.kalkulator;

import java.util.Scanner;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class IF110119011Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kalkulator kl = new Kalkulator();
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukan angka ke-1 : ");
        double value1 = sc.nextDouble();
        System.out.print("Masukan angka ke-2 : ");
        double value2 = sc.nextDouble();
        
        System.out.println();
        
        System.out.println("Hasil pertambahan\t: " + kl.tambahBilangan(value1, value2));
        System.out.println("Hasil pengurangan\t: " + kl.kurangBilangan(value1, value2));
        System.out.println("Hasil kali\t:" + kl.kaliBilangan(value1, value2));
        System.out.println("Hasil bagi\t:" + kl.bagiBilangan(value1, value2));
        System.out.println("Hasil sisa\t:" + kl.sisaBilangan(value1, value2));
    }
    
}
