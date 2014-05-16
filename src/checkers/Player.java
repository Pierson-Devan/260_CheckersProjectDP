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
    double ratioLostToCaptured = 0;
    int numberOfPiecesLost = 0;
    
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
        System.out.println(playerName + "'s number of pieces: " + ratioLostToCaptured + "\n");
    }
    
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
            System.out.println("Invalid value. Try again.\n");
            return -99;
        }
        if (numberOfPieces <=1)
            return 0;
        numberOfPieces--;
        numberOfPiecesLost ++;
        if(numberOfCapturedPieces != 0){
        ratioLostToCaptured = (int)(numberOfPiecesLost / numberOfCapturedPieces); 
        }
        else
            System.out.println("An Error Has occured: Divsion By Zero.\n \tTo "
                    + "resovlve this error, please capture some of your"
                    + " opponent's pieces");
        return numberOfPieces;
    }
}

    
