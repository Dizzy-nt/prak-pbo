/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum1;
/**
 *
 * @author User
 */
public class Frasa {
    public static void main(String[] args) {
        //Bagian 1 = membuat 3 kumpulan kata-kata untuk dipilih. Silahkan menambah kata-kata anda
        String indeksKataSatu[]={"rumah","sepeda","ayam","jam","baju","mobil","laptop","smartphone"};
        String indeksKataDua[]={"canggih","nyaman","enak","terbaru","besar","hitam","bagus","luas"};
        String indeksKataTiga[]={"itu","di atas","milikmu","miliknya","di toko","baru","putih"};
        //Bagian 2 = cari berapa banyak kata disetiap list
        System.out.print("Jumlah kata pada indeks kata 1 = ");
        System.out.println(indeksKataSatu.length+" Kata");  //jumlah kata di indeks Satu
        System.out.print("Jumlah kata pada indeks kata 2 = ");
        System.out.println(indeksKataDua.length+" Kata");   //jumlah kata di indeks Dua
        System.out.print("Jumlah kata pada indeks kata 3 = ");
        System.out.println(indeksKataTiga.length+" Kata\n");  //jumlah kata di indeks Tiga
        //Bagian 3 = men-generate 3 bilangan random sesuai dengan banyaknya kata disetiap list
        int rndm1 = (int)Math.random()*indeksKataSatu.length;
        /*
          Seperti diatas adalah hasil perbaikan, bahwa kita bisa langsung menjadikannya integer
          dalam satu variabel tanpa membuat variabel baru :")
        */
        double rndm2 = Math.random()*indeksKataDua.length;
        double rndm3 = Math.random()*indeksKataTiga.length;
        int random1,random2,random3;
        random1 = (int)rndm1;
        random2 = (int)rndm2;
        random3 = (int)rndm3;
        System.out.print("Angka Random dari indeks kata 1 : ");
        System.out.println("("+rndm1+")");
        System.out.print("Angka Random dari indeks kata 2 : ");
        System.out.println("("+random2+")");
        System.out.print("Angka Random dari indeks kata 3 : ");
        System.out.println("("+random3+")");
        //Bagian 4 = membangun sebuah frasa
        String frasa;
        frasa=indeksKataSatu[random1]+" "+indeksKataDua[random2]+" "+indeksKataTiga[random3];
        //Bagian 5 = cetak frasa tersebut
        System.out.println("Saya menginginkan sebuah "+frasa);
    }
}
