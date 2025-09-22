package model;

public class Surat {
    private String judulSurat, nomorSurat, tanggalSurat, statusSurat;
    
    public Surat(String judulSurat, String nomorSurat, String tanggalSurat) {
        this.judulSurat = judulSurat;
        this.nomorSurat = nomorSurat;
        this.tanggalSurat = tanggalSurat;
        this.statusSurat = "Pending";
    }
    
    // Getter & Setter
    public String getJudulSurat() {
        return judulSurat;
    }

    public void setJudulSurat(String judulSurat) {
        this.judulSurat = judulSurat;
    }

    public String getNomorSurat() {
        return nomorSurat;
    }

    public void setNomorSurat(String nomorSurat) {
        this.nomorSurat = nomorSurat;
    }

    public String getTanggalSurat() {
        return tanggalSurat;
    }

    public void setTanggalSurat(String tanggalSurat) {
        this.tanggalSurat = tanggalSurat;
    }

    public String getStatusSurat() {
        return statusSurat;
    }

    public void setStatusSurat(String statusSurat) {
        this.statusSurat = statusSurat;
    }
    
    // Method untuk menampilkan info umum
    public void tampilkanDataUmum() {
        System.out.println("Judul   : " + judulSurat);
        System.out.println("Nomor   : " + nomorSurat);
        System.out.println("Tanggal : " + tanggalSurat);
        System.out.println("Status  : " + statusSurat);
    }
}
