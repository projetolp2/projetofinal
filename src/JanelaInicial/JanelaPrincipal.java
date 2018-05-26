/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JanelaInicial;

import JanelasAjuda.JanelaDistriEletronica;
import JanelasAjuda.JanelaPeriodo;
import JanelasAjuda.JanelaRaioAtomico;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author jayme
 */
public class JanelaPrincipal extends javax.swing.JDialog {
    
    Hidrogenio hidrogenio;
    int posX, posY, largura, altura;
    Botao elemento = new Botao(); //Botao aonde vai o simbolo do elemento.
    Botao nomeElemento = new Botao(); //Botao aonde vai o nome do elemento.
    JLabel periodos; //Labels para os periodos.
    JLabel familias; //Labels para as familias.
    ArrayList<Elementos> arrayElem = new ArrayList();
    ArrayList<Elementos> escolhidos = new ArrayList(); //Array de elementos que foram escolhidos aleatoriamente.
    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        super.setBounds(0, 0, 1365, 740); //Maximiza a tela.
        hidrogenio = new Hidrogenio(elemento, nomeElemento, numeroAtomico, massaAtomica, arrayElem);
        hidrogenio.setLocation(hidrogenio.getLocation().x, hidrogenio.getLocation().y);
        posX = hidrogenio.getX(); //Posiçao de referencia X.
        posY = hidrogenio.getY(); //Posiçao de referencia Y.
        largura = 2 + hidrogenio.getSize().width;
        altura = 2 + hidrogenio.getSize().height;
        canvas.add(hidrogenio);
        elemento.setBounds(10, 66, 130, 130); //Formata o tamanho do botao e a posiçao.
        nomeElemento.setBounds(10, 19, 549, 45); //Idem ao de cima.
        canvas2.setLocation(posX + (largura * 2), posY - 10);
        canvas2.add(nomeElemento); //Adiciona ao canvas2 o botao onde vai o nome do elemento.
        canvas2.add(elemento); //Adiciona ao canvas2 o botao onde vai o simbolo do elemento.
        canvas.add(canvas2); //Adiciona ao canvas o painel onde vai as informaçoes dos elementos.
        //562 189
        tabelaPeriodica(); //Cria a tabela periodica.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas = new javax.swing.JPanel();
        canvas2 = new javax.swing.JPanel();
        numeroAtomico = new javax.swing.JLabel();
        massaAtomica = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabelDica1 = new javax.swing.JLabel();
        jLabelDica2 = new javax.swing.JLabel();
        jLabelDica3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemPeriodosFamilias = new javax.swing.JMenuItem();
        jMenuItemRaioAtomico = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tabela Periodica");

        canvas.setPreferredSize(new java.awt.Dimension(2147483647, 2147483647));

        canvas2.setBorder(javax.swing.BorderFactory.createTitledBorder("Elemento"));

        numeroAtomico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        massaAtomica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        massaAtomica.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton1.removeMouseListener(jButton1.getMouseListeners()[0]);
        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setOpaque(false);
        jButton1.setRequestFocusEnabled(false);
        jButton1.setVerifyInputWhenFocusTarget(false);

        jLabel4.setText("Hidrogenio");

        jButton2.removeMouseListener(jButton2.getMouseListeners()[0]);
        jButton2.setBackground(new java.awt.Color(250, 128, 114));
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.setOpaque(false);
        jButton2.setRequestFocusEnabled(false);
        jButton2.setVerifyInputWhenFocusTarget(false);

        jLabel5.setText("Met. Trans.");

        jLabel6.setText("Halogenios");

        jButton3.removeMouseListener(jButton3.getMouseListeners()[0]);
        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setBorderPainted(false);
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.setOpaque(false);
        jButton3.setRequestFocusEnabled(false);
        jButton3.setVerifyInputWhenFocusTarget(false);

        jLabel7.setText("Alcalinos");

