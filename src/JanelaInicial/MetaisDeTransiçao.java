/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JanelaInicial;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author jayme
 */
public class MetaisDeTransiçao extends Elementos{
    String dica1, dica2, dica3;
    public MetaisDeTransiçao(JButton e, JButton n, JLabel nAtomico, ArrayList<Elementos> arrayElem){
        super(e, n, arrayElem);
        setBackground(new Color(250, 128, 114, 150));
        super.setNumeroAtomico(nAtomico);
    }

    public void setMetaisDeTransiçao(MetaisDeTransiçao m, int x, int y, int w, int h, int i, int j, JPanel c) {
        m.setLocation(x + (w * i), y + (h * j));
        c.add(m);
        switch (i) {
            case 2:
                switch (j) {
                    case 3:
                        super.setNome("Escandio");
                        super.numeroAtomico = "21";
                        m.setText("Sc");
                        break;
                    case 4:
                        super.setNome("Itrio");
                        super.numeroAtomico = "39";
                        m.setText("Y");
                        break;
                    case 5:
                        m.setBackground(new Color(17, 204, 228, 150));
                        super.setNome("Lantanio");
                        super.numeroAtomico = "57";
                        m.setText("La");
                        break;
                    case 6:
                        m.setBackground(new Color(0, 85, 255, 150));
                        super.setNome("Actinio");
                        super.numeroAtomico = "89";
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
                        super.numeroAtomico = "22";
                        m.setText("Ti");
                        m.dica1 = "É UTILIZADO COMO PINO PARA FRATURAS";
                        m.dica2 = "É UM METAL DE TRANSIÇÃO DO 4º PERÍODO";
                        m.dica3 = "SUA CONFIGURAÇÃO ELETRÔNICA TERMINA EM d²";
                        super.setArrayList(m);
                        break;
                    case 4:
                        super.setNome("Zirconio");
                        super.numeroAtomico = "40";
                        m.setText("Zr");
                        break;
                    case 5:
                        super.setNome("Hafnio");
                        super.numeroAtomico = "72";
                        m.setText("Hf");
                        break;
                    case 6:
                        super.setNome("Rutherfordio");
                        super.numeroAtomico = "104";
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
                        super.numeroAtomico = "23";
                        m.setText("V");
                        break;
                    case 4:
                        super.setNome("Niobio");
                        super.numeroAtomico = "41";
                        m.setText("Nb");
                        break;
                    case 5:
                        super.setNome("Tantalo");
                        super.numeroAtomico = "73";
                        m.setText("Ta");
                        break;
                    case 6:
                        super.setNome("Dubnio");
                        super.numeroAtomico = "105";
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
                        super.numeroAtomico = "24";
                        m.setText("Cr");
                        m.dica1 = "É UM METAL DE TRANSIÇÃO";
                        m.dica2 = "UTILIZADO NO PROCESSO DE GALVANOPLASTIA";
                        m.dica3 = "PERTENCE À FAMÍLIA 6";
                        super.setArrayList(m);
                        break;
                    case 4:
                        super.setNome("Molibdenio");
                        super.numeroAtomico = "42";
                        m.setText("Mo");
                        break;
                    case 5:
                        super.setNome("Tungstenio");
                        super.numeroAtomico = "74";
                        m.setText("W");
                        m.dica1 = "É UM METAL DO 6 PERIODO E COM O MAIOR PONTO DE FUSAO DE TODOS. (+5000 ºC)";
                        m.dica2 = "É O ELEMENTO MAIS DENSO DE TODA A TABELA PERIODICA";
                        m.dica3 = "ESTA LOCALIZADO NA FAMÍLIA 6, ESSE METAL É MUITO UTILIZADO EM SUPERLIGAS ALTAMENTE RESISTENTES";
                        super.setArrayList(m);
                        break;
                    case 6:
                        super.setNome("Seaborgio");
                        super.numeroAtomico = "106";
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
                        super.numeroAtomico = "25";
                        m.setText("Mn");
                        m.dica1 = "POSSUI QUATRO CAMADAS ENERGÉTICAS";
                        m.dica2 = "ELE É UTILIZADO EM COFRES";
                        m.dica3 = "SUA CONFIGURAÇÃO ELETRÔNICA TERMINA EM d5";
                        super.setArrayList(m);
                        break;
                    case 4:
                        super.setNome("Tecnecio");
                        super.numeroAtomico = "43";
                        m.setText("Tc");
                        break;
                    case 5:
                        super.setNome("Renio");
                        super.numeroAtomico = "75";
                        m.setText("Re");
                        break;
                    case 6:
                        super.setNome("Bohrio");
                        super.numeroAtomico = "107";
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
                        super.numeroAtomico = "26";
                        m.setText("Fe");
                        m.dica1 = "É UM METAL DE TRANSIÇÃO";
                        m.dica2 = "MUITO UTILIZADO EM PORTÕES";
                        m.dica3 = "POSSUI NÚMERO ATÔMICO IGUAL A 26";
                        super.setArrayList(m);
                        break;
                    case 4:
                        super.setNome("Rutenio");
                        super.numeroAtomico = "44";
                        m.setText("Ru");
                        break;
                    case 5:
                        super.setNome("Osmio");
                        super.numeroAtomico = "76";
                        m.setText("Os");
                        break;
                    case 6:
                        super.setNome("Hassio");
                        super.numeroAtomico = "108";
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
                        super.numeroAtomico = "27";
                        m.setText("Co");
                        break;
                    case 4:
                        super.setNome("Rodio");
                        super.numeroAtomico = "45";
                        m.setText("Rh");
                        break;
                    case 5:
                        super.setNome("Iridio");
                        super.numeroAtomico = "77";
                        m.setText("Ir");
                        m.dica1 = "UTILIZADO EM AGULHAS DE INJEÇÃO";
                        m.dica2 = "É UM METAL DE TRANSIÇÃO";
                        m.dica3 = "É O METAL MAIS RESISTENTE A CORROSAO CONHECIDO";
                        super.setArrayList(m);
                        break;
                    case 6:
                        super.setNome("Meitnerio");
                        super.numeroAtomico = "109";
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
                        super.numeroAtomico = "28";
                        m.setText("Ni");
                        break;
                    case 4:
                        super.setNome("Paladio");
                        super.numeroAtomico = "46";
                        m.setText("Pd");
                        m.dica1 = "É UTILIZADO NA BLINDAGEM DE RADIAÇÃO";
                        m.dica2 = "ESTÁ LOCALIZADO NO SEXTO PERÍODO";
                        m.dica3 = "PERTENCE Â FAMÍLIA DO CARBONO E SEU SÍMBOLO REPRESENTA A SIGLA DO ESTADO DA PARAÍBA";
                        super.setArrayList(m);
                        break;
                    case 5:
                        super.setNome("Platina");
                        super.numeroAtomico = "78";
                        m.setText("Pt");
                        m.dica1 = "ENCONTRA-SE NO SEXTO PERÍODO";
                        m.dica2 = "SEU RAIO ATÔMICO É MAIOR QUE O DO OURO";
                        m.dica3 = "MUITO UTILIZADO NO PROCESSO DE RECUPERAÇÃO DE FRATURA ÓSSEA";
                        super.setArrayList(m);
                        break;
                    case 6:
                        super.setNome("Darmstadtio");
                        super.numeroAtomico = "110";
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
                        super.numeroAtomico = "29";
                        m.setText("Cu");
                        m.dica1 = "É MUITO UTILIZADO EM FIAÇÕES ELÉTRICAS";
                        m.dica2 = "É UM METAL DO QUARTO PERÍODO";
                        m.dica3 = "ESTÁ LOCALIZADO NA FAMÍLIA ONZE";
                        super.setArrayList(m);
                        break;
                    case 4:
                        super.setNome("Prata");
                        super.numeroAtomico = "47";
                        m.setText("Ag");
                        m.dica1 = "É USADO EM BIJUTERIAS, TALHERES, ETC";
                        m.dica2 = "É UM METAL DE TRANSIÇÃO";
                        m.dica3 = "ELEMENTO USADO NA FABRICAÇAO DE ESPELHOS";
                        super.setArrayList(m);
                        break;
                    case 5:
                        super.setNome("Ouro");
                        super.numeroAtomico = "79";
                        m.setText("Au");
                        m.dica1 = "É METAL REPRESENTATIVO";
                        m.dica2 = "MUITO UTILIZADO EM JOIAS";
                        m.dica3 = "ESTÁ LOCALIZADO NO SEXTO PERÍODO DA FAMÍLIA 11";
                        super.setArrayList(m);
                        break;
                    case 6:
                        super.setNome("Roentgenio");
                        super.numeroAtomico = "111";
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
                        super.numeroAtomico = "30";
                        m.setText("Zn");
                        m.dica1 = "SEU RAIO ATÔMICO É MAIOR QUE O DO GÁS NOBRE CRIPTÔNIO";
                        m.dica2 = "É UM METAL DE TRANSIÇÃO UTILIZADO NA FABRICAÇÃO DE CALHAS";
                        m.dica3 = "POSSUI QUATRO CAMADAS ENERGÉTICAS E ENCONTRA-SE NA FAMÍLIA DOZE";
                        super.setArrayList(m);
                        break;
                    case 4:
                        super.setNome("Cadmio");
                        super.numeroAtomico = "48";
                        m.setText("Cd");
                        break;
                    case 5:
                        super.setNome("Mercurio");
                        super.numeroAtomico = "80";
                        m.setText("Hg");
                        m.dica1 = "MUITO UTILIZADO EM COLUNAS DE TERMÔMETRO";
                        m.dica2 = "TEM O MESMO NOME DE UM PLANETA DO SISTEMA SOLAR";
                        m.dica3 = "METAL ENCONTRADO NO ESTADO LÍQUIDO NA TEMPERATURA AMBIENTE";
                        super.setArrayList(m);
                        break;
                    case 6:
                        super.setNome("Copernicio");
                        super.numeroAtomico = "112";
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
