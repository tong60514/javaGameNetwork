/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionServer;

import ServerModule.Game;

/**
 *
 * @author user
 */
public class GameException extends Exception{
    private Game game;
    public GameException(Game game){
        this.game = game;
    }
}
