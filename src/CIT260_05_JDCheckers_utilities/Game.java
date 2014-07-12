/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CIT260_05_JDCheckers_utilities;
import CIT260_05_JDCheckers_Player.PlayerList;
import CIT260_05_JDCheckers_Player.Player;
import CIT260_05_JDCheckers_Menus_View.GameMenuView;
import java.io.Serializable;
/**
 *
 * @author Devan
 */
public class Game implements Serializable {

    PlayerList playerList = new PlayerList();
    Player player1 = Checkers.getPlayer1();
    Player player2 = Checkers.getPlayer2();
    Board board = new Board();
    GameMenuView gameMenu = new GameMenuView(board);
    
    public void newGame(){
        System.out.println("Player One:");
        player1.getName();
        player1.isPlayerOne = true;
        player1.createPieceArray();
        System.out.println("Player Two:");
        player2.getName();
        player2.createPieceArray();
        boolean input;
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
}
