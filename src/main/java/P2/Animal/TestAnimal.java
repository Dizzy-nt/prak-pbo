/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P2.Animal;
/**
 *
 * @author Dizzy-nt
 */
public class TestAnimal {
    public static void main(String[] args) {
    Animal ayam=new Animal("Ayam", "Daratan", "Bertelur");
    ayam.bunyi="Pok-pok petook!";
    ayam.keterangan();
    ayam.suara();
    
    Animal hiu=new Animal("Hiu Putih", "Laut", "Ovovivipar");
    hiu.keterangan();
    hiu.suara();
    
    Animal buaya=new Animal("Buaya(Darat?)", "Amfibi");
    buaya.bunyi="Assalamu'alaikum ukhti";
    buaya.keterangan();
    buaya.suara();
    }
}
