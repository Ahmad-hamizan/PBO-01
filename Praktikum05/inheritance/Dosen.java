package Praktikum05.inheritance;

public class Dosen extends Person {
    // member1 var
    private String nidn;
    private String gelar;

    // member2 konstruktor
    public Dosen() {
        super();
    }

    // member3 method
    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String getGelar() {
        return gelar;
    }

    public void setGelar(String gelar) {
        this.gelar = gelar;
    }

    @Override
    public String toString() {
        return "\nDosen " + super.toString() +
                "\nnidn : " + nidn +
                "\ngelar : " + gelar;
    }

}
