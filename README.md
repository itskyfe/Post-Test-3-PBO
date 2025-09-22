Muhammad Rizky Febrianto | 2409116045

# Program Manajemen Surat di Kelurahan

## Deskripsi Singkat

Program ini adalah aplikasi sederhana manajemen surat menggunakan bahasa pemrograman Java dengan konsep CRUD (Create, Read, Update, Delete).

* Encapsulation = atribut dibuat `private`, akses melalui getter dan setter.
* Inheritance = class `Surat` sebagai superclass, `SuratMasuk` dan `SuratKeluar` sebagai subclass.

Fitur utama:

* Menambah surat masuk & surat keluar.
* Menampilkan semua daftar surat.
* Mengupdate status surat.
* Menghapus surat.
* Mencari surat berdasarkan nomor.

## Struktur Project

Program ini dipisah ke dalam package sesuai konsep MVC (Model, View, Controller):

<img width="212" height="247" alt="image" src="https://github.com/user-attachments/assets/66db164c-8673-409c-8a3d-c1a265ab6ca5" />

## Alur Program

1. Menu Utama
   Program menampilkan pilihan:
   
    <img width="446" height="157" alt="image" src="https://github.com/user-attachments/assets/2f439771-4d26-4fdf-9aae-8d3f1efb3ff3" />

3. Tambah Surat

    <img width="446" height="574" alt="image" src="https://github.com/user-attachments/assets/643bcdf4-7aa6-4df7-af72-283c1383b0c2" />
 
   * User memilih jenis surat (Masuk / Keluar).
   * Memasukkan judul, nomor, tanggal, dan asal/tujuan.
   * Data disimpan ke dalam `ArrayList` sesuai jenisnya.

3. Tampilkan Surat

    <img width="441" height="387" alt="image" src="https://github.com/user-attachments/assets/41b093b8-5721-4714-b380-abcdc109b5a9" />

   * Jika ada surat masuk maka akan ditampilkan dengan method `tampilkanSuratMasuk()`.
   * Jika ada surat keluar maka akan ditampilkan dengan method `tampilkanSuratKeluar()`.

4. Update Surat

    <img width="446" height="581" alt="image" src="https://github.com/user-attachments/assets/41ce4cf2-847e-4972-8593-96afb839ad5c" />

   * User memasukkan nomor surat.
   * Jika ditemukan maka status surat diperbarui.
   * Jika tidak ada maka akan tampil pesan error.

5. Hapus Surat
   
     <img width="441" height="460" alt="image" src="https://github.com/user-attachments/assets/7b35cd2f-7e60-46f3-9e2f-5a1b182d8b87" />

   * User memasukkan nomor surat.
   * Jika ditemukan maka surat dihapus dari daftar.
   * Jika tidak ada maka akan tampil pesan error.

7. Cari Surat

    <img width="434" height="412" alt="image" src="https://github.com/user-attachments/assets/5f3adee7-ba6a-4a7c-afdf-74d90ea49025" />

   * User memasukkan nomor surat.
   * Jika ditemukan maka detail surat ditampilkan.
   * Jika tidak ada maka akan tampil pesan "Surat tidak ditemukan".

8. Keluar
   * Program berhenti jika user memilih menu `0`.
     
     <img width="446" height="204" alt="image" src="https://github.com/user-attachments/assets/679d62da-30ca-4f9c-833c-165e3c449dc2" />
