# P07 — Tabel, Menu, dan Praktikum 5

## Identitas Mahasiswa

- **Nama:** Azahari Faisal
- **NPM:** 2410010565
- **Kelas:** 5B Reguler Banjarmasin
- **Program Studi:** Teknik Informatika
- **Mata Kuliah:** Pemrograman Berorientasi Objek 2 (PBO 2)
- **Universitas:** Universitas Islam Kalimantan Muhammad Arsyad Al Banjari

## Informasi Proyek

- **Nama Proyek:** `p07-tabel-dan-menu`
- **Nama Aplikasi:** Daftar Kontak
- **Bahasa Pemrograman:** Java
- **IDE:** Apache NetBeans IDE 31
- **GUI:** Java Swing
- **Build Tool:** Maven

## Deskripsi

Aplikasi Daftar Kontak merupakan aplikasi desktop berbasis Java Swing untuk menampilkan dan mengelola data kontak.

Aplikasi menggunakan komponen `JTable` untuk menampilkan data, model tabel untuk mengelola data, serta `JMenuBar` untuk menyediakan menu aplikasi.

Fitur yang dipelajari meliputi pengelolaan data kontak, pencarian, penggunaan menu, event handling, dan pengaturan tampilan GUI melalui NetBeans GUI Builder.

## Fitur Aplikasi

- Menampilkan data kontak dalam tabel.
- Menambahkan kontak.
- Mengubah kontak yang dipilih.
- Menghapus kontak.
- Melakukan pencarian kontak.
- Menggunakan menu File, Kontak, dan Bantuan.
- Menggunakan accelerator atau pintasan keyboard.
- Menampilkan informasi aplikasi melalui menu Tentang.
- Menutup aplikasi melalui menu Keluar.

## Struktur Proyek

```text
p07-tabel-dan-menu/
├── pom.xml
├── README.md
└── src/
    └── main/
        ├── java/
        │   └── id/ac/uniska/pbo2/p07/tabel/dan/menu/
        │       ├── FormDaftarKontak.java
        │       ├── FormDaftarKontak.form
        │       ├── Kontak.java
        │       └── P07TabelDanMenu.java
        └── resources/
```

> Catatan: Sesuaikan daftar file di atas dengan struktur proyek yang benar-benar ada di NetBeans. Jangan mencantumkan file yang tidak ada.

## Peta Menu

| Menu | Item | Fungsi |
|---|---|---|
| File | Keluar | Menutup aplikasi |
| Kontak | Tambah | Menambahkan kontak |
| Kontak | Ubah | Mengubah kontak yang dipilih |
| Kontak | Hapus | Menghapus kontak yang dipilih |
| Bantuan | Tentang | Menampilkan informasi aplikasi |

## Peta Event

| Komponen | Event | Fungsi |
|---|---|---|
| Tombol Tambah | `actionPerformed` | Menjalankan proses tambah kontak |
| Tombol Ubah | `actionPerformed` | Menjalankan proses ubah kontak |
| Tombol Hapus | `actionPerformed` | Menjalankan proses hapus kontak |
| Menu Tambah | `actionPerformed` | Menjalankan proses tambah kontak |
| Menu Ubah | `actionPerformed` | Menjalankan proses ubah kontak |
| Menu Hapus | `actionPerformed` | Menjalankan proses hapus kontak |
| Field pencarian | `keyReleased` | Memperbarui hasil pencarian |
| Tabel kontak | `mouseClicked` | Memilih kontak; klik dua kali dapat menjalankan proses ubah |
| Menu Keluar | `actionPerformed` | Menutup aplikasi |
| Menu Tentang | `actionPerformed` | Menampilkan informasi aplikasi |

## Accelerator Keyboard

| Menu Item | Pintasan |
|---|---|
| Tambah | Ctrl + N |
| Ubah | Ctrl + E |
| Hapus | Ctrl + D |

## Jawaban Eksperimen Praktikum 5

### Eksperimen 1 — Menghilangkan `fireTableRowsInserted`

**Pertanyaan:** Jika baris `fireTableRowsInserted(baris, baris);` dijadikan komentar, lalu ditambahkan kontak baru, apakah tabel langsung berubah?

**Jawaban:**

`fireTableRowsInserted()` digunakan untuk memberi tahu `JTable` bahwa terdapat baris baru pada model tabel.

