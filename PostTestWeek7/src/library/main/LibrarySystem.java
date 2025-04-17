package library.main;

import library.model.Book;
import library.model.Member;
import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public LibrarySystem() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Buku sudah berhasil ditambahkan");
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("Anggota sudah berhasil ditambahkan.");
    }

    public void displayBooks() {
        System.out.println("\nDaftar Buku:");
        for (Book book : books) {
            System.out.println("- " + book);
        }
    }

    public void displayMembers() {
        System.out.println("\nDaftar Anggota:");
        for (Member member : members) {
            System.out.println("- " + member);
        }
    }

    public static void main(String[] args) {
        LibrarySystem system = new LibrarySystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Sistem Perpustakaan ===");
            System.out.println("1. Tambahkan Buku");
            System.out.println("2. Tambahkan Anggota");
            System.out.println("3. Daftar Buku");
            System.out.println("4. Daftar Anggota");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Judul: ");
                    String title = scanner.nextLine();
                    System.out.print("Penulis: ");
                    String author = scanner.nextLine();
                    System.out.print("Tahun Terbit: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // buang newline
                    system.addBook(new Book(title, author, year));
                    break;
                case 2:
                    System.out.print("Nama: ");
                    String name = scanner.nextLine();
                    System.out.print("ID Anggota: ");
                    String id = scanner.nextLine();
                    system.addMember(new Member(name, id));
                    break;
                case 3:
                    system.displayBooks();
                    break;
                case 4:
                    system.displayMembers();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (choice != 0);

        scanner.close();
    }
}

