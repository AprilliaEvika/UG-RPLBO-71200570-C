import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Mobil = "M_71200570";
        PejalanKaki = "P_71200570";
        Scanner inp = new Scanner(System.in);
        System.out.println("Kode lampu lalu lintas saat ini : ") ;
        int kodeLampu = inp.nextlnt();
        if (kodeLampu = "3")
            System.out.println(Mobil.berhenti() PejalanKaki.menyebrang());
        if (kodeLampu = "2")
            System.out.println(Mobil.jalan() PejalanKaki.menunggu());
        if (kodeLampu = "1")
            System.out.println(Mobil.kurangiKecepatan() PejalanKaki.bersiap());
        else
            System.out.println("Kode lampu lalu lintas tidak valid");


    }

}
