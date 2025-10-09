/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum01;

/**
 *
 * @author USER
 */
public class BelajarIf {
    public static void main(String[] args) {
        // 1. Variabel segitiga 1
        double alas1 = 4.7;
        double tinggi1 = 3.8;
        double luas1 = 0.5 * alas1 * tinggi1;

        // 2. Variabel segitiga 2
        double alas2 = 3.7;
        double tinggi2 = 4.8;
        double luas2 = 0.5 * alas2 * tinggi2;

        // 3. Bandingkan luas
        if (luas1 > luas2) {
            System.out.println("Segitiga 1 lebih besar");
        } else if (luas1 < luas2) {
            System.out.println("Segitiga 1 lebih kecil");
        } else {
            System.out.println("Kedua segitiga sama luas");
        }

        // Tambahan: tampilkan nilai luas biar jelas
        System.out.println("Luas Segitiga 1 = " + luas1);
        System.out.println("Luas Segitiga 2 = " + luas2);
    }
}
