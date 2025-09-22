package controller;

import model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    private ArrayList<SuratMasuk> daftarSuratMasuk = new ArrayList<>();
    private ArrayList<SuratKeluar> daftarSuratKeluar = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public void tambahSurat() {
        System.out.println("1. Surat Masuk");
        System.out.println("2. Surat Keluar");
        System.out.print("Pilih jenis surat:");
        int jenis = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan Judul Surat: ");
        String judulSurat = input.nextLine();
        if (judulSurat.isEmpty()){
            System.out.println("Input tidak boleh kosong! Silahkan coba lagi");
            return;
        }

        System.out.print("Masukkan Nomor Surat: ");
        String nomorSurat = input.nextLine();
        if (nomorSurat.isEmpty()){
            System.out.println("Input tidak boleh kosong! Silahkan coba lagi");
            return;
        }

        System.out.print("Masukkan Tanggal Surat (dd/mm/yyyy): ");
        String tanggalSurat = input.nextLine();
        if (tanggalSurat.isEmpty()){
            System.out.println("Input tidak boleh kosong! Silahkan coba lagi");
            return;
        }

        switch (jenis) {
            case 1:
                System.out.print("Masukkan Asal Surat: ");
                String asal = input.nextLine();
                daftarSuratMasuk.add(new SuratMasuk(judulSurat, nomorSurat, tanggalSurat, asal));
                break;
            case 2:
                System.out.print("Masukkan Tujuan Surat: ");
                String tujuan = input.nextLine();
                daftarSuratKeluar.add(new SuratKeluar(judulSurat, nomorSurat, tanggalSurat, tujuan));
                break;
            default:
                System.out.println("Jenis surat tidak valid!");
                return;
        }

        System.out.println("Surat berhasil ditambahkan!");
    }

    public void tampilkanSurat() {
        if (daftarSuratMasuk.isEmpty() && daftarSuratKeluar.isEmpty()) {
            System.out.println("Belum ada surat.");
        } else {
            for (SuratMasuk sm : daftarSuratMasuk) {
                System.out.println("-- Daftar Surat Masuk --");
                sm.tampilkanSuratMasuk();
                System.out.println("-------------------");
            }
            for (SuratKeluar sk : daftarSuratKeluar) {
                System.out.println("-- Daftar Surat Keluar --");
                sk.tampilkanSuratKeluar();
                System.out.println("-------------------");
            }
        }
    }

    public void updateSurat() {
        System.out.print("Masukkan Nomor Surat yang ingin diupdate: ");
        String nomor = input.nextLine();

        for (SuratMasuk sm : daftarSuratMasuk) {
            if (sm.getNomorSurat().equalsIgnoreCase(nomor)) {
                System.out.print("Masukkan Status Baru: ");
                String statusBaru = input.nextLine();
                if (statusBaru.isEmpty()){
                   System.out.println("Input tidak boleh kosong! Silahkan coba lagi");
                    return;
                }else{
                    sm.setStatusSurat(statusBaru);
                    System.out.println("Status surat masuk berhasil diupdate!");
                    return;
                }
            }
        }

        for (SuratKeluar sk : daftarSuratKeluar) {
            if (sk.getNomorSurat().equalsIgnoreCase(nomor)) {
                System.out.print("Masukkan Status Baru: ");
                String statusBaru = input.nextLine();
                if (statusBaru.isEmpty()){
                   System.out.println("Input tidak boleh kosong! Silahkan coba lagi");
                    return;
                }else{
                    sk.setStatusSurat(statusBaru);
                    System.out.println("Status surat keluar berhasil diupdate!");
                    return;
                }
            }
        }
        System.out.println("Surat tidak ditemukan.");
    }

    public void hapusSurat() {
        System.out.print("Masukkan Nomor Surat yang ingin dihapus: ");
        String nomor = input.nextLine();

        for (int i = 0; i < daftarSuratMasuk.size(); i++) {
            if (daftarSuratMasuk.get(i).getNomorSurat().equalsIgnoreCase(nomor)) {
                daftarSuratMasuk.remove(i);
                System.out.println("Surat masuk berhasil dihapus!");
                return;
            }
        }

        for (int i = 0; i < daftarSuratKeluar.size(); i++) {
            if (daftarSuratKeluar.get(i).getNomorSurat().equalsIgnoreCase(nomor)) {
                daftarSuratKeluar.remove(i);
                System.out.println("Surat keluar berhasil dihapus!");
                return;
            }
        }

        System.out.println("Surat tidak ditemukan.");
    }

    public void cariSurat() {
        System.out.print("Masukkan Nomor Surat yang dicari: ");
        String nomorCari = input.nextLine();

        for (SuratMasuk sm : daftarSuratMasuk) {
            if (sm.getNomorSurat().equalsIgnoreCase(nomorCari)) {
                sm.tampilkanSuratMasuk();
                return;
            }
        }

        for (SuratKeluar sk : daftarSuratKeluar) {
            if (sk.getNomorSurat().equalsIgnoreCase(nomorCari)) {
                sk.tampilkanSuratKeluar();
                return;
            }
        }

        System.out.println("Surat tidak ditemukan.");
    }
}
