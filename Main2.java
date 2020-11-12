package com.pboreg;
//interface
interface Mamalia {
    //interface method
    public void tempatTinggal();
    public void tidur();
}
interface MakhlukHidup {
    public void bernafas();
    public void bernama();
}
class Hewan1 implements Mamalia, MakhlukHidup {
    @Override
    public void tempatTinggal() {
        System.out.println("Tempat Tinggal: Air");
    }
    @Override
    public void tidur() {
        System.out.println("ZzzZzz");
    }
    @Override
    public void bernafas() {
        System.out.println("Bernapas dengan paru-paru");
    }
    @Override
    public void bernama() {
        System.out.println("Paus");
    }
}
public class Main2 {
    public static void main(String[] args) {
        Hewan1 paus = new Hewan1();
        paus.tempatTinggal();
        paus.tidur();
        paus.bernama();
        paus.bernafas();
    }
}
