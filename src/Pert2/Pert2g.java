package Pert2;

import java.util.Scanner;

/*
 * @Author by Rahmat Aditya Qudaedah
 * github : https://github.com/adityaqudaedah
 */

public class Pert2g {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        //input angka
        System.out.println("Input number here [1-3]: ");
        num = s.nextInt();

        switch (num){
            case 1:
                //jika angka yang diinput 1 maka yang akan diesksekusi adalah statement yang ini
                System.out.println("1 untuk sabun");
                break;
            case 2:
                //jika angka yang diinput 2 maka yang akan diesksekusi adalah statement yang ini
                System.out.println("2 untuk shampoo");
                break;
            case 3:
                //jika angka yang diinput 3 maka yang akan diesksekusi adalah statement yang ini
                System.out.println("3 untuk sunlight");
                break;
            default:
                //jika angka yang diinput tidak [1-3] maka statement ini yang dieksekusi
                System.out.println("Your number doesn't match ");
        }


    }
}
