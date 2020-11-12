package com.pboreg;

import java.util.Scanner;

abstract class Luas {
    public abstract void banyakLuas();

    public void hitungLuas() {
        System.out.println("-Mengitung Luas-");
    }
}
class Segitiga extends Luas {
    public void banyakLuas() {
        Scanner input = new Scanner(System.in);
        int alas;
        int tinggi;
        double luasSegitiga;
        System.out.print("Masukkan alas = ");
        alas = input.nextInt();
        System.out.print("Masukkan tinggi = ");
        tinggi = input.nextInt();
        luasSegitiga = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga = " + luasSegitiga + "cm");
    }
}
class Lingkaran extends Luas {
    public void banyakLuas() {
        Scanner input = new Scanner(System.in);
        int diameter;
        double phi;
        double jarijari;
        double luasLingkaran;
        System.out.print("Masukkan Diameter = ");
        diameter = input.nextInt();
        System.out.print("Masukkan phi = ");
        phi = input.nextDouble();
        jarijari = diameter * 0.5;
        luasLingkaran = phi * jarijari * jarijari;
        System.out.println("Luas Lingkaran = " + luasLingkaran + "cm");
    }
}
public class Latihan {
    public static void main(String[] args){
        Segitiga segitigaa = new Segitiga();
        segitigaa.hitungLuas();
        segitigaa.banyakLuas();
        Lingkaran lingkarann = new Lingkaran();
        System.out.println("");
        lingkarann.hitungLuas();
        lingkarann.banyakLuas();
    }
}
