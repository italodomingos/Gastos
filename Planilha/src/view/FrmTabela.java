package view;

import com.toedter.calendar.JDateChooser;
import control.CtrlGambiarra;
import control.Helper;
import control.Verificacao;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import model.Gastos;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class FrmTabela extends javax.swing.JFrame {

    Helper help = new Helper();
    int cont = 0;

    public FrmTabela() {

        initComponents();
        new Thread() {
            public void run() {
                int x = 400;
                int y = jlWelcome.getLocation().y;

                while (true) {
                    x--;
                    if (x < -100) {
                        x = 400;
                    }
                    jlWelcome.setLocation(x, y);
                    try {
                        sleep(10);
                    } catch (Exception e) {

                    }

                }

            }

        }.start();
        setExtendedState(MAXIMIZED_BOTH);

    }

    public float removerRegistrosTabela(DefaultTableModel model, String nome) {
        int cont = 0, start = 0;

        float soma = 0;
        int limit = model.getRowCount();
        for (int i = 0; i < limit; i++) {
            if (model.getValueAt(i, 1).toString().equalsIgnoreCase(nome)) {
                start = i;
                break;
            }
        }
        for (int i = start; i < limit; i++) {
            if (model.getValueAt(i, 1).toString().equalsIgnoreCase(nome)) {
                soma = soma + Float.parseFloat(model.getValueAt(i, 2).toString().replace("R$", ""));
                cont++;

            }
        }
        for (int i = 0; i < limit; i++) {

            if (model.getValueAt(i, 0).toString().equalsIgnoreCase("Total")) {

                model.removeRow(i);
            }

        }
        for (int i = 0; i < cont; i++) {

            model.removeRow(start);

        }

        return soma;

    }

    public boolean percorrerTabela(DefaultTableModel model, String nome) {
        for (int i = 0; i < model.getRowCount() - 1; i++) {
            if (model.getValueAt(i, 1).toString().equals(nome)) {
                return false;
            }
        }
        return true;

    }

    public void preencherGrafico(Gastos[] g) {
        DefaultPieDataset dpd = new DefaultPieDataset();

        for (int i = 0; i < g.length; i++) {
            dpd.setValue(g[i].getTipo(), g[i].getValor());
        }

        JFreeChart jfc = ChartFactory.createPieChart("Gastos", dpd, true, true, false);

        ChartPanel chartPanel = new ChartPanel(jfc);
        chartPanel.setSize(600, 600);
        jpGraficos.add(chartPanel);
        chartPanel.validate();
        jpGraficos.validate();

    }

    public void preencher(Gastos[] g) {
        float soma = 0;

        DefaultTableModel modelo = new DefaultTableModel();

        jtTabela.setModel(modelo);
        modelo.addColumn("Código");
        modelo.addColumn("Tipo");
        modelo.addColumn("Valor");
        modelo.addColumn("Data");

        jtTabela.getColumnModel().getColumn(0);
        jtTabela.getColumnModel().getColumn(1);
        jtTabela.getColumnModel().getColumn(2);
        jtTabela.getColumnModel().getColumn(3);

        for (int i = 0; i < g.length; i++) {

            modelo.addRow(new Object[]{g[i].getCodigo(), g[i].getTipo(), "R$ " + g[i].getValor(), g[i].getData().replace('-', '/')});
            soma = soma + g[i].getValor();

        }
        help.setSoma(soma);
        modelo.addRow(new Object[]{"Total", "", "R$ " + soma});
        jtpGeral.setSelectedIndex(1);

    }

    public void setarData(String data1, String data2) {
        CtrlGambiarra ct = new CtrlGambiarra();
        preencher(ct.getCtrl(data1, data2));

    }

    public void toExcel(JTable table, File file) throws IOException {
        try {
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            FileWriter excel = new FileWriter(file);
            for (int i = 0; i < model.getColumnCount(); i++) {

                excel.write(model.getColumnName(i).replace('ó', 'o') + ";");
            }
            excel.write("\n");
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    if (j == 2) {
                        excel.write(model.getValueAt(i, j).toString().replace('.', ',') + ";");
                    } else {
                        excel.write(model.getValueAt(i, j) + ";");

                    }

                }
                excel.write("\n");
            }
            excel.close();
            JOptionPane.showMessageDialog(null, "Salvo em: " + file);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jlIcone = new javax.swing.JLabel();
        jtpGeral = new javax.swing.JTabbedPane();
        jpInicio = new javax.swing.JPanel();
        jlWelcome = new javax.swing.JLabel();
        jpTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabela = new javax.swing.JTable();
        jpGraficos = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmNovo = new javax.swing.JMenu();
        jmiGasto = new javax.swing.JMenuItem();
        jmMes = new javax.swing.JMenu();
        jmiJunho = new javax.swing.JMenuItem();
        jmiJulho = new javax.swing.JMenuItem();
        jmiAgosto = new javax.swing.JMenuItem();
        jmiSetembro = new javax.swing.JMenuItem();
        jmiOutubro = new javax.swing.JMenuItem();
        jmiNovembro = new javax.swing.JMenuItem();
        jmiDezembro = new javax.swing.JMenuItem();
        jmFerramentas = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jmiExcel = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jmiPTodos = new javax.swing.JMenuItem();
        jmiPData = new javax.swing.JMenuItem();
        jmiPNome = new javax.swing.JMenuItem();
        jmiDataNome = new javax.swing.JMenuItem();
        jmiRemover = new javax.swing.JMenuItem();
        jmiEditar = new javax.swing.JMenuItem();
        jmFiltrar = new javax.swing.JMenu();
        jmSair = new javax.swing.JMenu();

        jTextField1.setText("jTextField1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenuItem5.setText("jMenuItem5");

        jlIcone.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlWelcome.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jlWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlWelcome.setText("Welcome");

        javax.swing.GroupLayout jpInicioLayout = new javax.swing.GroupLayout(jpInicio);
        jpInicio.setLayout(jpInicioLayout);
        jpInicioLayout.setHorizontalGroup(
            jpInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInicioLayout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jlWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(297, 297, 297))
        );
        jpInicioLayout.setVerticalGroup(
            jpInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInicioLayout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jlWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(213, 213, 213))
        );

        jtpGeral.addTab("Início", jpInicio);

        jtTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtTabela);

        javax.swing.GroupLayout jpTabelaLayout = new javax.swing.GroupLayout(jpTabela);
        jpTabela.setLayout(jpTabelaLayout);
        jpTabelaLayout.setHorizontalGroup(
            jpTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
        );
        jpTabelaLayout.setVerticalGroup(
            jpTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
        );

        jtpGeral.addTab("Tabela", jpTabela);

        javax.swing.GroupLayout jpGraficosLayout = new javax.swing.GroupLayout(jpGraficos);
        jpGraficos.setLayout(jpGraficosLayout);
        jpGraficosLayout.setHorizontalGroup(
            jpGraficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
        );
        jpGraficosLayout.setVerticalGroup(
            jpGraficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );

        jtpGeral.addTab("Gráficos", jpGraficos);

        jmNovo.setText("Novo");
        jmNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmNovoActionPerformed(evt);
            }
        });

        jmiGasto.setText("Gasto");
        jmiGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGastoActionPerformed(evt);
            }
        });
        jmNovo.add(jmiGasto);

        jMenuBar1.add(jmNovo);

        jmMes.setText("Mês");

        jmiJunho.setText("Junho");
        jmiJunho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiJunhoActionPerformed(evt);
            }
        });
        jmMes.add(jmiJunho);

        jmiJulho.setText("Julho");
        jmiJulho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiJulhoActionPerformed(evt);
            }
        });
        jmMes.add(jmiJulho);

        jmiAgosto.setText("Agosto");
        jmiAgosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAgostoActionPerformed(evt);
            }
        });
        jmMes.add(jmiAgosto);

        jmiSetembro.setText("Setembro");
        jmiSetembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSetembroActionPerformed(evt);
            }
        });
        jmMes.add(jmiSetembro);

        jmiOutubro.setText("Outubro");
        jmiOutubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiOutubroActionPerformed(evt);
            }
        });
        jmMes.add(jmiOutubro);

        jmiNovembro.setText("Novembro");
        jmiNovembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNovembroActionPerformed(evt);
            }
        });
        jmMes.add(jmiNovembro);

        jmiDezembro.setText("Dezembro");
        jmiDezembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDezembroActionPerformed(evt);
            }
        });
        jmMes.add(jmiDezembro);

        jMenuBar1.add(jmMes);

        jmFerramentas.setText("Ferramentas");

        jMenu3.setText("Exportar");

        jmiExcel.setText("Para Excel");
        jmiExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiExcelActionPerformed(evt);
            }
        });
        jMenu3.add(jmiExcel);

        jmFerramentas.add(jMenu3);

        jMenu8.setText("Buscar");

        jmiPTodos.setText("Todos");
        jmiPTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPTodosActionPerformed(evt);
            }
        });
        jMenu8.add(jmiPTodos);

        jmiPData.setText("Por data");
        jmiPData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPDataActionPerformed(evt);
            }
        });
        jMenu8.add(jmiPData);

        jmiPNome.setText("Por nome");
        jmiPNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPNomeActionPerformed(evt);
            }
        });
        jMenu8.add(jmiPNome);

        jmiDataNome.setText("Por data e nome");
        jmiDataNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDataNomeActionPerformed(evt);
            }
        });
        jMenu8.add(jmiDataNome);

        jmFerramentas.add(jMenu8);

        jmiRemover.setText("Remover");
        jmiRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRemoverActionPerformed(evt);
            }
        });
        jmFerramentas.add(jmiRemover);

        jmiEditar.setText("Editar");
        jmiEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEditarActionPerformed(evt);
            }
        });
        jmFerramentas.add(jmiEditar);

        jMenuBar1.add(jmFerramentas);

        jmFiltrar.setText("Filtrar");
        jmFiltrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jmFiltrarMousePressed(evt);
            }
        });
        jmFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFiltrarActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmFiltrar);

        jmSair.setText("Sair");
        jmSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSairMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jmSairMousePressed(evt);
            }
        });
        jmSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpGeral)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jtpGeral)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRemoverActionPerformed
        CtrlGambiarra ct = new CtrlGambiarra();
        preencher(ct.getAll());
        JOptionPane.showMessageDialog(null, "Pressione um registro para remové-lo");
        jtTabela.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                if (jtTabela.getSelectedRow() > -1) {

                    try {
                        FrmInserir fi = new FrmInserir();
                        fi.preencherRemover((int) jtTabela.getValueAt(jtTabela.getSelectedRow(), 0));
                        fi.setVisible(true);
                        jtTabela.getSelectionModel().removeListSelectionListener(this);
                    } catch (ParseException ex) {
                        Logger.getLogger(FrmTabela.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            }
        });

    }//GEN-LAST:event_jmiRemoverActionPerformed

    private void jmiAgostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAgostoActionPerformed

        Verificacao v = new Verificacao();
        String teste[] = v.verData("agosto");

        setarData(teste[0], teste[1]);
    }//GEN-LAST:event_jmiAgostoActionPerformed

    private void jmiDezembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDezembroActionPerformed
        Verificacao v = new Verificacao();
        String d[] = v.verData("Dezembro");
        setarData(d[0], d[1]);
    }//GEN-LAST:event_jmiDezembroActionPerformed

    private void jmSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSairActionPerformed

    }//GEN-LAST:event_jmSairActionPerformed

    private void jmSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSairMouseClicked

    }//GEN-LAST:event_jmSairMouseClicked

    private void jmiJulhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiJulhoActionPerformed

        Verificacao v = new Verificacao();
        String d[] = v.verData("julho");
        setarData(d[0], d[1]);

    }//GEN-LAST:event_jmiJulhoActionPerformed

    private void jmSairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSairMousePressed
        String opc[] = {"Sim", "Não"};
        int x = JOptionPane.showOptionDialog(null, "Deseja realmente sair", "Sair", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opc, opc[0]);
        if (x == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jmSairMousePressed

    private void jmiJunhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiJunhoActionPerformed
        Verificacao v = new Verificacao();
        String d[] = v.verData("junho");
        setarData(d[0], d[1]);

    }//GEN-LAST:event_jmiJunhoActionPerformed

    private void jmiSetembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSetembroActionPerformed
        Verificacao v = new Verificacao();
        String d[] = v.verData("setembro");
        setarData(d[0], d[1]);
    }//GEN-LAST:event_jmiSetembroActionPerformed

    private void jmiOutubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiOutubroActionPerformed
        Verificacao v = new Verificacao();
        String d[] = v.verData("Outubro");
        setarData(d[0], d[1]);
    }//GEN-LAST:event_jmiOutubroActionPerformed

    private void jmiNovembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNovembroActionPerformed
        Verificacao v = new Verificacao();
        String d[] = v.verData("Novembro");
        setarData(d[0], d[1]);
    }//GEN-LAST:event_jmiNovembroActionPerformed

    private void jmiPTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPTodosActionPerformed
        CtrlGambiarra ct = new CtrlGambiarra();
        preencher(ct.getAll());
        preencherGrafico(ct.getAll());


    }//GEN-LAST:event_jmiPTodosActionPerformed

    private void jmiEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEditarActionPerformed
        CtrlGambiarra ct = new CtrlGambiarra();
        preencher(ct.getAll());
        JOptionPane.showMessageDialog(null, "Pressione um registro para alterá-lo");
        jtTabela.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                if (jtTabela.getSelectedRow() > -1) {
                    String opc[] = {"Sim", "Não"};
                    int x = JOptionPane.showOptionDialog(null, "Deseja editar o Código " + jtTabela.getValueAt(jtTabela.getSelectedRow(), 0),
                            "Você tem certeza disso?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opc, opc[0]);
                    if (x == 0) {
                        FrmInserir fi = new FrmInserir();
                        try {
                            fi.preencherAlterar((int) jtTabela.getValueAt(jtTabela.getSelectedRow(), 0));
                            fi.setVisible(true);
                            jtTabela.getSelectionModel().removeListSelectionListener(this);
                        } catch (ParseException ex) {
                            Logger.getLogger(FrmTabela.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                }

            }
        });

    }//GEN-LAST:event_jmiEditarActionPerformed

    private void jmiPDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPDataActionPerformed
        CtrlGambiarra ct = new CtrlGambiarra();
        JDateChooser jd1 = new JDateChooser();
        JDateChooser jd2 = new JDateChooser();

        String message = "Escolha uma data de início\n";
        Object[] params = {message, jd1, "até\n", jd2};
        JOptionPane.showConfirmDialog(null, params, "Data de início", JOptionPane.PLAIN_MESSAGE);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String data1 = sdf.format(((JDateChooser) params[1]).getDate());
        String data2 = sdf.format(((JDateChooser) params[3]).getDate());

        preencher(ct.getCtrl(data1, data2));

    }//GEN-LAST:event_jmiPDataActionPerformed

    private void jmiPNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPNomeActionPerformed

        String nome = JOptionPane.showInputDialog("Informe um nome");
        CtrlGambiarra ct = new CtrlGambiarra();

        preencher(ct.getCtrlNome(nome));
    }//GEN-LAST:event_jmiPNomeActionPerformed

    private void jmiExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExcelActionPerformed
        JFileChooser fc = new JFileChooser();

        if (jtTabela.getValueAt(1, 1) != null) {
            FileNameExtensionFilter ff = new FileNameExtensionFilter("Xlsx, Xls, Csv", "csv", "xls", "xlsx");
            fc.setFileFilter(ff);
            int option = fc.showSaveDialog(jtTabela);

            if (option == JFileChooser.APPROVE_OPTION) {
                String filename = fc.getSelectedFile().getName();
                String path = fc.getSelectedFile().getParentFile().getPath();
                int len = filename.length();
                String ext = "";
                String file = "";

                if (len > 4) {
                    ext = filename.substring(len - 4, len);
                }
                if (ext.equals(".csv")) {
                    file = path + "\\" + filename;
                } else {
                    file = path + "\\" + filename + ".csv";
                }
                try {
                    toExcel(jtTabela, new File(file));
                } catch (IOException ex) {
                    Logger.getLogger(FrmTabela.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma tabela");
        }
    }//GEN-LAST:event_jmiExcelActionPerformed

    private void jmiDataNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDataNomeActionPerformed
        CtrlGambiarra ct = new CtrlGambiarra();
        JDateChooser jd1 = new JDateChooser();
        JDateChooser jd2 = new JDateChooser();
        JTextField jt = new JTextField();

        String message = "Escolha uma data de início\n";
        Object[] params = {message, jd1, "até\n", jd2, "Nome:", jt};
        JOptionPane.showConfirmDialog(null, params, "Data de início", JOptionPane.PLAIN_MESSAGE);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String data1 = sdf.format(((JDateChooser) params[1]).getDate());
        String data2 = sdf.format(((JDateChooser) params[3]).getDate());
        String nome = jt.getText();
        preencher(ct.getCtrlDataNome(data1, data2, nome));
    }//GEN-LAST:event_jmiDataNomeActionPerformed

    private void jmNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmNovoActionPerformed

    }//GEN-LAST:event_jmNovoActionPerformed

    private void jmiGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGastoActionPerformed
        FrmInserir fi = new FrmInserir();
        fi.desativarCod();
        fi.setLocationRelativeTo(null);
        fi.setVisible(true);
    }//GEN-LAST:event_jmiGastoActionPerformed

    private void jmFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFiltrarActionPerformed

    }//GEN-LAST:event_jmFiltrarActionPerformed

    private void jmFiltrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmFiltrarMousePressed
        CtrlGambiarra ct = new CtrlGambiarra();
        JComboBox jc = new JComboBox();
        Gastos[] gas = ct.getFiltros();
        float soma = 0;
        int cont = 0;
        DefaultTableModel modelo = (DefaultTableModel) jtTabela.getModel();

        jc.addItem(null);
        for (int i = 0; i < ct.getFiltros().length - 1; i++) {
            jc.addItem(gas[i].getTipo());
        }

        Object[] parametros = {"Selecione um filtro", jc};
        String opc[] = {"Filtrar", "Add Filtro", "Remover Filtro"};
        int x = JOptionPane.showOptionDialog(null, parametros, "Filtros", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opc, opc[0]);
        Gastos[] g = ct.getCtrlNome(jc.getSelectedItem().toString());
        if (x == 0) {
            preencher(ct.getCtrlNome(jc.getSelectedItem().toString()));

        } else if (percorrerTabela(modelo, jc.getSelectedItem().toString()) == true) {
            soma = Float.parseFloat(modelo.getValueAt(modelo.getRowCount() - 1, 2).toString().replace("R$", ""));

            modelo.removeRow(modelo.getRowCount() - 1);

            for (int i = 0; i < g.length; i++) {
                modelo.addRow(new Object[]{g[i].getCodigo(), g[i].getTipo(), "R$ " + g[i].getValor(), g[i].getData().replace('-', '/')});
                soma = soma + g[i].getValor();
            }
            help.setSoma(soma);
            modelo.addRow(new Object[]{"Total", "", "R$ " + help.getSoma()});

        } else if (x == 2) {

            help.setSoma(help.getSoma() - removerRegistrosTabela(modelo, jc.getSelectedItem().toString()));

            modelo.addRow(new Object[]{"Total", "", "R$ " + help.getSoma()});

        } else if (jc.getSelectedItem().equals(null)) {

        } else {
            JOptionPane.showMessageDialog(null, "Filtro já utilizado", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jmFiltrarMousePressed

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
            java.util.logging.Logger.getLogger(FrmTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel());
                } catch (ParseException ex) {
                    Logger.getLogger(FrmTabela.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(FrmTabela.class.getName()).log(Level.SEVERE, null, ex);
                }
                SwingUtilities.updateComponentTreeUI(new FrmTabela());

                new FrmTabela().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jlIcone;
    private javax.swing.JLabel jlWelcome;
    private javax.swing.JMenu jmFerramentas;
    private javax.swing.JMenu jmFiltrar;
    private javax.swing.JMenu jmMes;
    private javax.swing.JMenu jmNovo;
    private javax.swing.JMenu jmSair;
    private javax.swing.JMenuItem jmiAgosto;
    private javax.swing.JMenuItem jmiDataNome;
    private javax.swing.JMenuItem jmiDezembro;
    private javax.swing.JMenuItem jmiEditar;
    private javax.swing.JMenuItem jmiExcel;
    private javax.swing.JMenuItem jmiGasto;
    private javax.swing.JMenuItem jmiJulho;
    private javax.swing.JMenuItem jmiJunho;
    private javax.swing.JMenuItem jmiNovembro;
    private javax.swing.JMenuItem jmiOutubro;
    private javax.swing.JMenuItem jmiPData;
    private javax.swing.JMenuItem jmiPNome;
    private javax.swing.JMenuItem jmiPTodos;
    private javax.swing.JMenuItem jmiRemover;
    private javax.swing.JMenuItem jmiSetembro;
    private javax.swing.JPanel jpGraficos;
    private javax.swing.JPanel jpInicio;
    private javax.swing.JPanel jpTabela;
    private javax.swing.JTable jtTabela;
    private javax.swing.JTabbedPane jtpGeral;
    // End of variables declaration//GEN-END:variables
}
