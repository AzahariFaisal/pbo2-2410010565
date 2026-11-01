# P07 — Mini Proyek Katalog Buku Perpustakaan

## Identitas Mahasiswa

| Keterangan | Detail |
|---|---|
| Nama | Azahari Faisal |
| NPM | 2410010565 |
| Kelas | 5B Reguler Banjarmasin |
| Mata Kuliah | Pemrograman Berorientasi Objek (PBO) |
| Project | P07 — Mini Proyek Katalog Buku Perpustakaan |

---

## 1. Deskripsi Proyek

Mini proyek ini merupakan aplikasi katalog buku perpustakaan berbasis desktop yang dibuat menggunakan Java Swing pada Apache NetBeans IDE.

Aplikasi digunakan untuk mengelola data buku perpustakaan, mulai dari menampilkan daftar buku, mencari buku, menambahkan buku baru, hingga mengubah data buku yang sudah tersimpan.

Data buku ditampilkan menggunakan `JTable` dengan model tabel yang dibuat menggunakan `AbstractTableModel`.

## 2. Teknologi yang Digunakan

- Java
- Java Swing
- Apache NetBeans IDE
- Maven
- `JTable`
- `AbstractTableModel`

## 3. Fitur Aplikasi

- Menampilkan daftar buku perpustakaan.
- Menyimpan data buku berupa kode, judul, penulis, tahun terbit, dan status.
- Menampilkan minimal 5 data buku awal.
- Menambahkan data buku melalui dialog.
- Mengubah data buku melalui dialog.
- Mencari buku berdasarkan kode, judul, atau penulis.
- Menampilkan jumlah seluruh buku.
- Menampilkan jumlah buku dengan status Tersedia.
- Memvalidasi data yang dimasukkan pengguna.

## 4. Struktur Project

```text
p07-mini-proyek/
├── src/
│   └── main/
│       └── java/
│           └── id/
│               └── ac/
│                   └── uniska/
│                       └── pbo2/
│                           └── p07/
│                               └── mini/
│                                   └── proyek/
│                                       ├── Buku.java
│                                       ├── DialogBuku.java
│                                       ├── FormKatalogBuku.java
│                                       ├── ModelTabelBuku.java
│                                       └── P07MiniProyek.java
├── pom.xml
└── README.md
```

## 5. Penjelasan Class

| Class | Keterangan |
|---|---|
| `Buku.java` | Menyimpan atribut dan data setiap buku. |
| `ModelTabelBuku.java` | Mengatur data tabel menggunakan `AbstractTableModel`. |
| `FormKatalogBuku.java` | Menampilkan halaman utama katalog buku. |
| `DialogBuku.java` | Form dialog untuk menambahkan dan mengubah data buku. |
| `P07MiniProyek.java` | Class utama untuk menjalankan aplikasi. |

## 6. Implementasi OOP

Konsep Pemrograman Berorientasi Objek yang diterapkan dalam proyek ini:

- **Class dan Object:** Digunakan untuk merepresentasikan buku dan komponen aplikasi.
- **Encapsulation:** Atribut pada class `Buku` dibuat private dan diakses melalui getter dan setter.
- **Inheritance:** `ModelTabelBuku` mewarisi `AbstractTableModel`, sedangkan form menggunakan `JFrame` dan `JDialog`.
- **Polymorphism:** Method pada `AbstractTableModel` diimplementasikan sesuai kebutuhan tabel katalog buku.

## 7. Validasi Data

Validasi yang diterapkan pada form buku:

- Kode buku wajib diisi.
- Judul buku wajib diisi.
- Tahun terbit harus berupa angka.
- Tahun terbit berada pada rentang 1900–2026.
- Status buku dipilih melalui pilihan Tersedia atau Dipinjam.

## 8. Cara Menjalankan Aplikasi

1. Buka Apache NetBeans IDE.
2. Pilih **File → Open Project**.
3. Pilih folder `p07-mini-proyek`.
4. Tunggu proses Maven selesai.
5. Klik kanan project dan pilih **Clean and Build**.
6. Jika proses berhasil, jalankan project menggunakan **Run Project**.

## 9. Dokumentasi Aplikasi

Tambahkan screenshot aplikasi pada bagian ini.

### Tampilan Katalog Buku

![Tampilan Katalog Buku](screenshots/katalog-buku.png)

### Form Tambah Buku

![Form Tambah Buku](screenshots/tambah-buku.png)

### Form Edit Buku

![Form Edit Buku](screenshots/edit-buku.png)

> Catatan: Simpan screenshot aplikasi ke folder `screenshots` di dalam project, lalu sesuaikan nama file gambar dengan dokumentasi yang tersedia.

## 10. Kesimpulan

Aplikasi Katalog Buku Perpustakaan merupakan implementasi mini proyek Pemrograman Berorientasi Objek menggunakan Java Swing. Aplikasi ini menerapkan konsep OOP serta pengelolaan data menggunakan `AbstractTableModel` untuk menampilkan dan mengelola data buku perpustakaan secara sederhana.