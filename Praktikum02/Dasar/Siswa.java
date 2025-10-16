package Praktikum02.Dasar;

public class Siswa {
    public static void main(String[] args) {
        String siswa1 ; // Deklarasi
        siswa1 = "Ikhsan Maulani"; // Inisiasi
        float nilai1 = 59.99f; // Deklarasi dan Inisiasi
        String ket;
        /*
        if(nilai1 >= 60){
            ket = "Lulus";
        } else {
            ket = "Tidak Lulus";
        }
         */
        ket = (nilai1 >= 60) ? "Lulus" : "Tidak Lulus"; // Operasi Ternary
        

        System.out.println("Nama :" + siswa1 + ",\nNilai :" + nilai1 + ",\nKeterangan :" + ket);
    }
}
