/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum01;

/**
 *
 * @author USER
 */
public class HitungRataRata {
    public static void main(String[] args) {
        // 1. Simpan data himpunan bilangan bulat ke dalam array
        int[] bilangan = {1, 2, 3, 5, 6, 7, 9, 10, 23};
        
        // 2. Hitung rata-rata menggunakan perulangan for
        double jumlah = 0;
        for (int i = 0; i < bilangan.length; i++) {
            jumlah += bilangan[i];
        }
        
        double rata2 = jumlah / bilangan.length;
        
        // Tampilkan hasil
        System.out.println("Data bilangan: ");
        for (int i = 0; i < bilangan.length; i++) {
            System.out.print(bilangan[i] + " ");
        }
        System.out.println("\nRata-rata: " + rata2);
    }
}
