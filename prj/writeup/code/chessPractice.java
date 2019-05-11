import java.util.Scanner;

public class chessPractice{
  
  public static void main(String[] args){
    int programState = 0;
    boolean quit = false;
    Scanner input = new Scanner(System.in);
      
    System.out.println("Welcome to Chess Opening Practice! Please type a command to get started.");
    System.out.println("For a list of commands type 'help'");
    System.out.println();
      
    while(input.hasNext() && !quit){
        
      //Main Menu
      if(programState == 0){
        String line = input.nextLine();
        
        if(line.equals("help")){
          System.out.println("The valid  commands are: ");
          System.out.println("'practice' : practice chess openings! Once in practice mode, you can select the opening you want to practice");
          System.out.println("'quit' : Stop using Chess Opening Practice.");
          System.out.println("'menu' : Return to the main menu.");
          System.out.println();
        }
        
        else if(line.equals("quit")){
          quit = true;
        }
      
        else if(line.equals("practice")){
          System.out.println("Select the side you would like to practice.");
          System.out.println("Type 'w' for White and 'b' for Black.");
          System.out.println();
          
          programState = 1;
        }
        
        else{
          System.out.println("Please type a valid command. Type 'help' for a list of all commands");
          System.out.println();
        }
      }
        
      //Selecting an opening
      else if(programState == 1){
        String line = input.nextLine();
        if(line.charAt(0) == 'w'){
          System.out.println("You have selected White. Please select an opening.");
          System.out.println("Type '1' for Ruy Lopez, '2' for King's Gambit, or '3' for Italian Game.");
          System.out.println();
            
          programState = 2;
        }
        else if(line.charAt(0) == 'b'){
          System.out.println("You have selected Black. Please select an opening.");
          System.out.println("Type '1' for Slav Defense, '2' for King's Indian, or '3' for Bogo Indian.");
          System.out.println();
            
          programState = 3;
        }
        else if(line.equals("quit")){
          quit = true;
        }
        else if(line.equals("menu")){
          System.out.println("Welcome to Chess Opening Practice! Please type a command to get started.");
          System.out.println("For a list of commands type 'help'");
          System.out.println();
            
          programState = 0;
        }
          
        else if(line.equals("help")){
          System.out.println("The valid  commands are: ");
          System.out.println("'quit' : Stop using Chess Opening Practice.");
          System.out.println("'menu' : Return to the main menu.");
          System.out.println();
        }
        else{
          System.out.println("Please select a valid side. Type 'w' for White and 'b' for Black.");
          System.out.println();
        }
      }
        
      //White openings
      else if(programState == 2){
        String line = input.nextLine();
        if(line.charAt(0) == '1'){
          System.out.println("You have selected the Ruy Lopez opening. Please type the required moves to complete the opening.");
          System.out.println("To make a move, type the starting position, followed by a space, then the ending position of a piece.");
          System.out.println("For example, to move the pawn from b2 to b4, type : b2 b4 ");
          System.out.println("Enter all of the moves at once. When you are finished, type 'end'");
          System.out.println();
            
          programState = 4;
        }
          
        else if(line.charAt(0) == '2'){
          System.out.println("You have selected the King's Gambit opening. Please type the required moves to complete the opening.");
          System.out.println("To make a move, type the starting position, followed by a space, then the ending position of a piece.");
          System.out.println("For example, to move the pawn from b2 to b4, type : b2 b4 ");
          System.out.println("Enter all of the moves at once. When you are finished, type 'end'");
          System.out.println();
            
          programState = 5;
        }
        
        else if(line.charAt(0) == '3'){
          System.out.println("You have selected the Italian Game opening. Please type the required moves to complete the opening.");
          System.out.println("To make a move, type the starting position, followed by a space, then the ending position of a piece.");
          System.out.println("For example, to move the pawn from b2 to b4, type : b2 b4 ");
          System.out.println("Enter all of the moves at once. When you are finished, type 'end'");
          System.out.println();
            
          programState = 6;
        }
          
        else if(line.equals("quit")){
          quit = true;
        }
        else if(line.equals("menu")){
          System.out.println("Welcome to Chess Opening Practice! Please type a command to get started.");
          System.out.println("For a list of commands type 'help'");
          System.out.println();
            
          programState = 0;
        }
        else if(line.equals("reselect")){
          System.out.println("Select the side you would like to practice.");
          System.out.println("Type 'w' for White and 'b' for Black.");
          System.out.println();
          
          programState = 1;
        }
        else if(line.equals("help")){
          System.out.println("The valid  commands are: ");
          System.out.println("'quit' : Stop using Chess Opening Practice.");
          System.out.println("'menu' : Return to the main menu.");
          System.out.println("'reselect' : Reselect which side you would like to practice.");
          System.out.println();
        }
      }
      
      //Black openings
      else if(programState == 3){
        String line = input.nextLine();
        if(line.charAt(0) == '1'){
          System.out.println("You have selected the Slav Defense opening. Please type the required moves to complete the opening.");
          System.out.println("To make a move, type the starting position, followed by a space, then the ending position of a piece.");
          System.out.println("For example, to move the pawn from b2 to b4, type : b2 b4 ");
          System.out.println("Enter all of the moves at once. When you are finished, type 'end'");
          System.out.println();
            
          programState = 7;
        }
          
        else if(line.charAt(0) == '2'){
          System.out.println("You have selected the King's Indian opening. Please type the required moves to complete the opening.");
          System.out.println("To make a move, type the starting position, followed by a space, then the ending position of a piece.");
          System.out.println("For example, to move the pawn from b2 to b4, type : b2 b4 ");
          System.out.println("Enter all of the moves at once. When you are finished, type 'end'");
          System.out.println();
            
          programState = 8;
        }
        
        else if(line.charAt(0) == '3'){
          System.out.println("You have selected the Bogo Indian opening. Please type the required moves to complete the opening.");
          System.out.println("To make a move, type the starting position, followed by a space, then the ending position of a piece.");
          System.out.println("For example, to move the pawn from b2 to b4, type : b2 b4 ");
          System.out.println("Enter all of the moves at once. When you are finished, type 'end'");
          System.out.println();
            
          programState = 9;
        }
        else if(line.equals("quit")){
          quit = true;
        }
        else if(line.equals("menu")){
          System.out.println("Welcome to Chess Opening Practice! Please type a command to get started.");
          System.out.println("For a list of commands type 'help'");
          System.out.println();
            
          programState = 0;
        }
        else if(line.equals("reselect")){
          System.out.println("Select the side you would like to practice.");
          System.out.println("Type 'w' for White and 'b' for Black.");
          System.out.println();
          
          programState = 1;
        }
        else if(line.equals("help")){
          System.out.println("The valid  commands are: ");
          System.out.println("'quit' : Stop using Chess Opening Practice.");
          System.out.println("'menu' : Return to the main menu.");
          System.out.println("'reselect' : Reselect which side you would like to practice.");
          System.out.println();
        }
      }
        
      //Ruy Lopez
      else if(programState == 4){
        prjDFA checker = new prjDFA();
        String line = input.nextLine();
        String sub = line.substring(0, line.length());
        int space =0;
        int good = 0;
        String move = " ";
        boolean end = false;
        int current = 0;
          
        if(line.equals("quit")){
          quit = true;
        }
        else if(line.equals("menu")){
          System.out.println("Welcome to Chess Opening Practice! Please type a command to get started.");
          System.out.println("For a list of commands type 'help'");
          System.out.println();
            
          programState = 0;
        }
        else if(line.equals("reselect")){
          System.out.println("You have selected White. Please select an opening.");
          System.out.println("Type '1' for Ruy Lopez, '2' for King's Gambit, or '3' for Italian Game.");
          System.out.println();
            
          programState = 2;
        }
        else if(line.equals("help")){
          System.out.println("The valid  commands are: ");
          System.out.println("'quit' : Stop using Chess Opening Practice.");
          System.out.println("'menu' : Return to the main menu.");
          System.out.println("'reselect' : Choose another black opening");
          System.out.println();
        }
          
        else{
          while(!end){
            space = sub.indexOf(' ');
            if(space != -1){
              move = sub.substring(0, space);
            }
            else{
              move = sub;
            }
            //System.out.println(move);
            if(move.equals("end")){
              end = true;
            }
            
            else{
              current = checker.transitionW(move);
              sub = sub.substring(space+1, sub.length());
           }
              
            if(current == 10){
              //System.out.println("Invalid input detected, please make a proper move.");
              end = true;
            }
            else{
              good = current;
            }
          }
          
          if(checker.acceptW() == 1){
            System.out.println("You have completed the Ruy Lopez opening successfully!");
          }
          else{
            System.out.println("You not have successfully completed the Ruy Lopez opening.");
            System.out.println();
          }
            
          if(good == 1){
            System.out.println("Last Good Move: expecting to finish moving Pawn on e2 to e4.");
          }
          else if(good == 2 || good == 8 || good == 7){
            System.out.println("Last Good Move: expecting to move Knight at g1 after moving Pawn from e2 to e4.");
          }
          else if(good == 3){
            System.out.println("Last Good Move: expecting to finish moving Knight from g1 to f3.");
          }
          else if(good == 4){
            System.out.println("Last Good Move: expecting to move Bishop at f1 after moving Knight from g1 to f3.");
          }
          else if(good == 5 || good == 9){
            System.out.println("Last Good Move: expecting to finish moving Bishop from f1 to b5");
          }
          else if(good == 6 && current == 13){
            System.out.println("Last Good Move: expecting to stop moving after moving Bishop from f1 to b5.");
          }
          
          System.out.println();
          System.out.println("Select the side you would like to practice.");
          System.out.println("Type 'w' for White and 'b' for Black.");
          
          programState = 1;
        }
      }
        
      //King's Gambit
      else if(programState == 5){
        prjDFA checker = new prjDFA();
        String line = input.nextLine();
        String sub = line.substring(0, line.length());
        int space =0;
        int good = 0;
        String move = " ";
        boolean end = false;
        int current = 0;
          
        if(line.equals("quit")){
          quit = true;
        }
        else if(line.equals("menu")){
          System.out.println("Welcome to Chess Opening Practice! Please type a command to get started.");
          System.out.println("For a list of commands type 'help'");
          System.out.println();
            
          programState = 0;
        }
        else if(line.equals("reselect")){
          System.out.println("You have selected White. Please select an opening.");
          System.out.println("Type '1' for Ruy Lopez, '2' for King's Gambit, or '3' for Italian Game.");
          System.out.println();
            
          programState = 2;
        }
        else if(line.equals("help")){
          System.out.println("The valid  commands are: ");
          System.out.println("'quit' : Stop using Chess Opening Practice.");
          System.out.println("'menu' : Return to the main menu.");
          System.out.println("'reselect' : Choose another black opening");
          System.out.println();
        }
        else{
          while(!end){
            space = sub.indexOf(' ');
            if(space != -1){
              move = sub.substring(0, space);
            }
            else{
              move = sub;
            }
            //System.out.println(move);
            if(move.equals("end")){
              end = true;
            }
            
            else{
              current = checker.transitionW(move);
              sub = sub.substring(space+1, sub.length());
           }
              
            if(current == 10){
              System.out.println("Invalid input detected, please make a proper move.");
              end = true;
            }
            else{
              good = current;
            }
          }
          
          if(checker.acceptW() == 2){
            System.out.println("You have completed the King's Gambit opening successfully!");
          }
          else{
            System.out.println("You not have successfully completed the King's Gambit opening.");
          }
            
          if(good == 1){
            System.out.println("Last Good Move: expecting to finish moving Pawn from e2 to e4.");
          }
          else if(good == 2 || good == 3 || good == 4 || good == 5 || good == 6 || good == 9){
            System.out.println("Last Good Move: expecting to move Pawn on f2 after moving Pawn from e2 to e4.");
          }
          else if(good == 7){
            System.out.println("Last Good Move: expecting to finish moving Pawn from f2 to f4.");
          }
          else if(good == 8 && current == 13){
            System.out.println("Last Good Move: expecting to stop moving after moving Pawn from f2 to f4.");
          }
            
          System.out.println();
          System.out.println("Select the side you would like to practice.");
          System.out.println("Type 'w' for White and 'b' for Black.");
          
          programState = 1;
        }
      }
        
      //Italian Game
      else if(programState == 6){
        prjDFA checker = new prjDFA();
        String line = input.nextLine();
        String sub = line.substring(0, line.length());
        int space =0;
        int good = 0;
        String move = " ";
        boolean end = false;
        int current = 0;
          
        if(line.equals("quit")){
          quit = true;
        }
        else if(line.equals("menu")){
          System.out.println("Welcome to Chess Opening Practice! Please type a command to get started.");
          System.out.println("For a list of commands type 'help'");
          System.out.println();
            
          programState = 0;
        }
        else if(line.equals("reselect")){
          System.out.println("You have selected White. Please select an opening.");
          System.out.println("Type '1' for Ruy Lopez, '2' for King's Gambit, or '3' for Italian Game.");
          System.out.println();
            
          programState = 2;
        }
        else if(line.equals("help")){
          System.out.println("The valid  commands are: ");
          System.out.println("'quit' : Stop using Chess Opening Practice.");
          System.out.println("'menu' : Return to the main menu.");
          System.out.println("'reselect' : Choose another black opening");
          System.out.println();
        }
        else{
          while(!end){
            space = sub.indexOf(' ');
            if(space != -1){
              move = sub.substring(0, space);
            }
            else{
              move = sub;
            }
            //System.out.println(move);
            if(move.equals("end")){
              end = true;
            }
            
            else{
              current = checker.transitionW(move);
              sub = sub.substring(space+1, sub.length());
            }
            
            if(current == 10){
              System.out.println("Invalid input detected, please make a proper move.");
              end = true;
            }
            else{
              good = current;
            }
          }
          
          if(checker.acceptW() == 3){
            System.out.println("You have completed the Italian Game opening successfully!");
          }
          else{
            System.out.println("You not have successfully completed the Italian Game opening.");
          }
            
          if(good == 1){
            System.out.println("Last Good Move: expecting to finish moving Pawn on e2 to e4.");
          }
          else if(good == 2 || good == 8 || good == 7){
            System.out.println("Last Good Move: expecting to move Knight at g1 after moving Pawn from e2 to e4.");
          }
          else if(good == 3){
            System.out.println("Last Good Move: expecting to finish moving Knight from g1 to f3.");
          }
          else if(good == 4){
            System.out.println("Last Good Move: expecting to move Bishop at f1 after moving Knight from g1 to f3.");
          }
          else if(good == 5 || good == 6){
            System.out.println("Last Good Move: expecting to finish moving Bishop from f1 to c4");
          }
          else if(good == 9 && current == 13){
            System.out.println("Last Good Move: expecting to stop moving after moving Bishop from f1 to c4");
          }
          
          System.out.println();
          System.out.println("Select the side you would like to practice.");
          System.out.println("Type 'w' for White and 'b' for Black.");
          
          programState = 1;
        }
      }
        
      //Slav Defense
      else if(programState == 7){
        prjDFA checker = new prjDFA();
        String line = input.nextLine();
        String sub = line.substring(0, line.length());
        int space =0;
        int good = 0;
        String move = " ";
        boolean end = false;
        int current = 0;
        
        if(line.equals("quit")){
          quit = true;
        }
        else if(line.equals("menu")){
          System.out.println("Welcome to Chess Opening Practice! Please type a command to get started.");
          System.out.println("For a list of commands type 'help'");
          System.out.println();
            
          programState = 0;
        }
        else if(line.equals("reselect")){
          System.out.println("You have selected Black. Please select an opening.");
          System.out.println("Type '1' for Slav Defense, '2' for King's Indian, or '3' for Bogo Indian.");
          System.out.println();
            
          programState = 3;
        }
        else if(line.equals("help")){
          System.out.println("The valid  commands are: ");
          System.out.println("'quit' : Stop using Chess Opening Practice.");
          System.out.println("'menu' : Return to the main menu.");
          System.out.println("'reselect' : Choose another black opening");
          System.out.println();
        }
        else{
          while(!end){
            space = sub.indexOf(' ');
            if(space != -1){
              move = sub.substring(0, space);
            }
            else{
              move = sub;
            }
            //System.out.println(move);
            if(move.equals("end")){
              end = true;
            }
            
            else{
              current = checker.transitionB(move);
              sub = sub.substring(space+1, sub.length());
            }
              
            if(current == 13){
              //System.out.println("Invalid input detected, please make a proper move.");
              end = true;
            }
            else{
              good = current;
            }
          }
          
          if(checker.acceptB() == 1){
            System.out.println("You have completed the Slav Defense opening successfully!");
          }
          else{
            System.out.println("You not have successfully completed the Slav Defense opening.");
          }
            
          if(good == 1){
            System.out.println("Last Good Move: expecting to finish moving Pawn from d7 to d5.");
          }
          else if(good == 0 || good == 5 || good == 6 || good == 7 || good == 8 || good == 9 || good == 10 || good == 11 || good == 12){
            System.out.println("Last Good Move: expecting to start by moving Pawn on d7.");
          }
          else if(good == 2){
            System.out.println("Last Good Move: expecting to move Pawn on c7 after moving Pawn from d7 to d5.");
          }
          else if(good == 3){
            System.out.println("Last Good Move: expecting to finish moving Pawn from c7 to c6.");
          }
          else if(good == 4 && current == 13){
            System.out.println("Last Good Move: expecting to stop moving after moving Pawn from c7 to c6.");
          }
          
          System.out.println();
          System.out.println("Select the side you would like to practice.");
          System.out.println("Type 'w' for White and 'b' for Black.");
          
          programState = 1;
        }
      }
        
      //King's Indian
      else if(programState == 8){
        prjDFA checker = new prjDFA();
        String line = input.nextLine();
        String sub = line.substring(0, line.length());
        int space =0;
        int good = 0;
        String move = " ";
        boolean end = false;
        int current = 0;
          
        if(line.equals("quit")){
          quit = true;
        }
        else if(line.equals("menu")){
          System.out.println("Welcome to Chess Opening Practice! Please type a command to get started.");
          System.out.println("For a list of commands type 'help'");
          System.out.println();
            
          programState = 0;
        }
        else if(line.equals("reselect")){
          System.out.println("You have selected Black. Please select an opening.");
          System.out.println("Type '1' for Slav Defense, '2' for King's Indian, or '3' for Bogo Indian.");
          System.out.println();
            
          programState = 3;
        }
        else if(line.equals("help")){
          System.out.println("The valid  commands are: ");
          System.out.println("'quit' : Stop using Chess Opening Practice.");
          System.out.println("'menu' : Return to the main menu.");
          System.out.println("'reselect' : Choose another black opening");
          System.out.println();
        }
        else{
          while(!end){
            space = sub.indexOf(' ');
            if(space != -1){
              move = sub.substring(0, space);
            }
            else{
              move = sub;
            }
            //System.out.println(move);
            if(move.equals("end")){
              end = true;
            }
            
            else{
              current = checker.transitionB(move);
              sub = sub.substring(space+1, sub.length());
            }
            if(current == 13){
              System.out.println("Invalid input detected, please make a proper move.");
              end = true;
            }
            else{
              good = current;
            }
          }
          
          if(checker.acceptB() == 2){
            System.out.println("You have completed the King's Indian opening successfully!");
          }
          else{
            System.out.println("You not have successfully completed the King's Indian opening.");
          }
            
          if(good == 1 || good == 2 || good == 3 || good == 4){
            System.out.println("Last Good Move: expecting to start by moving Knight on g8.");
          }
          else if(good == 5){
            System.out.println("Last Good Move: expecting to finish moving Knight from g8 to f6.");
          }
          else if(good == 6 || good == 9 || good == 10 || good == 11 || good == 12){
            System.out.println("Last Good Move: expecting to move Pawn on g7 after moving Knight from g8 to f6.");
          }
          else if(good == 7){
            System.out.println("Last Good Move: expecting to finish moving Pawn from g7 to g6.");
          }
          else if(good == 8 && current == 13){
            System.out.println("Last Good Move: expecting to stop moving after moving Pawn from g7 to g6.");
          }
            
          System.out.println();
          System.out.println("Select the side you would like to practice.");
          System.out.println("Type 'w' for White and 'b' for Black.");
          
          programState = 1;
        }
      }
       
      //Bogo Indian
      else if(programState == 9){
        prjDFA checker = new prjDFA();
        String line = input.nextLine();
        String sub = line.substring(0, line.length());
        int space =0;
        int good = 0;
        String move = " ";
        boolean end = false;
        int current = 0;
          
        if(line.equals("quit")){
          quit = true;
        }
        else if(line.equals("menu")){
          System.out.println("Welcome to Chess Opening Practice! Please type a command to get started.");
          System.out.println("For a list of commands type 'help'");
          System.out.println();
            
          programState = 0;
        }
        else if(line.equals("reselect")){
          System.out.println("You have selected Black. Please select an opening.");
          System.out.println("Type '1' for Slav Defense, '2' for King's Indian, or '3' for Bogo Indian.");
          System.out.println();
            
          programState = 3;
        }
        else if(line.equals("help")){
          System.out.println("The valid  commands are: ");
          System.out.println("'quit' : Stop using Chess Opening Practice.");
          System.out.println("'menu' : Return to the main menu.");
          System.out.println("'reselect' : Choose another black opening");
          System.out.println();
        }
        else{
          while(!end){
            space = sub.indexOf(' ');
            if(space != -1){
              move = sub.substring(0, space);
            }
            else{
              move = sub;
            }
            //System.out.println(move);
            if(move.equals("end")){
              end = true;
            }
            
            else{
              current = checker.transitionB(move);
              sub = sub.substring(space+1, sub.length());
            }
            if(current == 13){
              System.out.println("Invalid input detected, please make a proper move.");
              end = true;
            }
            else{
              good = current;
            }
          }
          
          if(checker.acceptB() == 3){
            System.out.println("You have completed the Bogo Indian opening successfully!");
          }
          else{
            System.out.println("You not have successfully completed the Bogo Indian opening.");
          }
            
          if(good == 1 || good == 2 || good == 3 || good == 4 || good == 0){
            System.out.println("Last Good Move: expecting to start by moving Knight on g8.");
          }
          else if(good == 5){
            System.out.println("Last Good Move: expecting to finish moving Knight from g8 to f6.");
          }
          else if(good == 6 || good == 7 || good == 8){
            System.out.println("Last Good Move: expecting to move Pawn on e7 after moving Knight to f6.");
          }
          else if(good == 9){
            System.out.println("Last Good Move: expecting to finish moving Pawn from e7 to e6.");
          }
          else if(good == 10){
            System.out.println("Last Good Move: expecting to move Bishop on f8 after moving Pawn to e6.");
          }
          else if(good == 11){
            System.out.println("Last Good Move: expecting to finish moving Bishop from f8 to b4.");
          }
          else if(good == 12 && current == 13){
            System.out.println("Last Good Move: expecting to stop after moving Bishop to b4.");
          }
          
          System.out.println();
          System.out.println("Select the side you would like to practice.");
          System.out.println("Type 'w' for White and 'b' for Black.");
          
          programState = 1;
        }
      }
        
    }
  }
}