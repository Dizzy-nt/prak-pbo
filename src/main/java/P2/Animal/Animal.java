/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P2.Animal;
/**
 *
 * @author Dizzy-nt
 */
class Animal {
    // Bagian 1
    String hewan;
    String habitat;
    String berkembangbiak;
    String bunyi;
    Animal(String IsiHewan, String IsiHabitat, String IsiBerkembangbiak) {
        this.hewan = IsiHewan;
        this.habitat = IsiHabitat;
        this.berkembangbiak = IsiBerkembangbiak;
    }
    Animal(String IsiHewan, String IsiHabitat) {
        this.hewan = IsiHewan;
        this.habitat = IsiHabitat;
    }
    Animal(String IsiHewan) {
        this.hewan = IsiHewan;
    }
    void suara(){
        System.out.print(hewan+" Memiliki suara = ");
        if (bunyi!=null) {
            System.out.println(bunyi);
        } else {
            System.out.println("Maaf, "+hewan+" belum diketahui suaranya");
        }
        System.out.println("");
    }
    void keterangan(){
        System.out.println("Jenis hewan = "+hewan);
        System.out.println("Habitat "+hewan+" = "+habitat);
        System.out.println(hewan+" berkembangbiak dengan cara = "+berkembangbiak);
    }
}
