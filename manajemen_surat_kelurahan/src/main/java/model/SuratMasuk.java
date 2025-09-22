package model;

public class SuratMasuk extends Surat {
    private String asalSurat;

    public SuratMasuk(String judulSurat, String nomorSurat, String tanggalSurat, String asalSurat) {
        super(judulSurat, nomorSurat, tanggalSurat);
        this.asalSurat = asalSurat;
    }

    public String getAsalSurat() {
        return asalSurat;
    }

    public void setAsalSurat(String asalSurat) {
        this.asalSurat = asalSurat;
    }

    // Method khusus untuk menampilkan data surat masuk
    public void tampilkanSuratMasuk() {
        super.tampilkanDataUmum();
        System.out.println("Asal    : " + asalSurat);
    }
}
