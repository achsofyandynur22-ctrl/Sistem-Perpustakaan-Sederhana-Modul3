/**
 * Kelas contoh bawaan IntelliJ IDEA.
 * Program utama Sistem Perpustakaan Sederhana dijalankan dari {@link LibraryAfter}.
 *
 * @author Ach Sofyan Daynur
 * @version 1.0
 */
public class Main {

    /**
     * Menampilkan pesan contoh dan angka dari satu sampai lima.
     * Kelas ini tidak digunakan sebagai titik masuk program perpustakaan.
     *
     * @param args argumen command-line (tidak digunakan)
     */
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
