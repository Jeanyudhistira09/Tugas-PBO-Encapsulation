package com.mycompany.grade;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("========================================");
        System.out.println("    SISTEM INPUT NILAI MAHASISWA OOP");
        System.out.println("  (Ketik 'selesai' pada Nama untuk keluar)");
        
        while (true) {
            System.out.print("Masukkan Nama Mahasiswa : ");
            String namaInput = input.nextLine();
            
            if (namaInput.equalsIgnoreCase("Selesai")) {
                System.out.println("\nProgram dihentikan. Terima kasih!");
                break;
            }
        
            System.out.print("Masukkan Nama NIM       : ");
            String nimInput = input.nextLine();
            
            Mahasiswa mhs = new Mahasiswa(namaInput, nimInput);
            
            System.out.print("Masukkan Mata Kuliah    : ");
            String matkulInput = input.nextLine();
            
            MataKuliah matkul = new MataKuliah(matkulInput, mhs);
            
            System.out.print("Masukkan Nilai Tugas    : ");
            double nilaiT = input.nextDouble();
            matkul.setNilaiTugas(nilaiT);
            
            System.out.print("Masukkan Nilai Ujian    : ");
            double nilaiU = input.nextDouble();
            matkul.setNilaiUjian(nilaiU); 
            
            input.nextLine();
            
            matkul.cetakTranskrip();
            System.out.println("\n--- Silahkan input data mahasiswa berikutnya ---");
            System.out.println("    (Ketik 'selesai' pada Nama untuk keluar)");
        }
        
        input.close();
    }
}
