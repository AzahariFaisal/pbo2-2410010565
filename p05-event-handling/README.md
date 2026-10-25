# P05 — Event Handling


- **Nama:** Azahari Faisal
- **NPM:** 2410010565
- **Kelas:** 5B Reguler Banjarmasin
- **Mata Kuliah:** Pemrograman Berorientasi Objek 2
- **Proyek:** `p05-event-handling`

1. Deskripsi Proyek

Proyek ini merupakan praktikum Event Handling pada Java Swing menggunakan NetBeans GUI Builder. Aplikasi Form Anggota Perpustakaan digunakan untuk mempelajari cara merespons tindakan pengguna melalui event, seperti klik tombol, perubahan pilihan checkbox, pengetikan pada text field, dan penutupan jendela.

Aplikasi menyediakan fitur pengisian data anggota, validasi NPM, pengosongan kolom, penampilan ringkasan data, serta konfirmasi sebelum form ditutup.

2 Struktur Proyek

```text
p05-event-handling/
├── src/
│   └── main/
│       └── java/
│           └── id/ac/uniska/pbo2/p05/
│               ├── FormAnggotaPerpustakaan.java
│               ├── FormAnggotaPerpustakaan.form
│               └── P05EventHandling.java
├── screenshots/
│   ├── form-anggota.png
│   ├── events-tombol-daftar.png
│   ├── dialog-ringkasan.png
│   └── dialog-konfirmasi-keluar.png
├── pom.xml
└── README.md
```

Keterangan:

- `FormAnggotaPerpustakaan.java`: kode program form dan event handler.
- `FormAnggotaPerpustakaan.form`: desain antarmuka yang dibuat menggunakan NetBeans GUI Builder.
- `P05EventHandling.java`: kelas utama proyek.
- `pom.xml`: konfigurasi proyek Maven dan dependency.
- `screenshots/`: folder dokumentasi visual hasil pengujian.

3. Komponen Form

| Komponen | Nama Variabel | Fungsi |
|---|---|---|
| JTextField | `txtNama` | Memasukkan nama lengkap |
| JTextField | `txtNpm` | Memasukkan NPM |
| JTextField | `txtEmail` | Memasukkan email |
| JTextField | `txtTelepon` | Memasukkan nomor telepon |
| JButton | `btnDaftar` | Memvalidasi dan memproses pendaftaran |
| JButton | `btnReset` | Tombol yang ditampilkan sebagai Batal |
| JButton | `btnRingkasan` | Menampilkan ringkasan data anggota |
| JButton | `btnKeluar` | Meminta konfirmasi keluar |
| JCheckBox | `chkSetuju` | Menyatakan persetujuan pendaftaran |

4. Peta Event

| Komponen | Event | Fungsi |
|---|---|---|
| `chkSetuju` | `itemStateChanged` | Mengaktifkan tombol Daftar ketika checkbox dicentang dan menonaktifkannya ketika dilepas |
| `btnDaftar` | `actionPerformed` | Memeriksa isian, memvalidasi NPM, dan menampilkan hasil pendaftaran |
| `btnReset` | `actionPerformed` | Mengosongkan kolom dan mengembalikan fokus ke kolom NPM |
| `btnRingkasan` | `actionPerformed` | Menampilkan ringkasan data anggota |
| `btnKeluar` | `actionPerformed` | Meminta konfirmasi sebelum form ditutup |
| JFrame | `windowClosing` | Meminta konfirmasi ketika pengguna menekan tombol X |

Penghitung digit NPM menggunakan event `keyReleased` apabila handler tersebut telah ditambahkan pada `txtNpm`.

5. Alur Program

```text
Pengguna membuka form
        |
        v
Mengisi data anggota
        |
        v
Menyetujui persyaratan
        |
        v
Tombol Daftar aktif
        |
        v
Klik Daftar
        |
        v
Pemeriksaan data dan NPM
        |
        v
Menampilkan hasil pendaftaran

Batal      -> Mengosongkan kolom
Ringkasan  -> Menampilkan data anggota
Keluar     -> Menampilkan konfirmasi
Tombol X   -> Menampilkan konfirmasi penutupan
```

6. Hasil Pengujian

| Fitur | Hasil yang diharapkan |
|---|---|
| Daftar dengan data kosong | Menampilkan pesan peringatan |
| Validasi NPM | Menolak NPM yang tidak sesuai format |
| Daftar dengan data valid | Memproses pendaftaran dan menampilkan hasil |
| Checkbox persetujuan | Mengatur status aktif tombol Daftar |
| Batal | Mengosongkan seluruh kolom dan memfokuskan NPM |
| Ringkasan | Menampilkan data anggota |
| Tombol Keluar | Menampilkan dialog konfirmasi |
| Tombol X | Meminta konfirmasi sebelum menutup form |

