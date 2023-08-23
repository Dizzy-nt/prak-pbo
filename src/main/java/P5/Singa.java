/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P5;
/**
 *
 * @author User
 */
public class Singa extends Feline{
    //Constructor untuk set nama
    public Singa(String nama) {
        this.nama=nama;
    }
    //Override method Suara singa
    @Override
    void Suara() {
        System.out.println(getClass()+" Mengaum ="
                + " Hauummmm");
        System.out.println("");
    }
}
