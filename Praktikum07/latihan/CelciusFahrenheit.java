package Praktikum07.latihan;

public class CelciusFahrenheit implements KonverterSatuan {
    // field variable
    String asal, tujuan;

    // default constructor
    public CelciusFahrenheit() {
        this.asal = "Celcius";
        this.tujuan = "Fahrenheit";
    }

    public String satuanInput() {
        return this.asal;
    }

    public String satuanOutput() {
        return this.tujuan;
    }

    public float konversi(float in) {
        return 9f / 5 * in + 32;
    }

    public static void main(String[] args) {
        KonverterSatuan k1 = new CelciusFahrenheit();
        float temp = 100; // titik didih air dalam Celcius
        System.out.println("Titik didih air " + temp + " " +
                k1.satuanInput() + " setara dengan " +
                k1.konversi(temp) + " " + k1.satuanOutput());
    }
}
