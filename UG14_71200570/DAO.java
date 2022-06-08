package com.ug14.rumahsakit;

public class DAO {
    public com.ug14.rumahsakit.Dokter getDokterById(int idDokter){

    }
    public com.ug14.rumahsakit.Suster getSusterById(int idSuster){

    }
    public com.ug14.rumahsakit.Pelayanan getPelayananById(int idPelayanan){

    }
    public inputPasien(com.ug14.rumahsakit.Pasien pasien){

    }
    public inputJadwal(com.ug14.rumahsakit.Jadwal jadwal){

    }
    public getPasienSembuh();

    public updateStatusPasien(com.ug14.rumahsakit.Dokter cekStatus){
        int sakit = 0;
        int sembuh = 1;
        if (cekStatus == 0){
            System.out.println("Anda masih dinyatakan belum sembuh");
        }else if (cekStatus == 1){
            System.out.println("Anda sudah dinyatakan sembuh");
        }
    }
}
