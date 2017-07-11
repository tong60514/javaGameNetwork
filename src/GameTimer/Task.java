/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameTimer;

import ServerEventHandler.Instruction;
import java.util.TimerTask;
import ServerEventHandler.TaskCondition;
/**
 *
 * @author user
 */
public abstract class Task extends TimerTask{
    
    protected TaskCondition cond;
    
    public Task(){} 
    
    public Task(TaskCondition cond){
        this.cond = cond;
    } 
    
}
