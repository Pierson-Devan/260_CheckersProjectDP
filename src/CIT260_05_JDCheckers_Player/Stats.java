/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CIT260_05_JDCheckers_Player;

/**
 *
 * @author Devan
 */
public class Stats {
        int numberOfCapturedPieces = 0;
        int numberOfCapturedKings = 0;
        double ratioLostToCaptured = 0;
        int numberOfPiecesLost = 0;
        int numberOfKingsLost = 0;

    public void displayStats(){
        System.out.println("Number of pieces: " + numberOfCapturedPieces + "\n");
        System.out.println("Number of pieces: " + numberOfCapturedKings + "\n");
        System.out.println("Number of pieces: " + ratioLostToCaptured + "\n");
    }
    
    public void calcRatioLostToCapt(){
         if(numberOfCapturedPieces != 0){
        ratioLostToCaptured = (int)(numberOfPiecesLost / numberOfCapturedPieces); 
        }
        else
            throw new ArithmeticException("Error: You have not captured any pieces yet");
    }

    void getStats() {
        System.out.println("Under Construction");
    }
    
    void setPiecesCaptured(int inc){
        this.numberOfCapturedPieces += inc;
    }
    
    void setKingsCaptured(int inc){
        this.numberOfCapturedKings += inc;
    }
    
    void updateLostPieces(int remPieces){
        this.numberOfPiecesLost = 12 - remPieces;
    }
    
}