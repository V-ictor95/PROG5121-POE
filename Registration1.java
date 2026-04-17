
package com.mycompany.registration1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration1 {

    public static void main(String[] args) { 
        Scanner myInput = new Scanner(System.in);
        
        System.out.println("name");
        String name = myInput.nextLine();
        
        System.out.println("last name ");
        String last = myInput.nextLine();
        // prinrt ou the username
        System.out.println("Enter your Username: ");
        String Username = myInput.nextLine();
        
        if(Username != null && Username.contains("_") && Username.length() <=5)
        {
            System.out.println("""
                               Username 
                               successfully 
                               captured.\u201d""");
        } else {
            System.out.println("""
                               Username is not 
                               correctly formatted; 
                               please ensure that 
                               your username 
                               contains an 
                               underscore and is no 
                               more than five 
                               characters in length""");
        }
        // intering a password for that the user can assess
        System.out.println("Enter your Password: ");
        String password = myInput.nextLine();
        
        if(password != null && password.length() >=8 && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*") && password.matches(".*[!@#$].*"))
        {
            System.out.println("""
                               Password 
                               successfully 
                               captured. """); 
        }
        else {
            System.out.println("""
                               \u201cPassword is not 
                               correctly formatted; 
                               please ensure that 
                               the password 
                               contains at least eight 
                               characters, a capital 
                               letter, a number, and 
                               a special character.\u201d """);
        }
        // this is the user cell number but must have international code
        System.out.println("Enter your number: ");
        String number = myInput.nextLine();
        
        String n = "^\\+\\d{1,3}\\d{1,10}$";
        Pattern pattern = Pattern.compile(n);
        Matcher matcher = pattern.matcher(number);
        
        if(number != null && matcher.matches() && number.length() == 12 )
        {
            System.out.println("""
                               Cell phone number 
                               successfully added.\u201d """);
        } else {
            System.out.println("""
                               Cell phone number 
                               incorrectly formatted 
                               or does not contain 
                               international code.\u201d""");
        }
        
        if (Username != null && Username.contains("_") && Username.length() <= 5 &&
            password != null && password.length() >= 8 &&
            password.matches(".*[A-Z].*") &&
            password.matches(".*[0-9].*") &&
            password.matches(".*[!@#$%].*") &&
            number != null && number.matches("^\\+\\d{1,3}[ -]?\\d{10}$")){
            
            System.out.println("""
                               Welcome 
                               it is great to 
                               see you again. """ + name + ", " + last + " it is great.");
        } else {
            System.out.println("""
                               Username or 
                               password incorrect, 
                               please try again.\u201d""");
    }
    }
}
