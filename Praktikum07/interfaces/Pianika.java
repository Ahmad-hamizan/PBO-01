package Praktikum07.interfaces;

public class Pianika implements MusikTekan, MusikTiup {
    @Override
    public void tiup() {
        System.out.println("Tiup Pianika pfufffffff...");
    }

    @Override
    public void tekan() {
        System.out.println("Tekan Pianika net...not...net...");
    }
}
