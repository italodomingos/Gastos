package control;

import javax.swing.table.DefaultTableModel;

public class Helper {

    float soma = 0;
    DefaultTableModel modelo;

    public DefaultTableModel getModelo() {
        return modelo;
    }

    public void setModelo(DefaultTableModel modelo) {
        this.modelo = modelo;
    }

    public float getSoma() {
        return soma;
    }

    public void setSoma(float soma) {
        this.soma = soma;
    }
}
