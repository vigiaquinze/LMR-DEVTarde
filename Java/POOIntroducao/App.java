package POOIntroducao;

public class App {
    public static void main(String[] args) {
        RegistraAluno aluno1 = new RegistraAluno();
        RegistraAluno aluno2 = new RegistraAluno();
        aluno1.setNome("Polibe Murici");
        System.out.println("Nome: "+aluno1.getNome());
        aluno1.setEndereco("Rua Power Guido, 101");
        System.out.println("Endereço: "+aluno1.getEndereco());
        aluno1.setIdade(17);
        System.out.println("Idade: "+aluno1.getIdade());
        aluno1.setNotaMatematica(5);
        aluno1.setNotaPortugues(10);
        aluno1.setNotaCiencias(6);
        System.out.println("Média das notas do aluno: "+aluno1.getMedia());
        System.out.println(" ");
        aluno2.setNome("Eustácio Junqueira");
        System.out.println("Nome: "+aluno2.getNome());
        aluno2.setEndereco("Rua Simas Turbo, 62");
        System.out.println("Endereço: "+aluno2.getEndereco());
        aluno2.setIdade(16);
        System.out.println("Idade: "+aluno2.getIdade());
        aluno2.setNotaMatematica(8);
        aluno2.setNotaPortugues(6);
        aluno2.setNotaCiencias(9);
        System.out.println("Média das notas do aluno: "+aluno2.getMedia());
    }
}
