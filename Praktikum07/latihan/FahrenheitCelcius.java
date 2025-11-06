package Praktikum07.latihan;

public class FahrenheitCelcius implements KonverterSatuan {
    String asal = "Fahrenheit";
    String tujuan = "Celcius";

    public float konversi(float in) {
        return 5f / 9 * (in - 32);
    }

    public String satuanInput() { return asal; }
    public String satuanOutput() { return tujuan; }
}
