/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P5;
/**
 *
 * @author User
 */
public class Serigala extends Canine {
    //Buat konstruktor untuk set nama
    public Serigala(String nama) {
        this.nama=nama;
    }
    //Override method suara, khusus Serigala
    @Override
    void Suara() {
        System.out.println(getNama()+" Melolong = Auuuuuuu");
        System.out.println("");
    }
}