package main;

public class Mahasiswa {
    String nama, nim;
    int usia,uts,uas;
    
    Mahasiswa(String nama, String nim, Integer usia, Integer uts, Integer uas){
        this.nama=nama;
        this.nim=nim;
        this.usia=usia;
        this.uts=uts;
        this.uas=uas;
    }
    
    int cNilaiAkhir() {
        int nilai_akhir;
        nilai_akhir = (uts+uas)/2;
        return nilai_akhir;
    }
}
