/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JanelaInicial;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
/**
 *
 * @author jayme
 */
public class Elementos extends JButton{
    private String nome; //Variavel que recebe o nome de cada elemento.
    ImageIcon imagem;
    String numeroAtomico;
    JLabel label;
    public Elementos(JButton e, JButton n){ //Paineis que vem da Janela Principal
        super();
        //super.removeMouseListener(super.getMouseListeners()[0]);
        super.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent me) {
            javax.swing.border.Border cor1 = BorderFactory.createLineBorder(getBackground(), 3);
            setBorder(cor1);
            e.setVisible(true); //Botao onde aparece o simbolo do elemento
            n.setVisible(true); //Botao onde aparece o nome do elemento
            e.setBackground(getBackground()); //Pega a cor do botao e joga no outro.
            //e.setIcon(imagem); //Coloca uma imagem do elemento no botao 
            n.setBackground(getBackground()); //Pega a cor do botao e joga no outro.
            e.setText(getText()); //Pegua o texto do botao e insere nesse botao (Apenas o simbolo)
            n.setText(nome); //Aqui, o botao recebe o nome real do elemento pelo metodo criado la em baixo.
            //label.setText(numeroAtomico); //Coloca o numero atomico do elemento.
        }

        @Override
        public void mouseExited(MouseEvent me) {
            javax.swing.border.Border cor2 = BorderFactory.createLineBorder(null, 0);
            setBorder(cor2);
            e.setVisible(false); //Deixa invisivel quando o mouse sai de um botao
            n.setVisible(false); //Idem ao de cima.
            e.setBackground(null); //Apaga a cor de fundo
            n.setBackground(null); //Idem ao de cima
            e.setText(""); //Coloca uma string vazia ao botao.
            n.setText(""); //Idem ao de cima.
            //label.setText(""); //Retira o numero atomico do elemento.
        }
        });
        super.setSize(55, 65);
        super.setLocation(15, 25);
        super.setFont(super.getFont().deriveFont(Font.PLAIN, 18));
        super.setFocusPainted(false);
        super.setVisible(true);
        super.setFocusable(false);
    }

    public void setNome(String nome) { //Aqui recebe o nome do elemento fornecido por cada janela (alcalinos, alcallinos-terrosos, etc) e joga nesse metodo.
        this.nome = nome;
    }

    void setImagem(ImageIcon imageIcon) {
        imagem = imageIcon;
    }
    
    void setNumeroAtomico(JLabel l){
        label = l;
    }
    
}
