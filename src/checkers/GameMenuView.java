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
 * @author Devan
 */
public class GameMenuView implements Serializable {
    private Board board;
    private OptionsMenuControl optionsMenuControl = new OptionsMenuControl();
    private GameMenuControl gameControl;
    
    public GameMenuView(Board board) {
        this.board = board;
        this.gameControl = new GameMenuControl(board);
        
    }
    private final static String[][] menuItems = {
        {"T", "Take your turn"},
        {"N", "New Game"},
        {"R", "Report stastics"},
        {"H", "Help"},
        {"O", "Options Menu"},
        {"Q", "QUIT"}
    };
    
    public boolean getInput(boolean playerType){
        
        String input;
        Scanner scan = new Scanner(System.in);
        boolean testInput = true;
        do {    
            board.displayBoard();
            this.display(); // display the menu

            // get commaned entered
            input = scan.nextLine();
            input = input.trim().toUpperCase();
            switch (input) {
                case "T":
                    this.gameControl.takeTurn(playerType);
                    break;
                case "N":
                    gameControl.startGame();
                    break;
                case "R":
                    gameControl.displayStats(playerType);
                    break;
                case "H":
                    gameControl.displayHelpMenu();
                    break;
                case "O":
                    gameControl.displayOptionsMenu();
                    break;
                case "Q": 
                    testInput = false;
                    break;
                default: 
                    System.out.println("Invalid command. Please enter a valid command.\n");
                    continue; 
            }
        } while (!input.equals("Q") || !input.equals("T"));
        return testInput;
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