/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CIT260_05_JDCheckers_Menu_Control;
import CIT260_05_JDCheckers_utilities.Game;
import CIT260_05_JDCheckers_Menus_View.HelpMenuView;
import CIT260_05_JDCheckers_Menus_View.Menu;
import CIT260_05_JDCheckers_interfaces.DisplayHelp;
import java.io.Serializable;
/**
 *
 * @author Devan
 */
public class MainMenuControl implements Serializable, DisplayHelp {
    
    @Override
    public void displayHelpMenu(){
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.executeCommand();
    }
    
    public void newGame(){
        Game game = new Game();
        game.newGame();
        
    }
}
