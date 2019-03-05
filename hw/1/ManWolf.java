/**
 * file: ManWolf.java
 * author: Alex Smith
 * course: CMPT 440
 * assignment: Homework 1
 * due date: March 12, 2019
 * version: 1.0
 * 
 * This class creates the dfa for the famous
 * Man, Wolf Goat, and Cabbage problem.
 */

/**
 * ManWolf
 * 
 * This class creates the dfa for the famous
 * Man, Wolf Goat, and Cabbage problem. It is
 * implemented using a table approach. In 
 * addition to the DFA, there are methods for 
 * transitioning between states and if a state
 * is an accepting state.
 */

public class ManWolf{
  
  String input = " ";
  int state = 0;
  int col = 0;
  boolean invalid = false;
    
  int[][] dfa = new int[][]{
    {1,2,1,1},
    {1,1,1,1},
    {1,0,1,3},
    {4,1,6,2},
    {3,5,1,1},  
    {1,4,8,1},
    {1,7,3,1},
    {8,6,1,1},
    {7,1,5,9},
    {1,10,1,8},
    {1,9,1,1}, 
  };
  //  column order: w, g, c, n
  // error state is 1
  
  public ManWolf(){}
    
  /**
   * transition
   *
   * This function controls the state transition for the
   * ManWolf DFA. It determines what the input is (wolf,
   * goat, cabbage, or nothing represented by their first
   * letter) and if it is valid. If it is valid, it changes
   * the state by going to the respective row and column of 
   * the DFA table.
   * 
   * Parameters:
   *   input: the next character in the input string
   * 
   * Return value: There is no return value.
   */
    
  public void transition (char input){
      
    if(input == 'w'){
      col = 0;
    }
    else if(input == 'g'){
      col = 1;
    }
    else if(input == 'c'){
      col = 2;
    }
    else if(input == 'n'){
      col = 3;
    }
    else{
      invalid = true;
    }
      
    if(!invalid){
      state = dfa[state][col];
    }
    else{
      state = 1;
    }
  }
    
  /**
   * accept
   *
   * This function checks if the given state is an 
   * accepting state. There is only one accepting state
   * for this problem (state 10) so it compares the value
   * of the state variable to that.
   * 
   * Parameters:
   *   There are no input parameters
   * 
   * Return value: 
   *   boolean: Returns true if accepting, false if not accepting.
   */
    
  public boolean accept (){
    if(state == 10){
      return true;
    }
    else{
      return false;
    }
  }
  
}