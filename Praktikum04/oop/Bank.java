package Praktikum04.oop;

public class Bank {
    // member1 variabel
    public String nama;
    protected int norek;
    private double saldo;

    // member2 konstruktor
    public Bank(String nama, int norek, double saldo) {
        this.nama = nama;
        this.norek = norek;
        this.saldo = saldo;
    }

    // member3 method
    public void menabung(double uang) {
        // this.saldo = this.saldo + uang;
        this.saldo += uang;
    }

    public void menarik(double uang) {
        // this.saldo = this.saldo - uang;
        this.saldo -= uang;
    }

    public void mencetak() {
        System.out.println("No. Rekening : " + this.norek);
        System.out.println("Nama Nasabah : " + this.nama);
        System.out.printf("Saldo : Rp. %,.2f", this.saldo);
        System.out.println("\n---------------------");
    }
}
