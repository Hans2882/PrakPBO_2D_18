package P1;

public class Tugas1 {
    private String merek;
    private String warna;
    private String Kondisi;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void warnaObjek(String newValue) {
        warna = newValue;
    }

    public void KondisiObjek(String newValue) {
        Kondisi = newValue;
    }

    public void cetakStatus() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Kondisi: " + Kondisi);
    }
}
