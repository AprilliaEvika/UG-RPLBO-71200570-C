package com.ug13.rumahsakit;

public class Pasien{
    private String nama;
    private int usia;
    private String alamat;
    private String penyakit;
    private int levelPenyakit;
    private String status;

    public Pasien(String name, int usia,String alamat, String penyakit, int levelPenyakit, String status){
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
        this.penyakit = penyakit;
        this.levelPenyakit = levelPenyakit;
        this.status = status;
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
        int levelPenyakit = 2;
        return levelPenyakit;
    }
    public String getStatus(){
        String status = false ;
        if(status == false)
            System.out.println("Anda dinyatakan belum sembuh");
        else
            System.out.println("Anda dinyatakan sembuh");
        return status;
    }
}
