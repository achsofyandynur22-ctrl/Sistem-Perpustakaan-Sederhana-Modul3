/**
 * Merepresentasikan buku perpustakaan yang dapat dipinjam dan dikembalikan.
 * Kelas ini mewarisi informasi umum dari {@link LibraryItem} dan menerapkan
 * operasi dari {@link Borrowable}.
 *
 * @author Ach Sofyan Daynur
 * @version 1.0
 */
public class LibraryBook extends LibraryItem implements Borrowable {

    /** Nama anggota yang meminjam buku. */
    private String memberName;

    /** Menunjukkan apakah buku sedang dipinjam. */
    private boolean borrowed;

    /** Besar denda keterlambatan untuk setiap hari. */
    private static final double FINE_PER_DAY = 2000;

    /**
     * Membuat data buku beserta anggota yang akan meminjamnya.
     * Status awal buku adalah tersedia.
     *
     * @param title judul buku
     * @param author nama penulis buku
     * @param memberName nama anggota perpustakaan
     */
    public LibraryBook(String title, String author, String memberName) {
        super(title, author);
        this.memberName = memberName;
        this.borrowed = false;
    }

    /**
     * Menampilkan informasi buku, penulis, peminjam, dan status peminjaman.
     */
    @Override
    public void showDetails() {
        printHeader();
        System.out.println("Judul buku : " + getTitle());
        System.out.println("Penulis    : " + getAuthor());
        System.out.println("Peminjam   : " + memberName);
        displayStatus();
    }

    /** Menampilkan judul bagian informasi data buku. */
    private void printHeader() {
        System.out.println("=== DATA BUKU ===");
    }

    /** Menampilkan status buku, yaitu Dipinjam atau Tersedia. */
    private void displayStatus() {
        System.out.println("Status     : " + (borrowed ? "Dipinjam" : "Tersedia"));
    }

    /**
     * Meminjam buku jika buku belum sedang dipinjam.
     * Jika sudah dipinjam, program menampilkan pesan bahwa buku sedang dipinjam.
     */
    @Override
    public void borrow() {
        if (!borrowed) {
            borrowed = true;
            System.out.println(memberName + " berhasil meminjam " + getTitle());
        } else {
            System.out.println("Buku sedang dipinjam.");
        }
    }

    /**
     * Mengembalikan buku jika statusnya sedang dipinjam.
     * Jika belum dipinjam, program menampilkan pesan yang sesuai.
     */
    @Override
    public void returnItem() {
        if (borrowed) {
            borrowed = false;
            System.out.println(memberName + " mengembalikan " + getTitle());
        } else {
            System.out.println("Buku belum dipinjam.");
        }
    }

    /**
     * Menghitung denda berdasarkan jumlah hari keterlambatan.
     * Tidak ada denda jika jumlah hari keterlambatan nol atau negatif.
     *
     * @param lateDays jumlah hari keterlambatan pengembalian
     * @return total denda dalam rupiah
     */
    public double calculateFine(int lateDays) {
        if (lateDays <= 0) {
            return 0;
        }
        return lateDays * FINE_PER_DAY;
    }
}
