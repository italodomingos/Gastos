package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ConexaoMySql {

    private boolean status = false;
    private String mensagem = "";
    private Connection con = null;
    private Statement statement;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;

    private String servidor = "localhost";
    private String nomeDoBanco = "gastos";
    private String usuario = "root";
    private String senha = "root";

    public ConexaoMySql() {

    }

    public ConexaoMySql(String servidor, String nomeDoBanco, String usuario, String senha) {
        this.servidor = servidor;
        this.nomeDoBanco = nomeDoBanco;
        this.usuario = usuario;
        this.senha = senha;

    }

    public Connection conectar() {
        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();

            String url = "jdbc:mysql://" + servidor + "/" + nomeDoBanco;
            this.setCon((Connection) DriverManager.getConnection(url, usuario, senha));
            this.status = true;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
        return this.getCon();

    }

    public boolean fecharConexao() {
        try {
            if ((this.getResultSet() != null) && (this.statement != null)) {
                this.getResultSet().close();
                this.statement.close();
            }
            this.getCon().close();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }

    public boolean executarSQL(String pSQL) {
        try {

            this.setStatement(getCon().createStatement());

            this.setResultSet(getStatement().executeQuery(pSQL));

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;

    }

    public boolean executarUpdateDeleteSQL(String pSQL) {
        try {

            this.setStatement(getCon().createStatement());

            getStatement().executeUpdate(pSQL);

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public int insertSQL(String pSQL) {
        int status = 0;

        try {

            this.setStatement(getCon().createStatement());

            this.getStatement().executeUpdate(pSQL);

            this.setResultSet(this.getStatement().executeQuery("SELECT last_insert_id();"));

            while (this.resultSet.next()) {
                status = this.resultSet.getInt(1);
            }

            return status;

        } catch (SQLException e) {
            e.printStackTrace();
            return status;
        }

    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    public void setNomeDoBanco(String nomeDoBanco) {
        this.nomeDoBanco = nomeDoBanco;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean getStatus() {
        return status;
    }

    public String getMensagem() {
        return mensagem;
    }

    public Connection getCon() {
        return con;
    }

    public Statement getStatement() {
        return statement;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public String getServidor() {
        return servidor;
    }

    public String getNomeDoBanco() {
        return nomeDoBanco;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public PreparedStatement getPreparedStatement() {
        return preparedStatement;
    }

    public void setPreparedStatement(PreparedStatement preparedStatement) {
        this.preparedStatement = preparedStatement;
    }

}
