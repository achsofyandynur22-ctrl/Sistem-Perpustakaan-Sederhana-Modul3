/**
 * Versi awal Sistem Perpustakaan Sederhana sebelum dilakukan refactoring.
 * Seluruh data dan operasi pengelolaan buku masih digabungkan dalam satu kelas.
 *
 * @author Ach Sofyan Daynur
 * @version 1.0
 */
public class LibraryBefore {

    /** Judul buku yang dikelola. */
    String bookTitle;

    /** Nama penulis buku. */
    String authorName;

    /** Nama anggota perpustakaan. */
    String memberName;

    /** Status peminjaman buku. */
    boolean borrowed;

    /**
     * Membuat objek buku dengan informasi judul, penulis, dan anggota.
     * Status awal buku ditetapkan tersedia.
     *
     * @param bookTitle judul buku
     * @param authorName nama penulis buku
     * @param memberName nama anggota perpustakaan
     */
    public LibraryBefore(String bookTitle, String authorName,
                         String memberName) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.memberName = memberName;
        this.borrowed = false;
    }

    /** Menampilkan informasi buku, anggota, dan status peminjaman. */
    public void showBook() {
        System.out.println("=== DATA BUKU ===");
        System.out.println("Judul buku : " + bookTitle);
        System.out.println("Penulis    : " + authorName);
        System.out.println("Peminjam   : " + memberName);
        System.out.println("Status     : " + (borrowed ? "Dipinjam" : "Tersedia"));
    }

    /** Meminjam buku jika buku belum sedang dipinjam. */
    public void borrowBook() {
        if (borrowed == false) {
            borrowed = true;
            System.out.println(memberName + " berhasil meminjam " + bookTitle);
        } else {
            System.out.println("Buku sedang dipinjam.");
        }
    }

    /** Mengembalikan buku jika statusnya sedang dipinjam. */
    public void returnBook() {
        if (borrowed == true) {
            borrowed = false;
            System.out.println(memberName + " mengembalikan " + bookTitle);
        } else {
            System.out.println("Buku belum dipinjam.");
        }
    }

    /**
     * Menghitung denda keterlambatan dengan tarif Rp2.000 per hari.
     *
     * @param lateDays jumlah hari keterlambatan
     * @return total denda dalam rupiah
     */
    public double calculateFine(int lateDays) {
        double fine = 0;
        if (lateDays > 0) {
            fine = lateDays * 2000;
        }
        return fine;
    }

    /**
     * Menjalankan simulasi program versi sebelum refactoring.
     *
     * @param args argumen command-line (tidak digunakan)
     */
    public static void main(String[] args) {
        LibraryBefore book = new LibraryBefore(
                "Pemrograman Java", "Budi Santoso", "Andi"
        );

        book.showBook();
        book.borrowBook();
        book.showBook();
        book.returnBook();

        System.out.println(
                "Denda keterlambatan: Rp" + book.calculateFine(3)
        );
    }
}
