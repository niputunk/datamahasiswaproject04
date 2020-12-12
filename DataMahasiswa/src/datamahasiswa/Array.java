/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamahasiswa;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
/**
 *
 * @author niputunk
 */
public class Array {
    
    private final ArrayList<String> nim = new ArrayList();
    private final ArrayList<String> nama = new ArrayList();
    private final ArrayList<String> tglahir = new ArrayList();
    private final ArrayList<Integer> gender = new ArrayList();
    
    Scanner input = new Scanner(System.in);
    
    void menu(){
        while (true) {
            System.out.println("--------- MENU ----------");
            System.out.println(" 1. Tambah Data\n 2. Hapus Data\n 3. Cari Data\n 4. Tampil Data");
            System.out.print("Masukkan pilihan anda : ");
            String menu = input.next();
            switch (menu) {
                case "1": {
                    System.out.println("------TAMBAH DATA------");
                    System.out.println("Masukkan data yang akan ditambahkan");
                    System.out.print("Nama : ");
                    String name = input.next();
                    System.out.print("NIM  : ");
                    String number = input.next();
                    System.out.print("Masukkan tgl lahir (dd/mm/yyyy) : ");
                    String tgl = input.next();
                    System.out.print("Masukkan jenis kelamin (0 : Laki-laki / 1 : Perempuan) : ");
                    int jk = input.nextInt();
                    nama.add(name);
                    nim.add(number);
                    tglahir.add(tgl);
                    gender.add(jk);
                    System.out.println("------------------------");
                    System.out.println(" Data telah ditambahkan \n");
                    break;
                }
                case "2": {
                    System.out.println("---------HAPUS DATA---------");
                    System.out.println("Masukkan nim yang akan dihapus");
                    System.out.print("NIM : ");
                    String number = input.next();
                    int index = Collections.binarySearch(nim, number);
                    nama.remove(index);
                    nim.remove(index);
                    tglahir.remove(index);
                    gender.remove(index);
                    System.out.println("------------------------");
                    System.out.println("   Data telah dihapus   \n");
                    break;          
                }
                case "3":
                    System.out.println("-------CARI DATA-------");
                    System.out.println("1. Berdasarkan gender\n2. Berdasarkan NIM");
                    System.out.print("Masukkan pilihan anda : ")
                    int pilih = input.nextInt();
                    if (pilih == 1) {
                        System.out.println("--------------");
                        System.out.println("    Gender    ");
                        System.out.println("--------------");
                        System.out.print("Jenis Kelamin (0 / 1) : ");
                        int gen = input.nextInt();
                        for (int a = 0; a < nama.size(); a++) {
                            if (gender.get(a) == 0) {
                                System.out.print("Nama          : " + nama.get(a));
                                System.out.print("NIM           : " + nim.get(a));
                                System.out.print("Tgl Lahir     : " + tglahir.get(a));
                                System.out.print("Jenis Kelamin : " + gender.get(a));
                                System.out.print("-----------------------------");
                                System.out.print("  Data berhasil ditampilkan  \n");
                            } else if (gender.get(a) == 1) {
                                System.out.print("Nama          : " + nama.get(a));
                                System.out.print("NIM           : " + nim.get(a));
                                System.out.print("Tgl Lahir     : " + tglahir.get(a));
                                System.out.print("Jenis Kelamin : " + gender.get(a));
                                System.out.print("-----------------------------");
                                System.out.print("  Data berhasil ditampilkan  \n");
                            }
                        }
                    } else if (pilih == 2 ) {
                        System.out.print("-------------");
                        System.out.print("     NIM     ");
                        System.out.print("-------------\n");
                        System.out.print("Masukkan NIM : ");
                        String number = input.next();
                        int index = Collections.binarySearch(nim, number);
                        String findNama = nama.get(index);
                        String findNim  = nim.get(index);
                        String findTgl  = tglahir.get(index);
                        int findJK      = gender.get(index);
                        System.out.print("Nama          : " + findNama);
                        System.out.print("NIM           : " + findNim);
                        System.out.print("Tgl Lahir     : " + findTgl);
                        System.out.print("Jenis Kelamin : " + findJK);
                        System.out.print("-----------------------------");
                        System.out.print("  Data berhasil ditampilkan  ");
                    }
                    break;
                case "4":
                    System.out.println("----TAMPILKAN DATA----");
                    for (int a = 0; a < nama.size(); a++) {
                        System.out.print("Nama          : " + nama.get(a));
                        System.out.print("NIM           : " + nim.get(a));
                        System.out.print("Tgl Lahir     : " + tglahir.get(a));
                        System.out.print("Jenis Kelamin : " + gender.get(a));
                    }
                    System.out.print("Jumlah Mahasiswa : " + nama.size());
                    break;
            }
        }
    }
}