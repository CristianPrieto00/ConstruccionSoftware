public class Rectangulo extends Figura {
    private double base;
    private double altura;


    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }


    @Override
    public double calcularArea() {
        double area;
        area = (base * altura);
        return area;

    }

    @Override
    public double calcularPerimetro() {
        double perimetro;
        perimetro = 2 * (base + altura);
        return perimetro;
        
    }


}