Hasil akhir setiap pengujian perlu sesuai dengan perilaku program ketika dijalankan.

7. Tabel Pengamatan Praktikum 2

Praktikum 2 membahas pengamatan berbagai event pada aplikasi PengamatEvent, seperti `windowOpened`, `actionPerformed`, `mouseEntered`, `mouseExited`, `itemStateChanged`, `keyTyped`, `focusGained`, dan `focusLost`.

Tabel pengamatan harus dilengkapi berdasarkan tindakan pengguna dan log event yang benar-benar muncul ketika aplikasi dijalankan.

| Tindakan | Event yang diamati | Hasil pengamatan |
|---|---|---|
| Jendela dibuka | `windowOpened` | Diisi berdasarkan log aktual |
| Kursor masuk ke tombol | `mouseEntered` | Diisi berdasarkan log aktual |
| Kursor keluar dari tombol | `mouseExited` | Diisi berdasarkan log aktual |
| Tombol diklik | `actionPerformed` | Diisi berdasarkan log aktual |
| Checkbox diubah | `itemStateChanged` | Diisi berdasarkan log aktual |
| Combo box diubah | `itemStateChanged` | Diisi berdasarkan log aktual |
| Kolom mendapat fokus | `focusGained` | Diisi berdasarkan log aktual |
| Kolom kehilangan fokus | `focusLost` | Diisi berdasarkan log aktual |
| Pengguna mengetik karakter | `keyTyped` | Diisi berdasarkan log aktual |

8. Jawaban Eksperimen Praktikum 3

### Eksperimen 1 — Menghapus pemeriksaan SELECTED

Ketika pemeriksaan `evt.getStateChange() == ItemEvent.SELECTED` dihapus, perubahan pilihan combo box dapat memicu event untuk pilihan lama yang dilepas dan pilihan baru yang dipilih. Akibatnya, pesan `item berubah` umumnya tercetak dua kali untuk satu perubahan pilihan.

### Eksperimen 2 — Mengganti keyReleased menjadi keyPressed

Event `keyPressed` terjadi ketika tombol keyboard ditekan, sebelum perubahan teks selesai diterapkan. Karena itu, pembacaan isi text field dapat tertinggal satu karakter. Event `keyReleased` lebih sesuai untuk membaca isi setelah tombol dilepas.

### Eksperimen 3 — Menghapus try-catch

Jika blok `try-catch` dihapus dan huruf dimasukkan ke kolom yang diproses sebagai angka, parsing dapat menghasilkan `NumberFormatException`. Pengecualian tersebut akan terlihat di Output dan proses konversi tidak dapat dilanjutkan secara normal.

9. Jawaban Eksperimen Praktikum 4

### Eksperimen 1 — Event ganda pada tombol kali

Jika event tombol kali dibuat melalui GUI Builder tanpa menghapus lambda yang sudah terdaftar, satu klik dapat menjalankan dua listener. Jika keduanya mencetak `kali`, pesan tersebut akan muncul dua kali. Satu tombol sebaiknya menggunakan satu mekanisme event agar aksi tidak berulang secara tidak sengaja.

### Eksperimen 2 — Menambahkan tombol modulus

Pada tab Design, tambahkan tombol `%` dan atur teks serta nama variabelnya. Pada tab Source, tambahkan logika perhitungan sisa bagi menggunakan operator `%` dan hubungkan tombol melalui satu event handler.

### Eksperimen 3 — Fokus setelah tombol Hapus

Kursor kembali ke kolom pertama karena program memanggil `requestFocusInWindow()` setelah kolom dikosongkan. Dengan demikian, pengguna dapat langsung mulai memasukkan data dari kolom pertama.

10. Deklarasi Penggunaan AI

AI digunakan sebagai alat bantu untuk memahami konsep Event Handling Java Swing, memeriksa kode, menjelaskan penggunaan event listener, dan membantu penyusunan dokumentasi.

Implementasi, pengujian, pemeriksaan hasil, serta pemahaman terhadap kode tetap menjadi tanggung jawab mahasiswa.

11. Kesimpulan

Praktikum P05 membantu memahami penerapan event handling pada aplikasi Java Swing. Melalui Form Anggota Perpustakaan, mahasiswa mempelajari validasi input, penggunaan checkbox, penanganan tombol, penampilan ringkasan data, dan konfirmasi penutupan jendela.

README ini mendokumentasikan struktur proyek, komponen form, peta event, screenshot, dan penjelasan eksperimen. Tabel pengamatan serta hasil percobaan perlu disesuaikan dengan hasil aktual sebelum proyek dikumpulkan.
