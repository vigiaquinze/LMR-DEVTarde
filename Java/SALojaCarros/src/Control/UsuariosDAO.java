package Control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Connection.ConnectionFactory;
import Model.Usuarios;

public class UsuariosDAO {
    // atributo
    private Connection connection;
    private Statement stmt;
    private List<Usuarios> usuarios;

    // construtor
    public UsuariosDAO() {
        this.connection = ConnectionFactory.getConnection();
    }

    // métodos
    public void criaTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS usuarios_lojacarros (CPF VARCHAR(255) PRIMARY KEY, NOME VARCHAR(255))";
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela criada com sucesso.");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar a tabela: " + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    // Listar todos os valores cadastrados
    public List<Usuarios> listarTodos() {
        PreparedStatement stmt = null;
        // Declaração do objeto PreparedStatement para executar a consulta
        ResultSet rs = null;
        // Declaração do objeto ResultSet para armazenar os resultados da consulta
        usuarios = new ArrayList<>();
        // Cria uma lista para armazenar os Usuarios recuperados do banco de dados
        try {
            stmt = connection.prepareStatement("SELECT * FROM usuarios_lojacarros");
            // Prepara a consulta SQL para selecionar todos os registros da tabela
            rs = stmt.executeQuery();
            // Executa a consulta e armazena os resultados no ResultSet
            while (rs.next()) {
                // Para cada registro no ResultSet, cria um objeto Usuarios com os valores do
                // registro
                Usuarios usuario = new Usuarios(
                        rs.getString("cpf"),
                        rs.getString("nome"));
                usuarios.add(usuario); // Adiciona o objeto Usuarios à lista de Usuarios
            }
        } catch (SQLException ex) {
            System.out.println(ex); // Em caso de erro durante a consulta, imprime o erro
        } finally {
            ConnectionFactory.closeConnection(connection, stmt, rs);

            // Fecha a conexão, o PreparedStatement e o ResultSet
        }
        return usuarios; // Retorna a lista de Usuarios recuperados do banco de dados
    }

    // Cadastrar usuario no banco
    public void cadastrar(String cpf, String nome) {
        PreparedStatement stmt = null;
        // Define a instrução SQL parametrizada para cadastrar na tabela
        String sql = "INSERT INTO usuarios_lojacarros (cpf, nome) VALUES (?, ?)";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, cpf);
            stmt.setString(2, nome);
            stmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }

    // Atualizar dados no banco
    public void atualizar(String cpf, String nome) {
        PreparedStatement stmt = null;
        // Define a instrução SQL parametrizada para atualizar dados pela placa
        String sql = "UPDATE usuarios_lojacarros SET nome = ? WHERE cpf = ?";
        try {
            stmt = connection.prepareStatement(sql);
            //placa é chave primária e não pode ser alterada
            stmt.setString(1, cpf);
            stmt.setString(2, nome);
            stmt.executeUpdate();
            System.out.println("Dados atualizados com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }

    // Apagar dados do banco
    public void apagar(String cpf) {
        PreparedStatement stmt = null;
        // Define a instrução SQL parametrizada para apagar dados pela placa
        String sql = "DELETE FROM usuarios_lojacarros WHERE cpf = ?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, cpf);
            stmt.executeUpdate(); // Executa a instrução SQL
            System.out.println("Dado apagado com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao apagar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }
}
