package Pert7;

/**
 * @author by Rahmat Aditya Qudaedah
 */

import java.util.Scanner;

public class Pert7f {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("===Program Input Matrix===");
        System.out.print("Input Jumlah baris : "); final int BARIS = s.nextInt();
        System.out.print("Input Jumlah kolom : "); final int KOLOM = s.nextInt();
        int [][] matrixA = new int[BARIS][KOLOM];//array untuk matriks A
        int [][]  matrixB = new int[BARIS][KOLOM];//array untuk matriks B

        System.out.print("\ninput elemen matrix A: ");
        System.out.println(" ");
        //Input elemen matriks dengan method
        inputMatrix(matrixA,BARIS,KOLOM);

        System.out.print("\ninput elemen matrix B: ");
        System.out.println(" ");
        //Input elemen matriks dengan method
        inputMatrix(matrixB,BARIS,KOLOM);

        System.out.println("\nHasil : ");
        //Hasil dari matriks dengan method
        sumMatrix(matrixA,matrixB,BARIS,KOLOM);

    }
    //method atau function input matrix
    public static void inputMatrix(int[][] m,int baris, int kolom){

        for (int i = 0;i<baris;++i){
            for (int j = 0; j<kolom;++j){
                System.out.printf("elemen [%d][%d] : ",i,j);
                m[i][j] = s.nextInt();
            }
        }
    }
    //method atau function print matrix
    public static void sumMatrix(int[][]m, int[][]m1,int baris, int kolom){

        for (int i = 0 ; i<baris;++i){
            for ( int j = 0; j<kolom;++j){
                System.out.print(" | "+(m[i][j]+m1[i][j])+" | ");
            }
            System.out.println(" ");
        }
    }
}






