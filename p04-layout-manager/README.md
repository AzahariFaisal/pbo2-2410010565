\# P04 — Layout Manager dan Desain Form

\- Nama: Azahari Faisal

\- NPM: 2410010565

\- Kelas: 5B Reguler Banjarmasin

\- Mata Kuliah: Pemrograman Berorientasi Objek 2

\- Proyek: `p04-layout-manager`



Daftar Form



Proyek ini memiliki tiga form:



1\. `GaleriLayout` — contoh penggunaan beberapa layout manager.

2\. `FormBiodata` — form biodata mahasiswa menggunakan komponen Swing.

3\. `FormAnggotaPerpustakaan` — form pendaftaran anggota perpustakaan.



Setiap form dibuat menggunakan JFrame Form agar memiliki berkas `.java` dan `.form`.



Sketsa dan Tabel Rancangan



Sketsa Form Anggota Perpustakaan



Gambarkan sketsa berdasarkan susunan form yang dibuat di NetBeans, kemudian simpan sebagai `sketsa-form.png`.



Sketsa menunjukkan tiga bagian utama: header, data anggota, dan kontak serta tombol.



Tabel Rancangan



| Bagian | Panel/Komponen | Layout |

|---|---|---|

| Jendela | JFrame | BorderLayout |

| Header | `headerPanel` | FlowLayout |

| Isi form | `dataAnggotaPanel` | GridBagLayout |

| Kontak dan tombol | `kontakPanel` | FlowLayout |



\*Catatan: Sesuaikan nama dan layout pada tabel dengan properti yang benar-benar digunakan di Navigator NetBeans.\*



Hasil Praktikum



GaleriLayout



Form `GaleriLayout` digunakan untuk mempraktikkan BorderLayout, FlowLayout, GridLayout, BoxLayout, dan gabungan layout.



FormBiodata



Form `FormBiodata` digunakan untuk mempraktikkan penyusunan label dan isian, termasuk Text Field, Combo Box, Spinner, dan Text Area.



FormAnggotaPerpustakaan



Form ini berisi:

\- Nama Anggota

\- NPM

\- Program Studi

\- Alamat

\- Email

\- Nomor HP

\- Jenis Anggota: Mahasiswa, Dosen, dan Umum

\- Persetujuan tata tertib perpustakaan

\- Tombol Batal dan Daftar



Screenshot



Simpan gambar yang benar-benar diambil dari hasil praktikum pada folder `screenshots`.



\- `screenshots/anggota-ukuran-awal.png` — form saat pertama dijalankan.

\- `screenshots/anggota-ukuran-diperlebar.png` — form setelah jendela dilebarkan.

\- `screenshots/anggota-design-navigator.png` — tab Design yang memperlihatkan susunan panel dan layout di Navigator.



Eksperimen Praktikum



Praktikum 2 — Galeri Layout Manager



Praktikum ini menunjukkan bahwa setiap layout manager memiliki cara berbeda dalam menyusun komponen.



\- BorderLayout membagi area menjadi beberapa arah.

\- FlowLayout menyusun komponen secara berurutan.

\- GridLayout menyusun komponen dalam baris dan kolom dengan ukuran sel seragam.

\- BoxLayout menyusun komponen secara horizontal atau vertikal.

\- Gabungan layout menggunakan lebih dari satu layout manager untuk menyusun bagian form.



Praktikum 4 — Form Biodata



Praktikum ini menggunakan beberapa panel untuk memisahkan header, isi form, dan tombol. GridBagLayout digunakan agar label dan isian dapat disusun dalam baris dan kolom.



Weight X dan Fill membantu isian melebar ketika jendela diperlebar, sedangkan label tetap berada pada posisi yang sesuai.



Eksperimen Perubahan Ukuran



Ketika ukuran jendela diubah, perhatikan apakah komponen tetap terlihat, isian melebar dengan baik, dan susunan form tetap mudah dibaca.



\*Isi hasil pengamatan berdasarkan pengujian yang benar-benar dilakukan.\*



Penilaian Teman — Tahap 4



| No. | Pemeriksaan | Hasil |

|---|---|---|

