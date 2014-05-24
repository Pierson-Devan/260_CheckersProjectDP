/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

import java.util.Scanner;

/**
 *
 * @author Jennie
 */
public class OptionsMenuView {
    private final static String[][] menuItems = {
        {"S", "Turn Sound On"}, 
        {"T", "Timed Game"},
        {"C", "Color Scheme"},
        {"L", "Who's winning?"},
        {"Q", "Quit Options Menu"}
       
    };
    
    // Create instance of the HelpMenuControl (action) class
    private final OptionsMenuControl optionsMenuControl = new OptionsMenuControl();
    
    // default constructor
    public OptionsMenuView() {
    } 
        // display the options menu and get the end users input selection
    
    public void getInput() {       
              
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.display(); // display the menu
            
            // get command entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
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
        } while (!command.equals("Q"));  
    }
    
           // displays the options menu
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (String[] menuItem : OptionsMenuView.menuItems) {
            System.out.println("\t   " + menuItem[0] + "\t" + menuItem[1]);
        }
        System.out.println("\t===============================================================\n");
    }
}
    

