package Praktikum07.latihan;

import java.util.Scanner;

public class ProgramKonversi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // daftar konverter
        KonverterSatuan[] konverters = {
            new CelciusFahrenheit(),
            new FahrenheitCelcius(),
            new CelciusReamur(),
            new ReamurCelcius()
        };

        System.out.println("Assalamu'alaikum, Aku adalah Konverter Besaran Suhu ...");

        while (true) {
            System.out.println("\nSilakan pilih nomor konverter:");
            for (int i = 0; i < konverters.length; i++) {
                System.out.println((i + 1) + ". " + konverters[i].satuanInput() +
                                   " ke " + konverters[i].satuanOutput());
            }
            System.out.print("\nKonverter pilihan anda (0 untuk QUIT): ");
            int pilih = sc.nextInt();

            if (pilih == 0) {
                System.out.println("Terima kasih! Program selesai.");
                break;
            } else if (pilih < 1 || pilih > konverters.length) {
                System.out.println("❌ Pilihan tidak valid!");
                continue;
            }

            KonverterSatuan k = konverters[pilih - 1];
            System.out.print("Masukkan besaran suhu (" + k.satuanInput() + "): ");
            float input = sc.nextFloat();

            float hasil = k.konversi(input);
            System.out.println(">> " + input + " " + k.satuanInput() + " setara dengan " + hasil + " " + k.satuanOutput());
        }

        sc.close();
    }
}
