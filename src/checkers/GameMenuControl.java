/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;


/**
 *
 * @author Devan
 */
public class GameMenuControl {
        private Board board;
    
    public GameMenuControl(Board board){
        this. board = board;
    }
    
    public void takeTurn(boolean playerType) {
        board.getValidInput(playerType);
    }
   
      
    public void startGame() {
        System.out.println("\n\tstartGame() has been called");
    }
    
    public void displayStats(boolean playerType) {
        Player player = Checkers.getPlayer(playerType);
        String playerStats = player.getPlayerStats();
        System.out.println("\n\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\t " + playerStats);
        System.out.println("\t+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
    
    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput();
    }
    
    public void displayOptionsMenu() {
        OptionsMenuView newoptions = new OptionsMenuView();
        newoptions.getInput();
    }    
   
}
