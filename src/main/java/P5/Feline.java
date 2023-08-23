/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P5;
/**
 *
 * @author User
 */
public abstract class Feline extends Hewan{
    //Override method eat dan roam, lebih spesifik
    @Override
    void berkeliaran() {//raom akan mengurangi 1 energi
        System.out.println(getNama()+" Berkeliaran secara individual");
        System.out.println("Energi sebelumnya = "+getEnergi());
        setEnergi(-1);
        System.out.println("Energi menjadi = "+getEnergi());
        System.out.println("");
    }
    @Override
    void makan() {
        setMakanan("daging");
        System.out.println(getNama()+" Memakan "+getMakanan());
        System.out.println("Energi sebelumnya = "+getEnergi());
        setEnergi(2);
        System.out.println("Energi menjadi = "+getEnergi());
        System.out.println("");
    }  
}