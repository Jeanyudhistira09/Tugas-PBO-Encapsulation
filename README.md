\# Student Grade System (OOP Encapsulation)



Mini sistem berbasis Java untuk mengelola data dan nilai mahasiswa, dibuat untuk memenuhi tugas pemahaman konsep Encapsulation.



\## Desain Class

Sistem ini terdiri dari 3 class utama:

1\. \*\*Mahasiswa\*\*: Menyimpan atribut `private` (nama, nim). Menerapkan validasi di setter agar identitas tidak boleh kosong/null.

2\. \*\*MataKuliah\*\*: Menyimpan atribut `private` (namaMatkul, nilaiTugas, nilaiUjian) dan memiliki relasi dengan class Mahasiswa. Menerapkan validasi ketat di setter nilai agar input mutlak berada di range 0 - 100.

3\. \*\*Grade (Main)\*\*: Class \*runner\* interaktif menggunakan `Scanner` untuk membuktikan bahwa validasi \*Encapsulation\* berjalan sempurna saat menerima input dari user.



