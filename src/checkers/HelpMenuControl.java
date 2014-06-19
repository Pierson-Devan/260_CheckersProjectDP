/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;
import java.io.Serializable;

/**
 *
 * @authors Devan and Jennie
 */

public class HelpMenuControl implements Serializable {


    HelpMenuControl() {
    }


    public void displayBoardHelp() {
        System.out.println();
        this.displayHelpBorder();             
        System.out.println( 
                "\tThe game board for Checkers consists of a two-color grid that is 8 rows by 8 columns. "
                + "\n\tPlayers begin with twelve pieces occupying the white tiles closest to them."
                + "\n\tPlayers move diagonally only on the white tiles. They can move one space, or "
                + "\n\tjump one opposing player's piece."
                + "\n\t Players begin with twelve pieces occupying the white tiles closest to them."
                + "\n\t Players move diagonally only on the white tiles. They can move one space, or "
                + "\n\t jump one opposing player's piece.");

        displayHelpBorder();
    }
 
        public void displayGameHelp() {
        System.out.println();
        this.displayHelpBorder();             
        System.out.println( 
               "\tThis is a game of checkers. You will be playing"
            + "\n against the other player.The object of the game is to capture"
            + "\n all your opponents's pieces.You can only move your pieces"
            + "\n diagonally in the forward direction. You take your opponent's "
            + "\n pieces by 'jumping' over them with your piece. If you get a"
            + "\n piece to the other side of the board, you may claim a "
            + "\n king-piece, which may move diagonally in either the forward "
            + "\n or backwards direction."
            + "\n Let's play!");
        displayHelpBorder();
    }
            
    public void displayPlayerHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                "\tA player manually takes their turn by moving one of their "
                + "\n pieces on the board. Before the player has a king, he can"
                + "\n only move forward on the board."
                ); 
        displayHelpBorder();
    }

    public void displayLocationHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
               "\tAny location on the board where a player can move."
                ); 
        displayHelpBorder();
    }
                 
    public void displayMarkerHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
               "\tA symbol that \"marks\" the locations on the board that are occupied "
                + "by a player. The  "
                + "\n\tThe default markers will be \"X\" and \"O\"."
                ); 
        displayHelpBorder();
    }
    
    
    private void displayHelpBorder() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
  
}

