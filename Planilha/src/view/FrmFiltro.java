package view;

import control.CtrlGastos;
import control.Ferramentas;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import model.Gastos;

public final class FrmFiltro extends javax.swing.JFrame {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    CtrlGastos ct = new CtrlGastos();
    Ferramentas f = new Ferramentas();
    FrmTabela ft;
    Gastos[] g = {};
    int[] codigos = {};
    DefaultTableModel modelo;

    float soma = 0;

    public FrmFiltro(FrmTabela ft, DefaultTableModel modelo) {
        initComponents();

        this.ft = ft;
        this.modelo = modelo;

        preencherJcb();
        startListeners();

        jlInicio.setVisible(false);
        jlFim.setVisible(false);
        jdc1.setVisible(false);
        jdc2.setVisible(false);
        jlTipo.setVisible(false);
        jcbTipos.setVisible(false);

    }

    public void startListeners() {
        jrbData.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent event) {
                if (jrbData.isSelected()) {

                    jlInicio.setVisible(true);
                    jlFim.setVisible(true);
                    jdc1.setVisible(true);
                    jdc2.setVisible(true);

                } else {

                    jdc1.setDate(null);
                    jdc2.setDate(null);
                    jlInicio.setVisible(false);
                    jlFim.setVisible(false);
                    jdc1.setVisible(false);
                    jdc2.setVisible(false);

                }

            }

        });
        jrbTipo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent event) {
                if (jrbTipo.isSelected()) {
                    jlTipo.setVisible(true);
                    jcbTipos.setVisible(true);
                } else {
                    jlTipo.setVisible(false);
                    jcbTipos.setVisible(false);

                }

            }

        });

    }

    private FrmFiltro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void preencherJcb() {
        jdc1.setDate(null);
        jdc2.setDate(null);
        Gastos[] gas = ct.getFiltros();
        jcbTipos.addItem("Escolha um tipo");

        for (int i = 0; i < ct.getFiltros().length - 1; i++) {
            jcbTipos.addItem(gas[i].getTipo());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jrbTipo = new javax.swing.JRadioButton();
        jrbData = new javax.swing.JRadioButton();
        jlTipo = new javax.swing.JLabel();
        jdc1 = new com.toedter.calendar.JDateChooser();
        jlInicio = new javax.swing.JLabel();
        jdc2 = new com.toedter.calendar.JDateChooser();
        jlFim = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jbFiltrar = new javax.swing.JButton();
        jcbTipos = new javax.swing.JComboBox<>();
        jbFechar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Filtros");

        jrbTipo.setText("Tipo");

        jrbData.setText("Data");

        jlTipo.setText("Tipo:");

        jlInicio.setText("Início:");

        jlFim.setText("Fim:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Filtros");

        jbFiltrar.setText("Filtrar");
        jbFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFiltrarActionPerformed(evt);
            }
        });

        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jbFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlInicio)
                            .addComponent(jlFim, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlTipo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jdc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbTipos, 0, 120, Short.MAX_VALUE)
                            .addComponent(jdc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jrbTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbData))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbTipo)
                    .addComponent(jrbData))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlTipo)
                            .addComponent(jcbTipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jdc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jdc2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlFim))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbFiltrar)
                    .addComponent(jbFechar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFiltrarActionPerformed
        boolean validador = false;
        try {
            sdf.format(jdc1.getDate());
        } catch (NullPointerException ex) {
            validador = true;

        }
        if (validador) {
            g = ct.getCtrlNome(jcbTipos.getSelectedItem().toString());
            ft.preencher(g);
        } else if (jcbTipos.getSelectedItem().toString().equals("Escolha um tipo")) {
            
            String dataI = sdf.format((jdc1.getDate()));
            String dataF = sdf.format((jdc2.getDate()));
            g = ct.getCtrl(dataI, dataF);
            ft.preencher(g);

        } else {

            String dataI = sdf.format((jdc1.getDate()));
            String dataF = sdf.format((jdc2.getDate()));
            g = ct.getCtrlDataNome(dataI, dataF, jcbTipos.getSelectedItem().toString());
            ft.preencher(g);

        }

    }//GEN-LAST:event_jbFiltrarActionPerformed

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        dispose();

    }//GEN-LAST:event_jbFecharActionPerformed

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
            java.util.logging.Logger.getLogger(FrmFiltro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmFiltro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmFiltro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmFiltro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new FrmFiltro().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbFiltrar;
    private javax.swing.JComboBox<String> jcbTipos;
    private com.toedter.calendar.JDateChooser jdc1;
    private com.toedter.calendar.JDateChooser jdc2;
    private javax.swing.JLabel jlFim;
    private javax.swing.JLabel jlInicio;
    private javax.swing.JLabel jlTipo;
    private javax.swing.JRadioButton jrbData;
    private javax.swing.JRadioButton jrbTipo;
    // End of variables declaration//GEN-END:variables
}
