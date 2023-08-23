/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P3;

/**
 *
 * @author User
 */
        //3
public class qz {
    public static void main(String[] args) {
        //1
        int[] index=new int[4];             
        //10
        String []island=new String[4];
        //8
        index[0]=1;                         
        index[1]=3;                         
        index[2]=0;
        index[3]=2;
        //4
        island[0]="Kangean";                
        island[1]="Bangka Belitung";
        island[2]="Natuna";
        island[3]="Biak";
        //9 salah
        //ref=index[y];
        //5
        int y=0;
        //11
        int ref;
        while (y<4) {
            //9
            ref=index[y];
            //7
            System.out.print("Pulau = ");
            //2
            System.out.println(island[ref]);
            //6
            y++;
        }
        /*
        jawabanku =             3-1-10-8-4-9-5-11-7-2-6
        jawaban yang benar =    3-1-10-8-4-5-11-9-7-2-6
        =======================
        output :
        Pulau = Bangka Belitung
        Pulau = Biak
        Pulau = Kangean
        Pulau = Natuna
        */
        
    }
}
