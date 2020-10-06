package Pert2;
/*
 * @Author by Rahmat Aditya Qudaedah
 * github : https://github.com/adityaqudaedah
 */

public class Pert2e {

    public static void main(String[] args) {

        char init = 'c';

        //jika statement pada setiap case sama
        switch (init) {
            case 'a' :
            case 'b' :
            case 'c' :
                //ini statement
                System.out.println("Character matched !");
                break;
            default:
                System.out.println("your character not found");

        }
    }
}
