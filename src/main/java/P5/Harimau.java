/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P5;
/**
 *
 * @author User
 */
public class Harimau extends Feline {
    //Constructor untuk set nama
    public Harimau(String nama) {
        this.nama=nama;
    }
    //Override method Suara harimau
    @Override
    void Suara() {
        System.out.println("Harimau mengaum ="
                + " rroaaarr");
        System.out.println("");
    }
}
