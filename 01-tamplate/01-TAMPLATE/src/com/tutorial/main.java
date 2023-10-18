package com.tutorial;

class mahasiswa {
    String nama;
    String NIM;
    String prodi;
}

public class main {
    public static void main(String[] args) {
        // instansiasi pembuatan objek
        mahasiswa mhs2 =new mahasiswa();

        // objek mhs2 diberi atribut 
        mhs2.nama ="dimas";
        mhs2.NIM = "22241030";
        mhs2.prodi = "pendidkan teknologi informasi";

        System.out.println("nama mahasiswa :" + mhs2.nama);
        System.out.println("NIM :" + mhs2.NIM);
        System.out.println("progam studi :" + mhs2.prodi);
    }
}