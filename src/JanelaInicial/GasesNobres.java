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
public class GasesNobres extends Elementos{
    String dica1, dica2, dica3;
    public GasesNobres(JButton e, JButton n, JLabel nAtomico){ //Paineis canvas e canvas2
        super(e, n); //Envia os paineis para a classe Elementos
        setBackground(new Color(106, 90, 205, 150));
    }
    
    public void setGasesNobres(GasesNobres n, int x, int y, int w, int h, int i, JPanel c){
        n.setLocation(x + (w * 17), y + (h * i));
        c.add(n);
        switch (i) {
            case 0:
                super.setNome("Helio"); //Manda o nome para a classe Elementos.
                n.setText("He");
                break;
            case 1:
                super.setNome("Neonio");
                n.setText("Ne");
                n.dica1 = "UTILIZADO EM ILUMINAÇÃO DE PLACAS DE PROPAGANDAS";
                n.dica2 = "ELEMENTO NA FAMÍLIA DOS ELEMENTOS NOBRES";
                n.dica3 = "ELEMENTO DO 2o PERÍODO";
                break;
            case 2:
                super.setNome("Argonio");
                n.setText("Ar");
                n.dica1 = "É UTILIZADO EM LÂMPADAS INCANDESCENTES";
                n.dica2 = "ENCONTRA-SE NO TERCEIRO PERÍODO";
                n.dica3 = "NÃO INTERAGE COM NENHUM ELEMENTO DA TABELA PERIÓDICA";
                break;
            case 3:
                super.setNome("Criptonio");
                n.setText("Kr");
                break;
            case 4:
                super.setNome("Xenonio");
                n.setText("Xe");
                n.dica1 = "UTILIZADO EM LÂMPADAS PARA BRONZEAMENTO ARTIFICIAL";
                n.dica2 = "ESTÁ NO 5o PERÍODO";
                n.dica3 = "ELEMENTO QUE COMPÕE OS GASES NOBRES";
                break;
            case 5:
                super.setNome("Radonio");
                n.setText("Rn");
                n.dica1 = "POSSUI O MENOR RAIO ATÔMICO DO PERÍODO SEIS";
                n.dica2 = "UTILIZADO EM SISMÓGRAFOS";
                n.dica3 = "POSSUI A CAMADA DE VALÊNCIA COMPLETA";
                break;
            case 6:
                super.setNome("Oganessonio");
                n.setText("Og");
                break;
            default:
                break;
        }
    }
}
