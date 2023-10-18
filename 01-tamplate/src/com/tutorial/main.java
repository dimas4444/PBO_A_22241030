package com.tutorial;

class mahasiswa {
    String nama;
    String NIM;
    String prodi;
}

public class main {
public static void main (String[] args) {
 // instansiasi pembuatan objek
        mahasiswa mhs1 =new mahasiswa();

        // objek mhs1 diberi atribut 
        mhs1.nama ="dimas";
        mhs1.NIM ="22241030";
        mhs1.prodi ="PTI";

        System.out.println("nama mahasiswa :" + mhs1.nama);
        System.out.println("NIM :" + mhs1.NIM);
        System.out.println("progam studi : "+ mhs1.prodi);
}
}

