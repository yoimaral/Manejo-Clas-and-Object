
package clases_objetos;

import java.util.Scanner;

/**
 * Representa los datos de almacenamiento basicos de un banco
 * @author Usuario
 */
public class banckAccount {
   
   private char name;
   protected char banckName;
   private char badge;
   private float amount;
   private int accountNumber;
   protected boolean activated;
   
   
   public void enterAmount(){
   Scanner entrada = new Scanner (System.in);
   System.out.println("----------------------------");
   System.out.println("Ingresar monto");
   this.amount = entrada.nextFloat();
   System.out.println("----------------------------");
   System.out.println("El monto ingresado fue" + this.amount);
   }
   
   
   
   
}
