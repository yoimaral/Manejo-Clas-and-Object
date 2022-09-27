
package clases_objetos;

import java.util.Scanner;
import set_get.Person; //Importo la clase para usar sus atributos y metodos


public class person extends Person {//Creo una extensión para implementar los atributos protegidos, privados y sus metodos.
    //Atributos
   public String name;
   public String lastName1;
   public String lastName2;
   protected String email;
   protected int cel;
   
   public void name(){
   Scanner nameLine = new Scanner (System.in);
   
   System.out.println("Ingrese su nombre");
   this.name = nameLine.nextLine();
   }
   
   public void lastName1(){
   Scanner lastName1Line = new Scanner (System.in);
   
   System.out.println("Ingrese su nombre");
   this.lastName1 = lastName1Line.nextLine();
   }
   
   public void lastName2(){
   Scanner lastName21Line = new Scanner (System.in);
   
   System.out.println("Ingrese su nombre");
   this.lastName2 = lastName21Line.nextLine();
   }
   
   private void enterDocument(){
   Scanner docuLine = new Scanner (System.in);
   Person Person = new Person();
   
   System.out.println("Ingrese su numero de Documento");
    int docu = docuLine.nextInt();
    Person.SetDocu(docu);
    
    System.out.println("Tu nombre es" + Person.GetDocument());
   }
   
   public void SetDocument(){
       person document = new person();
       document.enterDocument();
   }
   
   public void email(){
   Scanner emailLine = new Scanner (System.in);
   
   System.out.println("Ingrese su Email");
   email = emailLine.nextLine();
   }
   
   public void cel(){
   Scanner celLine = new Scanner (System.in);
   
   System.out.println("Ingrese su numero celular");
   cel = celLine.nextInt();
   }
   
}
