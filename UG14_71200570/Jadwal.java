package com.ug14.rumahsakit;

public class Jadwal {
    private int idPemeriksaan;
    private com.ug14.rumahsakit.Pasien pasien;
    private com.ug14.rumahsakit.Dokter dokter;
    private com.ug14.rumahsakit.Suster suster;
    private com.ug14.rumahsakit.Pelayanan pelayanan;
    private Boolean statusDaftar;
    private Boolean statusScreenning;

    public Jadwal(int IDperiksa){
        IDperiksa = idPemeriksaan;
    }
    public com.ug14.rumahsakit.Pasien getPasien(){
        return pasien;
    }
    public com.ug14.rumahsakit.Dokter getDokter(){
        return dokter;
    }
    public com.ug14.rumahsakit.Suster getSuster(){
        return suster;
    }
    public com.ug14.rumahsakit.Pelayanan getPelayanan(){
        return pelayanan;
    }

    public Boolean getStatusDaftar(){
        statusDaftar = false;
        if (statusDaftar == false) {
            System.out.println("Mohon maaf anda harus mendaftar terlebih dahulu pada bagian pelayanan");
        }else {
            System.out.println(statusScreenning);
        }
    }
    public Boolean getStatusScreenning(){
        statusScreenning = false;
        if (statusDaftar == false){
            System.out.println("Mohon maaf selesaikan pendaftaran terlebih dahulu");
        }else {
            System.out.println(dokter);
        }
    }
}
