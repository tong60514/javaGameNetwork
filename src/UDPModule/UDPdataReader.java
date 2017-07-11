/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDPModule;

import static UDPModule.SerializedObjectHandler.DeserializeObject;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.SocketException;

/**
 *
 * @author user
 */
public class UDPdataReader extends UDPSocket{
    
    public UDPdataReader(int Port) throws SocketException {
        super(Port);
    }
    public final Object receive() throws ClassNotFoundException, IOException
    {
        byte[] inByte = new byte[10000];
        this.packet = new DatagramPacket(inByte,inByte.length);
        UDPSocket.receive(packet);
        Object obj = DeserializeObject(inByte);
        return obj;
    }
    
    
}
