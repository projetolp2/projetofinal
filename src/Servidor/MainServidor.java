/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author clistenes
 */
public class MainServidor {
    public static int count;
    static ArrayList<String> arrayElem;
    static ArrayList<String> escolhidos;
    
    public static void main(String[] args) throws IOException {
        
       //abri o socket do servidor e cria a fila que serão armazenados os clientes;
       Socket s1, s2;
       ServerSocket s = new ServerSocket(4444);
       //FilaArray fila = new FilaArray();
       ArrayList fila = new ArrayList();
       
       
        while(true){
           //recebendo cliente e guardando em uma fila;
           
           while(fila.size() != 2){
           Socket ns = s.accept();
           fila.add(ns);
           count = fila.size();
           System.out.println(count);
           }
           
            if(fila.size() == 2){
            
                //instanciando variaveis de entrada e saida de dados;
                s1 = (Socket) fila.remove(0);
                s2 = (Socket) fila.remove(0);
                arrayElem = new ArrayList();
                escolhidos = new ArrayList();
                tabelaPeriodica(arrayElem, escolhidos);
                DataOutputStream out1 = new DataOutputStream(s1.getOutputStream());
                DataOutputStream out2 = new DataOutputStream(s2.getOutputStream());
                
                //enviando mensagem de conectado;
                out1.writeUTF("conectado");
                out2.writeUTF("conectado");
                
                for (int i = 0; i < escolhidos.size(); i++) {
                    //System.out.println("Cheguei aqui");
                    out1.writeUTF(escolhidos.get(i));
                    out2.writeUTF(escolhidos.get(i));
                }
                
                //Thread do servidor;
                new Thread( new Servidor(s1, s2)).start();
                System.out.println("ELEMENTOS REMOVIDOS = " + fila.size());
            }
        }
        //s.close();
    }
    
    static public void tabelaPeriodica(ArrayList array, ArrayList esc) {
        array.add("Hidrogenio");
        array.add("Sodio");
        array.add("Potassio");
        array.add("Magnesio");
        array.add("Calcio");
        array.add("Estroncio");
        array.add("Bario");
        array.add("Titanio");
        array.add("Cromio");
        array.add("Tungstenio");
        array.add("Manganes");
        array.add("Ferro");
        array.add("Iridio");
        array.add("Paladio");
        array.add("Platina");
        array.add("Cobre");
        array.add("Prata");
        array.add("Ouro");
        array.add("Zinco");
        array.add("Mercurio");
        array.add("Aluminio");
        array.add("Galio");
        array.add("Carbono");
        array.add("Flerovio");
        array.add("Nitrogenio");
        array.add("Fosforo");
        array.add("Antimonio");
        array.add("Oxigenio");
        array.add("Enxofre");
        array.add("Selenio");
        array.add("Telurio");
        array.add("Polonio");
        array.add("Livermorio");
        array.add("Fluor");
        array.add("Cloro");
        array.add("Iodo");
        array.add("Neonio");
        array.add("Argonio");
        array.add("Xenonio");
        array.add("Radonio");
        
        int index = 0;
        String elem;
        while (esc.size() != 10) { //Escolhe aleatoriamente 10 elementos para começar o jogo.
            index = (int) (Math.random() * 40);
            elem = (String) array.get(index);

            if (esc.isEmpty()) { //Adiciona o 1º elemento.
                esc.add(elem);
            }else{
                if (!esc.contains(elem)) { //Testa se o elemento escolhido ja esta dentro da lista.
                    esc.add(elem);
                }
            }
        }
        for (int i = 0; i < escolhidos.size(); i++) {
            System.out.println(escolhidos.get(i));
        }
    }
}
