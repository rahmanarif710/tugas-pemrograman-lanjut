/*
Nama    : Arif Rahman
NIM     : 155150200111101
Kelas   : INFORMATIKA - H
TUGAS   : Tugas Pengantar Praktikum
*/

import java.util.Scanner;

public class mahasiswaMain {

    public static void main(String[] args) {
        String nama,nim;
        int kata;
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan Mahasiswa yang ikut nulis = ");
        int n = in.nextInt();
        Mahasiswa [] Tugas = new Mahasiswa [n] ;
        for (int i = 0; i < Tugas.length; i++) {
            Tugas [i] = new Mahasiswa ();
            System.out.print("Masukkan Nama = ");
            nama = in.next();
            System.out.print("Masukkan NIM  = ");
            nim = in.next();
            System.out.print("Masukkan Jumlah Kata = ");
            kata = in.nextInt();
            Tugas[i].isiData(nama, nim, kata);
            System.out.println();
            Tugas[i].tampilan();
        }
    }
    
}