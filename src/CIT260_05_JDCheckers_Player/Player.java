/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CIT260_05_JDCheckers_Player;

import CIT260_05_JDCheckers_exceptions.PlayerException;
import java.util.Scanner;

/**
 *
 * @author Devan and Jennie
 */
public class Player {
    public static Stats stats = new Stats();
    public String playerName = null;
    public int numberOfPieces = 12;
    public int numberOfKings = 0;
    public int count = 0;
    public boolean isPlayerOne = false;
    public Piece[] piece = new Piece[12];
    
    
    public Player(){
    
    }
    
    public void createPieceArray(){       
        for (int x = 0; x <piece.length; x++){
            piece[x]= new Piece();
            piece[x].pieceName= x;
        }
            createPieceLocs();
    }
public String getName(){
    return playerName;
}
public static Stats getStats(){
    return stats;
}

public void setName(String name){
    playerName = name;
}
/*public void getNameInput(){
    Scanner input = new Scanner(System.in);
    PlayerList myList = new PlayerList();
    System.out.println("Please enter new player's name: ");
    playerName = input.nextLine();
    checkName(playerName);
    //myList.getPlayerArray(playerName);         
    }
*/

    
    public void outputPlayerInfo()throws PlayerException{
        if(playerName != null)
            System.out.println("Player Name: " + playerName);
        else{
            throw new PlayerException("Error: No user information given");
            /*System.out.println("Error: No user information given");
            return;*/
        }
        System.out.println(playerName + "'s number of pieces: " + numberOfPieces + "\n");
        System.out.println(playerName + "'s number of pieces: " + numberOfKings + "\n");
        stats.displayStats();
    } 

// public void outputPlayerInfo(){
//     try {
//        if(playerName != null)
//            System.out.println("Player Name: " + playerName);
//     }
//     catch (Exception e){
//     System.out.println(e.getMessage());
//     }
//     
//     
//     System.out.println(playerName + "'s number of pieces: " + numberOfPieces + "\n");
//     System.out.println(playerName + "'s number of pieces: " + numberOfKings + "\n");
//        stats.displayStats();
//    }

    
        /*Define the problem: The system needs to track the number of pieces still on the board, so it
    can determine when the player gets to 0 that the other player wins. Given inputs: piece 
    location equals null. Outputs: none. Tasks performed decrement numberOfPieces
    Test: Ensure that when piece location equals null, that the decrement operator 
    affects the numberOfPieces variable and decrements by one.
    Test Cases: valid inputs: null, invalid inputs: not equal to null. 
    The numberOfPieces cannot be less than 0 and cannot be greater than 12
    
    Pseudocode: 
    Function lowerPieceCount (location) 
    check to make sure the value of location is null
    if not null then return
    if null check to see if numberOfPieces is le 1 
    if so, call endGame() and if not then minus 1 from numberOfPieces
    
    */  
    /*I changed the lowerPieceCount() a little because of the requirments for 
        *the assignment. I made changes so we has 2 escape characters(\t and \n),
        *so we have a total of 2 mathimatical operators, 2 primitive data types
        *and 1 type casting*/
    public int lowerPieceCount(String location){
        if (location != null){
            System.out.println("Invalid value for lowerPieceCount. Try again.\n"); //Exception Possibility
            return -99;
        }
        if (numberOfPieces <=1)
            return 0;
        numberOfPieces--;
        
       
        return numberOfPieces;
    }
    
    public void getPlayerStats(){
        stats.getStats();
 }
    
    private void createPieceLocs(){
        int marker = 0;
        int counter = 1;
        int post = 1;
        if(isPlayerOne){
            while (marker < 12){
                for (int x = 1; x <= 4; x ++){
                    if(post > 8){
                        post -= 8;
                    }
                    piece[marker].locationVert = counter;
                    piece[marker].locationHori = post;
                    marker ++;
                    post += 2;
                }
                counter ++;
            }
        }
        else{
            counter = 8;
            while (marker < 12){
                for (int x = 1; x <= 4; x ++){
                    if(post > 8){
                        post -= 8;
                    }
                    piece[marker].locationVert = counter;
                    piece[marker].locationHori = post;
                    marker ++;
                    post += 2;
                }
                counter --;
            }
        }
    }
    
    public class Piece {
    public String color;
    public int pieceName;
    public boolean isKing = false;//marks whether a given piece is normal or a king
    public int locationVert = 0;//see comment above class header
    public int locationHori = 0;//see comment above class header
    public boolean isCaptured = false;//stores if the piece is captured or not
    
    public Piece(){
    
    }
    
    /**outputs the values in all default variables*/
    public void outputPieceInfo(){
        System.out.println("Piece is King: " + isKing +"\n"
                + "Piece is on location: " + locationHori +" and " +locationVert + "\n"
                + "Piece is Captured: " +isCaptured);
    }
    }

}

    
