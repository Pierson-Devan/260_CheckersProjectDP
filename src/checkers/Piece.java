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
//Pieces will be initialized at start of game and given a number; pieces 
//101-112 with be player 1 and pieces 201-212 will be player two. They will be
//in an array under each player and this array will allow the program to access
//each individual pieces location information. To test current code, a location
//of 5,3 will be set a defualt till array can be developed
public class Piece {
    String color;
    int pieceName;
    boolean isKing = false;//marks whether a given piece is normal or a king
    int locationVert = 0;//see comment above class header
    int locationHori = 0;//see comment above class header
    boolean isCaptured = false;//stores if the piece is captured or not
    
    public Piece(){
    
    }
    
    /**outputs the values in all default variables*/
    public void outputPieceInfo(){
        System.out.println("Piece is King: " + isKing +"\n"
                + "Piece is on location: " + locationHori +" and " +locationVert + "\n"
                + "Piece is Captured: " +isCaptured);
    }
}
