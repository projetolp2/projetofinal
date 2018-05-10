/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JanelaInicial;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author jayme
 */
public class MetaisTransiçaoInterna extends Elementos{
    
    public MetaisTransiçaoInterna(JButton e, JButton n, JLabel nAtomico) {
        super(e, n);
        setBackground(new Color(17, 204, 228, 150));
        //super.setNumeroAtomico(nAtomico);
    }
    
    public void setMetaisTransiçaoInterna(MetaisTransiçaoInterna m, int x, int y, int w, int h, int i, int j, JPanel c){
        m.setLocation(x + (w * i), y + (h * j) + 6);
        c.add(m);
        switch (i) {
            case 2:
                switch (j) {
                    case 7:
                        super.setNome("Cerio");
                        m.setText("Ce");
                        break;
                    case 8:
                        m.setBackground(new Color(0, 85, 255, 150));
                        super.setNome("Torio");
                        m.setText("Th");
                        break;
                    default:
                        return;
                }
            return;
            case 3:
                switch (j) {
                    case 7:
                        super.setNome("Praseodimio");
                        m.setText("Pr");
                        break;
                    case 8:
                        m.setBackground(new Color(0, 85, 255, 150));
                        super.setNome("Protactinio");
                        m.setText("Pa");
                        break;
                    default:
                        return;
                }
            return;
            case 4:
                switch (j) {
                    case 7:
                        super.setNome("Neodimio");
                        m.setText("Nd");
                        break;
                    case 8:
                        m.setBackground(new Color(0, 85, 255, 150));
                        super.setNome("Uranio");
                        m.setText("U");
                        break;
                    default:
                        return;
                }
            return;
            case 5:
                switch (j) {
                    case 7:
                        super.setNome("Promecio");
                        m.setText("Pm");
                        break;
                    case 8:
                        m.setBackground(new Color(0, 85, 255, 150));
                        super.setNome("Netunio");
                        m.setText("Np");
                        break;
                    default:
                        return;
                }
            return;
        }
        //super.setNome("Elemento");
        //m.setText("El");
    }
}
