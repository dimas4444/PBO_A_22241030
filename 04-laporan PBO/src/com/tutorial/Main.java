package com.tutorial;


class Persegi {
    private float sisi;

    public Persegi(float sisi) {
        this.sisi = sisi;
    }

    public float luas() {
        return sisi * sisi;
    }

    public float keliling() {
        return 4 * sisi;
    }

    public void display() {
        System.out.println("Persegi dengan sisi: " + sisi);
    }
}

class Lingkaran {
    private float jari;

    public Lingkaran(float jari) {
        this.jari = jari;
    }

    public float luas() {
        return (float) (Math.PI * jari * jari);
    }

    public float keliling() {
        return (float) (2 * Math.PI * jari);
    }
}


class PersegiPanjang {
    private float panjang;
    private float lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public float luas() {
        return panjang * lebar;
    }

    public float keliling() {
        return 2 * (panjang + lebar);
    }
}


class Segitiga {
    private float alas;
    private float tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public float luas() {
        return 0.5f * alas * tinggi;
    }
}


public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(5);
        persegi.display();
        System.out.println("Luas Persegi: " + persegi.luas());
        System.out.println("Keliling Persegi: " + persegi.keliling());

        Lingkaran lingkaran = new Lingkaran(7);
        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling());

        PersegiPanjang persegiPanjang = new PersegiPanjang(4, 6);
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.luas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.keliling());

        Segitiga segitiga = new Segitiga(3, 4);
        System.out.println("Luas Segitiga: " + segitiga.luas());
    }
}