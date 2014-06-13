/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author Devan
 */
public class GameMenuControl {
        private Board board;
    
    public GameMenuControl(Board board){
        this. board = board;
    }
    
    public void takeTurn(Player player) {
        getValidInput(player);
    }
   
      
    public void startGame() {
        System.out.println("\n\tstartGame() has been called");
    }
    
    public void displayStats(Player player) {
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
    public void getValidInput(Player player){
        String input;
        int pieceId = 0;
        int horizLoc = 0;
        int vertLoc = 0;
        int pieceCurrentHorizLoc = player.piece[pieceId].locationHori;
        int pieceCurrentVertLoc = player.piece[pieceId].locationVert;
        boolean valid = false;
        while (!valid){
            Scanner inFile = new Scanner(System.in);
            System.out.println("Please enter the id number of the piece you wish to move: ");
            input = inFile.nextLine();
            pieceId = parseInt(input);
            System.out.println(player.piece[pieceId].locationHori);
            System.out.println(player.piece[pieceId].locationVert);
            System.out.println("Please enter the horizontal location you wish to move to: ");
            input = inFile.nextLine();
            horizLoc = parseInt(input);
            System.out.println("Please enter the vertical location you wish to move to: ");
            input = inFile.nextLine();
            //this line will read a future array of all the player's pieces to
            //find the one with the name that matches the input on line 59
            vertLoc = parseInt(input);
            System.out.println(horizLoc + " " + vertLoc);
            if (pieceCurrentHorizLoc == 0 || pieceCurrentVertLoc == 0){
                System.out.println("Invalid piece. Please try again");
                continue;
            }
            if (horizLoc <9 && horizLoc > 0){
                if(vertLoc < 9 && horizLoc > 0){
                    if(player.isPlayerOne == true){
                        if(pieceCurrentHorizLoc + 1 == horizLoc  || pieceCurrentHorizLoc -1 == horizLoc){
                            if(pieceCurrentVertLoc + 1 == vertLoc){
                                valid = true;
                                break;
                            }
                        }    
                    }
                    else{
                        if(pieceCurrentHorizLoc + 1 == horizLoc  || pieceCurrentHorizLoc -1 == horizLoc){
                            if(pieceCurrentVertLoc - 1 == vertLoc){
                                valid = true;
                                break;
                            }
                        }
                    }
                }
            }
            System.out.println("Invalid move. Please try again");
        }    
        System.out.println("Valid move. Piece number" +pieceId+ " will move from "
                +pieceCurrentHorizLoc+ ", " +pieceCurrentVertLoc+ "to " +horizLoc
                +", " +vertLoc);
    }
}
