package Pert4;

import java.util.Scanner;

/*
 * author by @Rahmat Aditya Qudaedah
 */

public class RahmatAdityaQudaedah {
    static int a ,b,sisa;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("input a :");a = s.nextInt();
        System.out.println("input b");b = s.nextInt();
        //M method dipanggil
        M(a,b);
    }
    //M method
    public static void M(int a, int b){
        if(sisa ==1){
            System.out.println("M(a,b) = "+ sisa);
            System.out.println(sisa + " dapat digunakan sebaagai public key");
        }
        else {
            //disini a berfungsi sebagai sisa karena jika digunakan variable sisa maka
            //statement akan dieksekusi dikarenakan nilai awal dari variable sisa = 0
            if(a==0){
                System.out.println("M(a,b) = "+ a);
                System.out.println(a + " tidak dapat digunakan sebagai public key");
            }
            else {
                sisa = b % a;//variable sisa akan menampung nilai b%a
                b = a; //variable b akan menjadi variable a yang baru
                a = sisa;//variable a akan menjadi variable b yang baru
                M(sisa, b);//M method akan dengan nilai a dan b yang baru yaitu sisa dan b
            }
        }
    }

}
