/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe;
import java.util.Scanner;
/**
 *
 * @author RC_Nhlakanipho
 */

public class POE {

    
        
    
       public class LoginSystem {
    public static void main(String[] args) {
        printLoginMessage();
        //object of scanner
       
    }

    public static void printLoginMessage()
    {   
   Scanner ss= new Scanner (System.in);
      String username;
    String password;
     String firstName;
     String lastName;
//prompt user for details
        System.out.println("Welcome to the login system!");
        System.out.print("Enter your username: ");
        username = ss.next();
        System.out.print("Enter your password: ");
        password= ss.next();
        System.out.println("Enter your firstName");
         firstName= ss.next();
        System.out.println("Enter lastName");
        lastName= ss.next();
       
    }
}
        
         
        
      
   
        
    }

  
           
        
        
        
      

