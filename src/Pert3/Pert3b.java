package Pert3;

import java.util.Scanner;
/*
 * @Author by Rahmat Aditya Qudaedah
 */

public class Pert3b {

    static int size = 0;
    static int count = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //input batas perulangan
        System.out.print("Masukkan batas perulangan : ");
        size = s.nextInt();

        while(count<size){
            //selama nilai count masih kurang dari nilai size maka statement dibawah akan terus di eksekusi
            System.out.println("Perulangan ke-"+count);
            //nilai count akan bertambah satu
            ++count;
        }
    }
}
