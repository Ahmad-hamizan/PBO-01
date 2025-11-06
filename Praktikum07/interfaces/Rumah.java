package Praktikum07.interfaces;

public class Rumah implements Assets {
    public double luas, tipe;

    public Rumah() {
    }

    public double getLuas() {
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public double getTipe() {
        return tipe;
    }

    public void setTipe(double tipe) {
        this.tipe = tipe;
    }

    @Override
    public double nilaiAsset() {
        return 2000000000;
    }

    @Override
    public String toString() {
        return "Rumah : " + "luas = " + luas + ", tipe = " + tipe;
    }

}
