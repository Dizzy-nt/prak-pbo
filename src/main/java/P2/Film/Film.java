/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P2.Film;
/**
 *
 * @author Dizzy-nt
 */
public class Film {
    public static void main(String[] args) {
        // TODO code application logic here
        dataFilm dora=new dataFilm();
        dora.judul="Dora si penjelajah";
        dora.genre="petualangan";
        dora.peringkat=7;
        
        dataFilm unyil=new dataFilm();
        unyil.judul="Laptop si unyil";
        unyil.genre="pengetahuan";
        unyil.peringkat=8;
        
        dataFilm kancil=new dataFilm();
        kancil.judul="si Kancil anak nakal";
        kancil.genre="dongeng";
        kancil.peringkat=7;
        
        dora.keterangan();
        kancil.keterangan();
        unyil.keterangan();
        
        unyil.putarFilm();
    }
}
