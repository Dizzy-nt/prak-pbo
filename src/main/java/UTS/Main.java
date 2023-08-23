/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author User
 */
public class Main{
    public static void main(String[] args) {
        mobil mobil=new mobil("Toyota", "Avanza", 2021, "Bensin");
        motor astrea=new motor("Honda", "Astrea", 1997, "Pertalite");
        bajay bajay=new bajay("Gatot Kaca", "Super Sakti", 2000, "Premium");
        System.out.println("Merk mobil = "+mobil.getMerk());
        System.out.println("Model mobil = "+mobil.getModel());
        mobil.bergerak();
        mobil.isiBahanBakar();
        mobil. berhenti();
        System.out.println("~~~");
        System.out.println("Merk motor = "+astrea.getMerk());
        System.out.println("Model motor = "+astrea.getModel());
        astrea.bergerak();
        astrea.isiBahanBakar();
        astrea. berhenti();
        System.out.println("~~~");
        System.out.println("Merk Bajay = "+bajay.getMerk());
        System.out.println("Model Bajay = "+bajay.getModel());
        bajay.bergerak();
        bajay.isiBahanBakar();
        bajay. berhenti();
    }
}
