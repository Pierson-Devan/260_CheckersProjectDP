/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

import java.util.Scanner;

/**
 *
 * @author Devan and Jennie
 */
public class Checkers {
    String playerOneName;
    String playerTwoName;
    
    /**String instructions = "This is a game of checkers. You will be playing"
            + " against the other player.\nPeterThe object of the game is to capture"
            + " all your opponent's pieces.\nYou can only move your pieces"
            + " diagonally in the forward direction.\nYou take your opponent's "
            + " pieces by 'jumping' over them with your piece.\nIf you get a"
            + " piece to the other side of the board, you may claim a king-piece,\n"
            + "which may move diagonally in either the forward or backwards"
            + " direction.\nLet's play!";*/
    //instructions moved to HelpMenuView

    public void endGame(){
        System.out.println("The game is over");
    }
    /**public void displayHelp(){
        System.out.println(instructions);
    }*/
    //displayHelp() moved to HelpMenuView
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Checkers myGame = new Checkers();
        Piece myPiece = new Piece();
        HelpMenuView myHelp = new HelpMenuView();
        Player player1 = new Player();
        player1.isPlayerOne = true;
        Player player2 = new Player();
        GameMenuView gmv = new GameMenuView();  
        player1.getName();
        player2.getName();
        //myGame.displayHelp();
        /*myPiece.outputPieceInfo();
        myMainMenu.displayOptions();
        myMainMenu.getUserChoice();
        myHelp.displayHelp();
        String location = null;
        player1.numberOfPieces= 12;
        myPiece.location = null;
        player1.numberOfCapturedPieces =2;
        player2.numberOfPiecesLost = 2;
        int marker = player2.increaseNumberOfCapturedPieces();
                if (marker == 12)
            myGame.endGame();
        else{
            if(marker !=-99)
                System.out.println(myGame.playerTwoName+ "\'s Number of Captured Pieces: " +marker);
        }
        int tracker = player1.lowerPieceCount(location);
        if (tracker == 0)
            myGame.endGame();
        else{
            if(tracker !=-99)
                System.out.println(myGame.playerOneName + "\'s Number of Pieces: " +tracker);
        
        
        }*/
        
        gmv.getInput();
    }
    
}
