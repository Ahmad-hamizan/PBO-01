package Praktikum06.abstracts;

public class SuaraHewan {
    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();
        Hewan kambing = new Kambing();
        Hewan monyet = new Monyet();

        kucing.bersuara();
        anjing.bersuara();
        kambing.bersuara();
        monyet.bersuara();
    }
}
