/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;
import java.io.Serializable;
/**
 *
 * @author Devan
 */
public class MainMenuControl implements Serializable {
    
    public void displayHelpMenu(){
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput();
    }
    
    public void newGame(){
        Game game = new Game();
        game.newGame();
        
    }
}
