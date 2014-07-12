
package CIT260_05_JDCheckers_Menu_Control;
import CIT260_05_JDCheckers_interfaces.ReturntoMainMenu;
import java.io.Serializable;
/**
 *
 * @author Jennie
 */

public class OptionsMenuControl implements Serializable, ReturntoMainMenu {
    boolean bSound = false;
    boolean bTimed = false;

    public OptionsMenuControl(){
    
    }
    

    public void displaySoundControls() {
        bSound=true;
        System.out.println();
        this.displayMenuBorder();             
        System.out.println("Sound is now on"); 
        displayMenuBorder();
    }
 
        public void displayTimedGame() {
        bTimed = true;
        System.out.println();
        this.displayMenuBorder();             
        System.out.println("Timed Game");
        displayMenuBorder();
    }
            
    public void displayColorScheme() {
    //not sure what to do here yet.
        System.out.println();
        displayMenuBorder();     
        System.out.println("Color scheme is not yet an option"); 
        displayMenuBorder();
    }

    public void displayWinning() {
        //I don't know how to figure out which user is winning yet. More code to follow
        System.out.println();
        displayMenuBorder();     
        System.out.println( 
                "Currently, everyone is a winner!"); 
        displayMenuBorder();
    }

    public void displayMenuBorder() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }  
    public void mainMenu(){
        //myGame.display();
    }
}

