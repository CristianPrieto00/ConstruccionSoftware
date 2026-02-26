abstract public class Figura {
    private String color;


    public void imprimir(){
        System.out.println("\n EL COLOR DE TU FIGURA ES: \n" + color);
        System.out.println("\n EL AREA DE TU FIGURA ES: \n" + calcularArea());
        System.out.println("\n EL PERIMETRO DE TU FIGURA ES: \n" + calcularPerimetro());
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
