package Praktikum07.latihan;

public class ReamurCelcius implements KonverterSatuan {
    String asal = "Reamur";
    String tujuan = "Celcius";

    public float konversi(float in) {
        return 5f / 4 * in;
    }

    public String satuanInput() { return asal; }
    public String satuanOutput() { return tujuan; }
}
