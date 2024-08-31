package P1;

public class Tugas2 {
    private String merek;
    private String warna;
    private String Kondisi;
    private int Volume;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void warnaObjek(String newValue) {
        warna = newValue;
    }

    public void KondisiObjek(String newValue) {
        Kondisi = newValue;
    }

    public void tambahVolume(int increment) {
        Volume = Volume + increment;
    }

    public void kurangVolume(int decrement) {  
        Volume = Volume - decrement;
    }

    public void cetakStatus() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Kondisi: " + Kondisi);
        System.out.println("Volume: " + Volume);
    }
}
