/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package madlibs;

import java.util.Scanner;

/**
 *
 * @author kaltman
 */
public class Madlibs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       
      
       String noun1;
       String noun2;
       String personsName;
       String numberOne;
       String numberTwo;
       String secondPerson;
       String verb1;
       
       
       
       System.out.println("What is your name?");
       personsName = sc.nextLine();
       
       System.out.println("Hi " + personsName + "!" );
     
       System.out.println("Please enter a person's name.");
       secondPerson = sc.nextLine();
       
       System.out.println("Please give me a noun.");
       noun1 = sc.nextLine();
       
       System.out.println("Please give me a verb.");
       verb1 = sc.nextLine();
       
       System.out.println("Please give me another noun.");
       noun2 = sc.nextLine();
       
       
       
       
       
  
    
    }
    
}
