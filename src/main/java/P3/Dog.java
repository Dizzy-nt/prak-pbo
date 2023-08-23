/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P3;
/**
 *
 * @author dizzy-nt
 */
public class Dog {
    String name ;          // State Class Dog
    public void bark() {// Method Class Dog, Menggonggong
        System.out.println(name + " Bersuara guk guk!!"); // Cetak
    }
    public static void main(String[] args) {// Main
        Dog dog1 = new Dog();               // Instansiasi Objek Reference Variable(VarRef)
        dog1.name = "chiko";                // VarRef assign nama
        dog1.bark();                        // VarRef akses method
        Dog[] anjing = new Dog[4];          // Instansiasi Array object
        anjing[0] = new Dog();              // tiap indeks menjadi VarRef
        anjing[1] = new Dog();
        anjing[2] = dog1;                   // indeks akses VarRef
        anjing[3] = dog1;
        anjing[0].name = "dalma";           // assign, VarRef akses nama
        anjing[1].name = "doggy";
        System.out.println("nama anjing terakhir");
        System.out.println(anjing[3].name); //Cetak nama VarRef indeks terakhir
        int i = 0;
        while(i< anjing.length){    // Cetak seluruh indeks VarRef dgn loop
            anjing[i].bark();
            i = i + 1;
        }
    }   
}
