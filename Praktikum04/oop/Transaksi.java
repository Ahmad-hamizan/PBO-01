package Praktikum04.oop;

public class Transaksi {
    public static void main(String[] args) {
        // membuat object/instance objek
        Bank n1 = new Bank("Budi", 111, 500000);
        Bank n2 = new Bank("Deden", 112, 700000);
        Bank n3 = new Bank("Siti", 113, 400000);
        // panggil member class/method
        n1.menabung(300000);
        n2.menabung(100000);
        n2.menarik(200000);
        n3.menarik(200000);

        System.out.println("---- Cara Mencetak Saldo Nasabah 1 ----");
        n1.mencetak();
        n2.mencetak();
        n3.mencetak();

        System.out.println("---- Cara Mencetak Saldo Nasabah 2 ----");
        Bank[] arrBank = { n1, n2, n3 };
        for (Bank b : arrBank) {
            b.mencetak();
        }
    }
}
