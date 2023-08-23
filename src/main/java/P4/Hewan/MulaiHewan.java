/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P4.Hewan;
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
        //Gunakan Setter
        ayam.setNama("Ayam");
        // Modifikasi, Method ayam.memakan() dengan parameter String
        System.out.println(ayam.memakan("Cacing"));
    }
}
