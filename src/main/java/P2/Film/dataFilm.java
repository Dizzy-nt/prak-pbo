/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P2.Film;
/**
 *
 * @author Dizzy-nt
 */
public class dataFilm {
    String judul;
    String genre;
    int peringkat;

    void putarFilm(){
        System.out.println("Film yang sedang diputar saat ini : "+judul);
    }
    void keterangan(){
        System.out.println("Keterangan film : ");
        System.out.println("Judul = "+judul);
        System.out.println("Genre film = "+genre);
        System.out.println("Rating film (0~10) = "+peringkat);
        System.out.println();
    }
}
