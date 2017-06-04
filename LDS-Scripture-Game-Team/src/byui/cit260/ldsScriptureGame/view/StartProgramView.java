/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ldsScriptureGame.view;

import byui.cit260.ldsScriptureGame.control.GameControl;
import byui.cit260.ldsScriptureGame.model.Player;
import java.util.Scanner;

/**
 *
 * @author Reinaldo
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView(){
        
    
       
        this.promptMessage = "\nPlease enter your name: ";
        
        this.displayBanner();
        
    }

      private void displayBanner(){  
        System.out.println(
                
                "\n************************************************"
              + "\n*                                              *"
              + "\n* This is the LDS Scripture Game               *"
              + "\n* In this game you will be placed in the shoes *"
              + "\n* of Nephi and his brothers as they go on a    *"
              + "\n* journey to retrive the Brass Plates as their *"
              + "\n* father, Lehi, instructed them to do because  *"
              + "\n* of the vision he recived from Heavenly       *"
              + "\n* Father                                       *"
              + "\n*                                              *"
              + "\n* You will need to leave Lehi's tent in the    *"
              + "\n* wilderness and travel back to the land of    *"
              + "\n* Jerusalem where you and your family were     *"
              + "\n* driven out from to obtain the record of your *"
              + "\n* ancestors. After doing so, you will need to  *"
              + "\n* bring those records, which are the Brass     *"
              + "\n* Plates, back to your father's tent in the    *"
              + "\n* wilderness.                                  *"
              + "\n*                                              *"
              + "\n* Good luck and may your journy be a success.  *"
              + "\n*                                              *"
              + "\n************************************************"  
        );
      }
    public void displayStartProgramView() {

        boolean done = false;
        do{
            //Prompt for and get the players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q"))
                return;

            //do requested action and display the next view
            done = this.doAction(playersName);
            
        }while (!done);
        
    }

    private String getPlayersName() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid){
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length()<1) {
                System.out.println("Invalid value: value can not be blank");
                continue;
            }
            break;
        }
        
        return value;
    }

    private boolean doAction(String playersName) {
        
        if (playersName.length() < 2){
            
            System.out.println("\nInvalid players name: " 
                    + "The name must be greater than one character in length");
        return false;    
        }
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) {
            System.out.println("\nError creating the player.");
        return false;    
        }
        this.displayNextView();
       
        return true;
    }
   
    private void displayNextView() {
        System.out.println("\n===================================="
                          + "\n");
    }
}