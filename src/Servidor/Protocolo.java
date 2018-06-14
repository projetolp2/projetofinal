package Servidor;

import JanelaInicial.Elementos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author clistenes
 */
public class Protocolo {
    ArrayList<ElementosServidor> elementos;
    int index = 0;
    
    public Protocolo(ArrayList elem){
        elementos = elem;
        for (int i = 0; i < elementos.size(); i++) {
            System.out.println(elementos.get(i).getNome()); //Estou testando se os elementos estao aqui.
        }
    }
    
    public String ProcessLine(String command){
        if(command.equalsIgnoreCase(elementos.get(index).getNome())){
            JOptionPane.showMessageDialog(null, "Acertou", "Acertou", 1); //Mensagem que acertou.
            index++; //Aument o index para quadno acertar passar para o proximo elemento.
            if (index == 10) { //Aqui era para encerrar a partida quadno index chegasse em 10... mas nao funciona XD
                return "acabou";
            }
            return "acertou";
        }else{
            JOptionPane.showMessageDialog(null, "Errou", "Errou", 0);
            return "SERVIDOR RESPONDE: ERROUUU !!";
        }
        
    }
    
}
