/**
 * file: driverDFA.java
 * author: Alex Smith
 * course: CMPT 440
 * assignment: Homework 1
 * due date: March 12, 2019
 * version: 1.0
 * 
 * This class implements a driver for the ManWolf
 * class.
 */

import java.util.Scanner;

  /**
   * driverDFA
   * 
   * This class implements a driver for the ManWolf
   * class. It takes a string input and calls the
   * methods of the ManWolf class. It then prints
   * if the given string is a valid solution.
  */

public class driverDFA{
  public static void main(String[] args){
      
    Scanner standard = new Scanner(System.in);
    String line = standard.nextLine();
    char next = ' ';
    ManWolf dfa = new ManWolf();
      
    for(int i = 0; i != line.length(); i++){
      next = line.charAt(i);
      dfa.transition(next);
    }
      
    if(dfa.accept()){
      System.out.println("This is a solution.");
    }
    else{
      System.out.println("This is not a solution.");
    }   
  }
    
    
    
    
    
}