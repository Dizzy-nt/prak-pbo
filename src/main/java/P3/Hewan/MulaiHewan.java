/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P3.Hewan;
/**
 *
 * @author Dizzy-nt
 */
public class MulaiHewan { //Class untuk menjalankankan Object Class Hewan
    public static void main(String[] args) {
        Hewan hewan=new Hewan();    //Instansiasi Variabel Referensi(VarRef)
        Hewan ayam=new Hewan();
        hewan.setNilai();           // VarRef jalankan Method
        hewan.makan();
        System.out.println("~");
        ayam.setNama("Ayam");
        System.out.println(ayam.memakan("Cacing"));
    }
}
