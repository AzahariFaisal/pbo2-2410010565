\# P06 — Validasi Input



\## Identitas Mahasiswa



| Keterangan | Data |

|---|---|

| Nama | Azahari Faisal |

| NPM | 2410010565 |

| Kelas | 5B Reguler Banjarmasin |

| Program Studi | Teknik Informatika |

| Universitas | Universitas Islam Kalimantan Muhammad Arsyad Al Banjari |

| Mata Kuliah | Pemrograman Berbasis Objek 2 |



\## 1. Deskripsi Project



P06 — Validasi Input merupakan project praktikum Pemrograman Berbasis Objek 2 yang menerapkan validasi data pada aplikasi pendaftaran anggota perpustakaan menggunakan Java Swing.



Aplikasi menyediakan form untuk memasukkan nama, NPM, email, dan nomor telepon. Setiap input diperiksa agar sesuai dengan aturan yang telah ditentukan. Apabila data tidak sesuai, aplikasi menampilkan pesan kesalahan melalui komponen JLabel.



Project ini juga menerapkan event handling pada komponen form, seperti `KeyTyped`, `FocusLost`, dan `ActionPerformed`.



\## 2. Tujuan Praktikum



Tujuan dari praktikum ini adalah:



1\. Memahami konsep validasi input pada aplikasi Java.

2\. Menerapkan validasi pada komponen JTextField.

3\. Memahami penggunaan event handling dalam proses validasi.

4\. Membatasi input pengguna berdasarkan tipe dan panjang data.

5\. Menggunakan ekspresi reguler atau regular expression untuk memeriksa format data.

6\. Menampilkan pesan kesalahan dan keberhasilan kepada pengguna.

7\. Meningkatkan kualitas data yang dimasukkan ke dalam aplikasi.



\## 3. Struktur Project



Struktur project P06 adalah sebagai berikut:



```text

p06-validasi-input/

├── dokumentasi/

│   ├── validasi-email.png

│   └── navigator-komponen.png

├── src/

│   └── main/

│       └── java/

│           └── id/

│               └── ac/

│                   └── uniska/

│                       └── pbo2/

│                           └── p06/

│                               ├── FormAnggotaPerpustakaan.java

│                               └── P06ValidasiInput.java

├── pom.xml

└── README.md

```



Struktur package dan nama file mengikuti project yang dibuat menggunakan NetBeans.



\## 4. Komponen Form



Form pendaftaran anggota perpustakaan menggunakan komponen berikut:



| Komponen | Nama Variabel | Fungsi |

|---|---|---|

| JLabel | `lblJudul` | Menampilkan judul form |

| JTextField | `txtNama` | Memasukkan nama anggota |

| JTextField | `txtNpm` | Memasukkan NPM anggota |

| JTextField | `txtEmail` | Memasukkan email anggota |

| JTextField | `txtTelepon` | Memasukkan nomor telepon |

| JButton | `btnDaftar` | Memproses pendaftaran |

| JButton | `btnBatal` | Mengosongkan seluruh input |

| JLabel | `lblPesan` | Menampilkan pesan validasi |



Komponen tersebut digunakan untuk membangun antarmuka pendaftaran anggota perpustakaan yang sederhana dan mudah digunakan.



\## 5. Implementasi Validasi Input



\### 5.1 Validasi Nama



Nama anggota wajib diisi sebelum proses pendaftaran dilakukan.



Aplikasi memeriksa apakah input nama kosong setelah dilakukan proses `trim()`. Penggunaan `trim()` bertujuan menghilangkan spasi di awal dan akhir teks sehingga input yang hanya berisi spasi tidak dianggap sebagai nama yang valid.



Apabila nama belum diisi, aplikasi menampilkan pesan:



`Nama harus diisi!`



\### 5.2 Validasi NPM



NPM digunakan sebagai identitas mahasiswa dan harus memenuhi ketentuan berikut:



\- NPM wajib diisi.

\- NPM hanya boleh berisi angka.

\- NPM harus memiliki panjang tepat 10 digit.

\- Input NPM dibatasi maksimal 10 karakter.



Validasi karakter dilakukan menggunakan event `KeyTyped`. Karakter yang bukan angka akan ditolak menggunakan `evt.consume()`.



Contoh kode validasi karakter NPM:



```java

char karakter = evt.getKeyChar();



if (!Character.isDigit(karakter)

&#x20;       || txtNpm.getText().length() >= 10) {

&#x20;   evt.consume();

}

```



