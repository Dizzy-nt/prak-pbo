/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P5;
/**
 *
 * @author User
 */
public abstract class Hewan{
    String nama;    //instance variable
    String makanan; //atau property atau atribut
    int energi;
    int[]lokasi={0,0}; //Koordinat untuk Lokasi
    int[]batasan={0,0};//Koordinat untuk batasan
    
    //Behavior Abstract, untuk di override pada subclass
    abstract void Suara();//Behavior hewan untuk bersuara,spesifik tiap subclass
    abstract void makan();//Behavior hewan untuk makan, energi bertambah

    void tidur(){         //Behavior hewan untuk tidur
        System.out.println(getNama()+" tidur\n");
    }
    void berkeliaran(){   //Beavior hewan untuk roam, energi berkurang
        System.out.println(getNama()+" Berkeliaran ");
        System.out.println("Energi sebelumnya = "+getEnergi());
        setEnergi(-1);
        System.out.println("Energi menjadi = "+getEnergi()+"\n");
    }
    
    public String getMakanan() {
        return makanan;
    }
    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }
    public int getEnergi() {
        return energi;
    }
    public void setEnergi(int energi) {
        this.energi += energi;
    }
    public int[] getLokasi() {
        return lokasi;
    }
    public void setLokasi(int[] lokasi) {
        this.lokasi = lokasi;
    }
    public int[] getBatasan() {
        return batasan;
    }
    public void setBatasan(int[] batasan) {
        this.batasan = batasan;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }  
}
