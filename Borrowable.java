/**
 * Mendefinisikan operasi yang dapat dilakukan pada item perpustakaan
 * yang bisa dipinjam dan dikembalikan.
 *
 * @author Ach Sofyan Daynur
 * @version 1.0
 */
public interface Borrowable {

    /**
     * Memproses peminjaman item perpustakaan.
     */
    void borrow();

    /**
     * Memproses pengembalian item perpustakaan.
     */
    void returnItem();
}
