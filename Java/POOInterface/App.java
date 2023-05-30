package POOInterface;

public class App {
    public static void main(String[] args) {
        Quadrado figura1 = new Quadrado(8);//parâmetro lado
        System.out.println(figura1.getNomeFigura()+"\nÁrea: "+figura1.getArea()+"\nPerímetro: "+figura1.getPerimetro());
        System.out.println("");
        Retangulo figura2 = new Retangulo(5, 10);
        System.out.println(figura2.getNomeFigura()+"\nÁrea: "+figura2.getArea()+"\nPerímetro: "+figura2.getPerimetro());
        System.out.println("");
        Trapezio figura3 = new Trapezio(5, 10, 5, 3, 3);
        System.out.println(figura3.getNomeFigura()+"\nÁrea: "+figura3.getArea()+"\nPerímetro: "+figura3.getPerimetro());
    }
}