Validasi panjang NPM juga dilakukan saat tombol Daftar ditekan agar data tetap diperiksa sebelum diproses.



\### 5.3 Validasi Email



Email wajib diisi dan harus memiliki format yang sesuai.



Validasi email dilakukan menggunakan event `FocusLost`, yaitu ketika pengguna berpindah dari komponen email ke komponen lain.



Pemeriksaan format menggunakan regular expression:



```java

^\[A-Za-z0-9+\_.-]+@\[A-Za-z0-9.-]+$

```



Apabila email kosong, aplikasi menampilkan:



`Email harus diisi!`



Apabila format email tidak sesuai, aplikasi menampilkan:



`Format email tidak valid!`



Validasi ini membantu mendeteksi kesalahan format email sebelum proses pendaftaran dilakukan.



\### 5.4 Validasi Nomor Telepon



Nomor telepon wajib diisi dengan ketentuan:



\- Hanya berisi angka.

\- Minimal 10 digit.

\- Maksimal 13 digit.



Pemeriksaan dilakukan menggunakan regular expression:



```java

\\\\d{10,13}

```



Apabila nomor telepon tidak memenuhi ketentuan, aplikasi menampilkan pesan:



`Nomor telepon harus 10-13 digit angka!`



\### 5.5 Validasi Form Pendaftaran



Validasi keseluruhan form dilakukan ketika tombol Daftar ditekan.



Urutan pemeriksaan meliputi:



1\. Memeriksa nama.

2\. Memeriksa NPM.

3\. Memeriksa email.

4\. Memeriksa nomor telepon.

5\. Menampilkan pesan keberhasilan apabila seluruh input valid.



Jika salah satu input tidak sesuai, proses pendaftaran dihentikan dan pesan kesalahan ditampilkan melalui `lblPesan`.



\### 5.6 Fungsi Tombol Batal



Tombol Batal digunakan untuk menghapus seluruh input pada form.



Ketika tombol Batal ditekan, aplikasi:



1\. Mengosongkan nama.

2\. Mengosongkan NPM.

3\. Mengosongkan email.

4\. Mengosongkan nomor telepon.

5\. Menghapus pesan validasi.

6\. Mengembalikan fokus ke input nama.



Dengan demikian, pengguna dapat mengisi ulang form tanpa harus menghapus data secara manual.



\## 6. Hasil Pengujian



Pengujian dilakukan dengan memasukkan data yang sesuai dan tidak sesuai dengan aturan validasi.



| No. | Skenario Pengujian | Hasil yang Diharapkan | Hasil Pengujian |

|---|---|---|---|

| 1 | Nama dikosongkan | Aplikasi menampilkan pesan nama harus diisi | Berhasil |

| 2 | NPM kurang dari 10 digit | Aplikasi menolak pendaftaran | Berhasil |

| 3 | NPM berisi huruf | Karakter huruf tidak diterima | Berhasil |

| 4 | NPM lebih dari 10 digit | Input dibatasi maksimal 10 karakter | Berhasil |

| 5 | Email dikosongkan | Aplikasi menampilkan pesan email harus diisi | Berhasil |

| 6 | Email dengan format tidak valid | Aplikasi menampilkan pesan format email tidak valid | Berhasil |

| 7 | Nomor telepon kurang dari 10 digit | Aplikasi menampilkan pesan kesalahan | Berhasil |

| 8 | Nomor telepon lebih dari 13 digit | Aplikasi menampilkan pesan kesalahan | Berhasil |

| 9 | Seluruh input sesuai ketentuan | Aplikasi menampilkan pesan keberhasilan | Berhasil |

| 10 | Tombol Batal ditekan | Seluruh input dan pesan validasi dikosongkan | Berhasil |



Berdasarkan pengujian yang dilakukan, validasi input pada form berjalan sesuai dengan aturan yang diterapkan.



\## 7. Evaluasi dan Peer Review



Evaluasi dilakukan dengan memeriksa fungsi setiap komponen dan memastikan bahwa data yang tidak sesuai tidak dapat diproses.



| No. | Aspek yang Dievaluasi | Temuan | Perbaikan atau Tindakan |

|---|---|---|---|

| 1 | Validasi nama | Nama harus diperiksa agar tidak kosong | Menggunakan pemeriksaan `trim()` |

