package id.ac.uniska.pbo2.p02;

import java.util.List;

public class AplikasiPerpustakaan {

    public static void main(String[] args) {

        // Membuat objek perpustakaan
        Perpustakaan perpus = new Perpustakaan();

        // Menambahkan koleksi buku
        perpus.tambah(new Buku(
                "B001",
                "Laskar Pelangi",
                2005,
                "Andrea Hirata"
        ));

        perpus.tambah(new Buku(
                "B002",
                "Clean Code",
                2008,
                "Robert C. Martin"
        ));

        // Menambahkan majalah
        perpus.tambah(new Majalah(
                "M001",
                "Majalah Teknologi Kita",
                2026,
                "Agustus"
        ));

        // Menambahkan skripsi
        perpus.tambah(new Skripsi(
                "S001",
                "Implementasi Clean Code pada Aplikasi Perpustakaan",
                2026,
                "Azahari Faisal",
                "Teknik Informatika"
        ));

        // Membuat anggota
        Anggota siti = new Anggota(
                "2410010123",
                "Siti Rahmah"
        );

        Anggota budi = new Anggota(
                "2410010456",
                "Budi Santoso"
        );

        // Menampilkan semua koleksi
        tampilkanDaftar(perpus);

        System.out.println();

        // Percobaan peminjaman
        cetakPinjam(perpus, "B002", siti);
        cetakPinjam(perpus, "B002", budi);
        cetakPinjam(perpus, "M001", budi);

        System.out.println();

        // Menampilkan hasil pencarian judul
        System.out.println("=== Hasil Pencarian ===");

        List<Koleksi> hasil = perpus.cariJudul("code");

        System.out.println(
                "Hasil pencarian \"code\": "
                + hasil.size()
                + " koleksi"
        );

        for (Koleksi k : hasil) {
            System.out.println(k);
        }

        System.out.println();

        // Percobaan meminjam Skripsi
        cetakPinjam(perpus, "S001", siti);
    }

    private static void tampilkanDaftar(Perpustakaan perpus) {

        System.out.println("=== Daftar Koleksi ===");

        for (Koleksi k : perpus.getDaftarKoleksi()) {
            System.out.println(k);
        }
    }

    private static void cetakPinjam(
            Perpustakaan perpus,
            String kode,
            Anggota anggota) {

        boolean berhasil = perpus.pinjam(kode, anggota);

        System.out.println(
                anggota.nama()
                + " meminjam "
                + kode
                + ": "
                + (berhasil ? "berhasil" : "gagal")
        );
    }
}