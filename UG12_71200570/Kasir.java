package com.ug12.projectkassa;

import java.io.InputStreamReader;

public class Kasir {
    public Kasir(String password, String nama, String username){
        this.password = password;
        this.nama = nama;
        this.username = username;
    }

    private String password;
    private long totalPenjualan;
    private String username;
    private String nama;

    public long getTotalPenjualan(){
        return totalPenjualan;
    }
    public String getPassword(){
        return password;
    }
    public String getNama(){
        return nama;
    }
    public String getUsername(){
        return username;
    }
    public void setTotalPenjualan(long totalPenjualan){
        this.totalPenjualan = totalPenjualan;
    }
}
