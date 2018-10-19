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

    public static ImageIcon setImageSize(ImageIcon imageIcon, int width, int heigt) {

        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(width, heigt, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        return imageIcon;
    }

    public String[] verData(String mes) {
        String cal[] = new String[2];
        switch (mes.toLowerCase()) {
            case "janeiro":
                cal[0] = "2018-01-01";
                cal[1] = "2018-01-31";

                return cal;
            case "fevereiro":
                cal[0] = "2018-02-01";
                cal[1] = "2018-02-31";

                return cal;
            case "março":
                cal[0] = "2018-03-01";
                cal[1] = "2018-03-31";

                return cal;
            case "abril":
                cal[0] = "2018-04-01";
                cal[1] = "2018-04-31";

                return cal;
            case "maio":
                cal[0] = "2018-05-01";
                cal[1] = "2018-05-31";

                return cal;
            case "junho":
                cal[0] = "2018-06-01";
                cal[1] = "2018-06-31";

                return cal;
            case "julho":
                cal[0] = "2018-07-01";
                cal[1] = "2018-07-31";

                return cal;
            case "agosto":
                cal[0] = "2018-08-01";
                cal[1] = "2018-08-31";

                return cal;
            case "setembro":
                cal[0] = "2018-09-01";
                cal[1] = "2018-09-31";

                return cal;
            case "outubro":
                cal[0] = "2018-10-01";
                cal[1] = "2018-10-31";

                return cal;
            case "novembro":
                cal[0] = "2018-11-01";
                cal[1] = "2018-11-31";

                return cal;
            case "dezembro":
                cal[0] = "2018-12-01";
                cal[1] = "2018-12-31";

                return cal;
        }
        return cal;

    }

}
