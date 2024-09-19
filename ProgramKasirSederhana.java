/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programkasirsederhana;

/**
 *
 * @author mirzanabil
 */ 
import java.util.Scanner;
public class ProgramKasirSederhana {
    public static void main(String[] args) {
        double hargaperkg,jumlahberas,hargatotal,uangkembali,diskon,totalsetelahdiskon;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan jumlah beras yang dibeli (dalam kg): "); 
        double jumlahberaskg = input.nextDouble();
        System.out.println("Masukkan harga per kg beras (dalam IDR): ");
        double hargaPerKg = input.nextDouble(); 
        double totalbiaya = jumlahberaskg * hargaPerKg;
        System.out.println("totalbiaya = "+totalbiaya);
        diskon = totalbiaya * 0.05;
        System.out.println("diskon = "+diskon);
        totalsetelahdiskon = totalbiaya - diskon;
        System.out.println("totalsetelahdiskon = "+totalsetelahdiskon);
        double jumlahuang = input.nextDouble();
        System.out.println("jumlah uang yang diterima = "+jumlahuang);
        uangkembali = jumlahuang - diskon;
        System.out.println("uangkembali = "+uangkembali);  
             
    }
}
