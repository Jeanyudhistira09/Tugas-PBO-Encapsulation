package com.mycompany.grade;

public class Mahasiswa {
    private String nama;
    private String nim;
    
    public Mahasiswa (String nama, String nim) {
        setNama(nama);
        setNim(nim);
    }
    
    public void setNama (String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("WARNING: Nama tidak boleh kosong! Sistem mengeset ke 'Tanpa Nama'.");
            this.nama = "Tanpa Nama";
        } else {
            this.nama = nama;
        }
    }

    public void setNim (String nim) {
        if (nim == null || nim.trim().isEmpty()) {
            System.out.println("WARNING: NIM tidak boleh kosong! Sistem mengeset ke '00000000'.");
            this.nim= "00000000";
        } else {
            this.nim= nim;
        }
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public String getNim() {
        return this.nim;
    }
}
