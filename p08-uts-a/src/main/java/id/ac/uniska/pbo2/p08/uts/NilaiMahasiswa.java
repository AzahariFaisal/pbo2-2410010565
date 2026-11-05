
package id.ac.uniska.pbo2.p08.uts;

public class NilaiMahasiswa {

    private String npm;
    private String nama;
    private double tugas;
    private double uts;
    private double uas;

    public NilaiMahasiswa(String npm, String nama,
            double tugas, double uts, double uas) {
        this.npm = npm;
        this.nama = nama;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    public double hitungNilaiAkhir() {
        return (tugas * 0.30) + (uts * 0.30) + (uas * 0.40);
    }

    public String hitungHurufMutu() {
        double nilai = hitungNilaiAkhir();

        if (nilai >= 80) return "A";
        if (nilai >= 75) return "B+";
        if (nilai >= 70) return "B";
        if (nilai >= 65) return "C+";
        if (nilai >= 60) return "C";
        if (nilai >= 40) return "D";
        return "E";
    }

    public String getNpm() { return npm; }
    public String getNama() { return nama; }
    public double getTugas() { return tugas; }
    public double getUts() { return uts; }
    public double getUas() { return uas; }
}

/*Azahari Faisal
2410010565
*/
