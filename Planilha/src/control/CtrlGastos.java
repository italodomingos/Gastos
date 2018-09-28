package control;

import dao.DaoGastos;
import model.Gastos;

public class CtrlGastos {

    public int salvarCtrl(Gastos gas) {

        return new DaoGastos().salvarDao(gas);

    }

    public Gastos[] getCtrl(String data1, String data2) {
        return new DaoGastos().getCadastroDao(data1, data2);
    }

    public boolean updateCtrl(Gastos gas) {
        return new DaoGastos().updateDao(gas);
    }

    public boolean excluirCtrl(int codigo) {
        return new DaoGastos().excluirDao(codigo);
    }

    public Gastos[] getCtrlDataNome(String data1, String data2, String tipo) {
        return new DaoGastos().getPorDataNome(data1, data2, tipo);
    }

    public Gastos[] getCtrlNome(String tipo) {
        return new DaoGastos().getPorNome(tipo);
    }

    public Gastos[] getAll() {
        return new DaoGastos().getCadastroAll();
    }

    public Gastos getPorCod(int cod) {
        return new DaoGastos().getPorCod(cod);
    }

    public Gastos[] getFiltros() {
        return new DaoGastos().getFiltros();
    }

    public Gastos[] getCtrlSomaTipos() {
        return new DaoGastos().getSomaTipos();
    }

}
