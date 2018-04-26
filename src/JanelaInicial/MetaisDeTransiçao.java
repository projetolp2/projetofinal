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
public class MetaisDeTransiçao extends Elementos{
    String dica1, dica2, dica3;
    public MetaisDeTransiçao(JButton e, JButton n, JLabel nAtomico){
        super(e, n);
        setBackground(new Color(250, 128, 114, 150));
    }

    public void setMetaisDeTransiçao(MetaisDeTransiçao m, int x, int y, int w, int h, int i, int j, JPanel c) {
        m.setLocation(x + (w * i), y + (h * j));
        c.add(m);
        switch (i) {
            case 2:
                switch (j) {
                    case 3:
                        super.setNome("Escandio");
                        m.setText("Sc");
                        break;
                    case 4:
                        super.setNome("Itrio");
                        m.setText("Y");
                        break;
                    case 5:
                        m.setBackground(new Color(17, 204, 228, 150));
                        super.setNome("Lantanio");
                        m.setText("La");
                        break;
                    case 6:
                        m.setBackground(new Color(0, 85, 255, 150));
                        super.setNome("Actinio");
                        m.setText("Ac");
                        break;
                    default:
                        return;
                }
            return;
            case 3:
                switch (j) {
                    case 3:
                        super.setNome("Titanio");
                        m.setText("Ti");
                        m.dica1 = "É UTILIZADO COMO PINO PARA FRATURAS";
                        m.dica2 = "É UM METAL DE TRANSIÇÃO DO 4º PERÍODO";
                        m.dica3 = "SUA CONFIGURAÇÃO ELETRÔNICA TERMINA EM d²";
                        break;
                    case 4:
                        super.setNome("Zirconio");
                        m.setText("Zr");
                        break;
                    case 5:
                        super.setNome("Hafnio");
                        m.setText("Hf");
                        break;
                    case 6:
                        super.setNome("Rutherfordio");
                        m.setText("Rf");
                        break;
                    default:
                        return;
                        }
            return;
            case 4:
                switch (j) {
                    case 3:
                        super.setNome("Vanadio");
                        m.setText("V");
                        break;
                    case 4:
                        super.setNome("Niobio");
                        m.setText("Nb");
                        break;
                    case 5:
                        super.setNome("Tantalo");
                        m.setText("Ta");
                        break;
                    case 6:
                        super.setNome("Dubnio");
                        m.setText("Db");
                        break;
                    default:
                    return;
                }
            return;
            case 5:
                switch (j) {
                    case 3:
                        super.setNome("Cromio");
                        m.setText("Cr");
                        m.dica1 = "É UM METAL DE TRANSIÇÃO";
                        m.dica2 = "UTILIZADO NO PROCESSO DE GALVANOPLASTIA";
                        m.dica3 = "PERTENCE À FAMÍLIA 6";
                        break;
                    case 4:
                        super.setNome("Molibdenio");
                        m.setText("Mo");
                        break;
                    case 5:
                        super.setNome("Tungstenio");
                        m.setText("W");
                        break;
                    case 6:
                        super.setNome("Seaborgio");
                        m.setText("Sg");
                        break;
                    default:
                        return;
                        }
            return;
            case 6:
                switch (j) {
                    case 3:
                        super.setNome("Manganes");
                        m.setText("Mn");
                        m.dica1 = "POSSUI QUATRO CAMADAS ENERGÉTICAS";
                        m.dica2 = "ELE É UTILIZADO EM COFRES";
                        m.dica3 = "SUA CONFIGURAÇÃO ELETRÔNICA TERMINA EM d5";
                        break;
                    case 4:
                        super.setNome("Tecnecio");
                        m.setText("Tc");
                        break;
                    case 5:
                        super.setNome("Renio");
                        m.setText("Re");
                        break;
                    case 6:
                        super.setNome("Bohrio");
                        m.setText("Bh");
                        break;
                    default:
                        return;
                }
            return;
            case 7:
                switch (j) {
                    case 3:
                        super.setNome("Ferro");
                        m.setText("Fe");
                        m.dica1 = "É UM METAL DE TRANSIÇÃO";
                        m.dica2 = "MUITO UTILIZADO EM PORTÕES";
                        m.dica3 = "POSSUI NÚMERO ATÔMICO IGUAL A 26";
                        break;
                    case 4:
                        super.setNome("Rutenio");
                        m.setText("Ru");
                        break;
                    case 5:
                        super.setNome("Osmio");
                        m.setText("Os");
                        break;
                    case 6:
                        super.setNome("Hassio");
                        m.setText("Hs");
                        break;
                    default:
                        return;
                }
            return;
            case 8:
                switch (j) {
                    case 3:
                        super.setNome("Cobalto");
                        m.setText("Co");
                        break;
                    case 4:
                        super.setNome("Rodio");
                        m.setText("Rh");
                        break;
                    case 5:
                        super.setNome("Iridio");
                        m.setText("Ir");
                        m.dica1 = "UTILIZADO EM AGULHAS DE INJEÇÃO";
                        m.dica2 = "É UM METAL DE TRANSIÇÃO";
                        m.dica3 = "É O METAL MAIS RESISTENTE A CORROSAO CONHECIDO";
                        break;
                    case 6:
                        super.setNome("Meitnerio");
                        m.setText("Mt");
                        break;
                    default:
                        return;
                }
            return;
            case 9:
                switch (j) {
                    case 3:
                        super.setNome("Niquel");
                        m.setText("Ni");
                        break;
                    case 4:
                        super.setNome("Paladio");
                        m.setText("Pd");
                        m.dica1 = "É UTILIZADO NA BLINDAGEM DE RADIAÇÃO";
                        m.dica2 = "ESTÁ LOCALIZADO NO SEXTO PERÍODO";
                        m.dica3 = "PERTENCE Â FAMÍLIA DO CARBONO E SEU SÍMBOLO REPRESENTA A SIGLA DO ESTADO DA PARAÍBA";
                        break;
                    case 5:
                        super.setNome("Platina");
                        m.setText("Pt");
                        m.dica1 = "ENCONTRA-SE NO SEXTO PERÍODO";
                        m.dica2 = "SEU RAIO ATÔMICO É MAIOR QUE O DO OURO";
                        m.dica3 = "MUITO UTILIZADO NO PROCESSO DE RECUPERAÇÃO DE FRATURA ÓSSEA";
                        break;
                    case 6:
                        super.setNome("Darmstadtio");
                        m.setText("Ds");
                        break;
                    default:
                        return;
                }
            return;
            case 10:
                switch (j) {
                    case 3:
                        super.setNome("Cobre");
                        m.setText("Cu");
                        m.dica1 = "É MUITO UTILIZADO EM FIAÇÕES ELÉTRICAS";
                        m.dica2 = "É UM METAL DO QUARTO PERÍODO";
                        m.dica3 = "ESTÁ LOCALIZADO NA FAMÍLIA ONZE";
                        break;
                    case 4:
                        super.setNome("Prata");
                        m.setText("Ag");
                        m.dica1 = "É USADO EM BIJUTERIAS, TALHERES, ETC";
                        m.dica2 = "É UM METAL DE TRANSIÇÃO";
                        m.dica3 = "ELEMENTO USADO NA FABRICAÇAO DE ESPELHOS";
                        break;
                    case 5:
                        super.setNome("Ouro");
                        m.setText("Au");
                        m.dica1 = "É METAL REPRESENTATIVO";
                        m.dica2 = "MUITO UTILIZADO EM JOIAS";
                        m.dica3 = "ESTÁ LOCALIZADO NO SEXTO PERÍODO DA FAMÍLIA 11"; /////
                        break;
                    case 6:
                        super.setNome("Roentgenio");
                        m.setText("Rg");
                        break;
                    default:
                        return;
                }
            return;
            case 11:
                switch (j) {
                    case 3:
                        super.setNome("Zinco");
                        m.setText("Zn");
                        m.dica1 = "SEU RAIO ATÔMICO É MAIOR QUE O DO GÁS NOBRE CRIPTÔNIO";
                        m.dica2 = "É UM METAL DE TRANSIÇÃO UTILIZADO NA FABRICAÇÃO DE CALHAS";
                        m.dica3 = "POSSUI QUATRO CAMADAS ENERGÉTICAS E ENCONTRA-SE NA FAMÍLIA DOZE";
                        break;
                    case 4:
                        super.setNome("Cadmio");
                        m.setText("Cd");
                        break;
                    case 5:
                        super.setNome("Mercurio");
                        m.setText("Hg");
                        m.dica1 = "MUITO UTILIZADO EM COLUNAS DE TERMÔMETRO";
                        m.dica2 = "TEM O MESMO NOME DE UM PLANETA DO SISTEMA SOLAR";
                        m.dica3 = "METAL ENCONTRADO NO ESTADO LÍQUIDO NA TEMPERATURA AMBIENTE";
                        break;
                    case 6:
                        super.setNome("Copernicio");
                        m.setText("Cn");
                        break;
                    default:
                        return;
                }
            default:
                return;
        }
    }
}
