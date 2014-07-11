/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CIT260_05_JDCheckers_Menus_View;

import CIT260_05_JDCheckers_exceptions.MenuException;
import checkers.OptionsMenuControl;

/**
 *
 * @author Jennie
 */
public class OptionsMenuView extends Menu {
    private final static String[][] menuItems = {
        {"S", "Turn Sound On"}, 
        {"T", "Timed Game"},
        {"C", "Color Scheme"},
        {"L", "Who's winning?"},
        {"Q", "Quit Options Menu"}
       
    };
    
    
    // Create instance of the HelpMenuControl (action) class
    private final OptionsMenuControl optionsMenuControl;
    
    // default constructor
    public OptionsMenuView() {
        super(OptionsMenuView.menuItems);
        optionsMenuControl = new OptionsMenuControl();
    } 
        // display the options menu and get the end users input selection
    
    @Override
    public void executeCommand() {       
              
        String command = null;
        do {
        try{
            command = this.getInput();
            
            switch (command) {
                case "S":
                    optionsMenuControl.displaySoundControls();
                    break;
                case "T":
                    this.optionsMenuControl.displayTimedGame();
                    break;                  
                case "C":
                    this.optionsMenuControl.displayColorScheme();
                    break;
                case "L":
                    this.optionsMenuControl.displayWinning();
                    break;
                case "Q": 
                    break;
                default: 
                    System.out.println("Invalid option. Please enter a valid option.");
            }
        }
        catch(MenuException mex){
            System.out.println("\n" + mex.getMessage());
        }
        } while (!command.equals("Q"));  
    }
    
    
    @Override
    public boolean executeCommand(boolean stuff) {
        return true;
    }
}
    

