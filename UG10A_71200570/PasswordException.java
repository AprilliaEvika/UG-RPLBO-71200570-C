package com.ug10;

public class PasswordException extends com.ug10.User {
    private String password;
    private int passwordLenght = 7;

    public String password{
        if (password <= passwordLenght) {
            System.out.println("Password minimal terdiri dari 7 karakter");
        }
        else if (password == com.ug10.UsernameException) {
            System.out.println("Password tidak boleh sama dengan username");
        }
        else if (password == null) {
            System.out.println("Password tidak boleh kosong");
        }
    }

    public String konfirmasiPassword{
        this.konfirmasiPassword = password;
    }

}
