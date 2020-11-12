package com.pboreg;
interface interfaceHitungLuasV3 {
    public void setSisi(double... sisi); // Java 1.5.0 Varargs (Variable Arguments)
    public double getLuas();
}

class SegitigaV3 implements interfaceHitungLuasV3 {
    private double alas;
    private double tinggi;

    @Override
    public void setSisi(double... sisi) {
        this.alas = sisi[0];
        this.tinggi = sisi[1];
    }

    @Override
    public double getLuas() {
        double luas = 0.5 * this.alas * this.tinggi;
        return luas;
    }
    public double getAlas() {
        return this.alas;
    }

    public double getTinggi() {
        return this.tinggi;
    }
}

class LingkaranV3 implements interfaceHitungLuasV3 {
    private double diameter;

    @Override
    public void setSisi(double... sisi) {
        this.diameter = sisi[0];
    }

    @Override
    public double getLuas() {
        double r = this.diameter/2;
        double luas = 3.14 * diameter * diameter;
        return luas;
    }

    public double getDiameter() {
        return this.diameter;
    }
}
public class P8RunLuasV3 {
    public static void main(String[] args) {
        SegitigaV3 oSegitiga = new SegitigaV3();
        oSegitiga.setSisi(5,2);
        System.out.println("Luas Segitiga = 0.5 x " +
                oSegitiga.getAlas() + " x " +
                oSegitiga.getTinggi() + " = " +
                oSegitiga.getLuas());

        LingkaranV3 oLingkaran = new LingkaranV3();
        oLingkaran.setSisi(10);
        System.out.println("Luas Lingkaran = " + oLingkaran.getLuas());
    }
}