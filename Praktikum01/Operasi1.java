/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum01;

/**
 *
 * @author USER
 */
public class Operasi1 {
    public static void main(String[] args) {
        // 2. Deklarasi variabel rad1
        float rad1 = 14.0f;

        // 3. Deklarasi variabel luas1 dan luas2
        float luas1, luas2;

        // 4. Hitung luas1 dengan rumus: 22f / 7 * rad1 * rad1
        luas1 = 22f / 7 * rad1 * rad1;

        // 5. Hitung luas2 dengan rumus: rad1 * rad1 * 22 / 7
        luas2 = rad1 * rad1 * 22 / 7;

        // 6. Cetak hasil
        System.out.println("Luas1 = " + luas1);
        System.out.println("Luas2 = " + luas2);

        // 7. Deklarasi variabel boolean kecilDari
        boolean kecilDari = luas1 < luas2;

        // Cetak hasil perbandingan
        System.out.println("Apakah luas1 < luas2 ? " + kecilDari);
    }
}
