package Pert7;

/**
 * @author by Rahmat Aditya Qudaedah
 */

import java.util.ArrayList;
import java.util.List;

public class Pert7c {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("Aku");
        list.add(69);

        //print bentuk listnya
        System.out.println(list);

        //print setiap elemen list atau arraylist menggunakan for each
        for (Object s: list){
            System.out.println(s);
        }

    }
}