        jButton4.removeMouseListener(jButton4.getMouseListeners()[0]);
        jButton4.setBackground(new java.awt.Color(255, 140, 0));
        jButton4.setBorderPainted(false);
        jButton4.setFocusPainted(false);
        jButton4.setFocusable(false);
        jButton4.setOpaque(false);
        jButton4.setRequestFocusEnabled(false);
        jButton4.setVerifyInputWhenFocusTarget(false);

        jButton5.removeMouseListener(jButton5.getMouseListeners()[0]);
        jButton5.setBackground(new java.awt.Color(46, 139, 87));
        jButton5.setBorderPainted(false);
        jButton5.setFocusPainted(false);
        jButton5.setFocusable(false);
        jButton5.setOpaque(false);
        jButton5.setRequestFocusEnabled(false);
        jButton5.setVerifyInputWhenFocusTarget(false);

        jLabel8.setText("Semi Metais");

        jLabel9.setText("Gases Nobres");

        jButton6.removeMouseListener(jButton6.getMouseListeners()[0]);
        jButton6.setBackground(new java.awt.Color(106, 90, 205));
        jButton6.setBorderPainted(false);
        jButton6.setFocusPainted(false);
        jButton6.setFocusable(false);
        jButton6.setOpaque(false);
        jButton6.setRequestFocusEnabled(false);
        jButton6.setVerifyInputWhenFocusTarget(false);

        jLabel10.setText("Alcalinos-Terrosos");

        jButton7.removeMouseListener(jButton7.getMouseListeners()[0]);
        jButton7.setBackground(new java.awt.Color(255, 215, 0));
        jButton7.setBorderPainted(false);
        jButton7.setFocusPainted(false);
        jButton7.setFocusable(false);
        jButton7.setOpaque(false);
        jButton7.setRequestFocusEnabled(false);
        jButton7.setVerifyInputWhenFocusTarget(false);

        jLabel11.setText("Ametais");

        jLabel12.setText("Met. Repre.");

        jButton9.removeMouseListener(jButton9.getMouseListeners()[0]);
        jButton9.setBackground(new java.awt.Color(70, 130, 180));
        jButton9.setBorderPainted(false);
        jButton9.setFocusPainted(false);
        jButton9.setFocusable(false);
        jButton9.setOpaque(false);
        jButton9.setRequestFocusEnabled(false);
        jButton9.setVerifyInputWhenFocusTarget(false);

        jLabel13.setText("Lantanideos");

        jButton10.removeMouseListener(jButton10.getMouseListeners()[0]);
        jButton10.setBackground(new java.awt.Color(17, 204, 228));
        jButton10.setBorderPainted(false);
        jButton10.setFocusPainted(false);
        jButton10.setFocusable(false);
        jButton10.setOpaque(false);
        jButton10.setRequestFocusEnabled(false);
        jButton10.setVerifyInputWhenFocusTarget(false);

        jLabel14.setText("Actinideos");

        jButton11.removeMouseListener(jButton11.getMouseListeners()[0]);
        jButton11.setBackground(new java.awt.Color(0, 85, 255));
        jButton11.setBorderPainted(false);
        jButton11.setFocusPainted(false);
        jButton11.setFocusable(false);
        jButton11.setOpaque(false);
        jButton11.setRequestFocusEnabled(false);
        jButton11.setVerifyInputWhenFocusTarget(false);

