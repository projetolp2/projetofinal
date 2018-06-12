/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author clistenes
 */
public class Servidor implements Runnable {
    Socket s, oponent;
    
     public Servidor(Socket ns, Socket oponente){
        this.s = ns;
        this.oponent = oponente;
    }
    
    @Override
    public void run(){
        
        try {     
            //Cliente 1;
            DataInputStream in = new DataInputStream(s.getInputStream());
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            Protocolo protocolo = new Protocolo();
            
            //Cliente 2;
            String fromOponent;
            DataInputStream inOponent = new DataInputStream(oponent.getInputStream());
            DataOutputStream outOponent = new DataOutputStream(oponent.getOutputStream());
            
            //testando servidor;
            System.out.println("SERVIDOR - CLIENTE 1: " + s);
            System.out.println("SERVIDOR - CLIENTE 2: " + oponent);
            new Thread(){
                public void run(){
                    String fromClient;
                    while (true) {
                        try {
                            fromClient = in.readUTF();
                            out.writeUTF(protocolo.ProcessLine(fromClient));
                            //outOponent.writeUTF(protocolo.ProcessLine(fromClient));
                        } catch (IOException ex) {
                            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }.start();
            
            while(true){
                System.out.println("SERVIDOR - ESTOU LENDO");
                //String fromClient = in.readUTF();
                fromOponent = inOponent.readUTF();
                //System.out.println("SERVIDOR - PASSEI DOS LEITORES");
                //System.out.println(fromClient);
                System.out.println(fromOponent);
                //out.writeUTF(protocolo.ProcessLine(fromClient));
                //out.writeUTF(protocolo.ProcessLine(fromOponent));
                outOponent.writeUTF(protocolo.ProcessLine(fromOponent));
                //out.writeUTF(protocolo.ProcessLine(fromOponent));
                System.out.println("SERVIDOR - CHEGUEI NO FINAL");
                /*if(fromClient.equals("Bye") || fromOponent.equals("Bye"))
                    break;*/
                
            }
            //in.close();
            //out.close();
            //s.close();
        } catch (IOException ex) {
            
        }
    
    }
}
