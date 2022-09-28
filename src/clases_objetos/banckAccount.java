
package clases_objetos;

import java.util.Scanner;
import set_get.banckAccount_Set_Get; //Importo la clase para usar sus atributos y metodos
import Protected.banck_Protected;//Importo la clase para usar sus atributos y metodos

/**
 * Representa los datos de almacenamiento basicos de un banco
 * @author Usuario
 */
public class banckAccount extends banck_Protected {
 
   
   public void name(){
   Scanner entry = new Scanner (System.in);
   banckAccount_Set_Get banck = new banckAccount_Set_Get();
   
   
   System.out.println("Ingrese su nombre");
   String name = entry.nextLine();
   banck.setName(name);
   
   System.out.println("El nombre ingresado es"+ banck.getName());
   
}
   /**
    * Las variables se encuentran protegidas. Por lo que se extiende des de 
    * la clase banck_Protected la cual seencuentra en el paquete Protected
    */
   public void banckName(){
   Scanner entry = new Scanner (System.in);
   
   System.out.println("Ingrese su nombre");
   banckName = entry.nextLine();
   
   System.out.println("El nombre ingresado es"+ banckName);
}
   
   public void badge(){
   Scanner entry = new Scanner (System.in);
   banckAccount_Set_Get banck = new banckAccount_Set_Get();
   

   System.out.println("Ingrese el tipo de tarjeta");
   String badges = entry.nextLine();
   banck.setBadge(badges);
   
   System.out.println("El nombre de tarjeta es"+ banck.getBadge());
}
   
   public void amount(){
   Scanner entry = new Scanner (System.in);
   banckAccount_Set_Get amounts = new banckAccount_Set_Get();
   
   System.out.println("Ingrese el monto");
   float amoun = entry.nextFloat();
   amounts.setAmount(amoun);
   
   System.out.println("El monto ingresado fue"+ amounts.getAmount());
}
   
   public void accountNumber(){
   Scanner entry = new Scanner (System.in);
   banckAccount_Set_Get account = new banckAccount_Set_Get();
   
   System.out.println("----------------------------");
   System.out.println("Ingresar numero de cuenta");
   int number = entry.nextInt();
   account.setAccountNumber(number);
   
   System.out.println("----------------------------");
   System.out.println("El numero de cuenta ingresado fuee" + account.getAccountNumber());
   }
   
   /**
    * Se ingresa el estado de la cuenta.
    * 
    */
   public void activated(){
   Scanner entry = new Scanner (System.in);
   
   System.out.println("----------------------------");
   System.out.println("Ingrese el estado dela cuenta activa o inactiva");
   boolean activated = entry.nextBoolean(); //Validar que si convierte un array o string en un booleano
   
   System.out.println("----------------------------");
   System.out.println("El estadode la cuenta es" + activated);
   }
   
      
      
      
}
