public class Electrodomestico {

    private double precioBase;
    private double peso;
    private String color;
    private char consumoEnergetico;

    //CONTRUCTOR POR DEFECTO
    public Electrodomestico() {

        precioBase = 100;
        peso = 5;
        color = "blanco";
        consumoEnergetico = 'F';

    }

    //CONSTRUCTOR RECIBIENDO PRECIO BASE Y PESO
    public Electrodomestico(double precioBase, double peso){

        this.precioBase = precioBase;
        this.peso = peso;
        color = "blanco";
        consumoEnergetico = 'F';

    }

    //CONSTRUCTOR RECIBIENDO TODOS LOS VALORES
    public Electrodomestico(double precioBase, double peso, String color, char consumoEnergetico) {

        this.precioBase = precioBase;
        this.peso = peso;
        validarColor(color);
        validarConsumoEnergetico(consumoEnergetico);
        
    }

    // METODO PARA VALIDAR EL COLOR SIN DIFERENCIAR MAYUSCULAS Y MINUSCULAS
    private void validarColor(String color){

        if(color.equalsIgnoreCase("blanco")||
           color.equalsIgnoreCase("negro")||
           color.equalsIgnoreCase("rojo")||
           color.equalsIgnoreCase("azul")||
           color.equalsIgnoreCase("gris")){

        this.color = color.toLowerCase();

        } else {
            this.color = "blanco";
        }
    }

    // METODO PARA VALIDAR EL CONSUMO ENERGETICO SIN DIFERENCIAR MAYUSCULAS Y MINUSCULAS
    private void validarConsumoEnergetico(char consumoEnergetico){

        consumoEnergetico = Character.toUpperCase(consumoEnergetico);
        
        if(consumoEnergetico >= 'A' && consumoEnergetico <= 'F'){
            
        this.consumoEnergetico = consumoEnergetico;

        } else {

            this.consumoEnergetico = 'F';

        }

    }

    // GETTERS
    public double getPrecioBase() {
        return precioBase;
    }


    public double getPeso() {
        return peso;
    }


    public String getColor() {
        return color;
    }


    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    // METODO PARA CALCULAR EL PRECIO FINAL
    public double precioFinal(){

        double precioFinal = precioBase;

        switch (consumoEnergetico){

            case 'A':
                precioFinal += 100;
                break;
            
            case 'B':
                precioFinal += 80;
                break;

            case 'C':
                precioFinal += 60;
                break;

            case 'D':
                precioFinal += 50;
                break;

            case 'E':
                precioFinal += 30;
                break;

            case 'F':
                precioFinal += 10;
                break;

        }

        if(peso < 20){
            precioFinal += 10;

        } else if (peso >= 20 && peso < 50){
            precioFinal += 50;

        } else if (peso >= 50 && peso < 80){
            precioFinal += 80;

        } else if (peso >= 80){
            precioFinal +=100;

        }

        return precioFinal;
    }
    
}
