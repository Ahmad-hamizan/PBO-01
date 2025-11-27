package Praktikum09.koleksi;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTelepon {
    public static void main(String[] args) {
        Map<String, String> telp = new HashMap<String, String>();
        // menambahkan data ke dalam map
        telp = new TreeMap<String, String>();
        telp.put("Andi", "081234567890");
        telp.put("Edok", "081234567891");
        telp.put("Cici", "081234567892");
        telp.put("Budi", "081234567893");
        telp.put("Dedi", "081234567894");
        // menampilkan seluruh data menggunakan keySet()
        for (String nama : telp.keySet()) {
            String no = telp.get(nama);
            System.out.println("Siswa " + nama + " nomor teleponnya " + no);
        }

        // menggunakan TreeMap untuk mengurutkan berdasarkan key
        System.out.println("\nData terurut berdasarkan nama:");
        Map<String, String> telp2 = new TreeMap<String, String>(telp);
        for (String nama : telp2.keySet()) {
            String no = telp2.get(nama);
            System.out.println("Siswa " + nama + " nomor teleponnya " + no);
        }
    }
}
