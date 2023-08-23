/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P3;
/**
 *
 * @author Dizzy-nt
 */
public class TestBuku {
    public static void main(String[] args) { // Main method
        Buku[] bukuku = new Buku[3];    // Instansiasi Array Object
        bukuku[0] = new Buku();     // tiap indeks jadi Variabel referensi(VarRef)
        bukuku[1] = new Buku();
        bukuku[2] = new Buku();
        int x = 0;
        bukuku[0].title = "Buku Ipa";    //Assign title untuk masing2 VarRef
        bukuku[1].title = "Buku Olhraga";
        bukuku[2].title = "Buku Masak";
        
        bukuku[0].author = "Prof. Rosyid";//Assign author untuk masing2 VarRef
        bukuku[1].author = "Coach Rosyid";
        bukuku[2].author = "Chef Rosyid";
        
        while (x < bukuku.length) {     //Loop untuk cetak title dan author
            System.out.print(bukuku[x].title); //gunakan urutan indeks
            System.out.print(" karya ");
            System.out.print(bukuku[x].author);
            System.out.println();
            x++;                        //Increment
        }
    }
}
