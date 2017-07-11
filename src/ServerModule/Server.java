/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerModule;

/**
 *
 * @author user
 */
public abstract class Server implements closable{
    abstract public int addCmp(ServerCmp cmp);
    public void removeCmp(ServerCmp cmp){
        this.rmCmp (cmp.getcode());
    }
    abstract protected void rmCmp(int Cmpcode);
}
