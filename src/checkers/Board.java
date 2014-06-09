/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

import java.util.ArrayList;

/**
 *
 * @author Tails2
 */
public class Board {
int locHoriz=1;
int locVert=2;


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
    
    void makeBoardHorizLocations(){
        ArrayList[] boardHorizLocations = new ArrayList[8];
        int filler = 1;
        for(int count = 0; count < 8; count ++){
            boardHorizLocations[count].add(filler);
            filler ++;
        }
    }
    void makeBoardVertLocations(){
        ArrayList[] boardVertLocations = new ArrayList[8];
        int filler = 1;
        for(int count = 0; count < 8; count ++){
            boardVertLocations[count].add(filler);
            filler ++;
        }
    }
/*    
    void unavailableBoardLocations(){
        boolean[] boardLocations = new boolean[64];
        for(int row=0; row<8; row=row+2){
            for (int col=0; col < 8; col++){
                boardLocations[row]=false;
            }
        }
    }
    */
    
    //New unavailableBoardLocations with for each
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
}
    
