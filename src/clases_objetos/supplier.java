/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_objetos;

import java.util.Scanner;
import set_get.supplier_Set_Get;
import Protected.supplier_Protected;

/**
 *
 * @author Usuario
 */
public class supplier extends supplier_Protected {
   
   public String city;
   
   
   public void city(){
   Scanner entry = new Scanner (System.in);
   
   System.out.println("Ingrese la ciudad de recidencia");
   this.city = entry.nextLine();
       
   }
   
   
   public void setSupplierName(){
   Scanner entry = new Scanner (System.in);
   supplier_Set_Get supplier = new supplier_Set_Get();
   
   System.out.println("Ingrese el nombre del proveedor");
   String name = entry.nextLine();
   
   supplier.setSupplierName(name);
       
   }
   
   
   public void email(){
   Scanner entry = new Scanner (System.in);
   
   System.out.println("Ingrese el email del proveedor");
   email = entry.nextLine();
       
   }
   
   public void setPhone(){
   Scanner entry = new Scanner (System.in);
   supplier_Set_Get supplier = new supplier_Set_Get();
   
   System.out.println("Ingrese el telefono del proveedor");
   int phone = entry.nextInt();
   
   supplier.setPhone(phone);
       
   }
    
}
