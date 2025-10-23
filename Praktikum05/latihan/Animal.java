package Praktikum05.latihan;

public class Animal {
    private String name;
    private int age;

    // constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter dan Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method untuk menampilkan informasi hewan
    public void makeSound() {
        System.out.println("Hewan " + name + " bersuara...");
    }
    
    @Override
    public String toString() {
        return  " name ='" + name + '\'' +
                ", age =" + age;
    }
}
