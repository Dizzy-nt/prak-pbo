/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P4.Dog;
/**
 *
 * @author User
 */
public class GonggonganPeliharaan extends AjgBaik{
    public static void main(String[] args) {
        AjgBaik[] arr=new AjgBaik[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new AjgBaik();
            arr[i].setSize((int)(Math.random()*80)+1);
            System.out.print("Anjing ke-"+i+" Menggonggong = ");
            arr[i].bark();
        }
    }
}
