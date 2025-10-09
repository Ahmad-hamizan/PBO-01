package Pratikum02.praktek;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        // ciptakan object scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama : ");
        String nama = sc.nextLine(); // untuk scan lagi
        System.out.print("Usia : ");
        int umur = sc.nextInt(); // untuk scan bilangan
        System.out.println("Nama Santri : " + nama +
                ", umur : " + umur + " tahun");
        sc.close();
    }
}