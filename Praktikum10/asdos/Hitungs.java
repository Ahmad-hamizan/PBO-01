package Praktikum10.asdos;

public class Hitungs {
    public static void main(String[] args) {
        try {
            int angka = 4;
            int hasil = angka/1;
            System.out.println("Hasil : " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Tidak boleh operasi pembagian dengan nol !");
        }
    }
}
