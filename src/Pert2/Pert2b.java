package Pert2;

import java.util.Scanner;

/*
 * @Author by Rahmat Aditya Qudaedah
 * github : https://github.com/adityaqudaedah
 */
public class Pert2b {

    //menggunakan static modifier keyword supaya dapat dibaca dibadan program
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        //tanpa static kerena sudah berada didalam sebuah function
//        Scanner scanner = new Scanner(System.in);

        //input angka
        System.out.println("input number :");
        int a = s.nextInt();

        //jika a mod 2 sisa 0
        if (a%2==0){
            System.out.println("even");
        }
        //jika sisa selain 0
        else {
            System.out.println("odd");
        }
    }
}
