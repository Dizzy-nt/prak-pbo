/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P4;
/**
 *
 * @author User
 */
public class Riski {
    private int []angka=new int[5];
    private float rata2;
    private int maksimum;
    private int minimum;
    
    public static void main(String[] args) {
        Riski test=new Riski();
        int []ary={-5,-3,-6,-3,-4};
        test.setAngka(ary);
        test.getAngka();
        test.setRata2();
        test.setMaksimum();
        test.setMinimum();
        
        test.cetak("a. Rata-rata = ");
        test.cetak(test.getRata2()+"\n");
        test.cetak("b. Maksimum = ");
        test.cetak(test.getMaksimum()+"\n");
        test.cetak("c. Minimum = ");
        test.cetak(test.getMinimum()+"\n");
        test.cetak("c. indeks ke = ");
        test.posisi(-3);  
    }

    public void cetak(int a){
        System.out.print(a);
    }
    public void cetak(String a){
        System.out.print(a);
    }
    public void cetak(int[] a){
        System.out.print(a);
    }
    public void cetak(String[] a){
        System.out.print(a);
    }
    public void cetak(float a){
        System.out.print(a);
    }
    
    public void setAngka(int[] angka) {
        this.angka = angka;
    }
    public int[] getAngka() {
        return angka;
    }

    public float getRata2() {
        return rata2;
    }
    public void setRata2() {
        float total=0;
        for (int i = 0; i < angka.length; i++) {
            total=total+angka[i];
        }
        rata2=(float)total/angka.length;
    }

    public int getMaksimum() {
        return maksimum;
    }
    public void setMaksimum() {
        maksimum=angka[0];
        for (int i = 0; i < angka.length; i++) {
            if (maksimum<angka[i]) {
                maksimum=angka[i];
            }
        }
    }

    public int getMinimum() {
        return minimum;
    }
    public void setMinimum() {
        for (int i = 0; i < angka.length; i++) {
            if (angka[i]<minimum) {
                minimum=angka[i];
            }
        }
    }
    
    public void posisi(int dicari){
        for (int i = 0; i < angka.length; i++) {
            if (angka[i]==dicari) {
                int posisi=i;
                System.out.print("ke-"+posisi+",");
            }
        }
    }
}
