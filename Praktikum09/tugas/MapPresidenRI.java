package Praktikum09.tugas;

import java.util.Map;
import java.util.TreeMap;

public class MapPresidenRI {
    public static void main(String[] args) {
        Map<String, String> presiden = new TreeMap<>();

        // 1. Input Data Presiden
        presiden.put("Soekarno", "1945-1967");
        presiden.put("Soeharto", "1967-1998");
        presiden.put("Bacharuddin Jusuf Habibie", "1999-2004");
        presiden.put("Abdurrahman Wahid", "2004-2007");
        presiden.put("Megawati Soekarnoputri", "2007-2010");
        presiden.put("Susilo Bambang Yudhoyono", "2010-2014");
        presiden.put("Joko Widodo", "2014-2019");

        // 2. Mengambil Data Tertentu
        System.out.println("Presiden RI ke 7 adalah: " + presiden.get("Joko Widodo"));

        // 3. Tampilkan Semua Data
        System.out.println("\nNama presiden RI:" + presiden.keySet());

        // 4. Menampilkan Semua Masa Jabatan
        System.out.println("\nMasa jabatan presiden RI:" + presiden.values());

        // 5. Menampilkan Seluruh Data Presiden beserta Masa Jabatannya
        for (String nama : presiden.keySet()) {
            String masa = presiden.get(nama);
            System.out.println("\nPresiden " + nama + " masa jabatannya :" + masa);
        }

        // 6. Update Data Presiden
        presiden.put("Joko Widodo", "2014-2024");

        // 7. Hapus Data Presiden
        presiden.remove("Soekarno");

        // 8. Tambah Data Presiden
        presiden.put("Sukarno", "1945-1967");
    }
}
