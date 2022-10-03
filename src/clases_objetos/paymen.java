/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_objetos;
import java.util.Scanner;
import set_get.paymen_Set_Get;

/**
 *
 * @author Usuario
 */
public class paymen {
    
   public char reference;
   public char description;

   private void setCurrency(){
   
   Scanner entry = new Scanner (System.in);
   paymen_Set_Get setCurrency = new paymen_Set_Get();
   
   System.out.println("Ingrese el tipo de moneda. Ejemplo: CO, US, CAD");
    String curren = entry.nextLine();
    setCurrency.setCurrency(curren);
    
   }
   
   public void playCurrency(){
       paymen pay = new paymen();
       pay.setCurrency();
       
   }
           
   public void total(){
   
   Scanner entry = new Scanner (System.in);
   paymen_Set_Get setTotal = new paymen_Set_Get();
   
   System.out.println("Ingrese el monto");
   float total = entry.nextFloat();
   setTotal.setTotal(total);
    
   }
   
}
