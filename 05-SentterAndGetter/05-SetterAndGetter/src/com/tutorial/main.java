package com.tutorial;

class User {
    private String username;
    private String password;

    // membuat konstuktor
    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // method getter
    public String getusername(){
        return this.username;
    }

    public String getpassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}

public class main {
    public static void main(String[] args) {
        // instansiasi objek
        User person_1 = new User ("dimas", "22241030");

        // panggil method GetteR
        System.out.println(person_1.getusername());
        System.out.println(person_1.getpassword());
    }
}