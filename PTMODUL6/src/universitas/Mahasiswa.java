package universitas;

public class Mahasiswa {
    private String NIM;
    private String Nama;
    private String Prodi;
    private double IPK;

    public Mahasiswa( String NIM, String Nama, String Prodi, double IPK) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Prodi = Prodi;
        this.IPK = IPK;
    }

    public String getNim() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getProdi() {
        return Prodi;
    }

    public void setProdi(String Prodi) {
        this.Prodi = Prodi;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public void tampilkanData() {
        System.out.println("---Data Mahasiswa---");
        System.out.println("NIM   : " + NIM);
        System.out.println("Nama  : " + Nama);
        System.out.println("Prodi : " + Prodi);
        System.out.println("IPK   : " + IPK);
        System.out.println("---------------------");
    }
}
