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
       String personsName;
       String numberOne;
       String numberTwo;
       String secondPerson;
       String verb1;
       String adjective1;
       int integer1;
       int integer2;
       double double1;
       double double2;
       
       
       
       System.out.println("What is your name?");
       personsName = sc.nextLine();
       
       System.out.println("Hi " + personsName + "!" );
     
       System.out.println("Please enter a person's name.");
       secondPerson = sc.nextLine();
       
       System.out.println("Please give me the name of an animal.");
       noun1 = sc.nextLine();
       
       System.out.println("Please give me a verb.");
       verb1 = sc.nextLine();
       
       System.out.println("Please give me an adjective.");
       adjective1 = sc.nextLine();
       
       System.out.println("Please insert an integer.");
       integer1 = sc.nextInt();
      
       System.out.println("Please enter a number with a decimal");
       double1 = sc.nextDouble();
       
       System.out.println("Please enter another integer.");
       integer2 = sc.nextInt();
      
       System.out.println("Please insert another number with a decimal.");
       double2 = sc.nextDouble();
               
       double result1 = double1 + double2;
       
       int result2 = integer1 * integer2;
       
        System.out.println("One day " + personsName + " was " + verb1 + 
                " through town. He was on a " + verb1 + " with his "
        + noun1 + ", when he came across " + secondPerson + ". They begin to ask " 
        + personsName + " many questions such as, what is " + double1 + " + " + double2 + 
                " the answer is " + result1 + ". correct, how about another one. What is " 
        + integer1 + " X " + integer2 + " " + result2 + " . Correct again. after that " + personsName +
                " continued to " + verb1 + " through the" + adjective1 + "town.");
       
       
       
       
       
    
    }
    
}
