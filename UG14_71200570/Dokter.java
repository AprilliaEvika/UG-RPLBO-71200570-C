package com.ug14.rumahsakit;

public class Dokter {
    private int idDokter;
    private String nama;
    private String spesialis;
    private String ruangan;

    public Dokter(int Iddokter, String namaDokter, String Spesialis, String Ruangan){
        idDokter = Iddokter;
        nama = namaDokter;
        spesialis = Spesialis;
        ruangan = Ruangan;
    }

    public memeriksa(com.ug14.rumahsakit.Pasien, com.ug14.rumahsakit.Jadwal){

    }


    public cekStatus(com.ug14.rumahsakit.Pasien status){
        int cekStatus = 'sakit';
        if ( cekStatus == status) {
            System.out.println("Penyakit anda belum sembuh silahkan datang lagi 3 hari lagi");
        }else{
            System.out.println("Penyakit anda sudah dinyatakan sembuh");
        }

    }
    public int getIdDokter(){
        return idDokter;
    }
    public String getNama(){
        return nama;
    }
    public String getSpesialis(){
        return spesialis;
    }
    public String getRuangan(com.ug14.rumahsakit.Pasien alamat){
        return ruangan;
    }

}
