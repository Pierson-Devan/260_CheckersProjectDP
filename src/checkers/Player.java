/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

/**
 *
 * @author Devan and Jennie
 */
public class Player {
    String playerName = null;
    int numberOfPieces = 12;
    int numberOfKings = 0;
    int numberOfCapturedPieces = 0;
    int numberOfCapturedKings = 0;
    
    public void outputPlayerInfo(){
        if(playerName != null)
            System.out.println("Player Name: " + playerName);
        else{
            System.out.println("Error: No user information given");
            return;
        }
        System.out.println(playerName + "'s number of pieces: " + numberOfPieces + "\n");
        System.out.println(playerName + "'s number of pieces: " + numberOfKings + "\n");
        System.out.println(playerName + "'s number of pieces: " + numberOfCapturedPieces + "\n");
        System.out.println(playerName + "'s number of pieces: " + numberOfCapturedKings + "\n");
    }
    public int lowerPieceCount(String location){
        if (location != null)
            return 99;
        if (numberOfPieces <=1)
            return 0;
        numberOfPieces--;
        return numberOfPieces;
    }
}

    
