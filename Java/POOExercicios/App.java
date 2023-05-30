package POOExercicios;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Victor", 1.75, 27, 01, 2003);
        System.out.println("Nome: "+pessoa1.getNome()+"\nAltura: "+pessoa1.getAltura()+"m \nData de nascimento: "+pessoa1.getDiaDeNascimento()+"/"+pessoa1.getMesDeNascimento()+"/"+pessoa1.getAnoDeNascimento());
        pessoa1.idade();
    }
}
