package com.mycompany.grade;

public class MataKuliah {
    private String namaMatkul;
    private double nilaiTugas;
    private double nilaiUjian;
    
    private Mahasiswa mahasiswa;
    
    public MataKuliah (String namaMatkulAwal, Mahasiswa mahasiswa) {
        this.namaMatkul = namaMatkulAwal;
        this.mahasiswa = mahasiswa;
        this.nilaiTugas = 0;
        this.nilaiUjian = 0;
    }
    
    public void setNilaiTugas (double nilai) {
        if (nilai >= 0 && nilai <= 100) {
            this.nilaiTugas = nilai;
        } else {
            System.out.println("ERROR: Nilai Tugas (" + nilai + ") tidak masuk akal! Diset ke 0.");
            this.nilaiTugas = 0;
        }
    }
    
    public void setNilaiUjian (double nilai) {
        if (nilai >= 0 && nilai <= 100) {
            this.nilaiUjian = nilai;
        } else {
            System.out.println("ERROR: Nilai Ujian (" + nilai + ") tidak masuk akal! Diset ke 0.");
            this.nilaiUjian = 0;
        }
    }
    
    public double hitungRataRata () {
        double rataRata = (this.nilaiTugas + this.nilaiUjian) / 2;
        return rataRata;
    }
    
    public String getGradeHuruf () {
        double rata = hitungRataRata();
        if (rata > 85) {
            return "A";
        } else if (rata > 75 && rata <= 85) {
            return "AB";
        } else if (rata > 65 && rata <= 75) {
            return "B";
        } else if (rata > 60 && rata <= 65) {
            return "BC";
        } else if (rata > 50 && rata <= 60) {
            return "C"; 
        } else if (rata > 40 && rata <= 50) {
            return "D";
        } else {
            return "E";
        }
    }
    
    public void cetakTranskrip () {
        System.out.println("\n=================================");
        System.out.println("    TRANSKRIP NILAI MAHASISWA    ");
        System.out.println("=================================");
        System.out.println("Nama Mahasiswa  : " + mahasiswa.getNama());
        System.out.println("NIM             : " + mahasiswa.getNim());
        System.out.println("Mata Kuliah     : " + this.namaMatkul);
        System.out.println("---------------------------------");
        System.out.println("Nilai Tugas     : " + this.nilaiTugas);
        System.out.println("Nilai Ujian     : " + this.nilaiUjian);
        System.out.println("Rata-rata       : " + hitungRataRata());
        System.out.println("Grade Akhir     : " + getGradeHuruf());
        System.out.println("=================================");
        
    }
}
