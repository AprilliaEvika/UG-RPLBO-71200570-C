package com.ug13.rumahsakit;

public class Dokter {
    private String nama;
    private String spesialis;
    private String ruangan;

    public Dokter(String nama, String spesialis, String ruangan){
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public memeriksa(com.ug13.rumahsakit.Pasien, com.ug13.rumahsakit.Jadwal){


    }
    public cekStatus(com.ug13.rumahsakit.Pasien){

    }

    public String getNama(){
        return nama;
    }
    public String getSpesialis(){
        return spesialis;
    }
    public String getRuangan(){
        return ruangan;
    }

}
