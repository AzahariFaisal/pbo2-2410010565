# P02 Perpustakaan Mini

## Praktikum PBO 2 - Pertemuan 2

Repository ini berisi project Perpustakaan Mini untuk latihan
Pemrograman Berbasis Objek 2.

## Fitur

### 1. Skripsi

Class `Skripsi` merupakan turunan dari class `Koleksi`.

Skripsi memiliki atribut:
- penulis
- programStudi

Skripsi hanya dapat dibaca di tempat sehingga tidak dapat dipinjam.
Batas peminjaman adalah 0 dan denda keterlambatan adalah 0.

### 2. Pencarian Judul

Method `cariJudul(String kataKunci)` digunakan untuk mencari koleksi
berdasarkan judul.

Pencarian tidak membedakan huruf besar dan huruf kecil.

## Jawaban Eksperimen Praktikum 6

### Eksperimen 1

Apa yang terjadi ketika membuat object langsung dari class `Koleksi`?
  
Terjadi error pada saat kompilasi karena `Koleksi` merupakan abstract
class sehingga tidak dapat dibuat object secara langsung menggunakan `new`.

### Eksperimen 2

Apa yang terjadi ketika nama method `hitungDenda` diubah menjadi
`hitungdenda`?
 
Jika anotasi `@Override` masih digunakan, terjadi error karena nama method
berbeda dengan method pada parent/interface. Java membedakan huruf besar
dan huruf kecil.

Jika `@Override` dihapus, method tersebut dianggap sebagai method baru
sehingga tidak melakukan overriding terhadap method induknya.


Apa yang terjadi ketika membuat Buku dengan judul kosong?
 
Saat program dijalankan terjadi `IllegalArgumentException` dengan pesan
"Judul tidak boleh kosong". Hal tersebut terjadi karena constructor
`Koleksi` memberikan aturan bahwa judul tidak boleh kosong.

### Eksperimen 4

Apa aturan yang dilanggar ketika status koleksi diubah langsung dari
method `main`?

Aturan yang dilanggar adalah enkapsulasi dan aturan perubahan status
koleksi. Status seharusnya tidak diubah secara langsung dari luar class,
tetapi melalui method `pinjam()` dan `kembalikan()`.


Program telah diuji dengan:
- Pencarian judul menggunakan kata kunci `code`
- Percobaan meminjam Skripsi
- Skripsi tidak dapat dipinjam

Hasil percobaan peminjaman Skripsi:

```text
Siti Rahmah meminjam S001: gagal
