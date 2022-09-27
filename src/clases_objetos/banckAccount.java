
package clases_objetos;

import java.util.Scanner;
import set_get.banck_Account; //Importo la clase para usar sus atributos y metodos
import Protected.banck_Protected;//Importo la clase para usar sus atributos y metodos

/**
 * Representa los datos de almacenamiento basicos de un banco
 * @author Usuario
 */
public class banckAccount extends banck_Protected {
 
   
   public void name(){
   Scanner enterName = new Scanner (System.in);
   banck_Account banck = new banck_Account();
   
   
   System.out.println("Ingrese su nombre");
   String name = enterName.nextLine();
   banck.setName(name);
   
   System.out.println("El nombre ingresado es"+ banck.getName());
   
}
   /**
    * Las variables se encuentran protegidas. Por lo que se extiende des de 
    * la clase banck_Protected la cual seencuentra en el paquete Protected
    */
   public void banckName(){
   Scanner enterName = new Scanner (System.in);
   
   System.out.println("Ingrese su nombre");
   banckName = enterName.nextLine();
   
   System.out.println("El nombre ingresado es"+ banckName);
}
   
   public void badge(){
   Scanner enterBadge = new Scanner (System.in);
   banck_Account banck = new banck_Account();
   

   System.out.println("Ingrese el tipo de tarjeta");
   String badges = enterBadge.nextLine();
   banck.setBadge(badges);
   
   System.out.println("El nombre de tarjeta es"+ banck.getBadge());
}
   
   public void amount(){
   Scanner enterAmount = new Scanner (System.in);
   banck_Account amounts = new banck_Account();
   

   System.out.println("Ingrese el monto");
   float amoun = enterAmount.nextFloat();
   amounts.setAmount(amoun);
   
   System.out.println("El monto ingresado fue"+ amounts.getAmount());
}
   
   public void accountNumber(){
   Scanner entry = new Scanner (System.in);
   banck_Account account = new banck_Account();
   
   System.out.println("----------------------------");
   System.out.println("Ingresar numero de cuenta");
   int number = entry.nextInt();
   account.setAccountNumber(number);
   
   System.out.println("----------------------------");
   System.out.println("El numero de cuenta ingresado fuee" + account.getAccountNumber());
   }
   
   s
   
}
