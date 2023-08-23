/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P4.Hewan;
/**
 *
 * @author Dizzy-nt
 */
public class Hewan {//Object Class
    //Modifikasi, Semua instance sudah di enkapsulasi (dijadikan private)
    private String nama;
    private String jenis;
    private int tingkatRantaiMakanan;
    private Hewan[] hewan=new Hewan[5];
    //Modifikasi, sudah ditambahkan Setter dan Getter
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getJenis() {
        return jenis;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public int getTingkatRantaiMakanan() {
        return tingkatRantaiMakanan;
    }
    public void setTingkatRantaiMakanan(int tingkatRantaiMakanan) {
        this.tingkatRantaiMakanan = tingkatRantaiMakanan;
    }
    public Hewan[] getHewan() {
        return hewan;
    }
    public void setHewan(Hewan[] hewan) {
        this.hewan = hewan;
    }  
    public void setNilai() {//Method untuk set nilai seluruh Variabel referensi
        System.out.println("Panjang Array = "+hewan.length);
        // Instansiasi Array Objek
        for (int i = 0; i < hewan.length; i++) {
            hewan[i]=new Hewan();
        }
        //Instansiasi Variabel referensi objek
        hewan[0].setNama("Elang");
        hewan[1].setNama("Ular");
        hewan[2].setNama("Burung");
        hewan[3].setNama("Belalang");
        hewan[4].setNama("Tumbuhan");
        hewan[0].setJenis("Karnivora");
        hewan[1].setJenis("Karnivora");
        hewan[2].setJenis("Omnivora");
        hewan[3].setJenis("Herbivora");
        // Instansiasi Variabel referensi objek juga
        // tapi dengan loop
        System.out.println("Puncak Rantai Makanan : ");
        for (int i = 0; i < hewan.length; i++){
            for (int j=hewan.length;j > i ; j--){//Nested loop agar mulai dari 1
            hewan[i].setTingkatRantaiMakanan(j);
            }   // Cetak Nilai variabel tiap loop
         System.out.print(hewan[i].getTingkatRantaiMakanan()+". "+hewan[i].getNama()+"\n");
        }
        System.out.println("~"); // Cetak batas untuk output
    }
    void makan(){   //Method hukum rimba
        for (int i = 0; i < hewan.length-1; i++) {//Memakan indeks berikutnya
            String b = hewan[i].getNama()+" makan "+hewan[i+1].getNama();
            System.out.println(b);
        }
    }
// Modifikasi, Method dengan parameter
    String memakan(String mangsa){
        String mkn;
        //Gunakan getter
        mkn = getNama()+" memakan "+mangsa;
        return mkn;
    }
}
