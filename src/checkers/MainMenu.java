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

public class MainMenu extends Menu {
    boolean playGame = false;
    
    @Override
    public void displayOptions(){
        System.out.println("Menu Options:\n1) Play Game\n2) "
                + "Display Help Menu\n3) Quit\n");
    }
}
