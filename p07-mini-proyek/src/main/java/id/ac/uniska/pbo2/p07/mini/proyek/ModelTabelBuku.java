package id.ac.uniska.pbo2.p07.mini.proyek;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class ModelTabelBuku extends AbstractTableModel {

    private final String[] kolom = {
        "Kode", "Judul", "Penulis", "Tahun Terbit", "Status"
    };

    private final List<Buku> daftarBuku = new ArrayList<>();

    @Override
    public int getRowCount() {
        return daftarBuku.size();
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
    public Object getValueAt(int rowIndex, int columnIndex) {
        Buku buku = daftarBuku.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return buku.getKode();
            case 1:
                return buku.getJudul();
            case 2:
                return buku.getPenulis();
            case 3:
                return buku.getTahunTerbit();
            case 4:
                return buku.getStatus();
            default:
                return null;
        }
    }
    
    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
        fireTableRowsInserted(
            daftarBuku.size() - 1,
            daftarBuku.size() - 1
        );
    }

    public Buku getBukuAt(int row) {
        return daftarBuku.get(row);
    }

    public void ubahBuku(int row, Buku buku) {
        daftarBuku.set(row, buku);
        fireTableRowsUpdated(row, row);
    }

    public void hapusBuku(int row) {
        daftarBuku.remove(row);
        fireTableRowsDeleted(row, row);
    }

    public List<Buku> getDaftarBuku() {
        return daftarBuku;
    }  
}