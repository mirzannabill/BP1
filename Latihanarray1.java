
package array1;
import java.util.Scanner;
public class Latihanarray1 {
    public static void main(String[] args) {
        String belanja[] = new String[5];
        int harga[] = new int[5];
        int total[] = new int[5];
        int jumlah[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int jum = 0;
        int pilih = 0;
        int item = 0;
        int tal = 0;
        int grandtal = 0;
        
        do{
            System.out.println(" ");
            System.out.println("===============================");
            System.out.println("     Kasir Warung Nandikha     ");
            System.out.println("===============================");
            System.out.println("1. Nasi Goreng  [15.000]");
            System.out.println("2. Mie Goreng   [10.000]");
            System.out.println("3. Soto Ayam    [20.000]");
            System.out.println("4. Ayam Penyet  [25.000]");
            System.out.println("5. Capcay       [30.000]");
            System.out.println("6. Selesai");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    if(item<belanja.length){
                        belanja[item] = "Nasi Goreng";
                        harga[item] = 15000;
                        System.out.print("Jumlah = ");
                        jum = sc.nextInt();
                        jumlah[item] = jum;
                        tal = harga[item] * jumlah[item];
                        total[item] = tal;
                        grandtal = grandtal + tal;
                    }
                    else System.out.println("Maaf Pesanan Anda Terlalu Banyak");
                    break;
                case 2:
                    if(item<belanja.length){
                        belanja[item] = "Mie Goreng";
                        harga[item] = 10000;
                        System.out.print("Jumlah = ");
                        jum = sc.nextInt();
                        jumlah[item] = jum;
                        tal = harga[item] * jumlah[item];
                        total[item] = tal;
                        grandtal = grandtal + tal;
                    }
                    else System.out.println("Maaf Pesanan Anda Terlalu Banyak");
                    break;
                case 3:
                    if(item<belanja.length){
                        belanja[item] = "Soto Ayam";
                        harga[item] = 20000;
                        System.out.print("Jumlah = ");
                        jum = sc.nextInt();
                        jumlah[item] = jum;
                        tal = harga[item] * jumlah[item];
                        total[item] = tal;
                        grandtal = grandtal + tal;
                    }
                    else System.out.println("Maaf Pesanan Anda Terlalu Banyak");
                    break;
                case 4:
                    if(item<belanja.length){
                        belanja[item] = "Ayam Penyet";
                        harga[item] = 25000;
                        System.out.print("Jumlah = ");
                        jum = sc.nextInt();
                        jumlah[item] = jum;
                        tal = harga[item] * jumlah[item];
                        total[item] = tal;
                        grandtal = grandtal + tal;
                    }
                    else System.out.println("Maaf Pesanan Anda Terlalu Banyak");
                    break;
                case 5:
                    if(item<belanja.length){
                        belanja[item] = "Capcay";
                        harga[item] = 30000;
                        System.out.print("Jumlah = ");
                        jum = sc.nextInt();
                        jumlah[item] = jum;
                        tal = harga[item] * jumlah[item];
                        total[item] = tal;
                        grandtal = grandtal + tal;
                    }
                    else System.out.println("Maaf Pesanan Anda Terlalu Banyak");
                    break;
                case 6:
                    System.out.println("  ");
                    System.out.println("                Daftar Pesanan              ");
                    System.out.println("----------------------------------------------");
                    System.out.print("No Pesanan\t\tHarga\tJumlah\tTotal\n");
                    System.out.println("----------------------------------------------");
                    for(int i = 0; i < item;i++){
                        System.out.print((i+1)+". "+belanja[i]);
                        System.out.print("\t\t"+harga[i]+" ");
                        System.out.print(" \t  "+jumlah[i]+" ");
                        System.out.println("\t"+total[i]+" ");
                    }
                    System.out.println("----------------------------------------------");
                    System.out.println("Total Pesanan\t\t\t     Rp."+grandtal);
                    break;
            }
            item++;
            if(item>5)
            item = 5;
            System.out.println("  ");
            System.out.println("Jumlah item : "+item);
        }while(pilih!=6);
    }
    
}
