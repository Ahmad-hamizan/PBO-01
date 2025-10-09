/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum01;

/**
 *
 * @author USER
 */
public class Nilai {
     public static void main(String[] args) {
        // 1. Nyatakan himpunan nilai numerik dalam array
        int[] nilai = {88, 26, 67, 92, 55, 49};

        // 2. Gunakan perulangan for dan if-else if untuk menentukan grade
        System.out.println("Konversi Nilai ke Grade:");
        System.out.println("========================");

        for (int i = 0; i < nilai.length; i++) {
            int n = nilai[i];
            char grade;

            // Tentukan grade menggunakan if-else if
            if (n >= 90 && n <= 100) {
                grade = 'A';
            } else if (n >= 80 && n <= 89) {
                grade = 'B';
            } else if (n >= 56 && n <= 79) {
                grade = 'C';
            } else if (n >= 40 && n <= 55) {
                grade = 'D';
            } else if (n >= 0 && n <= 39) {
                grade = 'E';
            } else {
                grade = '?'; // untuk nilai di luar rentang 0-100
            }

            // Cetak nilai dan grade yang sesuai
            System.out.println("Nilai: " + n + " -> Grade: " + grade);
        }
    }
}
