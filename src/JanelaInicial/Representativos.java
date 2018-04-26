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
public class Representativos extends Elementos{
    String dica1, dica2, dica3;
    public Representativos(JButton e, JButton n, JLabel nAtomico){
        super(e, n);
        setBackground(new Color(70, 130, 180, 150));
    }

    public void setRepresentativos(Representativos r, int x, int y, int w, int h, int i, int j, JPanel c) {
        r.setLocation(x + ((w) * i), y + (h * j));
        c.add(r);
        switch (i) {
            case 12:
                switch (j) {
                    case 1:
                        setCorSemiMetal(r);
                        super.setNome("Boro");
                        r.setText("B");
                        break;
                    case 2:
                        super.setNome("Aluminio");
                        r.setText("Al");
                        r.dica1 = "É UM METAL DO TERCEIRO PERÍODO";
                        r.dica2 = "É UTILIZADO EM LATINHAS RECICLÁVEIS";
                        r.dica3 = "ENCONTRA-SE NA FAMÍLIA DO BORO";
                        break;
                    case 3:
                        super.setNome("Galio");
                        r.setText("Ga");
                        r.dica1 = "UTILIZADO NAS TELAS DE TV";
                        r.dica2 = "POSSUI QUATRO CAMADAS ENERGÉTICAS";
                        r.dica3 = "SEU NOME LEMBRA “GALILEU”";
                        break;
                    case 4:
                        super.setNome("Indio");
                        r.setText("In");
                        break;
                    case 5:
                        super.setNome("Talio");
                        r.setText("Tl");
                        break;
                    case 6:
                        super.setNome("Nihonio");
                        r.setText("Nh");
                        break;
                    default:
                        return;
                }
            return;
            case 13:
                switch (j) {
                    case 1:
                        setCorAmetal(r);
                        super.setNome("Carbono");
                        r.setText("C");
                        r.dica1 = "CONSTITUINTE DA GRAFITE E DO DIAMENTE";
                        r.dica2 = "POSSUI DUAS CAMADAS ENERGÉTICAS";
                        r.dica3 = "É UM AMETAL";
                        break;
                    case 2:
                        setCorSemiMetal(r);
                        super.setNome("Silicio");
                        r.setText("Si");
                        break;
                    case 3:
                        setCorSemiMetal(r);
                        super.setNome("Germanio");
                        r.setText("Ge");
                        break;
                    case 4:
                        super.setNome("Estanho");
                        r.setText("Sn");
                        break;
                    case 5:
                        super.setNome("Chumbo");
                        r.setText("Pb");
                        break;
                    case 6:
                        super.setNome("Flerovio");
                        r.setText("Fl");
                        r.dica1 = "SEU TEMPO DE MEIA VIDA É MENOR DO QUE UM SEGUNDO";
                        r.dica2 = "PERTENCE À FAMÍLIA DO CARBONO";
                        r.dica3 = "POSSUI SETE CAMADAS ENERGÉTICAS";
                        break;
                    default:
                        return;
                }
            return;
            case 14:
                switch (j) {
                    case 1:
                        setCorAmetal(r);
                        super.setNome("Nitrogenio");
                        r.setText("N");
                        r.dica1 = "É UM GÁS MAS PODE SER ENCONTRADO NO ESTADO LÍQUIDO UTILIZADO PARA CONSERVAÇÃO DE\n" +
                                  "MATERIAIS EM TEMPERATURAS MUITO BAIXAS";
                        r.dica2 = "POSSUI DUAS CAMADAS ENERGÉTICAS";
                        r.dica3 = "ENCONTRA-SE NO GRUPO VIZINHO À FAMÍLIA DO CARBONO";
                        break;
                    case 2:
                        setCorAmetal(r);
                        super.setNome("Fosforo");
                        r.setText("P");
                        r.dica1 = "AMETAL COM TRÊS CAMADAS ENERGÉTICAS";
                        r.dica2 = "ENCONTRADO DENTRO DE CAIXINHAS PEQUENAS";
                        r.dica3 = "EM NOSSA COZINHA PODE NOS AJUDAR A CONSEGUIR FOGO";
                        break;
                    case 3:
                        setCorSemiMetal(r);
                        super.setNome("Arsenio");
                        r.setText("As");
                        break;
                    case 4:
                        setCorSemiMetal(r);
                        super.setNome("Antimonio");
                        r.setText("Sb");
                        r.dica1 = "UTILIZADO EM SOMBRAS PARA OS OLHOS (MAQUIAGEM)";
                        r.dica2 = "SEMIMETAL DO 5º PERÍODO";
                        r.dica3 = "ELE É MAIS ELETRONEGATIVO DO QUE O ESTANHO E MENOS DO QUE O ARSÊNIO";
                        break;
                    case 5:
                        super.setNome("Bismuto");
                        r.setText("Bi");
                        break;
                    case 6:
                        super.setNome("Moscovio");
                        r.setText("Mc");
                        break;
                    default:
                        return;
                }
            return;
            case 15:
                switch (j) {
                    case 1:
                        setCorAmetal(r);
                        super.setNome("Oxigenio");
                        r.setText("O");
                        r.dica1 = "SEM ELE NÃO EXISTIRA A COMBUSTÃO";
                        r.dica2 = "É UM AMETAL DO 2o PERÍODO";
                        r.dica3 = "O SEGUNDO ELEMENTO MAIS ELETRONEGATIVO DA TABELA";
                        break;
                    case 2:
                        setCorAmetal(r);
                        super.setNome("Enxofre");
                        r.setText("S");
                        r.dica1 = "É ENCOTRADO EM CONSERVANTES DE FOGOS DE ARTIFÍCIO";
                        r.dica2 = "É UM NÃO METAL DA FAMILIA DOS CALCOGÊNIOS";
                        r.dica3 = "SEU SÍMBOLO ENCONTRA-SE NA ROUPA DO SUPER-HOMEM";
                        break;
                    case 3:
                        setCorAmetal(r);
                        super.setNome("Selenio");
                        r.setText("Se");
                        r.dica1 = "ELEMENTO UTILIZADO EM XAMPU ANTI-CASPA";
                        r.dica2 = "AMETAL DO 4o PERÍODO";
                        r.dica3 = "ESTÁ NA FAMÍLIA DOS CALCOGÊNIOS";
                        break;
                    case 4:
                        setCorSemiMetal(r);
                        super.setNome("Telurio");
                        r.setText("Te");
                        r.dica1 = "ENCONTRADO EM PROTEÇÃO PARA CHUMBO DE ACUMULADORES DE BATERIA";
                        r.dica2 = "É UM SEMIMETAL NÃO RADIATIVO";
                        r.dica3 = "ESTÁ NA FAMÍLIA DOS CALCOGÊNIOS";
                        break;
                    case 5:
                        setCorSemiMetal(r);
                        super.setNome("Polonio");
                        r.setText("Po");
                        r.dica1 = "É UM SEMI-METAL RADIOATIVO QUE FOI DESCOBERTO POR MARIE CORRIE";
                        r.dica2 = "PERTENCE À FAMÍLIA DOS CALCOGÊNIOS";
                        r.dica3 = "SEU NÚMERO ATÔMICO ANTECEDE O DO ASTATO";
                        break;
                    case 6:
                        super.setNome("Livermorio");
                        r.setText("Lv");
                        r.dica1 = "FOI UM DOS ÚLTIMOS ELEMENTOS A SEREM RECONHECIDOS PELA IUPAC";
                        r.dica2 = "É UM CALCOGÊNIO";
                        r.dica3 = "POSSUI SETE CAMADAS ENERGÉTICAS";
                        break;
                    default:
                        return;
                }
            return;
            case 16:
                switch (j) {
                    case 1:
                        halogenio(r);
                        super.setNome("Fluor");
                        r.setText("F");
                        r.dica1 = "É MUITO UTILIZADO POR DENTISTAS";
                        r.dica2 = "ENCONTRA-SE NA FAMÍLIA DOS HALOGÊNIOS";
                        r.dica3 = "É O ELEMENTO MAIS ELETRONEGATIVO DA TABELA PERIÓDICA";
                        break;
                    case 2:
                        halogenio(r);
                        super.setNome("Cloro");
                        r.setText("Cl");
                        r.dica1 = "COMPÕE O SAL DE COZINHA";
                        r.dica2 = "ENCONTRA-SE NO TERCEIRO PERÍODO AO LADO DE UM GÁS NOBRE";
                        r.dica3 = "ESTÁ NA FAMÍLIA DOS HALOGÊNIOS";
                        break;
                    case 3:
                        halogenio(r);
                        super.setNome("Bromo");
                        r.setText("Br");
                        break;
                    case 4:
                        halogenio(r);
                        super.setNome("Iodo");
                        r.setText("I");
                        r.dica1 = "É UTILIZADO PARA REDUZIR OS EFEITOS DE ISÓTOPOS RADIOATIVOS";
                        r.dica2 = "COM SUA SUBLIMAÇÃO, É POSSÍVEL VIZUALIZAR IMPRESSÕES DIGITAIS";
                        r.dica3 = "É UM HALOGÊNIO DO QUINTO PERÍODO";
                        break;
                    case 5:
                        halogenio(r);
                        super.setNome("Astato");
                        r.setText("At");
                        break;
                    case 6:
                        halogenio(r);
                        super.setNome("Tenessino");
                        r.setText("Ts");
                        break;
                    default:
                        return;
                }
            default:
                break;
        }
    }
    
    private void setCorSemiMetal(Representativos rep) {
        rep.setBackground(new Color(46, 139, 87, 150));
    }
    
    private void setCorAmetal(Representativos rep){
        rep.setBackground(new Color(188, 143, 143, 150));
    }
    
    private void halogenio(Representativos rep){
        rep.setBackground(new Color(255, 0, 0, 150));
    }
}
