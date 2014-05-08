/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

import java.util.Scanner;

/**
 *
 * @author Devan
 */
public class Checkers {
    String playerOneName;
    String playerTwoName;
    String instructions = "This is a game of checkers. You will be playing "
            + "against the other player.\n The object of the game is to capture "
            + "all your opponents's pieces.\n You can only move your pieces "
            + "diagonally in the forward direction.\n You take your opponent's "
            + "pieces by 'jumping' over them with your piece.\n If you get a "
            + "piece to the other side of the board, you may claim a king-piece,\n "
            + "which may move diagonally in either the forward or backwards "
            + "direction.\n Let's play!";
    public void getName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Player One, please enter name: ");
        this.playerOneName = input.next();
        System.out.println("Player Two, please enter name: ");
        this.playerTwoName = input.next();
    }
    public void displayHelp(){
        System.out.println(instructions);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Checkers myGame = new Checkers();
        myGame.getName();
        myGame.displayHelp();
    }
    
}
