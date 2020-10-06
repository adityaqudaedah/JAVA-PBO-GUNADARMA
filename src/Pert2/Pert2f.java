package Pert2;

import java.util.Scanner;

/*
 * @Author by Rahmat Aditya Qudaedah
 * github : https://github.com/adityaqudaedah
 */

public class Pert2f {
    public static void main(String[] args) {
        char c;
        //scanner object
        Scanner s = new Scanner(System.in);

        //charAt(0) digunakan untuk mengarahkan input menuju character yang dituju
        //misal kita input a kedalam variable c maka ,a berada pada index ke-0 pada variable c
        System.out.println("Input your character here [a-c] : ");
        c = s.next().charAt(0);

        switch (c){
            case 'a':
                //jika yang diinput 'a' maka yang akan diesksekusi adalah statement yang ini
                System.out.println("a untuk andi");
                break;
            case 'b':
                //jika yang diinput 'b' maka yang akan diesksekusi adalah statement yang ini
                System.out.println("b untuk bobi");
                break;
            case 'c':
                //jika yang diinput 'c' maka yang akan diesksekusi adalah statement yang ini
                System.out.println("c untuk caca");
                break;
            default:
                //jika character yang diinput tidak [a-c] maka statement ini yang dieksekusi
                System.out.println("Character doesn't match");
        }
    }
}
