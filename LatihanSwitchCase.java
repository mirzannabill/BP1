/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanswitchcase;

import java.util.Scanner;
public class LatihanSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Warung Sederhana ===");
        System.out.println("Menu Makanan:");
        System.out.println("1. Sate");
        System.out.println("2. Pecel");
        System.out.println("3. Penyetan");
        System.out.print("Pilih menu = ");
        int menu = sc.nextInt();
        String itemName = "";
        int price = 0;
        switch (menu) {
            case 1:
                System.out.println("Menu Sate:");
                System.out.println("1. Ayam (1.500 per tusuk)");
                System.out.println("2. Kambing (3.000 per tusuk)");
                System.out.print("Pilih jenis sate: ");
                int sate = sc.nextInt();
                if (sate == 1) {
                    price = 1500;
                    itemName = "Sate Ayam";
                } else {
                    price = 3000;
                    itemName = "Sate Kambing";
                }
                break;

            case 2:
                System.out.println("Menu Pecel:");
                System.out.println("1. Lauk Ayam (13.000 per porsi)");
                System.out.println("2. Lauk Empal (15.000 per porsi)");
                System.out.print("Pilih lauk pecel: ");
                int pecel = sc.nextInt();
                if (pecel == 1) {
                    price = 13000;
                    itemName = "Pecel Lauk Ayam";
                } else {
                    price = 15000;
                    itemName = "Pecel Lauk Empal";
                    System.out.println("pilihan lauk tidak ada");
                }
                break;

            case 3:
                System.out.println("Menu Penyetan:");
                System.out.println("1. Lauk Tahu/Tempe (5.000 per porsi)");
                System.out.println("2. Lauk Telur (7.000 per porsi)");
                System.out.println("3. Lauk Ayam (10.000 per porsi)");
                System.out.print("Pilih lauk penyetan: ");
                int penyetan = sc.nextInt();
                switch (penyetan) {
                    case 1:
                        price = 5000;
                        itemName = "Penyetan Lauk Tahu/Tempe";
                        break;
                    case 2:
                        price = 7000;
                        itemName = "Penyetan Lauk Telur";
                        break;
                    case 3:
                        price = 10000;
                        itemName = "Penyetan Lauk Ayam";
                        break;
                    default:
                        System.out.println("Pilihan lauk penyetan tidak valid!");
                        return;
                }
                break;

            default:
                System.out.println("Pilihan menu tidak valid!");
                return;
        }

        System.out.print("Jumlah " + itemName + " yang dibeli: ");
        int quantity = sc.nextInt();
        int totalCost = price * quantity;

        System.out.print("Apakah Anda memiliki kartu member?: ");
        char member = sc.next().toLowerCase().charAt(0);
        if (member == 'y') {
            totalCost *= 0.05;
        }

        
    }
}

            
