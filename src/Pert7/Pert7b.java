package Pert7;
/**
 * @author by Rahmat Aditya Qudaedah
 */

public class Pert7b {
    public static void main(String[] args) {
        String [] mhs = {"andi","andu","ande"};
        System.out.println("Menggunakan for each :");
        //print elemen menggunakan for each
        for(String s : mhs){
            System.out.println(s);
        }

        System.out.println("Menggunakan for :");
        //print elemen menggunakan for
        for(int i = 0;i< mhs.length;++i){
            System.out.println(mhs[i]);
        }
    }
}
