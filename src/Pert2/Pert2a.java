package Pert2;

import javax.swing.JOptionPane;
import java.util.Scanner;

/*
* @Author by Rahmat Aditya Qudaedah
* github : https://github.com/adityaqudaedah
*
 */

public class Pert2a {

    //pakai static keyword modifier supaya variable bisa di akses di setiap bagian kelas
    static int a;
    public static void main(String[] args) {
        //scanner object untuk memasukkan angka kedalam variable
//        Scanner scann = new Scanner(System.in);
//        System.out.println("input : angka");
//        a = scann.nextInt();

        //JoptiionPane untuk input dengan GUI
        a = Integer.valueOf(JOptionPane.showInputDialog("input"));
        //menampilkan output dalam GUI
        JOptionPane.showMessageDialog(null,a);
    }
}
