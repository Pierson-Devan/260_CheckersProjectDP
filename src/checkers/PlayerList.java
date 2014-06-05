/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;


public class PlayerList {
    
    public String[] listOfPlayers = new String[50];
    int endMarker = 0; //keeps track of which slot in the array next value goes in
    
    public void getPlayerArray(String name){
        listOfPlayers[endMarker] = name;
        endMarker ++;
        this.sortPlayerList();
    }
    
    public void sortPlayerList(){
        String temp;
        for (int counter = 0; counter < listOfPlayers.length - 1; counter++){
            for (int incrementor = counter + 1; incrementor < listOfPlayers.length; incrementor ++){
                if (listOfPlayers[counter].compareToIgnoreCase(listOfPlayers[incrementor]) > 0){
                    temp = listOfPlayers[counter];
                    listOfPlayers[counter] = listOfPlayers[incrementor];
                    listOfPlayers[incrementor] = temp;
                }
            }
        }
    }
    
    public void outputPlayerList(){
        for (int count = 0; count < listOfPlayers.length; count ++){
            System.out.println("The players in the system are: \n");
            System.out.println(listOfPlayers[count] + " , ");
        }
    }
}
