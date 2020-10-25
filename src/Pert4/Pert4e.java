package Pert4;

import java.util.Scanner;

/*
* author by @Rahmat Aditya Qudaedah
*/

public class Pert4e {

    static int  flag = 0;//flag variable sebagai penanda
    static int n ; //variable n merupakan tempat menampung batas
    static Scanner s = new Scanner(System.in);// object scanner untuk memasukkan nilai

    //Main method
    public static void main(String[] args) {

        //versi bu rodiah
        /*System.out.print("masukkan jumlah deret(n) : "); n = s.nextInt();
        for(int i = 0;i<n;++i) {
            System.out.println(fibonacci(i));
        }*/

        //versi author
        //masukkkan jumlah deret yang diinginkan
        System.out.print("Masukkan jumlah deret(n) : ");n = s.nextInt();
        //niali n1, n2 dan count tidak perlu dirubah
        fibonacci(0,1,0);
    }


    //versi bu rodiah
    public static int fibonacci(int i){
        //jika i pada iterasi bernilai 0 maka akan me-return 0
        if(i==0){
            return 0;
        }
        //jika i pada iterasi bernilai 1 maka akan me-return 1
        else if(i==1){
            return 1;
        }
        else {
            //recursive algorithm :
            //misal i atau n yang dimasukkan adalah 5
            //maka pada iterasi ke-0 akan me-return 0 dan iterasi ke-1 akan me-return 1
            //lalu di print 0 dan 1 setelahnya,
            //pada iterasi ke-2 akan me-return 1 + 0, satu dan 0 masing-masing didapat dari
            // fibonacci( 2-1 ) + fibonacci (2-2)
            //selanjutnya akan seperti itu sampai batas yang telah ditentukan
            return fibonacci(i-1)+fibonacci(i-2);
        }
    }
    //fibonacci versi author
    public static void fibonacci(int n1,int n2,int count){
        //jika count kurang dari n-2 maka program akan terus berjalan
        if(count < n-2) {
            if (flag <=0) {
                //variable flag untuk penanda agar
                //statement dibawah hanya di eksekusi 1x
                System.out.print(n1 + " " + n2);
                ++flag;
            }
            int n3 = 0;
            n3 = n1 + n2;//n3 sebagai penampung nilai pertambahan 2 suku sebelumnya yaitu 0 dan 1
            n1 = n2;// n2 akan menjadi n1 yang baru
            n2 = n3;// dan n3 akan menjadi n2 yang baru
            System.out.print(" " + n3);
            fibonacci(n1, n2, ++count);//memanggil method fibonacci dengan nilai n1 dan n2 yang baru
        }
    }
}

