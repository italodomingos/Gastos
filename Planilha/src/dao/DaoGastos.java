package dao;

import conexao.ConexaoMySql;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.Gastos;

public class DaoGastos {

    public int salvarDao(Gastos gas) {

        ConexaoMySql conexao = new ConexaoMySql();

        try {

            conexao.conectar();

            String sql = "INSERT INTO tabela (calendario,valor,tipo,areaTipo) VALUES ('" + gas.getData()
                    + "','" + gas.getValor()
                    + "','" + gas.getTipo()
                    + "','" + gas.getArea()
                    + "');";

            return conexao.insertSQL(sql);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            conexao.fecharConexao();
        }
    }

    public boolean excluirDao(int codigo) {

        ConexaoMySql conexao = new ConexaoMySql();

        try {

            conexao.conectar();

            String sql = "DELETE FROM tabela WHERE codigo = '" + codigo + "';";

            conexao.executarUpdateDeleteSQL(sql);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;

        } finally {
            conexao.fecharConexao();
        }

    }

    public boolean updateDao(Gastos gas) {
        ConexaoMySql conexao = new ConexaoMySql();

        try {
            conexao.conectar();

            String sql = "UPDATE tabela SET valor= " + gas.getValor()
                    + ",tipo ='" + gas.getTipo()
                    + "',calendario='" + gas.getData()
                    + "',areaTipo='" + gas.getArea()
                    + "' WHERE codigo = " + gas.getCodigo() + ";";
            conexao.executarUpdateDeleteSQL(sql);

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;

        } finally {
            conexao.fecharConexao();
        }

    }