        jButton12.removeMouseListener(jButton12.getMouseListeners()[0]);
        jButton12.setBackground(new java.awt.Color(188, 143, 143));
        jButton12.setBorderPainted(false);
        jButton12.setFocusPainted(false);
        jButton12.setFocusable(false);
        jButton12.setOpaque(false);
        jButton12.setRequestFocusEnabled(false);
        jButton12.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout canvas2Layout = new javax.swing.GroupLayout(canvas2);
        canvas2.setLayout(canvas2Layout);
        canvas2Layout.setHorizontalGroup(
            canvas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(canvas2Layout.createSequentialGroup()
                .addGroup(canvas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(canvas2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(numeroAtomico, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(canvas2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(massaAtomica, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(canvas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(canvas2Layout.createSequentialGroup()
                        .addGroup(canvas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(canvas2Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(canvas2Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(canvas2Layout.createSequentialGroup()
                                .addComponent(jButton12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)))
                        .addGap(18, 18, 18)
                        .addGroup(canvas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(canvas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(canvas2Layout.createSequentialGroup()
                                    .addComponent(jButton9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel12)
                                    .addGap(13, 13, 13)
                                    .addComponent(jButton5))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, canvas2Layout.createSequentialGroup()
                                    .addGroup(canvas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton11)
                                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(canvas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel14))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton6)))
                            .addGroup(canvas2Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGap(24, 24, 24)
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(canvas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)))))
                    .addGroup(canvas2Layout.createSequentialGroup()
                        .addComponent(jButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        canvas2Layout.setVerticalGroup(
            canvas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(canvas2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(numeroAtomico, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(massaAtomica, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(canvas2Layout.createSequentialGroup()
                .addGroup(canvas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(canvas2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(canvas2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(canvas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(canvas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(canvas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(canvas2Layout.createSequentialGroup()
                .addGroup(canvas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(canvas2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(canvas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, canvas2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(canvas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(canvas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(canvas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(canvas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(canvas2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(canvas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(canvas2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(canvas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(canvas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        jLabelDica1.setText("Dica 1:");

        jLabelDica2.setText("Dica 2:");

        jLabelDica3.setText("Dica 3:");

        javax.swing.GroupLayout canvasLayout = new javax.swing.GroupLayout(canvas);
        canvas.setLayout(canvasLayout);
        canvasLayout.setHorizontalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(canvasLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(canvas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                .addGroup(canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, canvasLayout.createSequentialGroup()
                        .addComponent(jLabelDica1)
                        .addGap(264, 264, 264))
                    .addGroup(canvasLayout.createSequentialGroup()
                        .addGroup(canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDica2)
                            .addComponent(jLabelDica3))
                        .addContainerGap())))
        );
        canvasLayout.setVerticalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(canvasLayout.createSequentialGroup()
                .addGroup(canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(canvasLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabelDica1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelDica2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelDica3))
                    .addGroup(canvasLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(canvas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(472, Short.MAX_VALUE))
        );

        jMenu1.setText("Ajuda");

        jMenuItemPeriodosFamilias.setText("Periodos/Familias");
        jMenuItemPeriodosFamilias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPeriodosFamiliasActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemPeriodosFamilias);

        jMenuItemRaioAtomico.setText("Raio Atomico");
        jMenuItemRaioAtomico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRaioAtomicoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemRaioAtomico);

        jMenuItem1.setText("Dist. Eletronica");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(canvas, javax.swing.GroupLayout.DEFAULT_SIZE, 1273, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(canvas, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemPeriodosFamiliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPeriodosFamiliasActionPerformed
        JanelaPeriodo obj = new JanelaPeriodo(null, true);
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItemPeriodosFamiliasActionPerformed

    private void jMenuItemRaioAtomicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRaioAtomicoActionPerformed
        JanelaRaioAtomico obj = new JanelaRaioAtomico(null, true);
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItemRaioAtomicoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JanelaDistriEletronica obj = new JanelaDistriEletronica(null, true);
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JanelaPrincipal dialog = new JanelaPrincipal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel canvas;
    private javax.swing.JPanel canvas2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDica1;
    private javax.swing.JLabel jLabelDica2;
    private javax.swing.JLabel jLabelDica3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemPeriodosFamilias;
    private javax.swing.JMenuItem jMenuItemRaioAtomico;
    private javax.swing.JLabel massaAtomica;
    private javax.swing.JLabel numeroAtomico;
    // End of variables declaration//GEN-END:variables

    private void tabelaPeriodica() {
        int num;
        for (int i = 0; i < 7; i++) { //Cria os labels e coloca nos periodos (Vertical).
            num = i + 1;
            periodos = new JLabel();
            periodos.setText("" + num);
            canvas.add(periodos);
            periodos.setBounds(posX - 10, posY + (altura * i), 10, altura);
            periodos.setVisible(true);
        }
        
        for (int i = 1; i < 19; i++) { //Cria os labels e coloca nas familias (Horizontal).
            familias = new JLabel();
            familias.setText("" + i);
            canvas.add(familias);
            familias.setBounds(posX - 35 + (largura * i), posY - 25, largura, 10);
        }
        
        for (int i = 1; i < 7; i++) { //Cria a familia do Alcalinos.
            Alcalinos alcalinos = new Alcalinos(elemento, nomeElemento, numeroAtomico, massaAtomica, arrayElem); //Manda os paineis para que sejam adicionado as informaçoes de nome e simbolo.
            alcalinos.setAlcalinos(alcalinos, posX, posY, altura, i, canvas);
        }
        
        for (int i = 1; i < 7; i++) { //Cria a familia dos Alcalinos-Terrosos.
            AlcalinosTerrosos alcTerrosos = new AlcalinosTerrosos(elemento, nomeElemento, numeroAtomico, massaAtomica, arrayElem); //Manda os paineis para que sejam adicionado as informaçoes de nome e simbolo.
            alcTerrosos.setAlcalinosTerrosos(alcTerrosos, posX, posY, largura, altura, i, canvas);
        }
        
        for (int i = 2; i < 12; i++) { //Cria o bloco dos metais de transiçao.
            for (int j = 3; j < 7; j++) {
                MetaisDeTransiçao metais = new MetaisDeTransiçao(elemento, nomeElemento, numeroAtomico, massaAtomica, arrayElem); //Manda os paineis para que sejam adicionado as informaçoes de nome e simbolo.
                metais.setMetaisDeTransiçao(metais, posX, posY, largura, altura, i, j, canvas);
            }
        }
        for (int i = 12; i < 17; i++) { //Cria o bloco dos elementos Representativos.
            for (int j = 1; j < 7; j++) {
                Representativos representativos = new Representativos(elemento, nomeElemento, numeroAtomico, massaAtomica, arrayElem); //Manda os paineis para que sejam adicionado as informaçoes de nome e simbolo.
                representativos.setRepresentativos(representativos, posX, posY, largura, altura, i, j, canvas);
            }
        }
        
        for (int i = 0; i < 7; i++) { //Cria a familia dos Gases Nobres.
            GasesNobres nobres = new GasesNobres(elemento, nomeElemento, numeroAtomico, massaAtomica, arrayElem); //Manda os paineis para que sejam adicionado as informaçoes de nome e simbolo.
            nobres.setGasesNobres(nobres, posX, posY, largura, altura, i, canvas);
        }
        
        for (int i = 3; i < 17; i++) { //Cria o bloco dos Metais de Transiçao Interna.
            for (int j = 7; j < 9; j++) {
                MetaisTransiçaoInterna interna = new MetaisTransiçaoInterna(elemento, nomeElemento, numeroAtomico, massaAtomica, arrayElem);
                interna.setMetaisTransiçaoInterna(interna, posX, posY, largura, altura, i, j, canvas);
            }
        }
        
        int index = 0;
        Elementos elem;
        while (escolhidos.size() != 10) { //Escolhe aleatoriamente 10 elementos para começar o jogo.
            index = (int) (Math.random() * 40);
            elem = arrayElem.get(index);
            
            if (escolhidos.isEmpty()) { //Adiciona o 1º elemento.
                escolhidos.add(elem);
            }else{
                if (!escolhidos.contains(elem)) { //Testa se o elemento escolhido ja esta dentro da lista.
                    escolhidos.add(elem);
                }
            }
        }
    }
}

