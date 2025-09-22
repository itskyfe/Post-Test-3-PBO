package model;

public class SuratKeluar extends Surat {
    private String tujuanSurat;

    public SuratKeluar(String judulSurat, String nomorSurat, String tanggalSurat, String tujuanSurat) {
        super(judulSurat, nomorSurat, tanggalSurat);
        this.tujuanSurat = tujuanSurat;
    }

    public String getTujuanSurat() {
        return tujuanSurat;
    }

    public void setTujuanSurat(String tujuanSurat) {
        this.tujuanSurat = tujuanSurat;
    }

    // Method khusus untuk menampilkan data surat keluar
    public void tampilkanSuratKeluar() {
        super.tampilkanDataUmum();
        System.out.println("Tujuan  : " + tujuanSurat);
    }
}
