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
public class Net_Message extends Net_Method{
    private static final long serialVersionUID = 40470005L;
    private String text;
    private int num;
    public Net_Message(){}
    public Net_Message(int Player_No,String text){
        this.text = text;
        this.num = Player_No;
    }
    @Override
    public void Perform(Server server) {
        
    }
}
