package com.ug12.projectkassa;

import java.util.ArrayList;
import java.util.HashMap;

public class Kassa {
    public Kassa(){
        this.kasir = kasir;
        this.pesanan = pesanan;
        this.arrKasir = arrKasir;
    }

    private HashMap<com.ug12.projectkassa.Produk, Integer> pesanan;
    private ArrayList<com.ug12.projectkassa.Kasir> arrKasir{
        ArrayList<com.ug12.projectkassa.Kasir> kasir = new ArrayList<String>();
    }
    private com.ug12.projectkassa.Kasir kasir{
        return "com.ug12.projectkassa.Kasir";
    }

    public void login(String username, String password){

        if(login(); != arrKasir){
            System.out.println("Maaf Username / Password anda salah ");
        }
        else{
            System.out.println(kasir);
            System.out.println("Anda berhasil login");
        }
    }
    public void register(com.ug12.projectkassa.Kasir){
        ArrayList<com.ug12.projectkassa.Kasir> kasir = new ArrayList<String>(arrKasir);

    }
    public void tambahPesanan(com.ug12.projectkassa.Produk, int){
        HashMap<com.ug12.projectkassa.Produk, Integer> pesanan  = new HashMap<com.ug12.projectkassa.Produk, Integer>();
    }
    public void printNota(){
        this.printNota() = pesanan;
        System.out.println("Sub Total = ");
        System.out.println("Total = ");

    }
    public void printPenjualanKasir(){
        System.out.println(arrKasir);
    }
}
