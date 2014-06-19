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
 * @author Tails2
 */
public class Board {
private int boardLocations[][];

public void displayBoard(){
    System.out.println("Consider the board printed out\n");
    System.out.println(" \t  1    2    3    4    5    6    7    8");
    System.out.println(" \t __   __   __   __   __   __   __   __");
    System.out.println("8\t|__ | __ | __ | __ | __ | __ | __ | __|");
    System.out.println("7\t|__ | __ | __ | __ | __ | __ | __ | __|");
    System.out.println("6\t|__ | __ | __ | __ | __ | __ | __ | __|");
    System.out.println("5\t|__ | __ | __ | __ | __ | __ | __ | __|");
    System.out.println("4\t|__ | __ | __ | __ | __ | __ | __ | __|");
    System.out.println("3\t|__ | __ | __ | __ | __ | __ | __ | __|");
    System.out.println("2\t|__ | __ | __ | __ | __ | __ | __ | __|");
    System.out.println("1\t|__ | __ | __ | __ | __ | __ | __ | __|");
}
/*
//return true if vertical is even
    boolean bVertIsEven(int iVEven){
    if(locVert <=0 | locVert >= 9) System.out.println("Invalid Value/n");
    //ints can't be null, previous statement here uneeded
    if((iVEven%2)==0)
        return true;
    else return false;
    }
//return true if vertical is even
    boolean bHorizIsEven(int iHEven){
    if(locHoriz <=0) 
        System.out.println("Invalid Value/n");
    //ints can't be null, previous statement here uneeded
    if((iHEven%2)==0)
            return true;
    else return false;
    }
    
    void makeBoard(){
        boardLocations = new int[8][8];
        for(int count = 0; count < 8; count ++){
            for (int counter = 0; counter < boardLocations.length-1; counter++)
            boardLocations[count][counter]= counter;
        }
    }
    
   
    void unavailableBoardLocations(){
        boolean[] boardLocations = new boolean[64];
        for(int row=0; row<8; row=row+2){
            for (int col=0; col < 8; col++){
                boardLocations[row]=false;
            }
        }
    }
    
    
    //New unavailableBoardLocations with for each
*/  
void unavailableBoardLocations(){    
    boolean[][] availableBoardLocations = new boolean[8][8];
        
        for (int r=0; r<8; r++){
            for(int c=0; c<8; c++){
                availableBoardLocations[r][c]=false;
                c++;
                availableBoardLocations[r][c]=true;
            }
            r++;
            for(int c=0;c<8; c++){
                availableBoardLocations[r][c]=true;
                c++;
                availableBoardLocations[r][c]=false;
            }
            
        }
        
        for (boolean[] q : availableBoardLocations){
            System.out.println(q);
        }
    }
     public void getValidInput(boolean playerType){
        String input;
        Player player = Checkers.getPlayer(playerType);
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
    
