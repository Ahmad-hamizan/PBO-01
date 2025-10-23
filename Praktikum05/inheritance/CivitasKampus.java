package Praktikum05.inheritance;

public class CivitasKampus {
    public static void main(String[] args) {
        // buat object dari Class Dosen dan Mahasiswa
        Dosen d1 = new Dosen();
        Dosen d2 = new Dosen();
        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa();

        // set data
        d1.setNama("Dr. Andi");
        d1.setGender('L');
        d1.setNidn("123456789");
        d1.setGelar("M.Kom");

        d2.setNama("Dr. Siti");
        d2.setGender('P');
        d2.setNidn("987654321");
        d2.setGelar("Ph.D");

        m1.setNama("Budi");
        m1.setGender('L');
        m1.setNim("101");
        m1.setJurusan("Teknik Informatika");
        m1.setSemester(4);

        m2.setNama("Ani");
        m2.setGender('P');
        m2.setNim("102");
        m2.setJurusan("Sistem Informasi");
        m2.setSemester(4);

        // cetak data
        Person [] arrCivitas = { d1, d2, m1, m2 };
        for (Person p : arrCivitas) {
            System.out.println(p.toString());
        }
    }
}