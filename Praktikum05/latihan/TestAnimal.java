package Praktikum05.latihan;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Kitty", 2, "White");
        Cow cow1 = new Cow("Luna", 3, "Limousin");

        //
        System.out.println(cat1.toString());
        cat1.makeSound();
        System.out.println(cow1.toString());
        cow1.makeSound();

        Animal[] hewan = {cat1, cow1};
        System.out.println("\n=== Data Hewan ===");
        for (Animal hewan1 : hewan) {
            System.out.println(hewan1.toString());
            hewan1.makeSound();
        }
        
    }
}
