/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P3;

/**
 *
 * @author User
 */
public class quiz {
    int id =0;
    public static void main(String[] args) {
        int x = 0;
        quiz[] a =new quiz[5];
        while (x<3) {            
            a[x]=new quiz();
            a[x].id=x;
            x++;
        }
        a[3]=a[1];
        a[4]=a[1];
        a[3]=null;
        a[4]=a[0];
        a[0]=a[3];
        a[3]=a[2];
        a[2]=a[0];
        for (int i = 0; i < a.length; i++) {
            System.out.print("a["+i+"].id = ");
            try {
                System.out.println(a[i].id);
            } catch (Exception e) {
                System.out.println("null");
            }
        }
        /*
        a[0].id = null
        a[1].id = 1
        a[2].id = null
        a[3].id = 2
        a[4].id = 0
        */
        
       
        
    }
    
}
