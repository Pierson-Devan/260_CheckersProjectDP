/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CIT260_05_JDCheckers_Menus_View;

import CIT260_05_JDCheckers_exceptions.MenuException;
import checkers.MainMenuControl;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Devan and Jennie
 */
public class MainMenuView extends Menu {
    boolean helpMenu = false;
    boolean quit = false;
    int userChoice;
    MainMenuControl mainControl = new MainMenuControl();
    private static final String[][] menuItems = {
        {"N", "Start New Game"},
        {"H", "Help"},
        {"X", "Exit Checkers"}
    };
    
    public MainMenuView(){
        super(MainMenuView.menuItems);
    }
     
    @Override
    public void executeCommand(){
        String choice = null;
        do {
            try{
            choice = this.getInput();
            switch (choice) {
                case "N":
                    this.mainControl.newGame();
                    break;
                case "H":
                    this.mainControl.displayHelpMenu();            
                    break;
                case "X":
                    break;
                default: 
                    System.out.println("Invalid command. Please enter a valid command.");
                    continue;                    
            }
            }
         catch(MenuException mex){
            System.out.println("\n" + mex.getMessage());
        }
        } while (!choice.equals("X"));

        return;
    }
    
    @Override
    public boolean executeCommand(boolean stuff) {
        return true;
    }
}
