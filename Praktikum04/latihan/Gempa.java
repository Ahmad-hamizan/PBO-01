package Praktikum04.latihan;

public class Gempa {
    // member1 variabel
    private String tempat;
    private float skala;

    // member2 konstuktor
    public Gempa(String tempat, float skala) {
        this.tempat = tempat;
        this.skala = skala;
    }

    // member3 method
    public String dampak() {
        String efek = "";
        if (this.skala < 3f)
            efek = "Tidak Terasa";
        else if (this.skala >= 3f && this.skala <= 5f)
            efek = "Bangunan Retak2";
        else if (this.skala > 5f && this.skala <= 8f)
            efek = "Bangunan Roboh";
        else
            efek = "Tsunami";
        System.out.println("Telah terjadi gempa di " + this.tempat +
                " dengan skala " + this.skala + " richter " +
                " berdampak " + efek);
        return efek;
    }
}
