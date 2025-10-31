package Praktikum06.tugas;

public class Segitiga extends Bentuk2D {

    public double alas, tinggi;
    
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double luasBidang() {
        return 0.5 * this.alas * this.tinggi;
    }

    @Override
    public double kelilingBidang() {
        double sisiMiring = Math.sqrt((this.alas * this.alas) + (this.tinggi * this.tinggi));
        return this.alas + this.tinggi + sisiMiring;
    }

    @Override
    public String toString() {
        return namaBentuk() + "\nalas = " + this.alas + ", tinggi = " + this.tinggi;
    }

}
