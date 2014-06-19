/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

import java.util.Scanner;
import java.io.Serializable;
/**
 *
 * @author Devan and Jennie
 */
public class MainMenuView implements Serializable {
    boolean helpMenu = false;
    boolean quit = false;
    int userChoice;
    MainMenuControl mainControl = new MainMenuControl();
    
    public MainMenuView(){
    
    }
    private static final String[][] mainItems = {
        {"N", "Start New Game"},
        {"H", "Help"},
        {"X", "Exit Checkers"}
    }; 
    
    public final void displayOptions() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tPlease choose a command from the options below:");

        for (int i = 0; i < MainMenuView.mainItems.length; i++) {
            System.out.println("\t   " + mainItems[i][0] + "\t" + mainItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }

    public void getInput(){
        String choice;
        Scanner input = new Scanner(System.in);
        
        do {
            this.displayOptions();
            choice = input.nextLine();
            choice = choice.trim().toUpperCase();
            
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
        } while (!choice.equals("X"));

        return;
    }
}
