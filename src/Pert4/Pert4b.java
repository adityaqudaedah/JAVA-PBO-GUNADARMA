package Pert4;

/*
 * author by @Rahmat Aditya Qudaedah
 */

public class Pert4b {

    static String[] nama = {"imus","andri","rahmat"};

    public static void biodata (int absensi){

        if(absensi < nama.length){

            System.out.println("absensi no "+(absensi+1) + " "+nama[absensi]);
            //pemanggilan method atau function biodata
            //dan nilai absensi akan bertambah
            biodata(++absensi);
        }
    }
    public static void main(String[] args) {
        //pemanggilan method biodata dengan diawali dari 0
        biodata(0);
    }
}
