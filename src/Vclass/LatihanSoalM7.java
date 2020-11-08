package Vclass;

import java.util.Scanner;

public class LatihanSoalM7 {
    public static void main(String[] args) {
        int bil, pangkat;
        Scanner s = new Scanner(System.in);
        System.out.print("input bilangan : ");bil = s.nextInt();
        System.out.print("input pangkat : "); pangkat = s.nextInt();

        System.out.println("Hasil : " +pow(bil, pangkat));

    }

    public static int pow(int bil, int pangkat){

        if (pangkat==0) {
            return 1;
        }
        else {
            return bil * pow(bil, pangkat-1);
        }
    }
}
