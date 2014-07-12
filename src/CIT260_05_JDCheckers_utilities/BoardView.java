/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CIT260_05_JDCheckers_utilities;

import CIT260_05_JDCheckers_Player.Player;
import java.io.Serializable;

/**
 *
 * @author Devan
 */
public class BoardView implements Serializable{
    Player player1 = Checkers.getPlayer1();
    Player player2 = Checkers.getPlayer2();
    
    public void displayBoard(char board[][]){
    System.out.println(" \t  1    2    3    4    5    6    7    8");
    System.out.println(" \t __   __   __   __   __   __   __   __");
    /*
    *Board under Construction
    for(int x = board.length-1; x <0; x--){
    */
        System.out.println("under construction");
        /*
        Code to follow: search array, if char is n, output ' _ |'
        *else, if player 1 piece, output ' X |'
        *else, if plater 2 piece, output ' O |'
        */
    }
    /*
    System.out.println("8\t|__ | __ | __ | __ | __ | __ | __ | __|");
    System.out.println("7\t|__ | __ | __ | __ | __ | __ | __ | __|");
    System.out.println("6\t|__ | __ | __ | __ | __ | __ | __ | __|");
    System.out.println("5\t|__ | __ | __ | __ | __ | __ | __ | __|");
    System.out.println("4\t|__ | __ | __ | __ | __ | __ | __ | __|");
    System.out.println("3\t|__ | __ | __ | __ | __ | __ | __ | __|");
    System.out.println("2\t|__ | __ | __ | __ | __ | __ | __ | __|");
    System.out.println("1\t|__ | __ | __ | __ | __ | __ | __ | __|");
    */
}
