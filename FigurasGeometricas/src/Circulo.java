public class Circulo extends Figura{
    private double radio;


    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }


    @Override
    public double calcularArea() {
        double area;
        area = Math.PI * radio * radio;
        return area;
        
    }

    @Override
    public double calcularPerimetro() {
        double perimetro;
        perimetro = 2 * Math.PI * radio;
        return perimetro;
        
    }

}
