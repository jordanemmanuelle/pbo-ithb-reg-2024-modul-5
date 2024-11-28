package View;

import Controller.Proses;
import Model.Class.Penduduk;
import Model.Enum.Agama;
import Model.Enum.StatusKawin;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import javax.swing.ImageIcon;

public class FormInput extends JFrame {
    private JTextField txtNik, txtNama, txtTempatLahir, txtTanggalLahir, txtAlamat, txtRtRw, txtKelDesa, txtKecamatan, txtBerlaku, txtKotaPembuatan;
    private JRadioButton rbPria, rbWanita;
    private JComboBox<Agama> cbAgama;
    private JComboBox<StatusKawin> cbStatus;
    private JButton btnSubmit, btnFoto, btnTandaTangan;
    private JLabel lblFoto, lblTandaTangan;
    private String fotoPath = "", tandaTanganPath = "";

    public FormInput() {
        setTitle("Form Input Data Penduduk");
        setSize(600, 700);
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

        JLabel lblTanggalLahir = new JLabel("Tanggal Lahir: ");
        txtTanggalLahir = new JTextField();
        panel.add(lblTanggalLahir);
        panel.add(txtTanggalLahir);

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

        JLabel lblFotoLabel = new JLabel("Foto:");
        panel.add(lblFotoLabel);
        btnFoto = new JButton("Pilih Foto");
        panel.add(btnFoto);
        lblFoto = new JLabel();
        panel.add(lblFoto); // tempat menampilkan foto

        JLabel lblTandaTanganLabel = new JLabel("Tanda Tangan:");
        panel.add(lblTandaTanganLabel);
        btnTandaTangan = new JButton("Pilih Tanda Tangan");
        panel.add(btnTandaTangan);
        lblTandaTangan = new JLabel();
        panel.add(lblTandaTangan); // tempat menampilkan tanda tangan

        btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Penduduk model = new Penduduk();
                model.setNik(txtNik.getText());
                model.setNama(txtNama.getText());
                model.setTempatLahir(txtTempatLahir.getText());
                model.setTanggalLahir(txtTanggalLahir.getText());
                model.setAlamat(txtAlamat.getText());
                model.setRtrw(txtRtRw.getText());
                model.setKelDesa(txtKelDesa.getText());
                model.setKecamatan(txtKecamatan.getText());
                model.setKotaPembuatan(txtKotaPembuatan.getText());
                model.setAgama((Agama) cbAgama.getSelectedItem());
                model.setStatusKawin((StatusKawin) cbStatus.getSelectedItem());

                // nyimpen foto dan ttd
                model.setFotoPath(fotoPath);
                model.setTandaTanganPath(tandaTanganPath);

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

        btnFoto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileFilter(new FileNameExtensionFilter("Foto KTP", "jpg", "png", "jpeg"));
                int result = fileChooser.showOpenDialog(FormInput.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    fotoPath = selectedFile.getAbsolutePath();
                    ImageIcon imageIcon = new ImageIcon(fotoPath);
                    lblFoto.setIcon(imageIcon);
                }
            }
        });

        btnTandaTangan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileFilter(new FileNameExtensionFilter("Foto TTD", "jpg", "png", "jpeg"));
                int result = fileChooser.showOpenDialog(FormInput.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    tandaTanganPath = selectedFile.getAbsolutePath();
                    ImageIcon imageIcon = new ImageIcon(tandaTanganPath);
                    lblTandaTangan.setIcon(imageIcon);
                }
            }
        });

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FormInput();
    }
}
