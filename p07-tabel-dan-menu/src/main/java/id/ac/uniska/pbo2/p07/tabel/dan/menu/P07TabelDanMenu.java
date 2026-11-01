package id.ac.uniska.pbo2.p07.tabel.dan.menu;

import javax.swing.SwingUtilities;
import com.formdev.flatlaf.FlatLightLaf;

public class P07TabelDanMenu {

    public static void main(String[] args) {

        FlatLightLaf.setup();

        SwingUtilities.invokeLater(() -> {
            FormDaftarKontak form = new FormDaftarKontak();
            form.setLocationRelativeTo(null);
            form.setVisible(true);
        });

    }
}