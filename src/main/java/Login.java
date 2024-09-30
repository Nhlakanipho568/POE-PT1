/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class Login {
       
    private String username;
    private String password;
    private String firstName;
    private String lastName;

    // Constructor
    public Login(String username, String password, String firstName, String lastName) {
  
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Method to check if the username is valid
    public boolean checkUserName() {
        return username.contains("_") && username.length() <= 5;
    }

    // Method to check if the password is valid
    public boolean checkPasswordComplexity() {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[0-9].*") &&
               password.matches(".*[!@#$%^&*()].*");
    }

    // Register user with success or failure messages
    public String registerUser() {
        if (!checkUserName()) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
        }
        if (!checkPasswordComplexity()) {
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.";
        }
        return "User successfully registered.";
    }

    // Method to verify login
    public boolean loginUser(String inputUsername, String inputPassword) {
        return inputUsername.equals(this.username) && inputPassword.equals(this.password);
    }

    // Method to return login status message
    public String returnLoginStatus(String inputUsername, String inputPassword) {
        if (loginUser(inputUsername, inputPassword)) {
            return "Welcome " + firstName + " " + lastName + ", it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
    
    

}

       
       
