/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P2.GameTebakan;
/**
 *
 * @author User
 */
public class CekKebenaran extends GameTebakan{ // Buat Class turunan dari GameTebakan
    void cek(){                                // untuk akses status
        System.out.println("Pemain 1 ?");
        if (statusPemain1) {
            System.out.println(" Bener... wkwk");
        } else {
            System.out.println("Salaahh... wkwk");
        }
        System.out.println("Pemain 2 ?");
        if (statusPemain2) {
            System.out.println(" Bener... wkwk");
        } else {
            System.out.println("Salaahh... wkwk");
        }
        System.out.println("Pemain 3 ?");
        if (statusPemain3) {
            System.out.println(" Bener... wkwk");
        } else {
            System.out.println("Salaahh... wkwk");
        }
    }
}