| 1 | Label singkat, jelas, dan sejajar | Isi setelah pemeriksaan |

| 2 | Isian dikelompokkan dengan judul bagian | Isi setelah pemeriksaan |

| 3 | Placeholder digunakan untuk isian yang memiliki format | Isi setelah pemeriksaan |

| 4 | Komponen sesuai jenis data | Isi setelah pemeriksaan |

| 5 | Tombol utama berada di kanan bawah | Isi setelah pemeriksaan |

| 6 | Jarak antar komponen konsisten | Isi setelah pemeriksaan |

| 7 | Form tetap rapi saat jendela diubah ukurannya | Isi setelah pemeriksaan |

| 8 | Form menggunakan JFrame Form dan layout manager | Isi setelah pemeriksaan |



\*\*Saran dari teman:\*\* \[Tuliskan minimal satu saran nyata dari teman yang memeriksa form.]



Pertanyaan Refleksi



1.Mengapa Null Layout dan Absolute Layout sebaiknya dihindari?



Null Layout dan Absolute Layout mengharuskan posisi serta ukuran komponen diatur secara manual. Akibatnya, komponen dapat bertumpuk atau terpotong ketika ukuran jendela atau tampilan berubah. Layout manager membantu mengatur komponen secara lebih fleksibel.



2.Jelaskan perbedaan perilaku FlowLayout dan GridLayout saat jendela dilebarkan.



FlowLayout menyusun komponen berurutan dan dapat memindahkan komponen ke baris berikutnya ketika ruang tidak mencukupi. GridLayout membagi ruang menjadi sel dengan ukuran seragam sehingga komponen ikut menyesuaikan ukuran sel.



3.Apa fungsi Weight X dan Fill pada constraint GridBagLayout?



Weight X menentukan pembagian ruang horizontal tambahan untuk komponen. Fill menentukan apakah komponen mengisi ruang yang tersedia di dalam sel. Pengaturan Weight X sebesar 1.0 dan Fill Horizontal pada kolom isian membantu kolom isian melebar ketika jendela diperlebar.



4.Mengapa formPanel dibungkus isiPanel dan diletakkan di North?



Menurut rancangan Praktikum 4, isiPanel menggunakan BorderLayout dan formPanel ditempatkan di North. Susunan ini membantu baris form tetap berada di bagian atas ketika jendela ditinggikan, sehingga ruang tambahan tidak membuat seluruh form tersebar ke bawah.



5.Sebutkan dua prinsip desain yang diterapkan pada Form Anggota Perpustakaan dan tunjukkan buktinya.



\- \*\*Keselarasan:\*\* label dan kolom isian disusun agar mudah dibaca.

\- \*\*Kedekatan:\*\* komponen data anggota dikelompokkan terpisah dari bagian kontak dan tombol.



\*Pastikan kedua prinsip tersebut benar-benar terlihat pada hasil form.\*



h.Deklarasi Penggunaan AI



Saya menggunakan ChatGPT sebagai alat bantu untuk memahami konsep layout manager, memperoleh panduan penggunaan NetBeans GUI Builder, serta membantu menyusun dokumentasi dan jawaban refleksi. Pembuatan dan pengaturan form dilakukan melalui NetBeans GUI Builder, kemudian hasilnya diperiksa kembali berdasarkan modul praktikum.



i.Kesimpulan



Praktikum P04 memberikan pemahaman mengenai penggunaan layout manager untuk menyusun antarmuka Java Swing. Pemisahan panel dan pemilihan layout yang tepat membantu form menjadi lebih terstruktur dan lebih mudah menyesuaikan diri terhadap perubahan ukuran jendela.



j.Referensi



1\. Modul Praktikum PBO 2 Pertemuan 4 — Layout Manager dan Desain Form.

2\. Oracle, Java Tutorials: https://docs.oracle.com/javase/tutorial/uiswing/layout/

3\. Oracle, How to Use GridBagLayout: https://docs.oracle.com/javase/tutorial/uiswing/layout/gridbag.html

4\. Apache NetBeans, Designing a Swing GUI in NetBeans IDE: https://netbeans.apache.org/





