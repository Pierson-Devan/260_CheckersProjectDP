/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CIT260_05_JDCheckers_exceptions;

/**
 *
 * @author Devan
 */
public class GameException extends Exception{
    public GameException(){
    
    }
    public GameException(String message){
        super(message);
    }
    public GameException(String message, Throwable cause){
        super(message, cause);
    }
    public GameException(Throwable cause){
        super(cause);
    }
}