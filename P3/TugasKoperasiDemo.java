package P3;

import java.util.Scanner;

public class TugasKoperasiDemo {
    public static void main(String[] args) {
        Scanner SC1 = new Scanner(System.in);
        boolean back = false;
        int menu;
        TugasAnggota donny = new TugasAnggota("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimit());

        while (back == false) {

            System.out.println("\nMenu:");
            System.out.println("1. Masukkan jumlah pinjaman");
            System.out.println("2. Bayar angsuran");
            System.out.println("3. Jumlah pinjaman");
            System.out.println("4. Exit");
            menu = SC1.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("\nMasukkan jumlah pinjaman");
                    int jumlah = SC1.nextInt();
                    donny.pinjam(jumlah);
                    break;
                case 2:
                    System.out.println("\nMembayar angsuran");
                    int angsur = SC1.nextInt();
                    donny.angsur(angsur);
                    break;
                case 3:
                    System.out.println("\nJumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
                    break;
                case 4:
                    back = true;
                    break;
                default:
                    break;
            }
        }
    }
}
