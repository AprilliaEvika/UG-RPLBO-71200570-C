package com.ug11.instapost;

public class InstaPost {
    private int totalMention = username.lenght;
    private String email;
    private String username;

    public static InstaPost(int totalMention, String email, String username){
        this totalMention = totalMention;
        this email = email;
        this username = username;
    }

    public void printinfo(){
        System.out.println(" Username:" username);
        System.out.println("Email: "email);
        System.out.println("Total Mention: " totalMention);
    }

    public void login(String email){
        if (email != '@')
            System.out.println("Email tidak valid");

        else if (email != 'gmail.com')
            System.out.println("Email tidak terdaftar di Google");

        else if(email == username"gmail.com")
            System.out.println("Email valid");
    }

    public void post(String){

    }
}
