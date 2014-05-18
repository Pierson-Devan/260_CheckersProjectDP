/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

/**
 *
 * @author Tails2
 */
public class Board {
int locHoriz=1;
int locVert=2;
}

class ChkVertical {
//return true if vertical is even
    boolean bVertIsEven(int iVEven){
    if(locVert <=0 | >= 9) System.out.println("Invalid Value/n");
    if(locVert == null) System.out.println ("Invalid Value/n");
        if((iVEven%2)==0) return true;
    else return false;
    }
class ChkHorizontal {
//return true if vertical is even
    boolean bHorizIsEven(int iHEven){
    if(locHoriz <=0 System.out.println("Invalid Value/n");
    if(locHoriz == null) System.out.println ("Invalid Value/n");
        if((iHEven%2)==0) return true;
    else return false;
    }
}
