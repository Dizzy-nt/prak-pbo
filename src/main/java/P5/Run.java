/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P5;
/**
 *
 * @author User
 */
public class Run {
    public static void main(String[] args) {
        Anjing anjing;   //Polymorphism 
        Hewan serigala;//Deklarasikan semua objek
        Harimau harimau;
        Kucing kucing;
        Feline singa;
        Hewan kudanil;
        anjing = new Anjing("Anjing");//Instansiasi semua objek
        serigala = new Serigala("Serigala");
        harimau = new Harimau("Harimau");
        kucing = new Kucing("Kucing");
        singa = new Singa("Singa");
        kudanil = new Kudanil("Kudanil");
        //Lakukan method dari Interface Pet
        anjing.ramah();
        anjing.bermain();
        kucing.ramah();
        kucing.bermain();
        //Lakukan behavior
        anjing.Suara();
        serigala.Suara();
        harimau.makan();
        kucing.makan();
        kucing.berkeliaran();
        singa.tidur();
        kudanil.makan();
        kudanil.berkeliaran();
        kudanil.Suara();
        kudanil.tidur();
    }
}
