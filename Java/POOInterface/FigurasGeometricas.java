package POOInterface;

public interface FigurasGeometricas {
    //somente uma classe como modelo para outras classes
    //não podemos instanciar obetos desta classe
    //métodos abstratos por padrão/default
    public String getNomeFigura();
    public double getArea();
    public double getPerimetro();
}
