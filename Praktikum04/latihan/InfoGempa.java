package Praktikum04.latihan;

public class InfoGempa {
    public static void main(String[] args) {
        // ---------buat object dari Class Gempa-------
        Gempa g1 = new Gempa("Jepang", 7.8f);
        Gempa g2 = new Gempa("Philipina", 5.7f);
        Gempa g3 = new Gempa("Argentina", 3.6f);
        Gempa g4 = new Gempa("India", 2.0f);
        // ---------buat object dari Class Gempa-------
        // ---------pada halaman slide selanjutnya------
        System.out.println("--------- Cetak Cara 1 ---------");
        g1.dampak();
        g2.dampak();
        g3.dampak();
        g4.dampak();

        System.out.println("--------- Cetak Cara 2 ---------");
        Gempa[] arrGempa = { g1, g2, g3, g4 };
        for (Gempa g : arrGempa) {
            g.dampak();
        }
    }
}
