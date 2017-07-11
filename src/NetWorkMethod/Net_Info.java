/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NetWorkMethod;

import ExceptionServer.NetworkException;
import ServerModule.Server;
import java.io.Serializable;

/**
 *
 * @author user
 */
public class Net_Info extends Net_Method implements Serializable{
    private static final long serialVersionUID = 94879487L;
    private int loginOrder;
    public Net_Info(){}
    public Net_Info(int loginOrder){
        this.loginOrder =loginOrder;
    }
    public int getIdentifyNum(){
        return loginOrder;
    }

    @Override
    public void Perform(Server server) throws NetworkException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
