package com.ug13.rumahsakit;

public class Jadwal {
    private com.ug13.rumahsakit.Pasien pasien;
    private com.ug13.rumahsakit.Dokter dokter;
    private com.ug13.rumahsakit.Suster suster;
    private com.ug13.rumahsakit.Pelayanan pelayanan;
    private Boolean statusDaftar;
    private Boolean statusScreening;

    public Jadwal(com.ug13.rumahsakit.Pasien pasien, com.ug13.rumahsakit.Dokter dokter, com.ug13.rumahsakit.Suster suster, com.ug13.rumahsakit.Pelayanan pelayanan){
        this.pasien = pasien;
        this.dokter = dokter;
        this.suster = suster;
        this.pelayanan = pelayanan;
    }

    public boolean isStatusDaftar{
        boolean statusDaftar = false;
    }
    public boolean isStatusScreening{
        boolean statusScreening = false;
    }

    public com.ug13.rumahsakit.Pasien getPasien(){
        return pasien;
    }

    public com.ug13.rumahsakit.Dokter getDokter() {
        return dokter;
    }
    public com.ug13.rumahsakit.Suster getSuster(){
        return suster;
    }
    public com.ug13.rumahsakit.Pelayanan getPelayanan(){
        return pelayanan;
    }
}
