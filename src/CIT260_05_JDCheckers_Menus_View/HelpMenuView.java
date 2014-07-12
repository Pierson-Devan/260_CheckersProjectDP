/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CIT260_05_JDCheckers_Menus_View;

import CIT260_05_JDCheckers_exceptions.MenuException;
import CIT260_05_JDCheckers_Menu_Control.HelpMenuControl;

/**
 *
 * @author Devan and Jennie
 */
public class HelpMenuView extends Menu {
 
    private final static String[][] menuItems = {
        {"B", "The board"}, 
        {"G", "The Checkers game"},
        {"L", "A location"},
        {"M", "A marker"},
        {"R", "A player"},        
        {"Q", "Quit Help"}        
    };
    
    
    
    // Create instance of the HelpMenuControl (action) class
    private final HelpMenuControl helpControl;
    
    // default constructor
    public HelpMenuView() {
        super(HelpMenuView.menuItems);
        this.helpControl = new HelpMenuControl();
    } 
        // display the help menu and get the end users input selection
    
    @Override
    public void executeCommand() {
            String command = null;
            do{
            try{
            command = this.getInput();
            switch (command) {
                case "B":
                    System.out.println("Check");
                    helpControl.displayBoardHelp();
                    break;
                case "G":
                    this.helpControl.displayGameHelp();
                    break;                  
                case "L":
                    this.helpControl.displayLocationHelp();
                    break;
                case "M":
                    this.helpControl.displayMarkerHelp();
                    break;
                 case "R":
                    this.helpControl.displayPlayerHelp();
                    break; 
                case "Q": 
                    //return;
                    this.helpControl.mainMenu();
                    break;
                default: 
                    System.out.println("Invalid option. Please enter a valid option.");
                }
            }
            catch(MenuException mex){
                System.out.println("\n" + mex.getMessage());
            }
            }while (!command.equals("Q"));
    }

    @Override
    public boolean executeCommand(boolean stuff) {
        return true;
    }
    
}
    
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

