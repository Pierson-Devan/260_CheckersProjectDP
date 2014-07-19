/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CIT260_05_JDCheckers_utilities;
import CIT260_05_JDCheckers_exceptions.ErrorPopUp;
import CIT260_05_JDCheckers_Menus_View.GameMenuView;
import CIT260_05_JDCheckers_Player.Player;
import CIT260_05_JDCheckers_Player.PlayerList;
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
    
    public void newGame(String name1, String name2){
        player1.setName(name1);
        player1.isPlayerOne = true;
        player2.setName(name2);
        boolean input;
        checkName(name1);
        checkName(name2);
        boolean player = true;
        do{
            System.out.println(player1.playerName + ", it is your turn");
            input =gameMenu.executeCommand(player);
            if(input){
                player = false;
                input = gameMenu.executeCommand(player);
                    System.out.println(player2.playerName + ", it is your turn");
            }
        }
        while (!input);
    }
    
    public void checkName(String name){
 /*
    if(name.compareToIgnoreCase("Wookie") == 0 || (name.compareToIgnoreCase("Chewbacca") == 0)){
                ErrorPopUp errorPop = new ErrorPopUp();
                errorPop.setVisible(true);  
            }
*/
}
}
