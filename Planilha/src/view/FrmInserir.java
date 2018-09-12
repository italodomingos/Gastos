package view;

import control.CtrlGambiarra;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import model.Gastos;

public class FrmInserir extends javax.swing.JFrame {

    public FrmInserir() {
        initComponents();
    }

    public void desativarCod() {
        jtfCodigo.setVisible(false);
        jlCodigo.setVisible(false);
        jbAlterar.setVisible(false);
        jbRemover.setVisible(false);

    }

    public void preencherAlterar(int cod) throws ParseException {
        CtrlGambiarra ct = new CtrlGambiarra();
        Gastos g = ct.getPorCod(cod);
        jtfTipo.setText(g.getTipo());
        jdcData.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(g.getData()));
        jtfValor.setText(String.valueOf(g.getValor()));
        jtfCodigo.setText(String.valueOf(cod));
        jtfCodigo.setEditable(false);
        jtfCodigo.setVisible(true);
        jlCodigo.setVisible(true);
        jbIncluir.setVisible(false);
        jbAlterar.setVisible(true);
        jbRemover.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbFechar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jlMes = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfTipo = new javax.swing.JTextField();
        jtfValor = new javax.swing.JTextField();
        jbIncluir = new javax.swing.JButton();
        jdcData = new com.toedter.calendar.JDateChooser();
        jbAlterar = new javax.swing.JButton();
        jlCodigo = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jbRemover = new javax.swing.JButton();
        jcbArea = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlMes.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jlMes.setText("Cadastro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jlMes)
                .addGap(151, 151, 151))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jlMes)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel1.setText("Tipo");

        jLabel2.setText("Data:");

        jLabel3.setText("Valor:");

        jtfTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTipoActionPerformed(evt);
            }
        });
        jtfTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfTipoKeyPressed(evt);
            }
        });

        jtfValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValorActionPerformed(evt);
            }
        });
        jtfValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfValorKeyPressed(evt);
            }
        });

        jbIncluir.setText("Incluir");
        jbIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIncluirActionPerformed(evt);
            }
        });

        jdcData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jdcDataKeyPressed(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jlCodigo.setText("Código:");

        jbRemover.setText("Remover");
        jbRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemoverActionPerformed(evt);
            }
        });

        jcbArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Lazer", "Restaurante", "Eletronicos", "Automóvel", "Supermecado", "Outro" }));

        jLabel4.setText("Área:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbRemover)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtfTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcData, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCodigo)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jdcData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbIncluir)
                    .addComponent(jbFechar)
                    .addComponent(jbAlterar)
                    .addComponent(jbRemover)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jtfValorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfValorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jbIncluir.doClick();
            //ve se alterou
        }
    }//GEN-LAST:event_jtfValorKeyPressed

    private void jbIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIncluirActionPerformed
        if ("".equals(jcbArea.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(null, "Informe uma área", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                CtrlGambiarra ct = new CtrlGambiarra();
                Gastos gas = new Gastos();

                SimpleDateFormat formato = new SimpleDateFormat("YYYY/MM/dd");
                String data = formato.format(jdcData.getDate());

                gas.setData(data);
                gas.setTipo(jtfTipo.getText());

                gas.setValor(Float.parseFloat(jtfValor.getText().replace(',', '.')));

                ct.salvarCtrl(gas);
                jdcData.setDate(null);
                jtfTipo.setText(null);
                jtfValor.setText(null);
                jtfTipo.requestFocus();

                JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
    }//GEN-LAST:event_jbIncluirActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        CtrlGambiarra ct = new CtrlGambiarra();
        Gastos gas = new Gastos();
        FrmTabela ft = new FrmTabela();

        gas.setCodigo(Integer.parseInt(jtfCodigo.getText()));
        gas.setTipo(jtfTipo.getText());
        gas.setValor(Float.parseFloat(jtfValor.getText()));

        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
        String data = formato.format(jdcData.getDate());

        gas.setData(data);
        ct.updateCtrl(gas);
        if (ct.updateCtrl(gas) == true) {
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
            ft.preencher(ct.getAll());

        } else {
            JOptionPane.showMessageDialog(null, "Erro");

        }

    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jtfValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfValorActionPerformed

    private void jtfTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTipoActionPerformed

    private void jtfTipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTipoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jdcData.requestFocus();

        }
    }//GEN-LAST:event_jtfTipoKeyPressed

    private void jdcDataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdcDataKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtfValor.requestFocus();

        }
    }//GEN-LAST:event_jdcDataKeyPressed

    private void jbRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemoverActionPerformed
        CtrlGambiarra ct = new CtrlGambiarra();
        String opc[] = {"Sim", "Não"};
        int x = JOptionPane.showOptionDialog(null, "Deseja remover o Código " + jtfCodigo.getText(),
                "Você tem certeza disso?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opc, opc[0]);
        if (x == 0) {
            ct.excluirCtrl(Integer.parseInt(jtfCodigo.getText()));
            JOptionPane.showMessageDialog(null, "Removido com sucesso");
        }
    }//GEN-LAST:event_jbRemoverActionPerformed

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
            java.util.logging.Logger.getLogger(FrmInserir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInserir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInserir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInserir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInserir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbIncluir;
    private javax.swing.JButton jbRemover;
    private javax.swing.JComboBox<String> jcbArea;
    private com.toedter.calendar.JDateChooser jdcData;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlMes;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfTipo;
    private javax.swing.JTextField jtfValor;
    // End of variables declaration//GEN-END:variables
}
