import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
            Statement s; // Cria uma instância de Statement para executar comandos SQL.
            // Estabelece a conexão com o banco de dados.
            Connection c;
        try {
            String usuario = "postgres"; // Nome de usuário do banco de dados.
            String senha = "postgres"; // Senha do banco de dados.
            String url = "jdbc:postgresql://localhost:5432/postgres"; // URL de conexão com o banco de dados PostgreSQL.
            c = DriverManager.getConnection(url, usuario, senha);
            s = c.createStatement(); // Cria um objeto Statement a partir da conexão.
            // Executa uma codigo SQL de inserção na tabela "contato".
            // ser substituídos pelos valores reais a serem inseridos.
            s.execute("INSERT INTO contato VALUES('2', 'Hugo', 'cornetafcvhb@gmail.com')");
        } catch (Exception E) {
            System.out.println("\n" + E); // Captura e imprime qualquer exceção que ocorra durante a execução.
        } finally {
            c.close(); // Fecha a conexão com o banco de dados após a conclusão da operação.
        }
    }
}
