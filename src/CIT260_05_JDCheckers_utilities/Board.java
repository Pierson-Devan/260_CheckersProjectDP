/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CIT260_05_JDCheckers_utilities;
import CIT260_05_JDCheckers_Player.Player;
import CIT260_05_JDCheckers_exceptions.BoardException;
import java.io.Serializable;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author Tails2
 */
public class Board implements Serializable {
private static char usedBoardLocations[][];
private final BoardView board = new BoardView();

private void findUsedLocations(){
            /*Code to follow: check player's pieces for their location
            if no piece, places a 'N', if a player 1 piece, places an 'X', and a
            'O' if a player two piece
            */
}
    
public void printBoard(){
    findUsedLocations();
    board.displayBoard(usedBoardLocations);
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
     public void getValidLocation(boolean playerType) throws BoardException{
        Player player = Checkers.getPlayer(playerType);
        int pieceId=0;
        int horizLoc=0;
        int vertLoc=0;
        int pieceCurrentVertLoc = 0;
        int pieceCurrentHorizLoc = 0;
        boolean valid = false;
        while (!valid){
            pieceId = getPieceIDInput();
            pieceCurrentHorizLoc = player.piece[pieceId].locationHori;
            pieceCurrentVertLoc = player.piece[pieceId].locationVert;
            System.out.println(player.piece[pieceId].locationHori);
            System.out.println(player.piece[pieceId].locationVert);
            horizLoc = getPieceHorizInput();
            vertLoc = getPieceVertInput();
            System.out.println(horizLoc + " " + vertLoc); 
            if(isFriendly(horizLoc, vertLoc, playerType))
                valid = true;
            
            if (horizLoc <9 && horizLoc > 0){
                if(vertLoc < 9 && horizLoc > 0){
                    if(player.isPlayerOne == true){
                        if(pieceCurrentHorizLoc + 1 == horizLoc  || pieceCurrentHorizLoc -1 == horizLoc){
                            if(pieceCurrentVertLoc + 1 == vertLoc){
                                valid = true;
                            }
                        }    
                    }
                    else{
                        if(pieceCurrentHorizLoc + 1 == horizLoc  || pieceCurrentHorizLoc -1 == horizLoc){
                            if(pieceCurrentVertLoc - 1 == vertLoc){
                                valid = true;
                            }
                        }
                    }
                }
            }
            else
            System.out.println("Invalid move. Please try again");
        }
        if(isEnemy(horizLoc, vertLoc, playerType)){
            capturePiece(playerType, horizLoc, vertLoc);
            return;
        }
        System.out.println("Valid move. Piece number " +pieceId+ " will move from "
                +pieceCurrentHorizLoc+ ", " +pieceCurrentVertLoc+ " to " +horizLoc
                +", " +vertLoc);
    }
     
    

    private int getPieceIDInput() throws BoardException {
        System.out.println("Please enter the id number of the piece you wish to move: ");
        String input;
        int id = -1;
        Scanner inFile = new Scanner(System.in);
        try{
        input = inFile.nextLine();
        id = parseInt(input);
        }
        catch(NumberFormatException ex){
            throw new BoardException("Invalid number entered.");
        }
        return id;
    }

    private int getPieceHorizInput() throws BoardException {
        String input;
        Scanner inFile = new Scanner(System.in);
        System.out.println("Please enter the horizontal location you wish to move to: ");
        input = inFile.nextLine();
        int hLoc = parseInt(input);
        if (!(hLoc >= 1) || (hLoc <= 8))
            throw new BoardException("Error: Invalid Horizontial Location entered. Location must be between 1 and 8");
        return hLoc;
    }

    private int getPieceVertInput() throws BoardException {
        String input;
        Scanner inFile = new Scanner(System.in);
        System.out.println("Please enter the vertical location you wish to move to: ");
            input = inFile.nextLine();
            int vLoc = parseInt(input);
            if(!(vLoc >=1)||(vLoc <= 8))
                throw new BoardException("Error: Invalid Vertical Location entered. Location must be between 1 and 8");
            return vLoc;
    }
    
    private boolean isFriendly(int hLoc, int vLoc, boolean playerType){
        Player thisPlayer = Checkers.getPlayer(playerType);
        for (int x = 0; x < thisPlayer.piece.length; x++){
            if(thisPlayer.piece[x].locationHori == hLoc && (thisPlayer.piece[x].locationVert == vLoc))
                return false;
            
        }
        return true;
    }
    
    private boolean isEnemy(int hLoc, int vLoc, boolean playerType){
         Player thatPlayer = Checkers.getPlayer(!playerType);
        for (int x = 0; x < thatPlayer.piece.length; x++){
            if(thatPlayer.piece[x].locationHori == hLoc && (thatPlayer.piece[x].locationVert == vLoc))
                return true;           
        }
        return false;
    }
    
    private void capturePiece(boolean playerType, int hLoc, int vLoc){
        Player enemy = Checkers.getPlayer(playerType);
        Player thisPlayer = Checkers.getPlayer(playerType);
        System.out.println("You can not move to that spot because of an enemy piece. Commense attack!");
        enemy.numberOfPieces --;
        for (int x=0; x < enemy.piece.length; x++){
            if(enemy.piece[x].locationHori == hLoc && (enemy.piece[x].locationVert == vLoc)){
                enemy.piece[x].isCaptured = true;
                enemy.piece[x].locationHori = 0;
                enemy.piece[x].locationVert = 0;
                continue;
            }
        }
        
    }
}
    
