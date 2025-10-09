/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum01;

/**
 *
 * @author USER
 */
public class UpahLembur {
    public static void main(String[] args) {
        int jam_kerja_perhari = 8;
        double gaji_perhari = 1200000;
        int jam_lembur = 15;

        double upah_lembur = (double) jam_lembur / jam_kerja_perhari * gaji_perhari;

        System.out.println("Upah lembur: Rp " + upah_lembur);
    }
}
