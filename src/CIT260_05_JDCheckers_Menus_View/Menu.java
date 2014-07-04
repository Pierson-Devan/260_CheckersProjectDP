/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CIT260_05_JDCheckers_Menus_View;

import CIT260_05_JDCheckers_interfaces.DisplayInfo;
import CIT260_05_JDCheckers_interfaces.EnterInfo;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Devan
 */
public abstract class Menu implements DisplayInfo, Serializable, EnterInfo{
    String[][] menuItems = null;
    
    public Menu(){
    
    }
    
    public Menu(String[][] menuItems) {
        this();
        this.menuItems = menuItems;
    }
    
    
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < this.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
    
    
    public final String getInput(){
        String input;
        Scanner scan = new Scanner(System.in);
            this.display(); // display the menu
            // get commaned entered
            input = scan.nextLine();
            input = input.trim().toUpperCase();
        return input;
    }
    
    public abstract void executeCommand();
    
    public abstract boolean executeCommand(boolean stuff);
}
