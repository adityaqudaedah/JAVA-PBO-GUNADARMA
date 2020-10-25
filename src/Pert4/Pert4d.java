package Pert4;

/*
 * author by @Rahmat Aditya Qudaedah
 */

public class Pert4d {
    public static void main(String[] args) {
        System.out.println(factorial(3));

    }
    public static int factorial(int n){
        //jika n=0 atau  n=1 maka akan mengembalikan nilai 1
        if (n==0||n==1){
            return 1;
        }
        else{
            //rescursive algorithm :
            //misal n = 3
            //maka method atau function
            //me-return 3*2*1*1
            //mengapa 1 ada dua karena
            //nilai n selalu berkurang 1 dan lama kelamaan akan menjadi 0
            return n*factorial(n-1);
        }
    }
}
