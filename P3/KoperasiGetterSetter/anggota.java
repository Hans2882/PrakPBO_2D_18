package P3.KoperasiGetterSetter;

public class anggota {
    private String Nama;
    private String Alamat;
    private float simpanan;

    public anggota(String Nama, String Alamat) {
    this.Nama = Nama;
    this.Alamat = Alamat;
    this.simpanan = 0;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public void setAlamat(String alamat) {
        this.Alamat = alamat;
    }

    public void setSimpanan(float simpanan) {
        this.simpanan = simpanan;
    }

    public String getNama() {
        return Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public float getSimpanan() {
        return simpanan;
    }

    public void setor(float uang) {
        simpanan += uang;
    }

    public void pinjam(float uang) {
        simpanan -= uang;
    }
}
