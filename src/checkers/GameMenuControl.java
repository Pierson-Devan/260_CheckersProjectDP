/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;
import CIT260_05_JDCheckers_utilities.Board;
import CIT260_05_JDCheckers_utilities.Checkers;
import CIT260_05_JDCheckers_utilities.Player;
import CIT260_05_JDCheckers_Menus_View.HelpMenuView;
import CIT260_05_JDCheckers_Menus_View.Menu;
import CIT260_05_JDCheckers_Menus_View.OptionsMenuView;
import CIT260_05_JDCheckers_exceptions.MenuException;
import CIT260_05_JDCheckers_interfaces.DisplayHelp;
import java.io.Serializable;

/**
 *
 * @author Devan
 */
public class GameMenuControl implements Serializable, DisplayHelp {
        private Board board;
    
    public GameMenuControl(Board board){
        this. board = board;
    }
    
    public void takeTurn(boolean playerType) {
        board.getValidLocation(playerType);
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
    
    @Override
    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.executeCommand();
        
    }
    
    public void displayOptionsMenu() throws MenuException {
        OptionsMenuView newoptions = new OptionsMenuView();
        newoptions.getInput();
    }    
   
}
