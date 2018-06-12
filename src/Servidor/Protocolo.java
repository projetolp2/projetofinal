package Servidor;

import JanelaInicial.Elementos;
import javax.swing.JOptionPane;

/**
 *
 * @author clistenes
 */
public class Protocolo {
    
    public Protocolo(){
        
    }
    
    public String ProcessLine(String command){
        if(command.equalsIgnoreCase("Hidrogenio")){
            return "acertou";
        }else{
            JOptionPane.showMessageDialog(null, "Errou", "Errou", 0);
            return "SERVIDOR RESPONDE: ERROUUU !!";
        }
        
    }
    
}
