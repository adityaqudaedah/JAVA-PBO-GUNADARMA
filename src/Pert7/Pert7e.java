package Pert7;

/**
 * @author by Rahmat Aditya Qudaedah
 */

import java.util.Scanner;

public class Pert7e {

    static Scanner s = new Scanner (System.in);

    public static void main(String[] args) {

        System.out.println("Input Jumlah Data : ");final int N = s.nextInt();
        String data[][] = new String[N][3];
        //Input Data table
        for (int i = 0;i<N;++i) {
            System.out.printf("\nData ke- %d",i+1);
            for (int j = 0; j < 3; ++j) {
                if (j == 0) {
                    System.out.print("\nNPM : ");
                    data[i][j] = s.next();
                } else if (j == 1) {
                    System.out.print("Nama : ");
                    data[i][j] = s.next();
                } else if(j==2){
                    System.out.print("Kelas : ");
                    data[i][j] = s.next();
                }
            }
        }
            //Print isi table
            for(int i = 0;i<N;++i){
                System.out.printf("\nData ke - %d",i+1);
                System.out.println("\nNPM\t\tNama\tKelas");
                for(int j = 0;j<3;++j){
                    System.out.print(data[i][j]+"\t\t");
                }
                System.out.println(" ");
            }


    }
}
