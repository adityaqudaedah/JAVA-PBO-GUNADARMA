package Pert3;

import java.util.Scanner;
/*
 * @Author by Rahmat Aditya Qudaedah
 */

public class Pert3d {
    static Scanner s = new Scanner(System.in);
    static Scanner scann = new Scanner(System.in);
    static int temp;

    public static void main(String[] args) {
        System.out.print("TOKO KUE GLUTEN \n");
        System.out.println("1. Bolu Cake");
        System.out.println("2. Korean Garlic Bread");
        System.out.println("3. Brownis Cake");
        System.out.println("4. Keluar");
        double harga = 0.0;
        //looping akan terus dilakukan selama inputString = "y"
        for(String inputString = "y";inputString.equalsIgnoreCase("y");){
            //input pilihan
            System.out.print("Masukkan Pilihan [1-3]: ");
            temp  = s.nextInt();
            //jika pilihan = 1 maka Bolu Cake akan di eksekusi
            if(temp==1){
                System.out.println("Bolu Cake ditambahkan kedalam keranjang");
                harga+=30000;
            }
            //jika pilihan = 2 maka Korean Garlic akan di eksekusi
            else if(temp==2){
                System.out.println("Korean Garlic ditambahkan kedalam keranjang");
                harga+=40000;
            }
            //jika pilihan = 3 maka Brownies Cake akan di eksekusi
            else if (temp==3){
                System.out.println("Brownies Cake ditambahkan kedalam keranjang");
                harga+=30000;
            }
            //jika pilihan = 4 maka akan keluar dari program
            else if(temp==4){
                System.out.println("Terimakasih telah belanja");
                System.exit(0);
            }
            //jika nomor yang diinput tidak dalam range 1-4 maka akan muncuk pemberitahuan bahwa
            //kue yang dicari tidak ditemukan
            else {
                System.err.println("Kue tidak ditemukan");
            }
            //evaluasi nilai inputString jika input nilai bukan "y" maka looping akan berhenti
            System.out.println("\nTambah item ? [y/n]");
            inputString = scann.next();
            //cetak harga total
            System.out.println("\nHarga Total: "+harga);

        }
    }
}
