package id.ac.uniska.pbo2.p08.uts;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModelTabelNilai extends AbstractTableModel {

    private final String[] kolom = {
        "NPM", "Nama", "Tugas", "UTS",
        "UAS", "Nilai Akhir", "Huruf Mutu"
    };

    private final ArrayList<NilaiMahasiswa> data = new ArrayList<>();

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return kolom.length;
    }

    @Override
    public String getColumnName(int column) {
        return kolom[column];
    }

    @Override
    public Object getValueAt(int row, int column) {
        NilaiMahasiswa m = data.get(row);

        switch (column) {
            case 0: return m.getNpm();
            case 1: return m.getNama();
            case 2: return m.getTugas();
            case 3: return m.getUts();
            case 4: return m.getUas();
            case 5: return String.format("%.2f", m.hitungNilaiAkhir());
            case 6: return m.hitungHurufMutu();
            default: return null;
        }
    }

    public void tambahData(NilaiMahasiswa mahasiswa) {
        data.add(mahasiswa);
        fireTableRowsInserted(data.size() - 1, data.size() - 1);
    }

    public void ubahData(int baris, NilaiMahasiswa mahasiswa) {
        data.set(baris, mahasiswa);
        fireTableRowsUpdated(baris, baris);
    }

    public void hapusData(int baris) {
        data.remove(baris);
        fireTableRowsDeleted(baris, baris);
    }

    public NilaiMahasiswa getData(int baris) {
        return data.get(baris);
    }
}


/*Azahari Faisal
2410010565*/
