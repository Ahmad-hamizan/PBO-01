package Praktikum07.interfaces;

public class Motor implements Assets {
    public String merk;
    public int cc, tahun;

    public Motor() {
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    @Override
    public double nilaiAsset() {
        return 30000000;
    }

    @Override
    public String toString() {
        return "Motor :" + " merk = " + merk + ", cc = " + cc + ", tahun = " + tahun;
    }

}
