package com.tutorial;

class lingkaran {
    float r;
    float diameter;

    public lingkaran (float r, float diameter) {
        this.r = r;
        this.diameter = diameter;
    }

    void display(){
        float luas = (float)(Math.PI*r*r);
        float keliling = (float)(2*3.14*r);
        System.out.println("keliling lingkaran"+luas);
        System.out.println("luas keliling"+keliling);
    }

    public class main {
        
    }

    public static void main(String[] arg) throws Exception {
        lingkaran lingkaran = new lingkaran(60, 90);
        System.out.println("jari jari:"+lingkaran);
        System.out.println("diameter:"+lingkaran.diameter);
        lingkaran.display();
    }
}