| 2 | Validasi NPM | NPM harus tepat 10 digit angka | Menggunakan `Character.isDigit()` dan pemeriksaan panjang |

| 3 | Validasi email | Email perlu diperiksa formatnya | Menggunakan regular expression |

| 4 | Validasi telepon | Nomor telepon harus terdiri dari 10–13 digit | Menggunakan regular expression `\\\\d{10,13}` |

| 5 | Pesan kesalahan | Pengguna perlu mengetahui kesalahan input | Menggunakan JLabel `lblPesan` |

| 6 | Tombol Batal | Pengguna perlu dapat mengulang pengisian | Mengosongkan seluruh input dan mengembalikan fokus |



Evaluasi ini digunakan sebagai pemeriksaan terhadap fungsi aplikasi dan konsistensi validasi input.



\## 8. Eksperimen Praktikum



\### Eksperimen 1 — Validasi Input Kosong



Eksperimen ini bertujuan mengetahui bagaimana aplikasi menangani input yang tidak diisi.



Ketika pengguna menekan tombol Daftar tanpa mengisi seluruh data, aplikasi memeriksa setiap input. Jika terdapat input kosong, proses pendaftaran dihentikan dan pesan kesalahan ditampilkan.



\*\*Kesimpulan:\*\* Validasi input kosong membantu mencegah data yang tidak lengkap diproses oleh aplikasi.



\### Eksperimen 2 — Validasi Menggunakan Regular Expression



Eksperimen ini bertujuan memahami penggunaan regular expression dalam memeriksa format data.



Regular expression digunakan untuk memeriksa format email dan panjang nomor telepon. Pola `\\\\d{10,13}` digunakan untuk memastikan nomor telepon hanya terdiri dari angka dengan panjang 10 sampai 13 digit.



\*\*Kesimpulan:\*\* Regular expression mempermudah pemeriksaan pola data tanpa harus memeriksa setiap karakter secara manual.



\### Eksperimen 3 — Event Handling pada Validasi Input



Eksperimen ini bertujuan memahami penerapan event handling pada komponen form.



Event `KeyTyped` digunakan untuk membatasi karakter yang dimasukkan ke dalam NPM. Event `FocusLost` digunakan untuk memeriksa format email ketika pengguna berpindah dari komponen email. Event `ActionPerformed` digunakan untuk menjalankan validasi keseluruhan form ketika tombol Daftar ditekan.



\*\*Kesimpulan:\*\* Event handling memungkinkan validasi dilakukan pada waktu yang sesuai dengan interaksi pengguna.



\## 9. Dokumentasi Screenshot



Dokumentasi project disimpan di dalam folder `dokumentasi`.



\### 9.1 Validasi Email



!\[Dokumentasi validasi email](dokumentasi/validasi-email.png)



Gambar menunjukkan tampilan form ketika pengguna memasukkan email dengan format yang tidak sesuai. Aplikasi menampilkan pesan kesalahan melalui komponen `lblPesan`.



\### 9.2 Navigator Komponen



!\[Dokumentasi Navigator komponen](dokumentasi/navigator-komponen.png)



Gambar menunjukkan struktur komponen form pada Navigator NetBeans, termasuk komponen input, tombol, dan label pesan validasi.



\## 10. Deklarasi Penggunaan AI



Dalam pengerjaan project P06 — Validasi Input, AI digunakan sebagai alat bantu pembelajaran untuk:



1. Membantu menyusun dokumentasi project dalam README.

2. Memberikan penjelasan terhadap kesalahan dan perbaikan kode.



Penggunaan AI dilakukan sebagai pendukung proses pembelajaran. Mahasiswa tetap bertanggung jawab terhadap implementasi, pengujian, pemahaman kode, dan hasil akhir project.



\## 11. Kesimpulan



Project P06 — Validasi Input berhasil menerapkan validasi data pada form pendaftaran anggota perpustakaan menggunakan Java Swing.



Validasi diterapkan pada nama, NPM, email, dan nomor telepon. Event handling digunakan untuk membatasi input NPM, memeriksa format email, dan memproses pendaftaran.



Penggunaan validasi input membantu memastikan bahwa data yang dimasukkan pengguna sesuai dengan ketentuan. Selain itu, pesan validasi melalui JLabel memberikan informasi kepada pengguna ketika terjadi kesalahan.



Project ini memberikan pemahaman mengenai pentingnya validasi input, regular expression, dan event handling dalam pengembangan aplikasi berbasis Java Swing.



