package Pert7;
/**
 * @author by Rahmat Aditya Qudaedah
 */

import java.util.Arrays;

public class Pert7a {
    public static void main(String[] args) {
        int nilai [] = {1,6,7,8,9};

        System.out.println(nilai[0]);

        int [] nilai1 = new int[5];

        for(int i = 0;i<nilai1.length;++i){
            nilai1[i] = i;
        }

        System.out.println(Arrays.toString(nilai1));

        System.out.println(nilai1[5]);//IndexOutOfBounds
    }
}
