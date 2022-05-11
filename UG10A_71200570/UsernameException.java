package com.ug10;

public class UsernameException extends com.ug10.User {
    private String username;
    private int jumlahKarakter = 6;

    public String username{
        if (username <= jumlahKarakter) {
            System.out.println("Username harus terdiri minimal 6 karakter");
        }
        else if (username == null) {
            System.out.println("Username tidak boleh kosong");
        }
    }
}
