package com.ug10;

public class EmailException extends com.ug10.User {
    private String email;
    private String formatEmail;

    public String formatEmail{
        int formatEmail = email"@ukdw.com";
    }

    public String email{
        if (email != formatEmail) {
            System.out.println("Format email tidak valid");
        }

        else if (email == null) {
            System.out.println("Email tidak boleh kosong");
        }
    }

}
