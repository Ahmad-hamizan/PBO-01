package Praktikum05.latihan;

public class Cat extends Animal {
    private String color;

    // constructor
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    // Getter dan Setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Method untuk menampilkan informasi kucing
    public void makeSound() {
        System.out.println(getName() + " says: meong meong...<3");
    }

    @Override
    public String toString() {
        return "Cat " + super.toString() +
                " name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", color='" + color + '\'';
    }
}
