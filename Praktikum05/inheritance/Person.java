package Praktikum05.inheritance;

public class Person {
    // atribut
    private String nama;
    private char gender;

    // constructor
    public Person() {
    }

    // method setter dan getter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "STT-NF : " + "\nnama : " + nama + "\ngender : "
                + gender;
    }
}
