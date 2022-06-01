package com.ug13.rumahsakit;
public class App {
    public static void main(String[] args) {
        System.out.println("===========================================PROSES INISIALISASI============================================");
        System.out.println();
        com.ug13.rumahsakit.Jadwal jadwal = new com.ug13.rumahsakit.Jadwal();
        com.ug13.rumahsakit.Pasien illegal = new com.ug13.rumahsakit.Pasien("test",21,"di mana saja");
        com.ug13.rumahsakit.Pelayanan pelayanan = new com.ug13.rumahsakit.Pelayanan("Andi");
        com.ug13.rumahsakit.Suster suster = new com.ug13.rumahsakit.Suster("Siti");
        com.ug13.rumahsakit.Dokter dokter = new com.ug13.rumahsakit.Dokter("Budi", "Organ Dalam", "A123");
        com.ug13.rumahsakit.Pasien pasien = pelayanan.registrasi();
        pelayanan.mengaturJadwal(pasien, dokter, jadwal);
        System.out.println("===========================================PROSES UJI COBA PASIEN DAN JADWAL ILLEGAL============================================");
        System.out.println();
        suster.screening(illegal, jadwal);
        dokter.memeriksa(illegal, jadwal);
        System.out.println("===========================================PROSES UJI COBA PASIEN DAN JADWAL ILLEGAL BERHASIL============================================");
        System.out.println();
        System.out.println("===========================================PROSES SCREENING SUSTER============================================");
        System.out.println();
        suster.screening(pasien, jadwal);
        System.out.println("===========================================PROSES SCREENING SUTER BERHASIL============================================");
        System.out.println();
        System.out.println("===========================================PROSES PEMERIKSAAN DOKTER============================================");
        System.out.println();
        int x = pasien.getLevelPenyakit();
        for(int i = 0; i <= x; i++) {
            dokter.memeriksa(pasien, jadwal);
            dokter.cekStatus(pasien);
        }
        System.out.println("===========================================PROSES PEMERIKSAAN DOKTER BERHASIL============================================");
        System.out.println();
        System.out.println(jadwal.getPasien().getStatus());
        System.out.println(jadwal.getPasien().getLevelPenyakit());
    }
}

