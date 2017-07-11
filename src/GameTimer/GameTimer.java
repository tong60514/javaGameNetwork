/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameTimer;

import ServerEventHandler.Instruction;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author user
 */
public abstract class GameTimer extends Timer{
    
    private Task timertask;
    
    public GameTimer(Task timertask){
        this.timertask = timertask;
    }
}
