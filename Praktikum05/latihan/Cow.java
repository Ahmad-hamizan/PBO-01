package Praktikum05.latihan;

public class Cow extends Animal {
    private String jenis;

    // constructor
    public Cow(String name, int age, String jenis) {
        super(name, age);
        this.jenis = jenis;
    }

    // Getter dan Setter
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    // Method untuk menampilkan informasi sapi
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: moo moo... <3");
    }

    @Override
    public String toString() {
        return "Cow " + super.toString() +
                " name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", jenis=" + getJenis() + '\'' ;
    }
}
