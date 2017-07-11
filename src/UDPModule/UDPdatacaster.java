/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDPModule;

import static UDPModule.SerializedObjectHandler.SerializeObject;
import java.io.IOException;
import java.io.Serializable;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.Timer;

/**
 *
 * @author user
 */
public class UDPdatacaster extends UDPSocket {
    //private final Timer castTimer ;
    public UDPdatacaster(Socket socket, int Port) throws SocketException {
        super(socket, Port);
    }
    protected final void sendObject(byte[] outbyte) throws IOException {
        this.packet = new DatagramPacket(
            outbyte,outbyte.length,InetAddress.getByName(this.IP),this.Port);
        this.UDPSocket.send(packet);            
    }
    public final void send(Serializable object) throws IOException {
        byte[] obj;
        obj = SerializeObject(object);
        sendObject(obj);
    }
    
}
