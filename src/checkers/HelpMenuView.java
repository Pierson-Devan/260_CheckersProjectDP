/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

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
            String command;
            do{
            command = this.getInput();
            switch (command) {
                case "B":
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
                    break;
                default: 
                    System.out.println("Invalid option. Please enter a valid option.");
                }
            }while (!command.equals("Q"));  
         return;
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

