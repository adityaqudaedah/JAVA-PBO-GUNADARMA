package Vclass;

import java.util.Scanner;

public class LatihanSoalM10 {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("===Program Input Matrix===");
        System.out.print("Input Jumlah baris : "); final int BARIS = s.nextInt();
        System.out.print("Input Jumlah kolom : "); final int KOLOM = s.nextInt();
        int [][] matrix = new int[BARIS][KOLOM];

        System.out.print("\ninput elemen matrix : ");
        System.out.println(" ");
        inputMatrix(matrix,BARIS,KOLOM);

        System.out.println("\nMatrix : ");
        System.out.println("");
        printMatrix(matrix,BARIS,KOLOM);
    }

    public static void inputMatrix(int[][] m,int baris, int kolom){

        for (int i = 0;i<baris;++i){
            for (int j = 0; j<kolom;++j){
                System.out.printf("elemen [%d][%d] : ",i,j);
                m[i][j] = s.nextInt();
            }
        }
    }

    public static void printMatrix(int[][]m, int baris, int kolom){

        for (int i = 0 ; i<baris;++i){

            for ( int j = 0; j<kolom;++j){
                System.out.print(" | "+m[i][j]+" | ");
            }
            System.out.println("");
        }
    }
}
