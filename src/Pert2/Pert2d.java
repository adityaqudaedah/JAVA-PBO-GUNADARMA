package Pert2;

import java.util.Scanner;

/*
 * @Author by Rahmat Aditya Qudaedah
 * github : https://github.com/adityaqudaedah
 */

public class Pert2d {
    //menggunakan static supaya bisa diakses didalam badan class
     static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        Double n;

        //input nilai kedalam variable n
        System.out.println("Input Nilai:");
        n  = s.nextDouble();
        //nilai 80-100
        if(n>=80 && n<=100){
            System.out.println("A");
        }
        //nilai 70-79
        else if(n>=70 && n<=79){
            System.out.println("B");
        }
        //nilai 60-69
        else if(n>=60 && n<=69){
            System.out.println("C");
        }
        //nilai 50-59
        else if (n>=50 && n<=59){
            System.out.println("D");
        }
        //nilai 0-49
        else if(n >= 0 && n <=49){
            System.out.println("E");
        }
        //jika nilai bukan range 1-100 maka statement ini akan di eksekusi
        System.out.println("Masukkan 1-100");
    }
}
