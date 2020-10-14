package Pert3;

import java.util.Scanner;
/*
* @Author by Rahmat Aditya Qudaedah
 */

public class Pert3a {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //input batas perulangan
        System.out.print("masukkan batas perulangan : ");
        int size = s.nextInt();

        for(int i=0;i<size;++i){
            //statement dibawah akan di print sebanyak n kali sesuai dengan size
            System.out.println("Perulangan ke-"+i);
        }

    }
}
