package main;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    String nama,nim;
    int pilihan, usia, uts, uas;
    
    System.out.println("====== INPUT DATA ======");
    System.out.print("Nama\t:"); nama = input.nextLine();
    System.out.print("NIM\t:"); nim = input.nextLine();
    System.out.print("Usia\t:");usia = input.nextInt();
    System.out.print("UTS\t:");uts = input.nextInt();
    System.out.print("UAS\t:");uas = input.nextInt();
  
    Mahasiswa mahasiswa = new Mahasiswa(nama, nim, usia, uts, uas);
    
    do{
       System.out.println("\n");
       System.out.println("====== DAFTAR PILIHAN ======");
       System.out.println("1. Tampilkan data");
       System.out.println("2. Edit data");
       System.out.println("3. Exit");
       System.out.println("Pilih\t:"); pilihan = input.nextInt();
       
       if (pilihan==1){
           System.out.println("Perkenalkan nama saya " + mahasiswa.nama + "," +" NIM " + mahasiswa.nim + ",");
           System.out.println("Usia\t\t: " + mahasiswa.usia);
           System.out.println("Nilai Akhir\t: " + mahasiswa.cNilaiAkhir());
           
       }if (pilihan==2) {
           System.out.println("====== INPUT DATA ======");
           input = new Scanner(System.in);
           System.out.print("Nama\t:"); mahasiswa.nama = input.nextLine();
           System.out.print("NIM\t:"); mahasiswa.nim = input.nextLine();
           System.out.print("Usia\t:"); mahasiswa.usia = input.nextInt();
           System.out.print("UTS\t:"); mahasiswa.uts = input.nextInt();
           System.out.print("UAS\t:"); mahasiswa.uas = input.nextInt();
       }
       
       } while (pilihan!=3);
        
        
        
        
    }  
}