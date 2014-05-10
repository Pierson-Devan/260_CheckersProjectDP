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
public class HelpMenu extends Menu {
    String instructions = "This is a game of checkers. You will be playing"
            + " against the other player.\nPeterThe object of the game is to capture"
            + " all your opponents's pieces.\nYou can only move your pieces"
            + " diagonally in the forward direction.\nYou take your opponent's "
            + " pieces by 'jumping' over them with your piece.\nIf you get a"
            + " piece to the other side of the board, you may claim a king-piece,\n"
            + "which may move diagonally in either the forward or backwards"
            + " direction.\nLet's play!";
    
     public void displayHelp(){
        System.out.println(instructions);
     }
}
