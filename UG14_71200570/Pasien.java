package com.ug14.rumahsakit;

public class Pasien {
    private int rm;
    private String nama;
    private int usia;
    private String alamat;
    private String penyakit;
    private int levelPenyakit;
    private Boolean status;

    public Pasien(int idPasien, String Namapasien, int Usia, String Alamat, String Penyakit, int LevelPenyakit){
        rm = idPasien;
        nama = Namapasien;
        usia = Usia;
        alamat = Alamat;
        penyakit = Penyakit;
        levelPenyakit = LevelPenyakit;
    }
    public int getRm(){
        return rm;
    }
    public String getNama(){
        return nama;
    }
    public int getUsia(){
        return usia;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getPenyakit(){
        return penyakit;
    }
    public int getLevelPenyakit(){
        levelPenyakit = 3 ;
        return levelPenyakit;
    }

    public boolean status{
        int status = 'sakit';
        if (penyakit == status) {
            System.out.println("Anda harus melakukan"levelPenyakit, "kali kontrol bersama dokter");
        }else{
            System.out.println("Penyakit anda sudah dinyatakan sembuh");
        }
    }
}
