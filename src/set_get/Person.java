
package set_get;

public class Person {
    

   private int document;
   
   
   
   //Implemento el metodo de encapsulamiento. Establesco el valor del nombre
   public void SetDocu(int document){
   this.document = document;
   }
   
   //Implemento el metodo de encapsulamiento. Se retorna la edad para mostrarla
   public int GetDocument(){
   return document;
   }
   
   
   
}
