package Model.Class;
import java.sql.Date;

import Model.Enum.Agama;
import Model.Enum.StatusKawin;
import Model.Enum.GolonganDarah;
import Model.Enum.JenisKelamin;

public class Penduduk {
    private String nik;
    private String nama;
    private String tempatLahir;
    private JenisKelamin jenisKelamin; // enum
    private GolonganDarah golDarah; // enum
    private String alamat;
    private String rtrw;
    private String kelDesa;
    private String kecamatan;
    private Agama agama; // enum
    private StatusKawin statusKawin; // enum
    private String pekerjaan;
    private String kewarganegaraan;
    private Date berlakuHingga;
    private String kotaPembuatan;
    private String tanggalPembuatan;
    private Date TanggalLahir;
    
    public String getNik() {
        return nik;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getTempatLahir() {
        return tempatLahir;
    }
    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }
    public JenisKelamin getJenisKelamin() {
        return jenisKelamin;
    }
    public void setJenisKelamin(JenisKelamin jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public GolonganDarah getGolDarah() {
        return golDarah;
    }
    public void setGolDarah(GolonganDarah golDarah) {
        this.golDarah = golDarah;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getRtrw() {
        return rtrw;
    }
    public void setRtrw(String rtrw) {
        this.rtrw = rtrw;
    }
    public String getKelDesa() {
        return kelDesa;
    }
    public void setKelDesa(String kelDesa) {
        this.kelDesa = kelDesa;
    }
    public String getKecamatan() {
        return kecamatan;
    }
    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }
    public Agama getAgama() {
        return agama;
    }
    public void setAgama(Agama agama) {
        this.agama = agama;
    }
    public StatusKawin getStatusKawin() {
        return statusKawin;
    }
    public void setStatusKawin(StatusKawin statusKawin) {
        this.statusKawin = statusKawin;
    }
    public String getPekerjaan() {
        return pekerjaan;
    }
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
    public String getKewarganegaraan() {
        return kewarganegaraan;
    }
    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }
    public Date getBerlakuHingga() {
        return berlakuHingga;
    }
    public void setBerlakuHingga(Date berlakuHingga) {
        this.berlakuHingga = berlakuHingga;
    }
    public String getKotaPembuatan() {
        return kotaPembuatan;
    }
    public void setKotaPembuatan(String kotaPembuatan) {
        this.kotaPembuatan = kotaPembuatan;
    }
    public String getTanggalPembuatan() {
        return tanggalPembuatan;
    }
    public void setTanggalPembuatan(String tanggalPembuatan) {
        this.tanggalPembuatan = tanggalPembuatan;
    }
    public Date getTanggalLahir() {
        return TanggalLahir;
    }
    public void setTanggalLahir(Date tanggalLahir) {
        TanggalLahir = tanggalLahir;
    }

    
}
