package Praktikum05.inheritance;

public class Mahasiswa extends Person {
    // member1 variabel
    private String nim;
    private String jurusan;
    private int semester;

    // member2 konstruktor
    public Mahasiswa() {
        super();
    }

    // member3 method
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "\nMahasiswa " + super.toString() +
                "\njurusan : " + jurusan +
                "\nsemester : " + semester;
    }
}
