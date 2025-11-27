package Praktikum10.asdos;

public class PraktekEksepsi {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[4] = 100;
            System.out.println("Isi element array berhassil dibuat");
        } catch (Exception e) {
            System.out.println("Terjadi pelanggaran memori");
            System.out.println("Terjadi kesalahan dengan sebab " + e.getMessage());
        }
    }
}
