/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P5;
/**
 *
 * @author User
 */
public class Anjing extends Canine implements Pet{
    //Override Abstract method dari interface Pet
    @Override
    public void bermain() {
        System.out.println("Ayo bermain bersama "+getNama());
        System.out.println("");
    }
    @Override
    public void ramah() {
        System.out.println(getNama()+" Ramah loh!");
    }
    //Buat konstruktor untuk set nama
    public Anjing(String nama) {
        this.nama=nama;
    }
    //Override method suara, khusus Anjing
    @Override
    void Suara() {
        System.out.println(getNama()+" Menggonggong = Woof-woof");
        System.out.println("");
    }
}