package Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Connection.ConnectionFactory;

public class ConnectionDAO {
    private Connection connection;

    // codigo para o banco de dados
    public ConnectionDAO() {
        this.connection = ConnectionFactory.getConnection();
    }

    //métodos
    public void criaTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS CARROS (PLACA VARCHAR(255) PRIMARY KEY,MODELO VARCHAR(255),MARCA VARCHAR(255),COR VARCHAR(255), ANO VARCHAR(255), PRECO VARCHAR(255))";
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela criada com sucesso.");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar a tabela: " + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    public void apagarTabela() {
        String sql = "DROP TABLE CARROS";
        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate(sql);
            System.out.println("Tabela apagada com sucesso.");
        } catch (Exception e) {
            throw new RuntimeException("Erro ao apagar tabela.", e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }
}
