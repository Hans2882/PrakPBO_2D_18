package P3;

public class TugasAnggota {
    private String NIK;
    private String Nama;
    private int Limit;
    private int pinjam;

    public TugasAnggota(String NIK, String Nama, int Limit) {
        this.NIK = NIK;
        this.Nama = Nama;
        this.Limit = Limit;
        this.pinjam = 0;
    }

    public String getNama() {
        return Nama;
    }

    public int getLimit() {
        return Limit;
    }

    public int getJumlahPinjaman() {
        return pinjam;
    }

    public void pinjam(int total) {
        if (pinjam + total > Limit) {
            System.out.println("Pinjaman melebihi limit");
        } else {
            pinjam += total;
        }
    }

    public void angsur(int total) {
        if (total >= 0.1 * pinjam) {
            pinjam -= total;
        } else {
            System.out.println("Angsuran minimal 10% dari pinjaman");
        }
    }
}
