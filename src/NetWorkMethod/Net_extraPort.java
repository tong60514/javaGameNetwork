/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NetWorkMethod;

import ServerModule.Server;

/**
 *
 * @author user
 */
public class Net_extraPort extends Net_Method{
    private static final long serialVersionUID = 40470005L;
    private int Port;
    private Net_Info Identify;
    public Net_extraPort(){}
    public Net_extraPort(int Port,Net_Info Identify){
        this.Port = Port;
        this.Identify = Identify;
    }
    
    @Override
    public void Perform(Server server) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
