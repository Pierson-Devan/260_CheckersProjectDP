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
public class HelpMenuView {
    private final static String[][] menuItems = {
        {"B", "The board"}, 
        {"G", "The Checkers game"},
        {"L", "A location"},
        {"M", "A marker"},
        {"R", "A player"},        
        {"Q", "Quit Help"}        
    };
    
    // Create instance of the HelpMenuControl (action) class
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    // default constructor
    public HelpMenuView() {
        
    } 
        // display the help menu and get the end users input selection
    
    public void getInput() {       
              
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.display(); // display the menu
            
            // get command entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "B":
                    this.helpMenuControl.displayBoardHelp();
                    break;
                case "G":
                    this.helpMenuControl.displayGameHelp();
                    break;                  
                case "L":
                    this.helpMenuControl.displayLocationHelp();
                    break;
                case "M":
                    this.helpMenuControl.displayMarkerHelp();
                    break;
                 case "R":
                    this.helpMenuControl.displayPlayerHelp();
                    break; 
                case "Q": 
                    break;
                default: 
                    new CheckersError().displayError("Invalid option. Please enter a valid option.");
                    continue;
            }
        } while (!command.equals("Q"));  
        
         return;
    }
    
           // displays the help menu
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < HelpMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    } 
    
/*    String instructions = "This is a game of checkers. You will be playing"
            + " against the other player.\nThe object of the game is to capture"
            + " all your opponents's pieces.\nYou can only move your pieces"
            + " diagonally in the forward direction.\nYou take your opponent's "
            + " pieces by 'jumping' over them with your piece.\nIf you get a"
            + " piece to the other side of the board, you may claim a king-piece,\n"
            + "which may move diagonally in either the forward or backwards"
            + " direction.\nLet's play!";
    
     public void displayHelp(){
        System.out.println(instructions);
     }
}

 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

