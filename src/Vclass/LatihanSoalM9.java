package Vclass;

import java.util.Scanner;

/**
 * @author by Rahmat Aditya Qudaedah
 */

public class LatihanSoalM9 {

    static int dummy,count,start, end;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("====Program Bilangan Prima===\n");
        System.out.print("Mulai dari : ");start = s.nextInt();
        System.out.print("Sampai : ");end = s.nextInt();

        prime(start,end);

    }

    static void prime(int start, int end){
        for (int i = start ; i<=end; ++i){
            count =0;
            for(int j = start; j<=i;++j){
                dummy = i%j;
                if (dummy==0) count++;
            }
            if (count<2){
                System.out.print(i+" ");
            }
        }
    }
}
