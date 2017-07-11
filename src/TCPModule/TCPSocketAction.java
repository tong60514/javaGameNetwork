package TCPModule;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;


/**
 *
 * @author user
 */
public class TCPSocketAction  {
    protected final ObjectOutputStream Objout;
    protected final ObjectInputStream Objin;
    public TCPSocketAction(Socket socket) throws IOException
    {
        Objout =  new ObjectOutputStream(new BufferedOutputStream (socket.getOutputStream()));
        Objout.flush();
        Objin  =  new ObjectInputStream(new BufferedInputStream(socket.getInputStream()));
    }
    public void send(Serializable instruction) throws IOException{
        Objout.writeObject(instruction);
        Objout.flush();
    }
    public Object receive() throws IOException,ClassNotFoundException{
        synchronized(Objin){
            return Objin.readObject();
        }
    }
}
