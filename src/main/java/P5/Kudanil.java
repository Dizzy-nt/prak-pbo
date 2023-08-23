/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P5;
/**
 *
 * @author User
 */
public class Kudanil extends Hewan {
    //Constructor untun set nama
    public Kudanil(String nama) {
        this.nama=nama;
    }
    //Override method makan untuk set makanan Kudanil
    @Override
    void makan() {
        setMakanan("Rumput");
        System.out.println(getNama()+" Memakan  "+getMakanan());
        System.out.println("energi sebelumnya = "+getEnergi());
        setEnergi(2);
        System.out.println("energi menjadi = "+getEnergi());
        System.out.println("");
    }
    //Override Methode suara untuk kudanil
    @Override
    void Suara() {
        System.out.println(getNama()+" Menderam = ngik-ngik");
        System.out.println("");
    }
}
