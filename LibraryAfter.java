/**
 * Kelas utama untuk menjalankan contoh Sistem Perpustakaan Sederhana
 * setelah proses refactoring.
 *
 * @author Ach Sofyan Daynur
 * @version 1.0
 */
public class LibraryAfter {

    /**
     * Menjalankan simulasi menampilkan data buku, meminjam buku,
     * menampilkan status terbaru, mengembalikan buku, dan menghitung denda.
     *
     * @param args argumen command-line (tidak digunakan)
     */
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook(
                "Pemrograman Java",
                "Budi Santoso",
                "Andi"
        );

        book.showDetails();
        book.borrow();
        book.showDetails();
        book.returnItem();

        System.out.println(
                "Denda keterlambatan: Rp" + book.calculateFine(3)
        );
    }
}
