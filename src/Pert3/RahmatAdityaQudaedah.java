package Pert3;
/*
*@Author by Rahmat Aditya Qudaedah
 */
public class RahmatAdityaQudaedah {
    public static void main(String[] args) {

        //variable nama bertipe array dari string
        String[] nama = {"Rahmat","sulastri","oly"};
        //variable nilai bertipe array dari integer
        int[] nilai = {100,80,90};

        System.out.print("No. \tNama\tnilai\n");
        //looping sebanyak item dalam variable nama
        for (int i = 0 ; i<nama.length;++i){
            //print No ke-i, nama ke-i, nilai ke-i
            //jika i =0 maka,
            //No ke-i = 0+1 = 1
            //nama ke-i = "Rahmat"
            //nilai ke-i = "100"
            System.out.println(i+1+"\t"+nama[i]+"\t"+nilai[i]);
        }
    }
}
