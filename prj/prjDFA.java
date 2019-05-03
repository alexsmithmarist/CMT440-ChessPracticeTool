/**
 * file: prjDFA.java
 * author: Alex Smith
 * course: CMPT 440
 * assignment: Project
 * due date: ???
 * version: 1.0
 * 
 * 
 */
 
public class prjDFA{
  int state = 0;
  int col = 0;
  boolean white = true;
  boolean invalid = false;
    
  /*COLUMN ORDER:
    e2,e4,g1,f3,f1,b5,f4,f2,c4
  */

  int[][] whiteDFA = new int[][]{
    {1,10,10,10,10,10,10,10,10},
    {10,2,10,10,10,10,10,10,10},
    {10,10,3,10,10,10,10,7,10},
    {10,10,10,4,10,10,10,10,10},
    {10,10,10,10,5,10,10,10,10},
    {10,10,10,10,10,6,10,10,9},
    {10,10,10,10,10,10,10,10,10},   //STATE 6: RUY LOPEZ
    {10,10,10,10,10,10,8,10,10},
    {10,10,10,10,10,10,10,10,10},   //STATE 8: KING's GAMBIT
    {10,10,10,10,10,10,10,10,10},   //STATE 9: ITALIAN GAME
    {10,10,10,10,10,10,10,10,10},   //STATE 10: ERROR
  };
    
  /*COLUMN ORDER
    d7,d5,c7,c6,g8,f6,g7,g6,e7,e6,f8,b4
  */
    
  int[][] blackDFA = new int[][]{
    {1,13,13,13,5,13,13,13,13,13,13,13},
    {13,2,13,13,13,13,13,13,13,13,13,13},
    {13,13,3,13,13,13,13,13,13,13,13,13},
    {13,13,13,4,13,13,13,13,13,13,13,13},
    {13,13,13,13,13,13,13,13,13,13,13,13},   //STATE 4: SLAV DEFENSE
    {13,13,13,13,13,6,13,13,13,13,13,13},
    {13,13,13,13,13,13,7,13,9,13,13,13},
    {13,13,13,13,13,13,13,8,13,13,13,13},
    {13,13,13,13,13,13,13,13,13,13,13,13},   //STATE 8: KING'S INDIAN DEFENSE
    {13,13,13,13,13,13,13,13,13,10,13,13},
    {13,13,13,13,13,13,13,13,13,13,11,13},
    {13,13,13,13,13,13,13,13,13,13,13,12},
    {13,13,13,13,13,13,13,13,13,13,13,13},   //STATE 12: BOGO-INDIAN DEFENSE
    {13,13,13,13,13,13,13,13,13,13,13,13},   //STATE 13: ERROR
  };
    
  public prjDFA(){}
    
  public int transitionW(String input){
    if(input.equals("e2")){
      col = 0;
    }
    else if(input.equals("e4")){
      col = 1;
    }
    else if(input.equals("g1")){
      col = 2;
    }
    else if(input.equals("f3")){
      col = 3;
    }
    else if(input.equals("f1")){
      col = 4;
    }
    else if(input.equals("b5")){
      col = 5;
    }
    else if(input.equals("f4")){
      col = 6;
    }
    else if(input.equals("f2")){
      col = 7;
    }
    else if(input.equals("c4")){
      col = 8;
    }
    else{
      invalid = true;
    }
      
    if(!invalid){
      state = whiteDFA[state][col];
    }
    else{
      state = 10;
    }
      
    return state;
  }
    
  public int acceptW(){
    if(state == 6){
      return 1; //RUY LOPEZ
    }
    else if(state == 8){
      return 2; //KING's GAMBIT
    }
    else if(state == 9){
      return 3; //ITALIAN GAME
    }
    else{
      return 0;
    }
  }
    
  public int transitionB(String input){
    if(input.equals("d7")){
      col = 0;
    }
    else if(input.equals("d5")){
      col = 1;
    }
    else if(input.equals("c7")){
      col = 2;
    }
    else if(input.equals("c6")){
      col = 3;
    }
    else if(input.equals("g8")){
      col = 4;
    }
    else if(input.equals("f6")){
      col = 5;
    }
    else if(input.equals("g7")){
      col = 6;
    }
    else if(input.equals("g6")){
      col = 7;
    }
    else if(input.equals("e7")){
      col = 8;
    }
    else if(input.equals("e6")){
      col = 9;
    }
    else if(input.equals("f8")){
      col = 10;
    }
    else if(input.equals("b4")){
      col = 11;
    }
    else{
      invalid = true;
    }
      
    if(!invalid){
      state = blackDFA[state][col];
    }
    else{
      state = 13;
    }
      
    return state;
  }
    
  public int acceptB(){
    if(state == 4){
      return 1; //SLAV DEFENSE
    }
    else if(state == 8){
      return 2; //KING'S INDIAN
    }
    else if(state == 12){
      return 3; //BOGO INDIAN
    }
    else{
      return 0;
    }
  }
}