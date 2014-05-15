/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

import java.util.Scanner;

/**
 *
 * @author Devan and Jennie
 */
public abstract class Menu {
    boolean helpMenu = false;
    boolean quit = false;
    int userChoice;
    
    public void displayOptions(){
        System.out.println("Menu Options:\n1) Display Help Menu\n2) Quit\n");
    }

    public void getUserChoice(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose an option: ");
        String  userText= input.next();
        userChoice = Integer.parseInt(userText);
        System.out.println("User chose " + userChoice);
    }
}
