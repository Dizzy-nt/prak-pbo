/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P5;
/**
 *
 * @author User
 */
public abstract class Canine extends Hewan{
    //Override method eat dan roam, lebih spesifik
    @Override
    void makan() {//makan akan menambah 2 energi
        setMakanan("daging");
        System.out.println(getNama()+" Memakan "+getMakanan());
        System.out.println("Energi sebelumnya = "+getEnergi());
        setEnergi(2);
        System.out.println("Energi menjadi = "+getEnergi());
    }
    @Override
    void berkeliaran() {
        System.out.println(getNama()+" Berkeliaran secara berkelompok");
        System.out.println("Energi sebelumnya = "+getEnergi());
        setEnergi(-1);
        System.out.println("Energi menjadi = "+getEnergi());
        System.out.println("");
    }
}
