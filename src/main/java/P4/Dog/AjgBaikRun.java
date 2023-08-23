/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P4.Dog;
/**
 *
 * @author User
 */
public class AjgBaikRun {
    public static void main(String[] args) {
        AjgBaik satu=new AjgBaik();
        AjgBaik dua=new AjgBaik();
        satu.setSize(70);
        dua.setSize(8);
        System.out.println("Anjig pertama = "+satu.getSize());
        System.out.println("Anjig kedua = "+dua.getSize());
        satu.bark();
        dua.bark();
    }
}
