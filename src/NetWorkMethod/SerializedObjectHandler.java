/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NetWorkMethod;


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
    
    static public byte[] creatSerializedObject(Serializable object)
    {
        ObjectOutputStream out;
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        try{
            out = new ObjectOutputStream(byteOut);
            out.writeObject(object);
        }catch(IOException e){
            System.out.println(e);
        }
        byte[] SerializedObject = byteOut.toByteArray();
        return SerializedObject;
    }
    static public LinkedList DeserializeObjectLinkedList(byte[] ObjectLinkedList) throws ClassNotFoundException
    {
        ObjectInputStream in;
        Object LinkedListUnCast ;
        ByteArrayInputStream inByte = new ByteArrayInputStream(ObjectLinkedList);
        try {
            in = new ObjectInputStream(inByte);
            LinkedListUnCast = in.readObject();
            return (LinkedList<Object>)LinkedListUnCast;
        } catch (IOException ex) {
            Logger.getLogger(SerializedObjectHandler.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    static public Object DeserializeObject(byte[] SerializedObject) throws ClassNotFoundException
    {
        ObjectInputStream in ;
        Object objectDeserialized;
        ByteArrayInputStream byteIn= new ByteArrayInputStream(SerializedObject);
        try {
            in = new ObjectInputStream(byteIn);
            objectDeserialized = in.readObject();
            return objectDeserialized;
        } catch (IOException ex) {
            Logger.getLogger(SerializedObjectHandler.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
    
    
    
    
    
}
