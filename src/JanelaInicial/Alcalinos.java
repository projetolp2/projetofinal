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
public class Alcalinos extends Elementos{
    String dica1, dica2, dica3;
    public Alcalinos(JButton e, JButton n, JLabel nAtomico){ //Paineis canvas e canvas2
        super(e, n); //Envia os paineis para a classe Elementos
        setBackground(new Color(255, 140, 0, 150));
        super.setNumeroAtomico(nAtomico);
    }
    
    public void setAlcalinos(Alcalinos a, int x, int y, int h, int num, JPanel c){    
        a.setLocation(x, y + (h * num));
        switch (num) {
            case 1:
                super.setNome("Litio"); //Manda o nome para a classe Elementos.
                super.numeroAtomico = "3";
                //super.setImagem(new ImageIcon(getClass().getResource("/Imagens/Litio.jpg")));
                a.setText("Li");
                break;
            case 2:
                super.setNome("Sodio");
                super.numeroAtomico = "11";
                a.setText("Na");
                a.dica1 = "UM DOS COMPONETES DO SAL DE COZINHA";
                a.dica2 = "É UM METAL ALCALINO QUE EXPLODE EM CONTATO COM A ÁGUA";
                a.dica3 = "POSSUI TRÊS CAMADAS ENERGÉTICAS";
                break;
            case 3:
                super.setNome("Potassio");
                super.numeroAtomico = "19";
                a.setText("K");
                a.dica1 = "É UM METAL DO QUARTO PERÍODO";
                a.dica2 = "É UTILIZADO EM ADUBOS QUÍMICOS";
                a.dica3 = "ESTÁ NO GRUPO DOS METAIS ALCALINOS";
                break;
            case 4:
                super.setNome("Rubidio");
                super.numeroAtomico = "37";
                a.setText("Rb");
                break;
            case 5:
                super.setNome("Cesio");
                super.numeroAtomico = "55";
                a.setText("Cs");
                break;
            case 6:
                super.setNome("Francio");
                super.numeroAtomico = "87";
                a.setText("Fr");
                break;
            default:
                return;
            }
        c.add(a);
    }
}
