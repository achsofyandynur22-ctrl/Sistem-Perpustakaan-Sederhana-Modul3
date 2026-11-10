/**
 * Kelas abstrak yang menjadi dasar untuk item dalam perpustakaan.
 * Menyimpan informasi umum berupa judul dan nama penulis.
 *
 * @author Ach Sofyan Daynur
 * @version 1.0
 */
public abstract class LibraryItem {

    /** Judul item perpustakaan. */
    private String title;

    /** Nama penulis item perpustakaan. */
    private String author;

    /**
     * Membuat item perpustakaan dengan judul dan penulis tertentu.
     *
     * @param title judul item perpustakaan
     * @param author nama penulis item perpustakaan
     */
    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     * Mengambil judul item perpustakaan.
     *
     * @return judul item
     */
    public String getTitle() {
        return title;
    }

    /**
     * Mengambil nama penulis item perpustakaan.
     *
     * @return nama penulis
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Menampilkan detail item perpustakaan.
     * Implementasinya ditentukan oleh kelas turunan.
     */
    public abstract void showDetails();
}
