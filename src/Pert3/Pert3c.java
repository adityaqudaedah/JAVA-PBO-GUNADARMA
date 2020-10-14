package Pert3;

import java.util.Scanner;
/*
 * @Author by Rahmat Aditya Qudaedah
 */

public class Pert3c {

    static int size =0;//variable size sebagai batas perulangan
    static int count=0;//variable count sebagai variable counter pada looping

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //input batas perulangan
        System.out.print("Masukkan batas perulangan : ");
        size = s.nextInt();
        do {
            //statement dibawah ini akan dieksekusi selama nilai count kurang dari nilai size
            System.out.println("Perulangan ke-"+count);
            //count akan bertambah satu
            ++count;
        }
            //selama count kurang dari size maka looping akan terus berjalan
            while (count < size) ;
    }
}
