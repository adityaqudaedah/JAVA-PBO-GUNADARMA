package Pert2;

import java.util.Scanner;

/*
 * @Author by Rahmat Aditya Qudaedah
 * github : https://github.com/adityaqudaedah
 */

public class Pert2c {

    public static void main(String[] args) {
        //scanner object
        Scanner s = new Scanner(System.in);

        //deklarasi variable untuk type double
        double bonus ,hargaJual,hargaToko;

        //input hargaJual dan hargaToko
        System.out.print("harga jual : ");hargaJual = s.nextDouble();
        System.out.print("harga toko : ");hargaToko = s.nextDouble();
        //kalau hargaJual > hargaToko maka dapet bonus
        if (hargaJual>hargaToko){
            bonus = 0.1*hargaJual;
            System.out.println("Selamat anda mendapatkan bonus sebesar : "+bonus);
        }
        //kalau hargaJual <= hargaToko maka tidak mendapatkan bonus
        else {
            bonus = 0.0;
            System.out.println("Anda tidak mendapatkan bonus ");
            System.out.println("bonus : "+bonus);
        }
    }
}
