# Sistem Perpustakaan Sederhana

## Deskripsi Proyek
Sistem Perpustakaan Sederhana merupakan aplikasi Java berbasis konsol untuk mensimulasikan pengelolaan peminjaman dan pengembalian buku. Program menampilkan informasi buku, nama penulis, anggota peminjam, status buku, serta perhitungan denda keterlambatan.

## Tujuan
- Menerapkan konsep pemrograman berorientasi objek (OOP) dalam Java.
- Memahami penggunaan abstract class dan interface.
- Memisahkan tanggung jawab program ke dalam beberapa class.
- Menambahkan dokumentasi kode menggunakan JavaDoc.

## Fitur
- Menampilkan detail buku dan status peminjaman.
- Memproses peminjaman buku.
- Memproses pengembalian buku.
- Menghitung denda keterlambatan sebesar Rp2.000 per hari.

## Teknologi
- Bahasa pemrograman: Java
- JDK: Java Development Kit
- IDE: IntelliJ IDEA
- Dokumentasi: JavaDoc dan Markdown

## Struktur Proyek
| File | Keterangan |
|---|---|
| `LibraryBefore.java` | Implementasi awal sebelum refactoring. |
| `LibraryAfter.java` | Kelas utama untuk menjalankan versi setelah refactoring. |
| `LibraryItem.java` | Abstract class yang menyimpan judul dan penulis. |
| `Borrowable.java` | Interface yang mendefinisikan operasi peminjaman dan pengembalian. |
| `LibraryBook.java` | Implementasi buku, status peminjaman, dan perhitungan denda. |
| `Main.java` | Contoh program bawaan IntelliJ, bukan titik masuk aplikasi perpustakaan. |

## Cara Menjalankan Program
1. Buka folder proyek melalui IntelliJ IDEA.
2. Pastikan JDK sudah dikonfigurasi pada Project SDK.
3. Buka file `LibraryAfter.java`.
4. Klik kanan pada method `main()` atau nama file, lalu pilih **Run 'LibraryAfter.main()'**.
5. Hasil program akan tampil pada jendela Run.

## Contoh Data dan Perhitungan
Program menggunakan contoh data berikut:
- Judul buku: Pemrograman Java
- Penulis: Budi Santoso
- Anggota: Andi
- Keterlambatan: 3 hari
- Tarif denda: Rp2.000 per hari

Perhitungan denda: 3 × Rp2.000 = **Rp6.000**.

## Dokumentasi JavaDoc
Class, constructor, dan method pada file Java dilengkapi komentar JavaDoc. Dokumentasi HTML dapat dibuat melalui fitur **Tools → Generate JavaDoc** di IntelliJ IDEA atau menggunakan tool JavaDoc dari JDK.

## Hasil Generate JavaDoc

Dokumentasi JavaDoc berhasil dibuat dalam format HTML
dan disimpan pada folder `javadoc`.

Untuk melihat dokumentasi:
1. Buka folder `javadoc`.
2. Buka file `index.html` menggunakan browser.
3. Pilih class atau interface yang ingin dilihat dokumentasinya.

## Penulis
Ach Sofyan Daynur
