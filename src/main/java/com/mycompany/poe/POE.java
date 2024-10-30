/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe;
import javax.swing. JDialog;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Nhlakanipho
 */

public class POE {

    public static void main(String[] args) {
        //Pass the external class 
        Login log= new Login();
        Task task=new Task();
    
        //declarations 
     String userName;
     String password;
     String firstName;
     String lastName;
     
     //create an object of the scanner
     Scanner input = new Scanner (System.in);
     JDialog dialog = new JDialog();
     dialog.setAlwaysOnTop(true);
     
     //prompt the user to enter the Username/Password/Firstname/Lastname
        System.out.println("please enter userName");
        userName = input.next();
        
        System.out.println("please enter password");
        password = input.next();
        
        System.out.println("please enter firstName");
        firstName = input.next();
        
        System.out.println("please enter lastName");
        lastName = input.next();
        
         
         //register the user 
         String registration=log.registerUser(userName,password,firstName,lastName);
         System.out.println("Registration" +registration);
         
         //register the user
         
                 
        System.out.println("Enter username to login");
        userName = input.next();
        System.out.println("Enter password to login");
       password = input.next();
       
       //display login status
       boolean loginSuccessful = log.loginUser(userName, password);
       String loginMessage = log.returnLoginStatus(loginSuccessful);
        System.out.println(loginMessage);
        
        //IF statements 
    if(loginSuccessful){
    JOptionPane.showMessageDialog(dialog, "Welcome to EasyKanban");
    while(loginSuccessful){
    int choice = Integer.parseInt(JOptionPane.showInputDialog("""
                                                              Enter choice: 
                                                            1. Add Tasks
                                                            2. Show report
                                                            3. Quit"""));
            
    switch (choice) {
    case 1:
    //promt user to enter tasks
    task.addTask();
    break;
    case 2:
    // if the user selects option 2
    JOptionPane.showMessageDialog(null, "coming soon");
    break;
    case 3:
    //If the user selects option 3   
    System.exit(0);
    JOptionPane.showMessageDialog(null,"Exiting EasyKanban");
    default:
    break;
    }
    input.close();
    dialog.dispose();
    }
       }
    }
}
        
        
        
       

