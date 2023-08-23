/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P2.GameTebakan;
/**
 *
 * @author Dizzy-nt
 */
public class Pemain {
    int angka = 0;
    void menebak(){
        angka = (int)(Math.random()*10);
        System.out.println("Tebakanku sih angka "+angka);
    }
    
}
