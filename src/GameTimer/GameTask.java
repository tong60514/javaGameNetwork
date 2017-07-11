/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameTimer;

import ExceptionServer.NetworkException;
import ServerEventHandler.Instruction;
import java.util.TimerTask;
import ServerEventHandler.TaskCondition;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class GameTask extends Task{
    private Instruction instr;
    public GameTask(TaskCondition cond,Instruction instr){
        super(cond);
        this.instr = instr;
    }
    @Override
    public void run() {
        if(this.cond.condition())
            try {
                this.instr.Do();
            } catch (NetworkException ex) {
                Logger.getLogger(GameTask.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}
