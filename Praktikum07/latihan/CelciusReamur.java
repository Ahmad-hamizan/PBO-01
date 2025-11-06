package Praktikum07.latihan;

public class CelciusReamur implements KonverterSatuan {
    String asal = "Celcius";
    String tujuan = "Reamur";

    public float konversi(float in) {
        return 4f / 5 * in;
    }

    public String satuanInput() { return asal; }
    public String satuanOutput() { return tujuan; }
}
