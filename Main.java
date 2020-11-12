package com.pboreg;
//class Abstract
abstract class Hewan {
    //Abstract Method (tidak memiliki body)
    public abstract void suaraHewan();

    //Regular Method
    public void tidur() {
        System.out.println("Zzz...");
    }
}
//Subclass (turunan dari Class Hewan)
class Ayam extends Hewan {
    public void suaraHewan() {
        //body dari abstract method suaraHewan() ditulis disini
        System.out.println("Kuuukuruyuuuukkkk...");
    }
}
class Kucing extends Hewan {
    public void suaraHewan() {
        //body dari abstract method suaraHewan()
        //ditulis disini
        System.out.println("Meong...meong...");
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Ayam ayamku = new Ayam(); //membuat object ayam
        ayamku.suaraHewan();
        ayamku.tidur();
        Kucing kucingku = new Kucing();
        kucingku.suaraHewan();
        ayamku.tidur();
    }
}
