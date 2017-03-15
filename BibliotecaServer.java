/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaserver;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.util.List;

/**
 *
 * @author Mayara
 */
public class BibliotecaServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
        int port = 5555;
        DatagramSocket server;
        server = new DatagramSocket(port);
        
        while(true){
            byte[] buffer = new byte[1024];
            DatagramPacket receive, send;
            receive = new DatagramPacket(buffer, buffer.length);
            server.receive(receive);
            System.out.println("Dado recebido:" + new String(receive.getData(), receive.getOffset(), receive.getLength()));
            
            
        }
        
    }
    
}
