package utama;

import dosen.Dosen;
import mahasiswa.Mahasiswa;
import mataKuliah.MataKuliah;
import java.util.ArrayList;

public class Utama {
    public static void main(String[] args) {
        // Buat objek Dosen
        Dosen cahya = new Dosen("Cahya", "D001");
        Dosen budi = new Dosen("Budi", "D002");

        // Buat objek Mahasiswa
        Mahasiswa tiara = new Mahasiswa("Tiara", "M001");
        Mahasiswa diana = new Mahasiswa("Diana", "M002");

        // Daftar mahasiswa Tiara & Diana
        ArrayList<Mahasiswa> mhsTiaraDiana = new ArrayList<>();
        mhsTiaraDiana.add(tiara);
        mhsTiaraDiana.add(diana);

        // Daftar mahasiswa hanya Tiara
        ArrayList<Mahasiswa> mhsTiara = new ArrayList<>();
        mhsTiara.add(tiara);

        // Daftar pengampu Cahya
        ArrayList<Dosen> pengampuCahya = new ArrayList<>();
        pengampuCahya.add(cahya);

        // Daftar pengampu Budi
        ArrayList<Dosen> pengampuBudi = new ArrayList<>();
        pengampuBudi.add(budi);

        // Mata kuliah PBO
        MataKuliah pbo = new MataKuliah("PBO", "123");
        pbo.setPengampu(pengampuCahya);
        pbo.setDaftarMahasiswa(mhsTiaraDiana);

        // Mata kuliah Kompar
        MataKuliah kompar = new MataKuliah("Kompar", "124");
        kompar.setPengampu(pengampuBudi);
        kompar.setDaftarMahasiswa(mhsTiaraDiana);

        // Mata kuliah Metnum
        MataKuliah metnum = new MataKuliah("Metnum", "125");
        metnum.setPengampu(pengampuBudi);
        metnum.setDaftarMahasiswa(mhsTiara);

        // Tampilkan data
        tampilkanData(pbo);
        tampilkanData(kompar);
        tampilkanData(metnum);
    }

    public static void tampilkanData(MataKuliah mataKuliah) {
        System.out.println("Mata Kuliah: " + mataKuliah.getNama());
        System.out.println("Kode MK: " + mataKuliah.getKodeMK());

        System.out.print("Pengampu: ");
        for (Dosen d : mataKuliah.getPengampu()) {
            System.out.print(d.getNama() + " ");
        }
        System.out.println();

        System.out.print("Mahasiswa: ");
        for (Mahasiswa m : mataKuliah.getDaftarMahasiswa()) {
            System.out.print(m.getNama() + " ");
        }
        System.out.println("\n------------------------");
    }
}