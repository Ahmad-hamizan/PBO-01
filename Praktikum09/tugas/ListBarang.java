package Praktikum09.tugas;

import java.util.ArrayList;
import java.util.List;

public class ListBarang {
    public static void main(String[] args) {
        // 1. Buat List Kosong
        List<String> barang = new ArrayList<>();

        // 2. Tambahkan Data
        barang.add("Sapu");
        barang.add("Pel");
        barang.add("Ember");
        barang.add("Pisau");
        
        // 3. Tampilkan Seluruh Data
        System.out.println("Daftar Barang:");
        for (int i = 0; i < barang.size(); i++) {
            System.out.println(barang.get(i));
        }

        // 4. Mengubah Data
        barang.set(2, "Gayung"); // Mengganti "Ember" dengan "Gayung"

        // 5. Hapus Data
        barang.remove(0); // Menghapus "Sapu"

        // 6. Menambah Data Baru
        barang.add("Sikat");

        // 7. Tampilkan Seluruh Data
        System.out.println("\nDaftar Barang Baru:");
        for (String b : barang) {
            System.out.println("- " + b);;
        }
    }
}
