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
        String move = " ";
        boolean end = false;
          
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
              checker.transitionW(move);
              sub = sub.substring(space+1, sub.length());
           }
          }
          
          if(checker.acceptW() == 1){
            System.out.println("You have completed the Ruy Lopez opening successfully!");
          }
          else{
            System.out.println("You not have successfully completed the Ruy Lopez opening.");
          }
          
          System.out.println();
          System.out.println("Select the side you would like to practice.");
          System.out.println("Type 'w' for White and 'b' for Black.");
          
          programState = 1;
        }
      }
        
      else if(programState == 5){
        prjDFA checker = new prjDFA();
        String line = input.nextLine();
        String sub = line.substring(0, line.length());
        int space =0;
        String move = " ";
        boolean end = false;
          
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
              checker.transitionW(move);
              sub = sub.substring(space+1, sub.length());
           }
          }
          
          if(checker.acceptW() == 2){
            System.out.println("You have completed the King's Gambit opening successfully!");
          }
          else{
            System.out.println("You not have successfully completed the King's Gambit opening.");
          }
          
          System.out.println();
          System.out.println("Select the side you would like to practice.");
          System.out.println("Type 'w' for White and 'b' for Black.");
          
          programState = 1;
        }
      }
        
      else if(programState == 6){
        prjDFA checker = new prjDFA();
        String line = input.nextLine();
        String sub = line.substring(0, line.length());
        int space =0;
        String move = " ";
        boolean end = false;
          
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
              checker.transitionW(move);
              sub = sub.substring(space+1, sub.length());
           }
          }
          
          if(checker.acceptW() == 3){
            System.out.println("You have completed the Italian Game opening successfully!");
          }
          else{
            System.out.println("You not have successfully completed the Italian Game opening.");
          }
          
          System.out.println();
          System.out.println("Select the side you would like to practice.");
          System.out.println("Type 'w' for White and 'b' for Black.");
          
          programState = 1;
        }
      }
        
      else if(programState == 7){
        prjDFA checker = new prjDFA();
        String line = input.nextLine();
        String sub = line.substring(0, line.length());
        int space =0;
        String move = " ";
        boolean end = false;
        
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
              checker.transitionB(move);
              sub = sub.substring(space+1, sub.length());
           }
          }
          
          if(checker.acceptB() == 1){
            System.out.println("You have completed the Slav Defense opening successfully!");
          }
          else{
            System.out.println("You not have successfully completed the Slav Defense opening.");
          }
          
          System.out.println();
          System.out.println("Select the side you would like to practice.");
          System.out.println("Type 'w' for White and 'b' for Black.");
          
          programState = 1;
        }
      }
        
      else if(programState == 8){
        prjDFA checker = new prjDFA();
        String line = input.nextLine();
        String sub = line.substring(0, line.length());
        int space =0;
        String move = " ";
        boolean end = false;
          
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
              checker.transitionB(move);
              sub = sub.substring(space+1, sub.length());
           }
          }
          
          if(checker.acceptB() == 2){
            System.out.println("You have completed the King's Indian opening successfully!");
          }
          else{
            System.out.println("You not have successfully completed the King's Indian opening.");
          }
          
          System.out.println();
          System.out.println("Select the side you would like to practice.");
          System.out.println("Type 'w' for White and 'b' for Black.");
          
          programState = 1;
        }
      }
        
      else if(programState == 9){
        prjDFA checker = new prjDFA();
        String line = input.nextLine();
        String sub = line.substring(0, line.length());
        int space =0;
        String move = " ";
        boolean end = false;
          
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
              checker.transitionB(move);
              sub = sub.substring(space+1, sub.length());
           }
          }
          
          if(checker.acceptB() == 3){
            System.out.println("You have completed the Bogo Indian opening successfully!");
          }
          else{
            System.out.println("You not have successfully completed the Bogo Indian opening.");
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