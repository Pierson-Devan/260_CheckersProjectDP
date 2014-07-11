/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CIT260_05_JDCheckers_Menus_View;

import CIT260_05_JDCheckers_exceptions.MenuException;
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
    
    
    @Override
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < this.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
    
    
    @Override
    public final String getInput() throws MenuException{
        String input = null;
        Scanner scan = new Scanner(System.in);
            this.display(); // display the menu
            // get commaned entered
            input = scan.nextLine();
            input = input.trim().toUpperCase();
            System.out.println(input);
            if(!isValidInput(input)){
                throw new MenuException("This is not a valid option");
            }
        return input;
    }
    
    public abstract void executeCommand();
    
    public abstract boolean executeCommand(boolean stuff);

    private boolean isValidInput(String input){
        boolean test = false;
        for(int x = 0; x < menuItems.length; x++){
            if(input.equals(menuItems[x][0])){
                test = true;
                break;
            }
        }
        return test;
    }
}
