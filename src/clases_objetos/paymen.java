/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_objetos;

/**
 *
 * @author Usuario
 */
public class paymen {
    
   public char reference;
   public char description;
   private char currency;
   private float total;
   
   public void currency(char currency){
   this.currency = currency;
   }
   
   public float total(float total){
   this.total = total;
       return total;
   }
   
}
