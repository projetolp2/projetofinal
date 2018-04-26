/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JanelaInicial;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author jayme
 */
public class AlcalinosTerrosos extends Elementos{
    String dica1, dica2, dica3;
    public AlcalinosTerrosos(JButton e, JButton n, JLabel nAtomico){ //Paineis canvas e canvas2
        super(e, n); //Envia os paineis para a classe Elementos
        setBackground(new Color(255, 215, 0, 150));
    }
    
    public void setAlcalinosTerrosos(AlcalinosTerrosos at, int x, int y, int w, int h, int num, JPanel c){
        at.setLocation(x + w, y + (h * num));
        switch (num) {
            case 1:
                super.setNome("Berilio"); //Manda o nome para a classe Elementos.
                at.setText("Be");
                break;
            case 2:
                super.setNome("Magnesio");
                at.setText("Mg");
                at.dica1 = "UTILIZADOS EM RODAS DE LIGA LEVE";
                at.dica2 = "É DA FAMÍLIA DOS METAIS ALCALINO-TERROSOS";
                at.dica3 = "POSSUI TRÊS CAMADAS ENERGÉTICAS";
                break;
            case 3:
                super.setNome("Calcio");
                at.setText("Ca");
                at.dica1 = "COMPÕE OS NOSSOS OSSOS E É UTILIZADO NO GESSO";
                at.dica2 = "SUA DISTRIBUIÇÃO ELETRÔNICA TERMINA EM s²";
                at.dica3 = "POSSUI QUATRO CAMADAS ENERGÉTICAS";
                break;
            case 4:
                super.setNome("Estroncio");
                at.setText("Sr");
                at.dica1 = "UTILIZADO EM FOGOS DE ARTIFÍCIO";
                at.dica2 = "POSSUI O SEGUNDO MAIOR RAIO ATÔMICO NA FAMÍLIA DOS METAIS ALCALINO-TERROSOS";
                at.dica3 = "UTILIZADO EM TINTAS QUE BRILHAM NO ESCURO";
                break;
            case 5:
                super.setNome("Bario");
                at.setText("Ba");
                at.dica1 = "SEU RAIO ATÔMICO É MAIOR QUE O DO OURO";
                at.dica2 = "POSSUI SEIS CAMADAS ENERGÉTICAS";
                at.dica3 = "É UM METAL ALCALINO –TERROSSO USADO EM FOGOS DE ARTIFÍCIO E CHAPAS DE ESTÔMAGO";
                break;
            case 6:
                super.setNome("Radio");
                at.setText("Ra");
                break;
            default:
                return;
        }
        c.add(at);
    }
    
}
