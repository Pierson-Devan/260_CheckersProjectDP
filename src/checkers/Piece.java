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
    String location = null;/**marks location on the board:
     * default is null because it is not on board. If captured,
     * location is null. Normal location is stored as letter
     * and number. For example, A8, B2, G1, etc.*/
    Boolean isCaptured = false;//stores if the piece is captured or not
    
    /**outputs the values in all default variables*/
    public void outputPieceInfo(){
        System.out.println("Piece is King: " + isKing +"\n"
                + "Piece is on location: " + location + "\n"
                + "Piece is Captured: " +isCaptured);
    }
}
