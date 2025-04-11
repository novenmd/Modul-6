import universitas.Mahasiswa;
import universitas.ManajemenMahasiswa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ManajemenMahasiswa manajemen = new ManajemenMahasiswa();

        int pilihan;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Semua Mahasiswa");
            System.out.println("3. Tampilkan Mahasiswa dengan IPK Tertinggi");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM   : ");
                    String nim = input.nextLine();
                    System.out.print("Masukkan Nama  : ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Prodi : ");
                    String prodi = input.nextLine();
                    System.out.print("Masukkan IPK   : ");
                    double ipk = input.nextDouble();

                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, ipk);
                    manajemen.tambahMahasiswa(mhs);
                    System.out.println("Data berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("\nDAFTAR MAHASISWA:");
                    manajemen.tampilkanSemua();
                    break;

                case 3:
                    manajemen.tampilkanIPKTertinggi();
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

        } while (pilihan != 4);

        input.close();
    }
}