Jika pemanggilan method tersebut dihilangkan, data dapat saja sudah masuk ke model, tetapi tabel tidak menerima pemberitahuan bahwa data berubah. Akibatnya, tampilan tabel tidak langsung diperbarui sesuai perubahan model.

### Eksperimen 2 — Mengubah `barisTerpilih()`

**Pertanyaan:** Jika method `barisTerpilih()` diubah menjadi `return kontakTable.getSelectedRow();`, kemudian mencari kata "ah", memilih Ahmad Fauzi, dan menekan Hapus lalu No, nama siapa yang muncul pada dialog konfirmasi?

**Jawaban:**

Ketika tabel menggunakan penyaringan atau pengurutan, indeks baris pada tampilan dapat berbeda dari indeks baris pada model.

Jika indeks tampilan langsung digunakan sebagai indeks model, kontak yang diproses dapat berbeda dari kontak yang dipilih. Karena itu, method `convertRowIndexToModel()` diperlukan untuk mengubah indeks tampilan menjadi indeks model.

**Hasil pengamatan:** Isi sesuai hasil pengujian yang dilakukan.

### Eksperimen 3 — Mengubah Dialog Modal Menjadi Nonmodal

**Pertanyaan:** Jika konstruktor `DialogKontak` diubah dari `super(pemilik, judul, true)` menjadi `super(pemilik, judul, false)`, apa yang terjadi ketika dialog dibuka dan jendela utama diklik?

**Jawaban:**

Dialog modal mengunci interaksi dengan jendela pemiliknya sampai dialog ditutup. Dialog nonmodal tidak mengunci jendela utama.

Jika dialog diubah menjadi nonmodal, pengguna dapat kembali berinteraksi dengan jendela utama saat dialog masih terbuka. Hal ini dapat memengaruhi alur pengambilan hasil isian dialog.

**Hasil pengamatan:** Isi sesuai hasil pengujian yang dilakukan.

### Eksperimen 4 — Menguji Accelerator Keyboard

**Pertanyaan:** Tekan Ctrl+N, Ctrl+E, dan Ctrl+D. Mengapa Ctrl+E dan Ctrl+D tidak bekerja saat tidak ada baris yang dipilih?

**Jawaban:**

Ctrl+N digunakan untuk menjalankan proses tambah kontak.

Ctrl+E dan Ctrl+D berkaitan dengan proses ubah dan hapus. Jika tidak ada baris yang dipilih, tidak terdapat kontak yang dapat diubah atau dihapus. Karena itu, aksi tersebut tidak dapat dijalankan.

### Eksperimen 5 — Mengubah Accelerator Hapus

**Pertanyaan:** Jika accelerator `hapusItem` diubah menjadi tombol Delete tanpa Ctrl, baris apa yang berubah di `initComponents()`?

**Jawaban:**

Pengaturan accelerator pada komponen menu disimpan oleh NetBeans di dalam kode `initComponents()`.

Ketika accelerator diubah melalui tab Design, kode yang mengatur properti accelerator pada `hapusItem` akan menyesuaikan pintasan baru. Perubahan dilakukan melalui GUI Builder agar kode yang dihasilkan tetap konsisten.

**Hasil pengamatan:** Catat baris kode yang berubah setelah pengaturan accelerator diubah.

### Eksperimen 6 — Menginisialisasi Model Setelah `initComponents()`

**Pertanyaan:** Jika atribut diubah menjadi `private KontakTableModel model;`, kemudian `model = new KontakTableModel();` diletakkan setelah `initComponents()`, pesan error apa yang muncul dan mengapa?

**Jawaban:**

Model tabel harus sudah tersedia ketika properti model pada komponen tabel diatur.

Jika model baru dibuat setelah `initComponents()`, komponen tabel dapat mencoba menggunakan model yang belum diinisialisasi. Hal ini dapat menyebabkan `NullPointerException` ketika kode GUI mencoba mengakses model.

Karena itu, model perlu diinisialisasi sebelum komponen tabel menggunakan model tersebut.

**Hasil pengamatan:** Catat pesan error yang muncul pada NetBeans jika eksperimen dijalankan.


## Kesimpulan

Praktikum ini memberikan pemahaman mengenai penggunaan `JTable`, model tabel, menu pada Java Swing, accelerator keyboard, event handling, pencarian data, serta hubungan antara model dan tampilan.

Penggunaan model tabel dan pemberitahuan perubahan data diperlukan agar tampilan tabel tetap konsisten dengan data yang dikelola oleh aplikasi.
