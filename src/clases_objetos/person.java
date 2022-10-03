
package clases_objetos;

//Importo las clases para usar sus atributos y metodos
import java.util.Scanner;
import set_get.person_Set_Get; 
import Protected.person_Protected;

// 
public class person extends person_Protected {
   
   public String name;
   public String lastName1;
   public String lastName2;
    
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
   
   /**
    *  Se crea un metodo privado en donde se envia los datos encapsulados
    */
   private void enterDocument(){
   Scanner docuLine = new Scanner (System.in);
   person_Set_Get Person = new person_Set_Get();
   
   System.out.println("Ingrese su numero de Documento");
    int docu = docuLine.nextInt();
    Person.SetDocu(docu);
    
    System.out.println("Tu nombre es" + Person.GetDocument());
   }
   
   /**
    * Se ejecuta el metodo playDocument para ejecutar el metodoprivado de enterDocument
    */
   public void playDocument(){
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
