/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P4.Dog;
/**
 *
 * @author User
 */
public class Doggu {
    int size;
    String name;
    void bark(){
        if (size>60) {
            System.out.println("Wooof! Wooof!");
        } else if (size>14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Kaing! Kaing!");
        }
    }
}
