/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P5;
/**
 *
 * @author User
 */
public class Kucing extends Feline implements Pet{
    // Override Abstract method dari Interface Pet
    @Override
    public void bermain() {
        System.out.println("Ayo bermain bersama "+getNama());
        System.out.println("");
    }
    @Override
    public void ramah() {
        System.out.println(getNama()+" Ramah loh!");
    }
    //Constructor untuk set nama
    public Kucing(String nama) {
        this.nama=nama;
    }
    //Override method Suara kucing
    @Override
    void Suara() {
        System.out.println(getNama()+
                " Mengeong = miaaw");
        System.out.println("");
    }
}
