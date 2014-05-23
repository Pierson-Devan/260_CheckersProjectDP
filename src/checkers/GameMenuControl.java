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
        Checkers game = new Checkers();
        Player player1 = new Player();
        Player player2 = new Player();
   
    public void takeTurn() {
        System.out.println("\n\ttakeTurn() has been called");
    }
   
      
    public void startGame() {
        System.out.println("\n\tstartGame() has been called");
    }
    
    public void displayStats() {
        String player1Stats = player1.getPlayerStats();
        String player2Stats = player2.getPlayerStats();
        System.out.println("\n\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\t " + player1Stats);
        System.out.println("\n\t " + player2Stats);
        System.out.println("\t+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
    
    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput();
    }
    
    
    
}
