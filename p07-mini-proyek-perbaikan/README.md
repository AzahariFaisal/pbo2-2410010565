# Katalog Koleksi Buku Perpustakaan (Mini Proyek P07)

Azahari Faisal / 2410010565 / Kelas 5B
Pemrograman Berbasis Objek 2 (TIF1508), Pertemuan 7: Tabel, Menu, dan Mini Proyek GUI.

Aplikasi Swing untuk mengelola koleksi buku perpustakaan: tambah, ubah, hapus, cari, dan urutkan lewat tabel.

## Cara menjalankan

Butuh JDK 21 dan Apache NetBeans.

1. Buka folder proyek ini di NetBeans, klik kanan proyek, pilih Build (FlatLaf diunduh di sini).
2. Klik kanan `FormKatalog.java`, pilih Run File.

## Fitur

| No | Fitur | Isi |
|----|-------|-----|
| 1 | Tabel buku | Kolom kode, judul, penulis, tahun terbit, status. Modelnya `KatalogTableModel` turunan `AbstractTableModel` |
| 2 | Data contoh | 6 buku sudah ada waktu aplikasi dibuka |
| 3 | Tambah dan ubah | Lewat `DialogBuku` (JDialog modal). Kode dan judul wajib diisi, tahun harus angka 1900 sampai tahun sekarang, kode ganda ditolak |
| 4 | Hapus | Pakai konfirmasi, nomor baris dikonversi dulu dengan `convertRowIndexToModel` di `barisTerpilih()` |
| 5 | Menu | Menu File, Buku, dan Bantuan dari GUI Builder, mnemonic Alt+F, Alt+B, Alt+T, accelerator Ctrl+N, Ctrl+E, Ctrl+D, Ctrl+Q |
| 6 | Pencarian | Menyaring kolom kode, judul, dan penulis. Huruf besar dan kecil dianggap sama |
| 7 | Status | Label di bawah tabel: berapa buku yang sedang tampil dari seluruh katalog, dan berapa yang masih tersedia |
| 8 | Tampilan | `FormKatalog.form` dan `DialogBuku.form`, FlatLaf, tombol dan item menu Ubah/Hapus baru aktif kalau ada baris dipilih |
| 9 | Dokumentasi | README ini berisi peta event dan screenshot aplikasi |

## Isi kelas

| Kelas | Jenis | Tugas |
|-------|-------|-------|
| `StatusBuku` | enum | Tersedia atau Dipinjam |
| `Buku` | record | Data satu buku: kode, judul, penulis, tahunTerbit, status |
| `KatalogTableModel` | `AbstractTableModel` | Menyimpan `List<Buku>`, memberi tahu tabel lewat `fireTable...`, punya `jumlahDenganStatus()` |
| `DialogBuku` | JDialog Form | Form tambah dan ubah beserta validasinya |
| `FormKatalog` | JFrame Form | Jendela utama: tabel, tombol, pencarian, menu, label status |

## Peta event

| Komponen | Event | Method |
|----------|-------|--------|
| `tombolTambah`, `itemTambah` | Action | `tombolTambahActionPerformed`, `itemTambahActionPerformed` -> `tambah()` |
| `tombolUbah`, `itemUbah` | Action | `tombolUbahActionPerformed`, `itemUbahActionPerformed` -> `ubah()` |
| `tombolHapus`, `itemHapus` | Action | `tombolHapusActionPerformed`, `itemHapusActionPerformed` -> `hapus()` |
| `itemKeluar` | Action | `itemKeluarActionPerformed`, isinya `dispose()` |
| `itemTentang` | Action | `itemTentangActionPerformed`, menampilkan `JOptionPane` |
| `isianCari` | Key: keyReleased | `isianCariKeyReleased` -> `saring()` |
| `tabelBuku` | Mouse: mouseClicked | `tabelBukuMouseClicked`, klik dua kali memanggil `ubah()` |
| `tabelBuku` | pemilihan baris | lambda di konstruktor (tidak ada di menu Events) -> `perbaruiTombol()` |
| `tombolBatal` (dialog) | Action | `tombolBatalActionPerformed`, isinya `dispose()` |
| `tombolSimpan` (dialog) | Action | `tombolSimpanActionPerformed` -> `simpan()` |

## Validasi di dialog

| Isian | Aturan | Pesan |
|-------|--------|-------|
| Kode | wajib | Kode wajib diisi |
| Kode | tidak boleh sama dengan buku lain | Kode (kode) sudah dipakai buku lain |
| Judul | wajib | Judul wajib diisi |
| Penulis | boleh kosong | - |
| Tahun Terbit | angka 1900 sampai tahun sekarang | Tahun terbit berupa angka 1900 sampai (tahun sekarang) |

Pesannya tampil di `labelPesan` dalam dialog, dan dialog tetap terbuka sampai isiannya benar atau
dibatalkan. Tombol Enter menyimpan, tombol Esc membatalkan.

## Screenshot

| Berkas | Isi |
|--------|-----|
| `screenshots/katalog-buku.png` | Jendela utama dengan 6 data contoh dan label status |
| `screenshots/tambah-buku.png` | Dialog Tambah Buku beserta isian dan tombolnya |

## Deklarasi penggunaan AI

Kode dan README ini diperbaiki dengan bantuan AI (Hermes Agent): merapikan struktur kelas model,
form, dan dialog mengikuti modul P07, menambah penolakan kode ganda, serta memeriksa kecocokan
`.form` dengan `.java` dan perilaku tombol, pencarian, serta validasi.
