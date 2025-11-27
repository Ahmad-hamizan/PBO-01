package Praktikum10.asdos;

public class PraktekFinally {
    public static void main(String[] args) {
        String[] vendors = {"Intel", "AMD", "ARM", "CITRIX"};
        try {
            System.out.println(vendors[6]);
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan dengan sebab " + e.getMessage());
        } finally {
            System.out.println("Eksekusi Finally Berhasil !");
        }
    }
}
