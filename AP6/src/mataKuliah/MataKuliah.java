package mataKuliah;

import java.util.ArrayList;
import dosen.Dosen;
import mahasiswa.Mahasiswa;

public class MataKuliah {
    private String nama;
    private String kodeMK;
    private ArrayList<Dosen> pengampu;
    private ArrayList<Mahasiswa> daftarMahasiswa;

    public MataKuliah(String nama, String kodeMK) {
        this.nama = nama;
        this.kodeMK = kodeMK;
        this.pengampu = new ArrayList<>();
        this.daftarMahasiswa = new ArrayList<>();
    }

    public void setPengampu(ArrayList<Dosen> pengampu) {
        this.pengampu = pengampu;
    }

    public String getNama() {
        return nama;
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public ArrayList<Dosen> getPengampu() {
        return pengampu;
    }

    public ArrayList<Mahasiswa> getDaftarMahasiswa() {
        return daftarMahasiswa;
    }

    public void setDaftarMahasiswa(ArrayList<Mahasiswa> daftarMahasiswa) {
        this.daftarMahasiswa = daftarMahasiswa;
    }
}
