package backend;

import java.sql.ResultSet;
import java.util.ArrayList;

public class peminjaman {
    private int idpeminjaman;
    private Anggota anggota;
    private Buku buku;
    private String tanggalPinjam;
    private String tanggalKembali;
    
    public peminjaman(){
        
    }
    
    public peminjaman(Anggota anggota, Buku buku, String tanggalPinjam, String tanggalKembali){
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    public int getIdpeminjaman() {
        return idpeminjaman;
    }

    public void setIdpeminjaman(int idpeminjaman) {
        this.idpeminjaman = idpeminjaman;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public String getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }
    
    public peminjaman getById(int id)
    {
        peminjaman pmj = new peminjaman();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                + "    p.idpeminjaman AS idpeminjaman, "
                + "    a.idanggota AS idanggota, "
                + "    a.nama AS nama, "
                + "    a.alamat AS alamat, "
                + "    a.telepon AS telepon, "
                + "    b.idbuku AS idbuku, "
                + "    b.judul AS judul, "
                + "    b.penerbit AS penerbit, "
                + "    b.penulis AS penulis, "
                + "    k.idkategori AS idkategori, "
                + "    k.nama AS kategori_nama, "
                + "    k.keterangan AS kategori_keterangan, "
                + "    p.tanggalpinjam AS tanggalpinjam, "
                + "    p.tanggalkembali AS tanggalkembali "
                + "    FROM peminjaman p "
                + "    LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                + "    LEFT JOIN buku b ON p.idbuku = b.idbuku "
                + "    LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                + "    WHERE p.idpeminjaman = '" + id + "'");
        try {
            if (rs.next()) {
                pmj.setIdpeminjaman(rs.getInt("idpeminjaman"));
                pmj.setTanggalPinjam(rs.getString("tanggalpinjam"));
                pmj.setTanggalKembali(rs.getString("tanggalkembali"));

                Anggota anggota = new Anggota();
                anggota.setIdAnggota(rs.getInt("idanggota"));
                anggota.setNama(rs.getString("nama"));
                anggota.setAlamat(rs.getString("alamat"));
                anggota.setTelepon(rs.getString("telepon"));
                pmj.setAnggota(anggota);

                Buku buku = new Buku();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));

                kategori kategori = new kategori();
                kategori.setIdkategori(rs.getInt("idkategori"));
                kategori.setNama(rs.getString("kategori_nama"));
                kategori.setKeterangan(rs.getString("kategori_keterangan"));
                buku.setKategori(kategori);

                pmj.setBuku(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pmj;
    }
    
    public ArrayList<peminjaman> getAll() {
    ArrayList<peminjaman> ListPeminjaman = new ArrayList<>();
    ResultSet rs = DBHelper.selectQuery("SELECT "
            + "    p.idpeminjaman AS idpeminjaman, "
            + "    a.idanggota AS idanggota, "
            + "    a.nama AS nama, "
            + "    a.alamat AS alamat, "
            + "    a.telepon AS telepon, "
            + "    b.idbuku AS idbuku, "
            + "    b.judul AS judul, "
            + "    b.penerbit AS penerbit, "
            + "    b.penulis AS penulis, "
            + "    k.idkategori AS idkategori, "
            + "    k.nama AS kategori_nama, "
            + "    k.keterangan AS kategori_keterangan, "
            + "    p.tanggalpinjam AS tanggalpinjam, "
            + "    p.tanggalkembali AS tanggalkembali "
            + "    FROM peminjaman p "
            + "    LEFT JOIN anggota a ON p.idanggota = a.idanggota "
            + "    LEFT JOIN buku b ON p.idbuku = b.idbuku "
            + "    LEFT JOIN kategori k ON b.idkategori = k.idkategori");
    try {
        while (rs.next()) {       
            peminjaman pmj = new peminjaman();
            pmj.setIdpeminjaman(rs.getInt("idpeminjaman"));
            pmj.setTanggalPinjam(rs.getString("tanggalpinjam"));
            pmj.setTanggalKembali(rs.getString("tanggalkembali"));

            Anggota anggota = new Anggota();
            anggota.setIdAnggota(rs.getInt("idanggota"));
            anggota.setNama(rs.getString("nama"));
            anggota.setAlamat(rs.getString("alamat"));
            anggota.setTelepon(rs.getString("telepon"));
            pmj.setAnggota(anggota);

            Buku buku = new Buku();
            buku.setIdbuku(rs.getInt("idbuku"));
            buku.setJudul(rs.getString("judul"));
            buku.setPenerbit(rs.getString("penerbit"));
            buku.setPenulis(rs.getString("penulis"));

            kategori kategori = new kategori();
            kategori.setIdkategori(rs.getInt("idkategori"));
            kategori.setNama(rs.getString("kategori_nama"));
            kategori.setKeterangan(rs.getString("kategori_keterangan"));
            buku.setKategori(kategori);

            pmj.setBuku(buku);

            ListPeminjaman.add(pmj);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return ListPeminjaman;
}

    
    public void save()
    {
        if (getById(idpeminjaman).getIdpeminjaman() == 0)
        {
            String SQL = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) VALUES("
                    + "    '" + this.getAnggota().getIdAnggota() + "', "
                    + "    '" + this.getBuku().getIdbuku() + "', "
                    + "    '" + this.tanggalPinjam + "', "
                    + "    '" + this.tanggalKembali + "' "
                    + "    )";
            this.idpeminjaman = DBHelper.insertQueryGetId(SQL);
        }
        else
        {
            String SQL = "UPDATE peminjaman SET "
                    + "    idanggota = '" + this.getAnggota().getIdAnggota() + "', "
                    + "    idbuku = '" + this.getBuku().getIdbuku() + "', "
                    + "    tanggalpinjam = '"
                                    + this.tanggalPinjam + "', "
                    + "    tanggalkembali = '" + this.tanggalKembali + "' "
                    + "    WHERE idpeminjaman = '" + this.idpeminjaman+ "'";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete()
    {
        String SQL = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.idpeminjaman + "'";
        DBHelper.executeQuery(SQL);
    }
}
