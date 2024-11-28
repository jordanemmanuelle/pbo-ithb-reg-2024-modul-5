package View;

import Controller.Proses;
import Model.Class.Penduduk;
import Model.Enum.Agama;
import Model.Enum.StatusKawin;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormInput extends JFrame {
    private JTextField txtNik, txtNama, txtTempatLahir, txtAlamat, txtRtRw, txtKelDesa, txtKecamatan, txtBerlaku, txtKotaPembuatan;
    private JRadioButton rbPria, rbWanita;
    private JComboBox<Agama> cbAgama;
    private JComboBox<StatusKawin> cbStatus;
    private JButton btnSubmit;

    public FormInput() {
        setTitle("Form Input Data Penduduk");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2, 10, 10));

        JLabel lblNik = new JLabel("NIK:");
        txtNik = new JTextField();
        panel.add(lblNik);
        panel.add(txtNik);

        JLabel lblNama = new JLabel("Nama:");
        txtNama = new JTextField();
        panel.add(lblNama);
        panel.add(txtNama);

        JLabel lblTempatLahir = new JLabel("Tempat Lahir:");
        txtTempatLahir = new JTextField();
        panel.add(lblTempatLahir);
        panel.add(txtTempatLahir);

        JLabel lblJenisKelamin = new JLabel("Jenis Kelamin:");
        rbPria = new JRadioButton("Pria");
        rbWanita = new JRadioButton("Wanita");
        ButtonGroup groupJenisKelamin = new ButtonGroup();
        groupJenisKelamin.add(rbPria);
        groupJenisKelamin.add(rbWanita);
        JPanel panelJenisKelamin = new JPanel();
        panelJenisKelamin.add(rbPria);
        panelJenisKelamin.add(rbWanita);
        panel.add(lblJenisKelamin);
        panel.add(panelJenisKelamin);

        JLabel lblAgama = new JLabel("Agama:");
        cbAgama = new JComboBox<>(Agama.values());
        panel.add(lblAgama);
        panel.add(cbAgama);

        JLabel lblStatusKawin = new JLabel("Status Kawin:");
        cbStatus = new JComboBox<>(StatusKawin.values());
        panel.add(lblStatusKawin);
        panel.add(cbStatus);

        JLabel lblAlamat = new JLabel("Alamat:");
        txtAlamat = new JTextField();
        panel.add(lblAlamat);
        panel.add(txtAlamat);

        JLabel lblRtRw = new JLabel("RT/RW:");
        txtRtRw = new JTextField();
        panel.add(lblRtRw);
        panel.add(txtRtRw);

        JLabel lblKelDesa = new JLabel("Kel/Desa:");
        txtKelDesa = new JTextField();
        panel.add(lblKelDesa);
        panel.add(txtKelDesa);

        JLabel lblKecamatan = new JLabel("Kecamatan:");
        txtKecamatan = new JTextField();
        panel.add(lblKecamatan);
        panel.add(txtKecamatan);

        JLabel lblKotaPembuatan = new JLabel("Kota Pembuatan:");
        txtKotaPembuatan = new JTextField();
        panel.add(lblKotaPembuatan);
        panel.add(txtKotaPembuatan);

        JLabel lblBerlaku = new JLabel("Berlaku Hingga:");
        txtBerlaku = new JTextField();
        panel.add(lblBerlaku);
        panel.add(txtBerlaku);

        btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Penduduk model = new Penduduk();
                model.setNik(txtNik.getText());
                model.setNama(txtNama.getText());
                model.setTempatLahir(txtTempatLahir.getText());
                model.setAlamat(txtAlamat.getText());
                model.setRtrw(txtRtRw.getText());
                model.setKelDesa(txtKelDesa.getText());
                model.setKecamatan(txtKecamatan.getText());
                model.setKotaPembuatan(txtKotaPembuatan.getText());
                model.setAgama((Agama) cbAgama.getSelectedItem());
                model.setStatusKawin((StatusKawin) cbStatus.getSelectedItem());

                if (model.getNik().isEmpty() || model.getNama().isEmpty() || model.getAlamat().isEmpty()) {
                    JOptionPane.showMessageDialog(FormInput.this, "Data tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    new Proses().prosesData(model);
                    JOptionPane.showMessageDialog(FormInput.this, "Data berhasil disimpan.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                }
            }
        });
        
        panel.add(btnSubmit);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FormInput();
    }
}
