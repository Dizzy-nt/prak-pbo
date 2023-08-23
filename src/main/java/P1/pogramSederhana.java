/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum1;
/**
 *
 * @author User
 */
public class pogramSederhana {
    public static void main(String[] args) {
        //Bagian 1
        //Statement asal aja nih ceritanya
        String a,b,c;
        a="Statement";
        b="Looping";
        c="Branching atau Decision making";        
        String judul="Program sederhana, disini berisi : "+a+", "+b+" dan "+c;
        int smt=2;
        int acak=(int)0.1*8;
        System.out.println(judul);
        System.out.println("Kamu sekarang semester = "+smt);
        System.out.println("Angka sembarang = "+acak);
        //Bagian 2
        if (acak%2==0) {
            System.out.println("Angka acak itu Genap");
        } else {
            System.out.println("Angka acak itu Ganjil");
        }
        //Bagian 3
        System.out.println("Berhitung dari 3 ke 1 : ");
        for (int i = 3; i >0; i--) {
            System.out.print(i+", ");
        }
        System.out.println("Selesai :)");
    }
}
