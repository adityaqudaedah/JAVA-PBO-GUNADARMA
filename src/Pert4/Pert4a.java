package Pert4;

import java.util.Scanner;

/*
 * author by @Rahmat Aditya Qudaedah
 */

public class Pert4a {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int temp,count, a, b;
        System.out.println("======= Program Bilangan Prima =======");
        System.out.print("Mulai dari: ");
        a = s.nextInt();
        System.out.print("Sampai : ");
        b = s.nextInt();
        System.out.println("");

        for(int i = a;i<=b;++i){
            count = 0;
            //looping untuk mengecek apakah bilangan hanya dapat dibagi oleh dirinya sendiri
            //misal 3, 3 hanya dapat dibagi dengan dirinya sendiri
            //misal lagi 4, 4 bisa dibagi oleh 2 dan 4 sendiri
            for(int j=a;j<=i;++j){
                temp = i % j;
                //temp sebagai variable penampung dari hasil i%j
                //jika i%j = 0 maka count akan bertambah 1
                if(temp==0) count++;
            }
            //jika count > 1 berarti bilangan tersebut bukan bilangan prima
            //dan tidak akan dicetak pada output
            //bilangan yang dicetak hanya bilangan prima
            if (count < 2) {

                System.out.print(i+" ");
            }
        }
    }
}
