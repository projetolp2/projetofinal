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
public class Hidrogenio extends Elementos{
    String dica1, dica2, dica3;
    public Hidrogenio(JButton e, JButton n, JLabel nAtomico){ //Paineis canvas e canvas2
        super(e, n); //Envia os paineis para a classe Elementos
        super.setNome("Hidrogenio"); //Manda o nome para a classe Elementos.
        super.setNumeroAtomico(nAtomico); //Transfere o JLabel que esta na JanelaPrincipal para a classe elementos
        super.numeroAtomico = "1"; //Coloca na variavel numeroAtomico que esta em Elementos o valor 1.
        //super.setImagem(new ImageIcon(getClass().getResource("/Imagens/Hidrogenio.jpg")));
        setBackground(new Color(255, 255, 255, 150));
        setText("H");
        dica1 = "UTILIZADO COMO COMBUSTÍVEL PARA FOGUETES;";
        dica2 = "POSSUI O MENOR RAIO ATÔMICO DA TABELA PERIÓDICA";
        dica3 = "POSSUI UM ÚNICO PRÓTON";
    }
    
}