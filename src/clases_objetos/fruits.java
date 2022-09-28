
package clases_objetos;

import java.util.Scanner;
import set_get.fruits_Set_Get;
        
public class fruits {
    
 protected char name;
 protected float averageWeight;
 
 
 public void setColor(){
     Scanner entry = new Scanner (System.in);
     fruits_Set_Get fruit = new fruits_Set_Get();
     
   System.out.println("Ingrese su nombre");
   String colors = entry.nextLine();
     
   fruit.setColor(colors);
     
 }
 
 public void getColor(){
     fruits_Set_Get fruit = new fruits_Set_Get();
     
     System.out.println("El color ingresado es" + fruit.getColor());
     
 }
 
}
