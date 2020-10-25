package Pert4;

/*
 * author by @Rahmat Aditya Qudaedah
 */

import java.util.Scanner;

public class Pert4c {

    public static void main(String[] args) {
        int bil, pangkat;
        Scanner s = new Scanner(System.in);

        System.out.print("masukkan bilangan : ");bil = s.nextInt();
        System.out.print("masukkan pangkat : ");pangkat = s.nextInt();

        System.out.print("Hasil : "+pow(bil,pangkat));
    }
    //method atau function dari perpangakatan
    public static int pow(int num, int powerNumber ){
        //jika pangkat atau PowerNumber 0 maka akan me-return 1
        if (powerNumber == 0) {
            return 1;
        }
        else {
            //recursive algorithm :
            //misal 3 pangkat 3
            //maka pow akan me-return 3*3*3*1
            //bilangan terakhir 1 dikarenakan powerNumber selalu berkurang 1
            // hingga menjadi 0
            return num * pow(num,powerNumber-1);
        }
    }
}
