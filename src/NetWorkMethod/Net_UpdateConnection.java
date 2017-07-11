/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NetWorkMethod;
import ServerModule.Server;
import java.util.LinkedList;

/**
 *
 * @author user
 */
public class Net_UpdateConnection extends Net_Method {
    private static final long serialVersionUID = 40470005L;
    private boolean[] connection;
    public Net_UpdateConnection(){}
    public Net_UpdateConnection(boolean[] connection){
        this.connection = connection;
    }
    @Override
    public void Perform(Server server) {
        
    }
    
}
