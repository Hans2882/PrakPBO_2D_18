package P1;

public class TugasDemo {
    public static void main(String[] args) {
        Tugas1 kmr1 = new Tugas1();
        Tugas1 kmr2 = new Tugas1();
        Tugas1 kmr3 = new Tugas1();

        Tugas2 spk1 = new Tugas2();
        Tugas2 spk2 = new Tugas2();
        Tugas2 spk3 = new Tugas2();

        Tugas3 psw1 = new Tugas3();
        Tugas3 psw2 = new Tugas3();
        Tugas3 psw3 = new Tugas3();

        Tugas3IN psw4 = new Tugas3IN();
        Tugas3IN psw5 = new Tugas3IN();
        Tugas3IN psw6 = new Tugas3IN();

        System.out.println("==========");
        System.out.println("Kamera");
        System.out.println("==========");
        kmr1.setMerek("Sony");
        kmr1.warnaObjek("Hitam");
        kmr1.KondisiObjek("Menyala");
        kmr1.cetakStatus();
        System.out.println("");
        kmr2.setMerek("Canon");
        kmr2.warnaObjek("Putih");
        kmr2.KondisiObjek("Mati");
        kmr2.cetakStatus();
        System.out.println("");
        kmr3.setMerek("FujiFilm");
        kmr3.warnaObjek("Silver");
        kmr3.KondisiObjek("Menyala");
        kmr3.cetakStatus();
       
        System.out.println("");
        System.out.println("==========");
        System.out.println("Speaker");
        System.out.println("==========");
        spk1.setMerek("JBL");
        spk1.warnaObjek("Hitam");
        spk1.KondisiObjek("Menyala");
        spk1.tambahVolume(60);
        spk1.cetakStatus();
        System.out.println("");
        spk2.setMerek("Edifier");
        spk2.warnaObjek("Hitam");
        spk2.KondisiObjek("Mati");
        spk2.cetakStatus();
        System.out.println("");
        spk3.setMerek("Sony");
        spk3.warnaObjek("Putih");
        spk3.KondisiObjek("Mati");
        spk3.tambahVolume(55);
        spk3.kurangVolume(5);
        spk3.cetakStatus();

        System.out.println("");
        System.out.println("==========");
        System.out.println("Pesawat Komersial");
        System.out.println("==========");
        psw1.setMerek("Airbus");
        psw1.warnaObjek("Putih");
        psw1.KondisiObjek("Mati");
        psw1.TambahKecepatan(0);
        psw1.cetakStatus();
        System.out.println("");
        psw2.setMerek("Boeing");
        psw2.warnaObjek("Hitam");
        psw2.KondisiObjek("Menyala");
        psw2.TambahKecepatan(550);
        psw2.cetakStatus();
        System.out.println("");
        psw3.setMerek("Embraer");
        psw3.warnaObjek("Silver");
        psw3.KondisiObjek("Menyala");
        psw3.TambahKecepatan(550);
        psw3.KurangiKecepatan(100);
        psw3.cetakStatus();

        System.out.println("");
        System.out.println("==========");
        System.out.println("Pesawat Tempur");
        System.out.println("==========");
        psw4.setMerek("Boeing");
        psw4.warnaObjek("Abu-abu");
        psw4.KondisiObjek("Mati");
        psw4.setRole("superioritas udara");
        psw4.setSenjata("AIM-9 Sidewinder");
        psw4.TambahKecepatan(0);        
        psw4.cetakStatus();
        System.out.println("");
        psw5.setMerek("Tupolev");
        psw5.warnaObjek("Abu-abu muda");
        psw5.KondisiObjek("Menyala");
        psw5.setRole("Pengebom");
        psw5.setSenjata("Kh-55SM");
        psw5.TambahKecepatan(2200);
        psw5.cetakStatus();
        System.out.println("");
        psw6.setMerek("Mitsubishi");
        psw6.warnaObjek("Abu-abu");
        psw6.KondisiObjek("Menyala");
        psw6.setRole("Multiperan");
        psw6.setSenjata("AIM-9 Sidewinder");
        psw6.TambahKecepatan(2000);
        psw6.KurangiKecepatan(200);
        psw6.cetakStatus();


    }
}
