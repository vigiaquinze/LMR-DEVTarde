package POOInterface;

public class Retangulo implements FigurasGeometricas {

    int altura;
    int base;

    public Retangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double getArea() {
        int area=base*altura;
        return area;
    }

    @Override
    public String getNomeFigura() {
        return "Retângulo";
    }

    @Override
    public double getPerimetro() {
        int perimetro=(base+altura)*2;
        return perimetro;
    }
    
}
