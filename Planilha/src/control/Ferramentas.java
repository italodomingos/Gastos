package control;

import java.awt.Image;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Ferramentas {

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
    public ImageIcon setImageSize(ImageIcon imageIcon, int width, int heigt) {

        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(width, heigt, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        return imageIcon;
    }

}
