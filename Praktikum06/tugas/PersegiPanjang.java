package Praktikum06.tugas;

public class PersegiPanjang extends Bentuk2D {

    public double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double luasBidang() {
        return this.panjang * this.lebar;
    }

    @Override
    public double kelilingBidang() {
        return 2 * (this.panjang + this.lebar);
    }

    @Override
    public String toString() {
        return namaBentuk() + "\npanjang = " + this.panjang + ", lebar = " + this.lebar;
    }
    

}
