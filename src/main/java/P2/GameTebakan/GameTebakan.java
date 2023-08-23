/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P2.GameTebakan;
/**
 *
 * @author Dizzy-nt
 */
public class GameTebakan {//========(Bagian 1)==================================
    Pemain Pemain1 = new Pemain();       // Instansiasi objek
    Pemain Pemain2 = new Pemain();
    Pemain Pemain3 = new Pemain();
    int tebakanPemain1;                  // Deklarasi Variabel
    int tebakanPemain2;                  // untuk nilai angka yg ditebak
    int tebakanPemain3;    
    boolean statusPemain1 = false;       // Inisialisasi Variabel
    boolean statusPemain2 = false;       // untuk status kebenaran
    boolean statusPemain3 = false;
//==================================(Bagian 2)==================================
    public void mulaiPermainan(){        // Buat method
        int jawaban = (int)(Math.random() * 10);//Inisialisasi var. jawaban
        System.out.println("Coba tebak dari 0 sampai 9"); // untuk acak angka
        System.out.println("Sssst..., angka yang harus ditebak ternyata angka "
                +jawaban);
//==================================(Bagian 3)==================================
        while (true) {                        // Perulangan
            Pemain1.menebak();                // objek menebak acak
            Pemain2.menebak();
            Pemain3.menebak();
            tebakanPemain1 = Pemain1.angka;   // Masukkan nilai & Cetak
            System.out.println("Pemain Pertama menebak angka "+tebakanPemain1);
            tebakanPemain2 = Pemain2.angka;
            System.out.println("Pemain Kedua menebak angka "+tebakanPemain2);
            tebakanPemain3 = Pemain3.angka;
            System.out.println("Pemain pertama menebak angka "+tebakanPemain3);
//==================================(Bagian 4)==================================
            if (tebakanPemain1==jawaban) {  // Kondisi
                statusPemain1 = true;       // Jika tebakan sama dgn jawaban
            }if (tebakanPemain2==jawaban) { // status menjadi benar
                statusPemain2 = true;
            }if (tebakanPemain3==jawaban) {
                statusPemain3 = true;}
//==================================(Bagian 5)================================== 
            if (statusPemain1||statusPemain2||statusPemain3) { // Kondisi
                System.out.println("\nKeren, tebakannya ada yang bener,"
                       + " siapa hayo..");// Jika ada salah satu yg benar
                CekKebenaran cek=new CekKebenaran(); //Instansiasi objek    
                cek.cek();                           //Untuk dipanggil
                break;
            } else {
                System.out.println("\nSalah semua... Wkwkwkwk. Coba lagi ya\n");
            }
        }
    }
}
