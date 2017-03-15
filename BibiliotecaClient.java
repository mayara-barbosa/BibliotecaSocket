/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibiliotecaclient;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author Mayara
 */
public class BibiliotecaClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        // TODO code application logic here
        DatagramSocket client = new DatagramSocket();
        
        String user;
        String passwd;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu usuario: ");
        user = sc.nextLine();
        System.out.println("senha: ");
        passwd = sc.nextLine();
        
        String pacote = new String();
        pacote = user+"."+passwd;
        byte[] message = pacote.getBytes();
        byte [] receiveData = new byte [1024];
        
        Inet4Address enderecoDestino;
        enderecoDestino =  (Inet4Address) Inet4Address.getByName("localhost");
        
        //mandando mensagem para server        
        DatagramPacket send;
        send = new DatagramPacket(message, message.length, enderecoDestino, 5555);
        client.send(send);
        
        DatagramPacket receive;
        receive = new DatagramPacket(receiveData, receiveData.length);
        client.receive(receive);               
        System.out.println("Dado recebido:" + new String(receive.getData(), receive.getOffset(), receive.getLength()));
        
    }
    
}
