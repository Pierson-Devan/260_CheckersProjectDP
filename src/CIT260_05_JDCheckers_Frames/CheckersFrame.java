package CIT260_05_JDCheckers_Frames;
import java.awt.Color; 
import java.awt.Container; 
import java.awt.Dimension; 
import java.awt.GridLayout; 
import javax.swing.JFrame; 
import static javax.swing.JFrame.EXIT_ON_CLOSE; /*


package CIT260_05_JDCheckers_Frames;

/**
 *
 * @author Devan
 */
import javax.swing.JPanel;
public class CheckersFrame {

    public CheckersFrame(){
    
    }


    public void viewBoard(){ 
        JFrame checkerBoard = new JFrame(); 
        checkerBoard.setSize(400, 400); 
        checkerBoard.setTitle("CheckerBoard"); 
        checkerBoard.setDefaultCloseOperation(EXIT_ON_CLOSE); 
        int row = 8; 
        int col = 8; 
        Container cont = checkerBoard.getContentPane(); 
        cont.setLayout(new GridLayout(row, col)); 
        Color checker; 
        for (int x = 1; x <= (row * col); x++) { 
            int altr = 0; 
            altr = (x - 1) % col; 
            altr += (x - 1) / col; 

            if (altr % 2 == 0) { 
                checker = Color.black; 
            } else { 
                checker = Color.red; 
            } 

            JPanel panel = new JPanel(); 
            panel.setPreferredSize(new Dimension(400 / row, 400 / col)); 
            panel.setBackground(checker); 
            cont.add(panel); 
        } 
        checkerBoard.setVisible(true); 
    } 
}
