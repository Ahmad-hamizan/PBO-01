package Praktikum02.Dasar;

public class Looping1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { // increment i = i + 1
            if (i == 3)
                continue;
            System.out.println("Bilangan " + i);
            if (i == 7)
                break;
        }
    }

}
