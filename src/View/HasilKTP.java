package View;

import Model.Class.Penduduk;
import javax.swing.*;

public class HasilKTP extends JFrame {
    public HasilKTP(Penduduk model) {
        setTitle("Hasil KTP");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel lblNik = new JLabel("NIK: " + model.getNik());
        lblNik.setBounds(20, 60, 300, 20);
        panel.add(lblNik);

        JLabel lblNama = new JLabel("Nama: " + model.getNama());
        lblNama.setBounds(20, 80, 300, 20);
        panel.add(lblNama);

        setVisible(true);
    }
}
