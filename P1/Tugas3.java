package P1;

public class Tugas3 {
    private String merek;
    private String warna;
    private String Kondisi;
    private int Kecepatan;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void warnaObjek(String newValue) {
        warna = newValue;
    }

    public void KondisiObjek(String newValue) {
        Kondisi = newValue;
    }

    public void TambahKecepatan(int increment) {
        Kecepatan = Kecepatan + increment;
    }

    public void KurangiKecepatan(int decrement) {
        Kecepatan = Kecepatan - decrement;
    }

    public void cetakStatus() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Kondisi Mesin: " + Kondisi);
        System.out.println("Kecepatan: " + Kecepatan);
    }
}
