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
public class Piece {
    String color;
    Boolean isKing = false;//marks whether a given piece is normal or a king
    int locationVert = 0;
    int locationHori = 0;
    Boolean isCaptured = false;//stores if the piece is captured or not
    
    /**outputs the values in all default variables*/
    public void outputPieceInfo(){
        System.out.println("Piece is King: " + isKing +"\n"
                + "Piece is on location: " + locationHori +" and " +locationVert + "\n"
                + "Piece is Captured: " +isCaptured);
    }
}
