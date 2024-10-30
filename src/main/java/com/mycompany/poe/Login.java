/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
class Login {
      
private String userName;
private String  password;
private String firstName;
private String lastName;

//method to check the username
public boolean checkUsername (String username){
    //check if the user name meets the conditions
    return username.contains("_") && username.length()<=5;
    
}
//method to check password
public boolean checkPasswordComplexity (String password){
//check if the password is complex
return password.length()>=8 && password.matches(".*[A-Z].*") &&password.matches(".*[a-z]*.") &&password.matches(".*[!@#$%^&*().]*");
}
//method to register the user
public String registerUser(String userName, String password, String firstName, String lastName){
        if (!checkUsername(userName)){ 
            return "The username is incorrectly formatted.";
        }
        
           if (!checkPasswordComplexity(password)){
        return "The password does not meet the complexity requirements."; 
        }
           
           this.userName = userName;
           this.password = password;
           this.firstName = firstName;
           this.lastName = lastName;
           return "The two above conditions have been met and the user has been registered successfully";
}
//method to verify the login details
public boolean loginUser(String username, String password){
    return username.equals(this.userName) && password.equals(this.password);
    
}

public String returnLoginStatus(boolean succesfulLogin){
    if (succesfulLogin){
        return "Welcome "+ this.firstName +" "+ this.lastName+",it's great to see you again.";
    }
    else{
        return "Username or password incorrect, try again";
    }
}
 
}
