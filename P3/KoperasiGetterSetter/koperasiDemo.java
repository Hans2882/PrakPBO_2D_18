package P3.KoperasiGetterSetter;

public class koperasiDemo {
    public static void main(String[] args) {
        anggota anggota1 = new anggota();

        anggota1.setNama("Mussolini");
        anggota1.setAlamat("Jl. Roma no 40");
        anggota1.setSimpanan(100000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp" + anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp" + anggota1.getSimpanan());
    }
}
