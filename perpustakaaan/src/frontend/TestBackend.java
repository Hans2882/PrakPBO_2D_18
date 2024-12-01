/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frontend;
import backend.*;
/**
 *
 * @author WINDOWS 10
 */
public class TestBackend {
    public static void main(String[] args) {
        kategori kat1 = new kategori("Novel", "Koleksi buku novel");
        kategori kat2 = new kategori("Referensi", "Buku referensi ilmiah");
        kategori kat3 = new kategori("Komik", "Komik anak-anak");

        // test insert
        kat1.save();
        kat2.save();
        kat3.save();

        // test update
        kat2.setKeterangan("Koleksi buku referensi ilmiah");
        kat2.save();

        // test delete
        kat3.delete();

        // test select all
        for (kategori k : new kategori().getAll()) {
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }

        // test search
        for (kategori k : new kategori().search("ilmiah")) {
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }
    }
}


