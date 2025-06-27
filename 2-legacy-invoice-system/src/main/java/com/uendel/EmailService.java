package com.uendel;

public class EmailService {
    public void send(String email, String content){
        System.out.println("Sending email to " + email);
        System.out.println("Content:\n " + content);
    }
}
