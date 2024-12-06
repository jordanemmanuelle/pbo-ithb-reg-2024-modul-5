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

        // Tambahkan setiap label untuk atribut Penduduk
        JLabel lblNik = new JLabel("NIK: " + model.getNik());
        lblNik.setBounds(20, 20, 300, 20);
        panel.add(lblNik);

        JLabel lblNama = new JLabel("Nama: " + model.getNama());
        lblNama.setBounds(20, 50, 300, 20);
        panel.add(lblNama);

        JLabel lblTempatLahir = new JLabel("Tempat Lahir: " + model.getTempatLahir());
        lblTempatLahir.setBounds(20, 80, 300, 20);
        panel.add(lblTempatLahir);

        JLabel lblTanggalLahir = new JLabel("Tanggal Lahir: " + model.getTanggalLahir());
        lblTanggalLahir.setBounds(20, 110, 300, 20);
        panel.add(lblTanggalLahir);

        JLabel lblJenisKelamin = new JLabel("Jenis Kelamin: " + (model.getJenisKelamin() != null ? model.getJenisKelamin() : "-"));
        lblJenisKelamin.setBounds(20, 140, 300, 20);
        panel.add(lblJenisKelamin);

        JLabel lblAlamat = new JLabel("Alamat: " + model.getAlamat());
        lblAlamat.setBounds(20, 170, 300, 20);
        panel.add(lblAlamat);

        JLabel lblRtRw = new JLabel("RT/RW: " + model.getRtrw());
        lblRtRw.setBounds(20, 200, 300, 20);
        panel.add(lblRtRw);

        JLabel lblKelDesa = new JLabel("Kel/Desa: " + model.getKelDesa());
        lblKelDesa.setBounds(20, 230, 300, 20);
        panel.add(lblKelDesa);

        JLabel lblKecamatan = new JLabel("Kecamatan: " + model.getKecamatan());
        lblKecamatan.setBounds(20, 260, 300, 20);
        panel.add(lblKecamatan);

        JLabel lblAgama = new JLabel("Agama: " + (model.getAgama() != null ? model.getAgama() : "-"));
        lblAgama.setBounds(20, 290, 300, 20);
        panel.add(lblAgama);

        JLabel lblStatusKawin = new JLabel("Status Kawin: " + (model.getStatusKawin() != null ? model.getStatusKawin() : "-"));
        lblStatusKawin.setBounds(20, 320, 300, 20);
        panel.add(lblStatusKawin);

        JLabel lblKotaPembuatan = new JLabel("Kota Pembuatan: " + model.getKotaPembuatan());
        lblKotaPembuatan.setBounds(20, 350, 300, 20);
        panel.add(lblKotaPembuatan);

        JLabel lblFoto = new JLabel("Foto Path: " + model.getFotoPath());
        lblFoto.setBounds(20, 380, 300, 20);
        panel.add(lblFoto);

        JLabel lblTandaTangan = new JLabel("Tanda Tangan Path: " + model.getTandaTanganPath());
        lblTandaTangan.setBounds(20, 410, 300, 20);
        panel.add(lblTandaTangan);

        add(panel);
        setVisible(true); 
    }
}
