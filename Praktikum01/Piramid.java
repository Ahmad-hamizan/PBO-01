/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum01;

/**
 *
 * @author USER
 */
public class Piramid {
    public static void main(String[] args) {
        int tinggi = 12; // tinggi piramid

        for (int i = 1; i <= tinggi; i++) {
            // Cetak spasi di awal setiap baris (untuk penataan piramid)
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }

            // Cetak bintang: jumlah bintang = 2*i - 1
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Pindah ke baris berikutnya
            System.out.println();
        }
    }
}
