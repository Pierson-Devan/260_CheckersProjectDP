/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CIT260_05_JDCheckers_utilities;
import CIT260_05_JDCheckers_Frames.ErrorPopUp;
import CIT260_05_JDCheckers_Frames.GameFrame;
import CIT260_05_JDCheckers_Menus_View.GameMenuView;
import CIT260_05_JDCheckers_Player.Player;
import CIT260_05_JDCheckers_Player.PlayerList;
import CIT260_05_JDCheckers_exceptions.GameException;
import java.io.Serializable;
/**
 *
 * @author Devan
 */
public class Game implements Serializable {

    PlayerList playerList = new PlayerList();
    Player player1 = Checkers.getPlayer1();
    Player player2 = Checkers.getPlayer2();
    ErrorPopUp ePop;
    Board board = new Board();
    GameMenuView gameMenu = new GameMenuView(board);
    Checkers myGame = Checkers.getGame();
    
    
    public void newGame(String name1, String name2) throws GameException{
        player1.setName(name1);
        player1.isPlayerOne = true;
        player2.setName(name2);
        if(!checkName(name1))
            return;
        if(!checkName(name2))
            return;
        GameFrame frame1 = new GameFrame();
        frame1.display(player1.isPlayerOne);
        frame1.setVisible(true);
    }
        
    
    public boolean checkName(String name) throws GameException{
        if(name.compareToIgnoreCase("Wookie") == 0 || (name.compareToIgnoreCase("Chewbacca") == 0)){
                    createPopUp(name);
                    return false;
        }
        return true;
    }
    
    public void createPopUp(String name){
        ErrorPopUp ePop = new ErrorPopUp();
        ePop.setVisible(true);
        ePop.setName(name);
    }
}