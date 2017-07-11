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
public abstract class Net_Method implements Serializable{
    private static final long serialVersionUID = 40470005L;
    public abstract void Perform(Server server) throws NetworkException;
}
