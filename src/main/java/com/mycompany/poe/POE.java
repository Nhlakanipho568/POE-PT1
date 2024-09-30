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

    public static void main(String[] args) {
        
    
        //object of scanner
        Scanner ss= new Scanner (System.in);
     String username;
     String password;
     String firstName;
     String lastName;
        System.out.println("please enter username");
        username = ss.next();
        System.out.println("please enter password");
        password = ss.next();
        System.out.println("please enter firstName");
        firstName = ss.next();
        System.out.println("please enter lastName");
        lastName = ss.next();
        
         
           
        
        
        
        System.out.println("Name :" + username + "\nPassword :" + password + "\nName :" + firstName + "\nName" + lastName);
        
        }
       
}
