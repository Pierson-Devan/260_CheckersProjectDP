/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CIT260_05_JDCheckers_Menus_View;

import CIT260_05_JDCheckers_utilities.Board;
import checkers.GameMenuControl;
import checkers.OptionsMenuControl;


/**
 *
 * @author Devan
 */
public class GameMenuView extends Menu{
    private final Board board;
    private final OptionsMenuControl optionsMenuControl = new OptionsMenuControl();
    private final GameMenuControl gameControl;
    
    public GameMenuView(Board board) {
        super(GameMenuView.menuItems);
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
    
    @Override
    public boolean executeCommand(boolean playerType){
        boolean checker = true;
        String input;
        do{
        board.printBoard();
        input = this.getInput();
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
                    checker = false;
                    break;
                default: 
                    System.out.println("Invalid command. Please enter a valid command.\n"); 
            }
        }while (!input.equals("Q") || !input.equals("T"));
        return checker;
    }

    @Override
    public void executeCommand() {
        return;
    }
    
    
}