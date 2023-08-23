/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P4;
/**
 *
 * @author User
 */
public class Riski2 {
    private int bil[]=new int[6];
    float[]ar=new float[6];

    public static void main(String[] args) {
        int[] arr = {2,5,3,5,9,5};
        Riski2 ob=new Riski2();
        //masukkan nilai arr pada array
        ob.setBil(arr);
        System.out.print("Array = ");
        //panggil array
        ob.getBil();
        //ubah nilai pada array, pakai setBil(angka yang ingin diubah, diubah dengan);
        ob.setBil(5,1);
        System.out.print("Array setelah diubah = ");
        ob.getBil();
        //kali dengan 0.5
        System.out.println("Array setelah dikali 0,5 = ");
        ob.kali((float)0.5);
        
    }
    public void kali(float pengkali){
        for (int i = 0; i < bil.length; i++) {
            ar[i] = (float)0.5*bil[i];
            System.out.println(ar[i]);
        }
    }
    public void getBil() {
        for (int i = 0; i < bil.length; i++) {
            System.out.print(bil[i]+" , ");
        }
        System.out.println();
    }
    public void setBil(int[] bil) {
        this.bil = bil;
    }
    public void setBil(int target,int pengganti){
        for (int i = 0; i < bil.length; i++) {
            if (bil[i]==target) {
                bil[i]=pengganti;
            }
        }
    }
    /*
    Output :
    Array = 2 , 5 , 3 , 5 , 9 , 5 , 
    Array setelah diubah = 2 , 1 , 3 , 1 , 9 , 1 , 
    Array setelah dikali 0,5 = 
    1.0
    0.5
    1.5
    0.5
    4.5
    0.5
    */
}
