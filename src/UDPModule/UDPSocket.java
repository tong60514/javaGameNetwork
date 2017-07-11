/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDPModule;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import static UDPModule.SerializedObjectHandler.DeserializeObject;
import static UDPModule.SerializedObjectHandler.SerializeObject;
import java.io.IOException;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author user
 */
public class UDPSocket {
    protected DatagramSocket UDPSocket = null;
    protected DatagramPacket packet = null;
    protected int Port = -1;
    protected String IP = null ;
    public UDPSocket(int Port) throws SocketException{
        this.Port = Port;
        this.UDPSocket = creatDatagramSocket(Port);
    }
    public UDPSocket(Socket socket,int Port) throws SocketException{
        this.IP = socket.getInetAddress().getHostAddress();
        this.Port = Port;
        this.UDPSocket = creatDatagramSocket();
    }
    private static DatagramSocket creatDatagramSocket(int Port) throws SocketException{
        return new DatagramSocket(Port);
    }
    private static DatagramSocket creatDatagramSocket() throws SocketException{
        return new DatagramSocket();
    }


    

}
