abstract public class Figura {
    private String color;


    public void imprimir(){
        System.out.println("EL COLOR DE TU FIGURA ES: " + color);
        System.out.println("EL AREA DE TU FIGURA ES: " + calcularArea());
        System.out.println("EL PERIMETRO DE TU FIGURA ES: " + calcularPerimetro());
    } 


    public void cambiarColor(String nuevoColor){
        this.color = nuevoColor;
    }


    public abstract double calcularArea();


    public abstract double calcularPerimetro();


    public Figura(String color) {
        this.color = color;
    }

}
