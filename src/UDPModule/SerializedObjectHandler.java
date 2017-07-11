/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDPModule;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.LinkedList;

/**
 *
 * @author user
 */
public class SerializedObjectHandler {
    
    static public byte[] SerializeObject(Serializable object) throws IOException
    {
        ObjectOutputStream out;
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        out = new ObjectOutputStream(byteOut);
        out.writeObject(object);
        byte[] SerializedObject = byteOut.toByteArray();
        return SerializedObject;
    }
    static public Object DeserializeObject(byte[] SerializedObject) throws ClassNotFoundException, IOException
    {
        ObjectInputStream in ;
        Object objectDeserialized;
        ByteArrayInputStream byteIn= new ByteArrayInputStream(SerializedObject);
        in = new ObjectInputStream(byteIn);
        objectDeserialized = in.readObject();
        return objectDeserialized;
        
    }
    
    
    
    
    
    
}
