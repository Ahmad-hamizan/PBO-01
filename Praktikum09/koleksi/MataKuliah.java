package Praktikum09.koleksi;

public class MataKuliah {
    private String kode, nama;
    private int sks;

    public MataKuliah(){
    }

    public void setKode(String kode){
        this.kode = kode;
    }

    public String getKode(){
        return kode;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setSks(int sks){
        this.sks = sks;
    }
    public int getSks(){
        return sks;
    }

    @Override
    public String toString(){
        return kode + " - " + nama + " (" + sks + " SKS)";
    }
}
