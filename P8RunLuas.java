package com.pboreg;
abstract class HitungLuas {
    protected double s1;
    protected double s2;
    public HitungLuas() {
        this.s1 = 0;
        this.s2 = 0;
    }
    public void setSisi(double s1) {
        this.s1 = s1;
    }
    public void setSisi(double s1, double s2) {
        this.s1 = s1;
        this.s2 = s2;
    }
    public double getS1() {
        return s1;
    }

    public double getS2() {
        return s2;
    }
    public abstract double getLuas();

}
class SgtgaV1 extends HitungLuas {
    public double getLuas() {
        double luas = 0.5 * this.s1 * this.s2;
        return luas;
    }
}
class LngkrnV1 extends HitungLuas {
    public double getLuas() {
        double r = this.s1/s2;
        double luas = 3.14 * r * r;
        return luas;
    }
}
public class P8RunLuas {
    public static void main(String[] args) {
        SgtgaV1 osgtga = new SgtgaV1();
        osgtga.setSisi(5,2);
        System.out.println("Luas Segitiga = 0.5 x " +
                osgtga.getS1() + " x " +
                osgtga.getS2() + " = " +
                osgtga.getLuas());

        LngkrnV1 olngkrn = new LngkrnV1();
        olngkrn.setSisi(10);
        System.out.println("Luas Lingkaran = " + olngkrn.getLuas());
    }
}