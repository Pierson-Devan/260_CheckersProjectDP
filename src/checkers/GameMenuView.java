/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

import java.util.Scanner;

/**
 *
 * @author Devan
 */
public class GameMenuView {
    Checkers game = new Checkers();
    GameMenuControl gameMenuCont = new GameMenuControl();
    OptionsMenuControl optionsMenuControl = new OptionsMenuControl();

    
    private final static String[][] menuItems = {
        {"T", "Take your turn"},
        {"N", "New Game"},
        {"R", "Report stastics"},
        {"H", "Help"},
        {"O", "Options Menu"},
        {"Q", "QUIT"}
    };
    
    public void getInput(Player player) {
   
        String input;
        Scanner inFile = new Scanner(System.in);

        do {    
            this.display(); // display the menu

            // get commaned entered
            input = inFile.nextLine();
            input = input.trim().toUpperCase();
            
            switch (input) {
                case "T":
                    this.gameMenuCont.takeTurn(player);
                    break;
                case "N":
                    gameMenuCont.startGame();
                    break;
                case "R":
                    gameMenuCont.displayStats();
                    break;
                case "H":
                    gameMenuCont.displayHelpMenu();
                    break;
                case "O":
                    gameMenuCont.displayOptionsMenu();
                    break;
                case "Q":                   
                    break;
                default: 
                    System.out.println("Invalid command. Please enter a valid command.");
                    continue; 
            }
        } while (!input.equals("Q"));
    }
    
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < this.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }

    
}
