/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messenger;

/**
 *
 * @author sumit
 */
public class Messenger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        chat_server obj = new chat_server();
        obj.setTitle("Server");
        chat_client ob = new chat_client();
        ob.setTitle("Client");
    }
    
}
