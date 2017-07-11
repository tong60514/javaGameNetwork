/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import TCPModule.TCPSocketAction;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class TCPdatatransfertest {
    
    public TCPdatatransfertest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void test(){
        TCPSocketAction server ;
        int port = 9487;
        new Thread(()->{
            try {
                ServerSocket serversocket = new ServerSocket(port);
                System.out.println("listening ");
                TCPSocketAction servertcp = new TCPSocketAction(serversocket.accept());
                System.out.println("client connected");
                System.out.println("waiting client data...");
                Object obj = servertcp.receive();
                assertEquals("client says client",(String)obj);
                System.out.println("data : " + (String)obj);
                servertcp.send("server ay hello");
                
            } catch (IOException ex) {
                Logger.getLogger(TCPdatatransfertest.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TCPdatatransfertest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }).start();
        
        try {
            Socket cli = new Socket();
            System.out.println("connecting server");
            cli.connect(new InetSocketAddress("127.0.0.1",port));
            System.out.println("connected !!");
            TCPSocketAction clienttcp = new TCPSocketAction(cli);
            clienttcp.send("client says client");
            System.out.println("waiting server data ....");
            Object obj = clienttcp.receive();
            assertEquals("server ay hello",(String)obj);
            
            
        } catch (IOException ex) {
            Logger.getLogger(TCPdatatransfertest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TCPdatatransfertest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
