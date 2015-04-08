/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dreamsailor.games.battleship.view;

import dreamsailor.games.battleship.msgs.BattleshipError;
import dreamsailor.games.battleship.control.HelpMenuControl;
import java.util.Scanner;


/**
 *
 * @author Shatzi-Webster
 */
public class Help extends MenuSuper {
          
    private final static String[][] menuItems = {
        {"B", "The board"},
        {"C", "A computer player"}, 
        {"G", "The Battleship game"},
        {"H", "A hit"},
        {"R", "A regular player"},
        {"S", "A ship placement"},
        {"W", "How to win"},
        {"Q", "Quit Help"}        
    };
    
    
    
    public Help() {
        super(Help.menuItems);
    }
    
    // Create instance of the HelpMenuControl (action) class
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    public HelpMenuControl getHelpMenuControl() {
        return helpMenuControl;
    }

    public void setHelpMenuControl(HelpMenuControl helpMenuControl) {
        this.helpMenuControl = helpMenuControl;
    }
     
    // display the help menu and get the end users input selection
    
    @Override
    public void getInput() {       
              
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.display(); // display the menu
            
            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "B":
                    helpMenuControl.displayBoardHelp();
                    break;
                case "C":
                    this.helpMenuControl.displayPlayerHelp();
                    break;
                case "G":
                    this.helpMenuControl.displayGameHelp();
                    break;                  
                case "S":
                    this.helpMenuControl.displayShipHelp();
                    break;
                case "H":
                    this.helpMenuControl.displayHitHelp();
                    break;
                 case "R":
                    this.helpMenuControl.displayPlayerHelp();
                    break; 
                case "W":
                    this.helpMenuControl.displayWinHelp();
                    break; 
                case "Q": 
                    break;
                default: 
                    BattleshipError.displayError("Invalid command. Please enter a valid command.");
                    continue;
            }
        } while (!command.equals("Q"));  
        
         return;
    }
   
        
    
}