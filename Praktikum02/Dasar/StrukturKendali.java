package Praktikum02.Dasar;

public class StrukturKendali {
    public static void main(String[] args) {
        float nilai = (float) 99.70;
        char grade;
        if (nilai >= 85 && nilai <= 100)
            grade = 'A';
        else if (nilai >= 75 && nilai < 85)
            grade = 'B';
        else if (nilai >= 60 && nilai < 75)
            grade = 'C';
        else if (nilai >= 30 && nilai < 60)
            grade = 'D';
        else
            grade = 'A';

        // Switch Case
        String predikat;
        switch (grade) {
            case 'A': predikat = "Memuaskan";break;
            case 'B': predikat = "Bagus";break;
            case 'C': predikat = "Cukup";break;
            case 'D': predikat = "Kureng";break;        
            default: predikat = "Buruk";
        }
        System.out.println("Nilai " + nilai +
                "\ngradenya " + grade + "\nPredikatnya " + predikat);
    }

}
