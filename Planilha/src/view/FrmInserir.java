package view;

import control.CtrlGastos;
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
        CtrlGastos ct = new CtrlGastos();
        Gastos g = ct.getPorCod(cod);
        jtfTipo.setText(g.getTipo());
        jdcData.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(g.getData()));
        jtfValor.setText(String.valueOf(g.getValor()));
        jtfCodigo.setText(String.valueOf(cod));
        jcbArea.setSelectedItem(g.getArea());
        jtfCodigo.setEditable(false);
        jtfCodigo.setVisible(true);
        jlCodigo.setVisible(true);
        jbIncluir.setVisible(false);
        jbAlterar.setVisible(true);
        jbRemover.setVisible(false);
    }

    public void preencherRemover(int cod) throws ParseException {
        CtrlGastos ct = new CtrlGastos();
        Gastos g = ct.getPorCod(cod);
        jtfTipo.setText(g.getTipo());
        jdcData.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(g.getData()));
        jtfValor.setText(String.valueOf(g.getValor()));
        jtfCodigo.setText(String.valueOf(cod));
        jcbArea.setSelectedItem(g.getArea());
        jtfCodigo.setEditable(false);
        jtfCodigo.setVisible(true);
        jlCodigo.setVisible(true);
        jbIncluir.setVisible(false);
        jbAlterar.setVisible(false);
        jbRemover.setVisible(true);
        jtfTipo.setEditable(false);
        jtfValor.setEditable(false);
        jdcData.setEnabled(false);
        jcbArea.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
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
        jLabel5 = new javax.swing.JLabel();
        jcbArea = new javax.swing.JComboBox<>();
        jbNext = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        jLabel1.setText("Tipo:");

        jLabel2.setText("Data:");

        jLabel3.setText("Valor:");

        jtfTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfTipoKeyPressed(evt);
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

        jLabel5.setText("Área:");

        jcbArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha uma área", "Refeição", "Combustivel", "Supermercado", "Transporte", "Ecommerce", "Lazer", "IOF", "Juros", "Hinode" }));

        jbNext.setText(">");
        jbNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNextActionPerformed(evt);
            }
        });

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(127, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jdcData, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbNext))))
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
                    .addComponent(jLabel5)
                    .addComponent(jcbArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jdcData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNext))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
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
        }
    }//GEN-LAST:event_jtfValorKeyPressed

    private void jbIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIncluirActionPerformed

        try {
            if (!jcbArea.getSelectedItem().toString().equals("Escolha uma área")) {
                CtrlGastos ct = new CtrlGastos();
                Gastos gas = new Gastos();

                SimpleDateFormat formato = new SimpleDateFormat("YYYY/MM/dd");
                String data = formato.format(jdcData.getDate());

                gas.setData(data);
                gas.setTipo(jtfTipo.getText());

                gas.setValor(Float.parseFloat(jtfValor.getText().replace(',', '.')));
                gas.setArea(jcbArea.getSelectedItem().toString());

                ct.salvarCtrl(gas);
                jdcData.setDate(null);
                jtfTipo.setText(null);
                jtfValor.setText(null);
                jtfTipo.requestFocus();

                JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "informe uma área");

            }
        } catch (Exception e) {
            e.printStackTrace();

        }

    }//GEN-LAST:event_jbIncluirActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        CtrlGastos ct = new CtrlGastos();
        Gastos gas = new Gastos();
        FrmTabela ft = new FrmTabela();

        gas.setCodigo(Integer.parseInt(jtfCodigo.getText()));
        gas.setTipo(jtfTipo.getText());
        gas.setValor(Float.parseFloat(jtfValor.getText()));

        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
        String data = formato.format(jdcData.getDate());
        gas.setData(data);
        gas.setArea(jcbArea.getSelectedItem().toString());

        if (ct.updateCtrl(gas) == true) {
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");

        } else {
            JOptionPane.showMessageDialog(null, "Erro");

        }
        ft.preencher(ct.getAll());
        dispose();


    }//GEN-LAST:event_jbAlterarActionPerformed

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
        CtrlGastos ct = new CtrlGastos();
        String opc[] = {"Sim", "Não"};
        int x = JOptionPane.showOptionDialog(null, "Deseja remover o Código " + jtfCodigo.getText(),
                "Você tem certeza disso?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opc, opc[0]);
        if (x == 0) {
            if (ct.excluirCtrl(Integer.parseInt(jtfCodigo.getText())) == true) {
                JOptionPane.showMessageDialog(null, "Removido com sucesso");
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Error", "Erro", JOptionPane.ERROR_MESSAGE);

            }
        }
    }//GEN-LAST:event_jbRemoverActionPerformed

    private void jbNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNextActionPerformed
       
    }//GEN-LAST:event_jbNextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbIncluir;
    private javax.swing.JButton jbNext;
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
