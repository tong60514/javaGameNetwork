/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NetWorkMethod;

import ExceptionServer.NetworkException;
import ServerModule.Server;


/**
 *
 * @author user
 */
public class Net_Fail extends Net_Method{
    private static final long serialVersionUID = 40470005L;
    public Net_Fail(){
        
    }
    @Override
    public void Perform(Server server) throws NetworkException {
        throw new NetworkException(server);
    }
    
}
