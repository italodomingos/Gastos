package model;

public class Gastos {

    private String tipo;
    private int codigo;
    private float valor;
    private String data, mes;

    public Gastos() {

    }

    public Gastos(String data, String tipo, int codigo, float valor) {
        this.data = data;
        this.tipo = tipo;
        this.codigo = codigo;
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

}
