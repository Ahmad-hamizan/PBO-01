package Praktikum06.tugas;

public abstract class Bentuk2D {
    public String namaBentuk() {
        return getClass().getSimpleName();
    }

    public abstract double luasBidang();
    public abstract double kelilingBidang();

}