    public Gastos[] getPorDataNome(String data1, String data2, String tipo) {

        Gastos gas[] = {};

        ConexaoMySql conexao = new ConexaoMySql();

        try {
            conexao.conectar();
            String sql = "SELECT COUNT(*) FROM tabela WHERE calendario BETWEEN '" + data1 + "' AND '" + data2 + "' AND tipo ='" + tipo + "';";
            conexao.executarSQL(sql);
            while (conexao.getResultSet().next()) {
                gas = new Gastos[(conexao.getResultSet().getInt("COUNT(*)"))];
            }
            sql = "SELECT * FROM tabela WHERE calendario BETWEEN '" + data1 + "' AND '" + data2 + "' AND tipo='" + tipo + "';";
            conexao.executarSQL(sql);

            for (int i = 0; conexao.getResultSet().next() == true; i++) {

                gas[i] = new Gastos();
                gas[i].setCodigo(Integer.parseInt(conexao.getResultSet().getString("codigo")));

                Date data = conexao.getResultSet().getDate("calendario");
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String datas = formato.format(data);

                gas[i].setData(datas);
                gas[i].setArea(conexao.getResultSet().getString("areaTipo"));
                gas[i].setTipo(conexao.getResultSet().getString("tipo"));
                gas[i].setValor(conexao.getResultSet().getFloat("valor"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            conexao.fecharConexao();

        }

        return gas;
    }

    public Gastos[] getPorNome(String tipo) {

        Gastos gas[] = {};

        ConexaoMySql conexao = new ConexaoMySql();

        try {
            conexao.conectar();
            String sql = "SELECT COUNT(*) FROM tabela WHERE tipo LIKE  '%" + tipo + "%';";
            conexao.executarSQL(sql);
            while (conexao.getResultSet().next()) {
                gas = new Gastos[(conexao.getResultSet().getInt("COUNT(*)"))];
            }
            sql = "SELECT * FROM tabela WHERE tipo LIKE '%" + tipo + "%';";
            conexao.executarSQL(sql);

            for (int i = 0; conexao.getResultSet().next() == true; i++) {

                gas[i] = new Gastos();
                gas[i].setCodigo(Integer.parseInt(conexao.getResultSet().getString("codigo")));

                Date data = conexao.getResultSet().getDate("calendario");
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String datas = formato.format(data);

                gas[i].setData(datas);
                gas[i].setArea(conexao.getResultSet().getString("areaTipo"));
                gas[i].setTipo(conexao.getResultSet().getString("tipo"));
                gas[i].setValor(conexao.getResultSet().getFloat("valor"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            conexao.fecharConexao();

        }

        return gas;
    }

    public Gastos getPorCod(int cod) {

        Gastos gas = new Gastos();

        ConexaoMySql conexao = new ConexaoMySql();

        try {
            conexao.conectar();
            String sql = "SELECT * FROM tabela WHERE codigo =" + cod + ";";
            conexao.executarSQL(sql);
            while (conexao.getResultSet().next()) {
                gas.setCodigo(Integer.parseInt(conexao.getResultSet().getString("codigo")));

                Date data = conexao.getResultSet().getDate("calendario");
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String datas = formato.format(data);

                gas.setData(datas);
                gas.setArea(conexao.getResultSet().getString("areaTipo"));
                gas.setTipo(conexao.getResultSet().getString("tipo"));
                gas.setValor(conexao.getResultSet().getFloat("valor"));
            }

            conexao.executarSQL(sql);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            conexao.fecharConexao();

        }

        return gas;
    }

    public Gastos[] getCadastroDao(String data1, String data2) {

        Gastos gas[] = {};

        ConexaoMySql conexao = new ConexaoMySql();

        try {
            conexao.conectar();
            String sql = "SELECT COUNT(*) FROM tabela WHERE calendario BETWEEN '" + data1 + "'AND'" + data2 + "';";
            conexao.executarSQL(sql);
            while (conexao.getResultSet().next()) {
                gas = new Gastos[(conexao.getResultSet().getInt("COUNT(*)"))];
            }
            sql = "SELECT * FROM tabela WHERE calendario BETWEEN '" + data1 + "'AND'" + data2 + "' ORDER BY calendario ;";
            conexao.executarSQL(sql);

            for (int i = 0; conexao.getResultSet().next() == true; i++) {
                gas[i] = new Gastos();
                gas[i].setCodigo(Integer.parseInt(conexao.getResultSet().getString("codigo")));

                Date data = conexao.getResultSet().getDate("calendario");
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String datas = formato.format(data);

                gas[i].setData(datas);

                gas[i].setArea(conexao.getResultSet().getString("areaTipo"));
                gas[i].setTipo(conexao.getResultSet().getString("tipo"));
                gas[i].setValor(conexao.getResultSet().getFloat("valor"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            conexao.fecharConexao();

        }

        return gas;
    }

    public Gastos[] getCadastroAll() {

        Gastos gas[] = {};

        ConexaoMySql conexao = new ConexaoMySql();

        try {
            conexao.conectar();
            String sql = "SELECT COUNT(*) FROM tabela;";
            conexao.executarSQL(sql);
            while (conexao.getResultSet().next()) {
                gas = new Gastos[(conexao.getResultSet().getInt("COUNT(*)"))];
            }
            sql = "SELECT * FROM tabela ORDER BY calendario ASC;";
            conexao.executarSQL(sql);

            for (int i = 0; conexao.getResultSet().next() == true; i++) {
                gas[i] = new Gastos();
                gas[i].setCodigo(Integer.parseInt(conexao.getResultSet().getString("codigo")));

                Date data = conexao.getResultSet().getDate("calendario");
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String datas = formato.format(data);
                gas[i].setData(datas);

                gas[i].setArea(conexao.getResultSet().getString("areaTipo"));
                gas[i].setTipo(conexao.getResultSet().getString("tipo"));
                gas[i].setValor(conexao.getResultSet().getFloat("valor"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            conexao.fecharConexao();

        }

        return gas;
    }

    public Gastos[] getFiltros() {

        Gastos gas[] = {};
        int x = 1;
        ConexaoMySql conexao = new ConexaoMySql();

        try {
            conexao.conectar();
            String sql = "SELECT * FROM tabela GROUP BY tipo;";
            conexao.executarSQL(sql);
            while (conexao.getResultSet().next()) {
                gas = new Gastos[x];
                x++;
            }
            sql = "SELECT * FROM tabela GROUP BY tipo";
            conexao.executarSQL(sql);

            for (int i = 0; conexao.getResultSet().next() == true; i++) {

                gas[i] = new Gastos();

                gas[i].setTipo(conexao.getResultSet().getString("tipo"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            conexao.fecharConexao();

        }

        return gas;
    }

    public Gastos[] getSomaTipos() {
        Gastos gas[] = {};
        int x = 1;
        ConexaoMySql conexao = new ConexaoMySql();

        try {
            conexao.conectar();
            String sql = "SELECT ROUND(SUM(valor),2) AS soma,areaTipo FROM tabela group by areaTipo";
            conexao.executarSQL(sql);
            while (conexao.getResultSet().next()) {
                gas = new Gastos[x];
                x++;
            }
            sql = "SELECT ROUND(SUM(valor),2) AS soma,areaTipo FROM tabela group by areaTipo";
            conexao.executarSQL(sql);

            for (int i = 0; conexao.getResultSet().next() == true; i++) {

                gas[i] = new Gastos();

                gas[i].setArea(conexao.getResultSet().getString("areaTipo"));
                gas[i].setValor(conexao.getResultSet().getFloat("soma"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            conexao.fecharConexao();

        }

        return gas;

    }
    public int getLastId() {

        int aux=0;

        ConexaoMySql conexao = new ConexaoMySql();

        try {
            conexao.conectar();
            String sql = "SELECT MAX(codigo) as ultimo FROM tabela;";
            conexao.executarSQL(sql);
            while (conexao.getResultSet().next()) {
                aux = Integer.parseInt(conexao.getResultSet().getString("ultimo"));
            }

            conexao.executarSQL(sql);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            conexao.fecharConexao();

        }

        return aux;
    }
    public int getFirstId() {

        int aux=0;

        ConexaoMySql conexao = new ConexaoMySql();

        try {
            conexao.conectar();
            String sql = "SELECT MIN(codigo) AS Primeiro FROM tabela;";
            conexao.executarSQL(sql);
            while (conexao.getResultSet().next()) {
                aux = Integer.parseInt(conexao.getResultSet().getString("Primeiro"));
            }

            conexao.executarSQL(sql);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            conexao.fecharConexao();

        }

        return aux;
    }

}
