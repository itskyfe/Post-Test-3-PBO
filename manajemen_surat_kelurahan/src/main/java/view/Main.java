package view;

import controller.Service;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        Scanner input = new Scanner(System.in);

        int pilihan;
        do {
            System.out.println("======= Menu Utama =======");
            System.out.println("1. Membuat Surat");
            System.out.println("2. Tampilkan Daftar Surat");
            System.out.println("3. Update Status Surat");
            System.out.println("4. Menghapus Surat");
            System.out.println("5. Cari Surat");
            System.out.println("0. Keluar");
            System.out.println("==========================");
            System.out.print("Masukkan Pilihan Anda: ");

            while (!input.hasNextInt()) {
                System.out.println("Input harus berupa angka!");
                input.next();
                System.out.print("Masukkan Pilihan Anda: ");
            }

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    service.tambahSurat();
                    break;
                case 2:
                    service.tampilkanSurat();
                    break;
                case 3:
                    service.updateSurat();
                    break;
                case 4:
                    service.hapusSurat();
                    break;
                case 5:
                    service.cariSurat();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan program kami!");
                    break;
                default:
                    System.out.println("Pilihan tidak ada.");
                    break;
            }
        } while (pilihan != 0);

        input.close();
    }
}
