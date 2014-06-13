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
public class Game {
    PlayerList playerList = new PlayerList();
    Player player1 = new Player();
    Player player2 = new Player();
    Board board = new Board();
    GameMenuView gameMenu = new GameMenuView(board);
    
    public void newGame(){
        System.out.println("Player One:");
        player1.getName();
        player1.isPlayerOne = true;
        System.out.println("Player Two:");
        player2.getName();
        boolean input;
        do{
            System.out.println(player1.playerName + ", it is your turn");
            input =gameMenu.getInput(player1);
            if(input){
                input = gameMenu.getInput(player2);
                    System.out.println(player2.playerName + ", it is your turn");
            }
        }
        while (!input);
    }
}
