/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerModule;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author user
 */
public abstract class ServerCmp {
    protected int Cmpcode ;
    protected Server server = null;
    protected Lock CmpLock = new ReentrantLock();
    public final void Serverstart(){
        try{
            CmpLock.lock();
            cmpStart();
        }finally{
            CmpLock.unlock();
        }
    }
    abstract protected void cmpStart();
    public final void Serverinterrupt(){
        try{
            CmpLock.lock();
            cmpInterrupt();
        }finally{
            CmpLock.unlock();
        }
    }
    abstract protected void cmpInterrupt();
    
    
    
    
    public final void Serverdestroy() {
        
        
        try{
            CmpLock.lock();
            cmpDestroy();
        }finally{
            CmpLock.unlock();
        }
    }
    abstract protected void cmpDestroy();
    
    
    
    public int getcode(){
        return this.Cmpcode;
    }
    public void switchServer(Server server){
        this.server = server;
        this.Cmpcode = server.addCmp(this);
    }
    
    
    
}
