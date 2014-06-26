/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

import java.util.Scanner;
import java.io.Serializable;
/**
 *
 * @author Devan and Jennie
 */
public class Checkers implements Serializable {
    private static Player player1 = new Player();
    private static Player player2 = new Player();
    
    
    public static Player getPlayer1(){
        return Checkers.player1;
    }
    
    public static Player getPlayer2(){
        return Checkers.player2;
    }
    
    public static Player getPlayer(boolean playerType){
        if(playerType)
            return player1;
        else
            return player2;
    }
    
    /*
    String playerOneName;
    String playerTwoName;
    
    String instructions = "This is a game of checkers. You will be playing"
            + " against the other player.\nThe object of the game is to capture"
            + " all your opponent's pieces.\nYou can only move your pieces"
            + " diagonally in the forward direction.\nYou take your opponent's "
            + " pieces by 'jumping' over them with your piece.\nIf you get a"
            + " piece to the other side of the board, you may claim a king-piece,\n"
            + "which may move diagonally in either the forward or backwards"
            + " direction.\nLet's play!";*/
    //instructions moved to HelpMenuView
    private void display(){
        System.out.println("Welcome to Checkers!");
    }
    private void endGame(){
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
        Checkers myGame = new Checkers();
        myGame.display();
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.executeCommand();
        /*
        Piece myPiece = new Piece();
        HelpMenuView myHelp = new HelpMenuView();
        Board myBoard = new Board();
        Player playerOne = new Player();
        playerOne.isPlayerOne = true;
        Player player2 = new Player();
        GameMenuView gmv = new GameMenuView();  
        playerOne.getName();
        player2.getName();
        gmv.getInput(playerOne);
        gmv.getInput(player2);
        myBoard.makeBoardHorizLocations();
        myBoard.makeBoardVertLocations();
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
        

        
    }
    
}
