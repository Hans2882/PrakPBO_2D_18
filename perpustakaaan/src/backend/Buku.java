/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.util.ArrayList;
import java.sql.*;
import java.sql.ResultSet;

public class Buku {
    private int idbuku;
    private kategori idkategori;
    private String judul;
    private String penerbit;
    private String penulis;

    public Buku() {
    }

    public Buku(kategori idkategori, String judul, String penerbit, String penulis) {
        this.idkategori = idkategori;
        this.judul = judul;
        this.penerbit = penerbit;
        this.penulis = penulis;
    }

    public int getIdbuku() {
        return idbuku;
    }

    public void setIdbuku(int idbuku) {
        this.idbuku = idbuku;
    }

    public kategori getKategori() {
        return idkategori;
    }

    public void setKategori(kategori kategori) {
        this.idkategori = kategori;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public Buku getById(int id) {
        Buku buku = new Buku();
        ResultSet rs = DBHelper.selectQuery("SELECT b.*, k.nama AS kategori_nama, k.keterangan AS kategori_keterangan "
                + "FROM buku b "
                + "JOIN kategori k ON b.idkategori = k.idkategori "
                + "WHERE b.idbuku = '" + id + "'");
        try {
            while (rs.next()) {
                buku = new Buku();
                buku.setIdbuku(rs.getInt("idbuku"));
                kategori kat = new kategori();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("kategori_nama"));
                kat.setKeterangan(rs.getString("kategori_keterangan"));
                buku.setKategori(kat);
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buku;
    }

    public ArrayList<Buku> getAll() {
        ArrayList<Buku> ListBuku = new ArrayList<>();

        ResultSet rs = DBHelper.selectQuery("SELECT b.*, k.nama AS kategori_nama, k.keterangan AS kategori_keterangan "
                + "FROM buku b "
                + "JOIN kategori k ON b.idkategori = k.idkategori");

        try {
            while (rs.next()) {
                Buku buku = new Buku();
                buku.setIdbuku(rs.getInt("idbuku"));
                kategori kat = new kategori();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("kategori_nama"));
                kat.setKeterangan(rs.getString("kategori_keterangan"));
                buku.setKategori(kat);
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));

                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListBuku;
    }

    public ArrayList<Buku> search(String keyword) {
        ArrayList<Buku> ListBuku = new ArrayList<>();

        String sql = "SELECT b.*, k.nama AS kategori_nama, k.keterangan AS kategori_keterangan "
                + "FROM buku b "
                + "JOIN kategori k ON b.idkategori = k.idkategori "
                + "WHERE b.judul LIKE '%" + keyword + "%' "
                + "OR b.penerbit LIKE '%" + keyword + "%' "
                + "OR b.penulis LIKE '%" + keyword + "%' "
                + "OR k.nama LIKE '%" + keyword + "%' "
                + "OR k.keterangan LIKE '%" + keyword + "%'";

        ResultSet rs = DBHelper.selectQuery(sql);

        try {
            while (rs.next()) {
                Buku buku = new Buku();
                buku.setIdbuku(rs.getInt("idbuku"));
                kategori kat = new kategori();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("kategori_nama"));
                kat.setKeterangan(rs.getString("kategori_keterangan"));
                buku.setKategori(kat);
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));

                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListBuku;
    }

    public void save() {
        if (getById(idbuku).getIdbuku() == 0) {
            String SQL = "INSERT INTO buku (idkategori, judul, penerbit, penulis) VALUES("
                    + " '" + this.idkategori.getIdkategori() + "', "
                    + " '" + this.judul + "', "
                    + " '" + this.penerbit + "', "
                    + " '" + this.penulis + "' "
                    + " )";
            this.idbuku = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE buku SET "
                    + " idkategori = '" + this.idkategori.getIdkategori() + "', "
                    + " judul = '" + this.judul + "', "
                    + " penerbit = '" + this.penerbit + "', "
                    + " penulis = '" + this.penulis + "' "
                    + " WHERE idbuku = '" + this.idbuku + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM buku WHERE idbuku = '" + this.idbuku + "'";
        DBHelper.executeQuery(SQL);
    }
}
