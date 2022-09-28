
package clases_objetos;

import java.util.Scanner;
import set_get.fruits_Set_Get;
import Protected.fruits_Protected;
        
public class fruits extends fruits_Protected{
    
 public String name;

 
 public void name(){
     Scanner entry = new Scanner (System.in);
     
     System.out.println("Ingrese el nombre de la fruta");
     this.name = entry.nextLine();
     
 }
 
 public void averageWeight(){
     Scanner entry = new Scanner (System.in);
     
     System.out.println("Ingrese el peso de la fruta");
     averageWeight = entry.nextFloat();
     
 }
 
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
