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

public Board(){

}

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
    
    void unavailableBoardLocations(){
        boolean[] boardVertLocations = new boolean[64];
        for(int i=0, h=0; i < 8; i=i+2){
            boardVertLocations[i]=false;
            if (i==7)h++;i=0; 
        }
    }
}
