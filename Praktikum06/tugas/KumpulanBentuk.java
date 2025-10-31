package Praktikum06.tugas;

public class KumpulanBentuk {
    public static void main(String[] args) {
        
        Lingkaran lingkaran1 = new Lingkaran(8);
        Lingkaran lingkaran2 = new Lingkaran(5);
        BujurSangkar bujurSangkar = new BujurSangkar(5.0);
        PersegiPanjang persegiPanjang = new PersegiPanjang(4.0, 6.0);
        Segitiga segitiga = new Segitiga(8.0, 6.0);

        System.out.println(lingkaran1.toString());
        System.out.println("Luas: " + lingkaran1.luasBidang());
        System.out.println("Keliling: " + lingkaran1.kelilingBidang());
        System.out.println();
        System.out.println(lingkaran2.toString());
        System.out.println("Luas: " + lingkaran2.luasBidang());
        System.out.println("Keliling: " + lingkaran2.kelilingBidang());
        System.out.println();
        System.out.println(bujurSangkar.toString());
        System.out.println("Luas: " + bujurSangkar.luasBidang());
        System.out.println("Keliling: " + bujurSangkar.kelilingBidang());
        System.out.println();
        System.out.println(persegiPanjang.toString());
        System.out.println("Luas: " + persegiPanjang.luasBidang());
        System.out.println("Keliling: " + persegiPanjang.kelilingBidang());
        System.out.println();
        System.out.println(segitiga.toString());
        System.out.println("Luas: " + segitiga.luasBidang());
        System.out.println("Keliling: " + segitiga.kelilingBidang());
        System.out.println();
    }

}
